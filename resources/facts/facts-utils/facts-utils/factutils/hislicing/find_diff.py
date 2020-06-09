#!/usr/bin/env python3

import argparse
from pprint import pprint
import logging
from typing import Tuple
from collections import namedtuple

logger = logging.getLogger(__name__)

SetDiff = namedtuple("SetDiff", ["size", "content"])


class CSlicerResult:
    def __init__(self, test_set: set, comp_set: set, hunk_set: set, drop_set: set):
        self.TEST = test_set
        self.COMP = comp_set
        self.HUNK = hunk_set
        self.DROP = drop_set

    def test_comp(self):
        return self.TEST | self.COMP

    def slicing_result(self):
        return self.TEST | self.COMP | self.HUNK

    def __str__ (self):
        return "\n".join([f"{x}:\n" + "\n".join(sorted(getattr(self, x))) + "\n" for x in ("TEST", "COMP", "HUNK", "DROP")])
    

def read_commits_standalone(lines_file: str) -> set:
    """
    It is used to read commits from grok results or from CSlicer when its log has been processed by
    an external script and a list of commits has been generated.
    :param lines_file: a line-based file containing list of commits
    :return: a set of commits
    """
    with open(lines_file, 'r') as in_file:
        commits = set((x.strip("\n") for x in in_file.readlines()))
        commits.discard("")
        if len(commits) == 0:
            logger.warning(f"{lines_file} does contain commits")
    return commits


def read_commits_from_grok_results(grok_result: str) -> set:
    with open(grok_result, 'r') as gf:
        return set(filter(bool, (x.strip("\n") for x in gf.readlines())))


def read_commits_from_cslicer_log(cslicer_log: str) -> CSlicerResult:
    result = CSlicerResult(set(), set(), set(), set())
    with open(cslicer_log, 'r') as lf:
        for line in lf.readlines():
            if line.startswith("TEST:"):
                result.TEST.add(line.split()[1])
            elif line.startswith("COMP:"):
                result.COMP.add(line.split()[1])
            elif line.startswith("HUNK:"):
                result.HUNK.add(line.split()[1])
            elif line.startswith("DROP:"):
                result.DROP.add(line.split()[1])
    return result


def verify(g_commits: set, c_commits: set) -> bool:
    diff = compute_diff(g_commits, c_commits)
    if diff[0].size == 0 and diff[1].size == 0:
        return True
    return False


def compute_diff(g_commits: set, c_commits: set) -> Tuple[namedtuple, namedtuple]:
    if len(g_commits) != 0 and len(c_commits) != 0:
        g_sha1_len = len(next(iter(g_commits)))
        c_sha1_len = len(next(iter(c_commits)))
        if g_sha1_len > c_sha1_len:
            g_commits = set(x[:c_sha1_len] for x in g_commits)
        else:
            c_commits = set(x[:g_sha1_len] for x in c_commits)
    gc_diff = g_commits - c_commits
    cg_diff = c_commits - g_commits
    result = (SetDiff(len(gc_diff), gc_diff), SetDiff(len(cg_diff), cg_diff))
    return result


def compute_diff_from_log(g_commits: set, c_commits: CSlicerResult) -> Tuple[namedtuple, namedtuple]:
    return compute_diff(g_commits, c_commits.slicing_result())


def main():
    args = handle_args()
    if args.a:
        r: CSlicerResult = read_commits_from_cslicer_log(args.a)
        print(r)
    else:
        g_commits = read_commits_standalone(args.g)
        r: CSlicerResult = read_commits_from_cslicer_log(args.c)
        pprint(compute_diff_from_log(g_commits, r))


def handle_args():
    parser = argparse.ArgumentParser(description="compute difference of two generated list of commits")
    parser.add_argument("-g", metavar="gFILE", type=str,
                        help="file containing one commit per line generated by grok")
    parser.add_argument("-c", metavar="CSlicer-Log", type=str,
                        help="CSlicer log")
    parser.add_argument("-a", metavar="CSlicer-Log", type=str,
                        help="analyze mode, get details from CSlicer log")
    args = parser.parse_args()
    logger.debug(args)
    return args


if __name__ == "__main__":
    main()
