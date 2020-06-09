#!/usr/bin/python3

import os
import sys
import time
import subprocess as sub
import re
import shutil
import argparse
import datetime
import collections
import distutils.core

### Requires:
### 1. Java 1.8

SCRIPT_DIR = os.path.dirname(os.path.realpath(__file__)) # Dir of this script
_DOWNLOADS_DIR = SCRIPT_DIR + '/_downloads'
_RESULTS_DIR = SCRIPT_DIR + '/_results'

def parseArgs(argv):
    '''
    Parse the args of the script.
    '''
    parser = argparse.ArgumentParser()
    parser.add_argument('--run', help='Run the entire experiment', \
                        action='store_true', required=False)

    if (len(argv) == 0):
        parser.print_help()
        exit(1)
    opts = parser.parse_args(argv)
    return opts

def isTestFail(log):
    fr = open(log, 'r')
    lines = fr.readlines()
    fr.close()
    num_of_failures = 0
    for i in range(len(lines)):
        if 'Tests run: ' in lines[i] and ', Failures:' in lines[i]:
            tests_fail = int(lines[i].split(',')[1].split()[-1])
            num_of_failures += tests_fail
    if num_of_failures > 0:
        return True
    else:
        return False

def isTestError(log):
    fr = open(log, 'r')
    lines = fr.readlines()
    fr.close()
    num_of_failures = 0
    for i in range(len(lines)):
        if 'Tests run: ' in lines[i] and ', Errors:' in lines[i]:
            tests_fail = int(lines[i].split(',')[2].split()[-1])
            num_of_failures += tests_fail
    if num_of_failures > 0:
        return True
    else:
        return False

def findAffectedProjects(_results_dir=_RESULTS_DIR):
    affected_projects = []
    clients_list = os.listdir(_results_dir)
    for client in clients_list:
        client_dir = _results_dir + '/' + client
        libs_list = os.listdir(client_dir)
        libs_list.remove('old.txt')
        for lib in libs_list:
            old_log = client_dir + '/' + lib + '/old.txt'
            if isTestFail(old_log) or isTestError(old_log):
                print (client + ' old version fail!')
                break
            new_log_0 = client_dir + '/' + lib + '/new-0.txt'
            new_log_1 = client_dir + '/' + lib + '/new-1.txt'
            new_log_2 = client_dir + '/' + lib + '/new-2.txt'
            if isTestFail(new_log_0) and isTestFail(new_log_1) and isTestFail(new_log_2):
                affected_project = collections.OrderedDict({})
                affected_project['client'] = client
                affected_project['lib'] = lib
                affected_project['type'] = 'Fail'
                affected_projects.append(affected_project)
            elif isTestError(new_log_0) and isTestError(new_log_1) and isTestError(new_log_2):
                affected_project = collections.OrderedDict({})
                affected_project['client'] = client
                affected_project['lib'] = lib
                affected_project['type'] = 'Error'
                affected_projects.append(affected_project)
    return affected_projects
            
if __name__ == '__main__':
    opts = parseArgs(sys.argv[1:])
    if opts.run:
        affected_projects = findAffectedProjects()
        for project in affected_projects:
            print ('client: ' + project['client'] + ', lib: ' + project['lib'] + \
                   ', type: ' + project['type'])
