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

SCRIPT_DIR = os.path.dirname(os.path.realpath(__file__)) # Dir of this script
_DOWNLOADS_DIR = SCRIPT_DIR + '/_downloads'
_RESULTS_DIR = SCRIPT_DIR + '/_results'
SUBJECTS_NUMBERS_TEX_FILE = SCRIPT_DIR + '/../../../../ICSE2020_DIFFBASE/tables/icse2020-compat-subjects-numbers.tex'
SUBJECTS_TABLE_TEX_FILE = SCRIPT_DIR + '/../../../../ICSE2020_DIFFBASE/tables/icse2020-compat-subjects-table.tex'
COMPAT_RESULT_NUMBERS_TEX_FIE = SCRIPT_DIR + '/../../../../ICSE2020_DIFFBASE/tables/icse2020-compat-result-numbers.tex'
COMPAT_RESULT_TABLE_TEX_FIE = SCRIPT_DIR + '/../../../../ICSE2020_DIFFBASE/tables/icse2020-compat-result-table.tex'
TEST_LOGS_DIR = SCRIPT_DIR + '/test-logs'
QUERY_FACTS_DIR = SCRIPT_DIR + '/query-facts'

CLIENT_LIB_PAIRS = [{'client': 'closure-templates',
                     'client_package': 'com.google.template',
                     'sha': 'd10daa56c6ab298901d7950f0d5ddd0b3c60aacb',
                     'url': 'https://github.com/google/closure-templates',
                     'lib': 'args4j:args4j',
                     'old_jar': 'args4j-2.0.23.jar',
                     'new_jar': 'args4j-2.33.jar'},
                    {'client': 'ebean',
                     'client_package': 'io.ebean',
                     'sha': '04e0069eb39584c16726c6f6cd1d571fdc2f1011',
                     'url': 'https://github.com/ebean-orm/ebean',
                     'lib': 'org.slf4j:slf4j-api',
                     'old_jar': 'slf4j-api-1.7.25.jar',
                     'new_jar': 'slf4j-api-2.0.0-alpha0.jar'},
                    {'client': 'extentreports-java',
                     'client_package': 'com.aventstack.extentreports',
                     'sha': '61115256494f887238d5306ee767879bbd20d59a',
                     'url': 'https://github.com/anshooarora/extentreports-java',
                     'lib': 'org.jsoup:jsoup',
                     'old_jar': 'jsoup-1.9.2.jar',
                     'new_jar': 'jsoup-1.12.1.jar'},
                    {'client': 'jafka',
                     'client_package': 'io.jafka',
                     'sha': 'a9ee7d90f2ff6825397819076f8dd2fedf50b2c6',
                     'url': 'https://github.com/adyliu/jafka',
                     'lib': 'net.sf.jopt-simple:jopt-simple',
                     'old_jar': 'jopt-simple-5.0.4.jar',
                     'new_jar': 'jopt-simple-6.0-alpha-3.jar'},
                    {'client': 'jasmine-maven-plugin',
                     'client_package': 'com.github.searls.jasmine',
                     'sha': 'ce365e7c908666e883908dd8e271f92c39d1be49',
                     'url': 'https://github.com/searls/jasmine-maven-plugin',
                     'lib': 'org.slf4j:slf4j-api',
                     'old_jar': 'slf4j-api-1.7.21.jar',
                     'new_jar': 'slf4j-api-2.0.0-alpha0.jar'},
                    {'client': 'jdeb',
                     'client_package': 'org.vafer.jdeb',
                     'sha': '7d07c1c5ab45241719d25c28306618eeb52fbb26',
                     'url': 'https://github.com/tcurdt/jdeb',
                     'lib': 'org.bouncycastle:bcpg-jdk15on',
                     'old_jar': 'bcpg-jdk15on-1.60.jar',
                     'new_jar': 'bcpg-jdk15on-1.62.jar'},
                    {'client': 'Mybatis-PageHelper',
                     'client_package': 'com.github.pagehelper',
                     'sha': 'f4df55cc6bded85a3585a3056a965aae74acdcd1',
                     'url': 'https://github.com/pagehelper/Mybatis-PageHelper',
                     'lib': 'org.mybatis:mybatis',
                     'old_jar': 'mybatis-3.4.4.jar',
                     'new_jar': 'mybatis-3.5.2.jar'},
                    {'client': 'restheart',
                     'client_package': 'org.restheart',
                     'sha': 'd7877495a24253367f6850e314a3d92e35adb357',
                     'url': 'https://github.com/SoftInstigate/restheart',
                     'lib': 'org.mongodb:mongodb-driver',
                     'old_jar': 'mongodb-driver-3.6.0.jar',
                     'new_jar': 'mongodb-driver-3.11.0.jar'},
                    {'client': 'photon',
                     'client_package': 'de.komoot.photon',
                     'sha': 'de5611cc0a7954c1644cb9e53542e934bc77438b',
                     'url': 'https://github.com/komoot/photon',
                     'lib': 'org.springframework:spring-jdbc',
                     'old_jar': 'spring-jdbc-4.0.0.RELEASE.jar',
                     'new_jar': 'spring-jdbc-5.1.9.RELEASE.jar'},
                    {'client': 'secor',
                     'client_package': 'com.pinterest.secor',
                     'sha': '93097322a812d2c2ed4c25a6bc1c0e30499d0153',
                     'url': 'https://github.com/pinterest/secor',
                     'lib': 'org.apache.hadoop:hadoop-common',
                     'old_jar': 'hadoop-common-2.7.0.jar',
                     'new_jar': 'hadoop-common-3.2.0.jar'}]

def genSubjectNumbers(client_lib_pairs=CLIENT_LIB_PAIRS, \
                      numbers_tex_file=SUBJECTS_NUMBERS_TEX_FILE):
    lines = ''
    i = 1
    for pair in client_lib_pairs:
        client = pair['client']
        lib = pair['lib']
        sha = pair['sha'][:8]
        url = pair['url'].split('/')[-2] + '/' + pair['url'].split('/')[-1]
        old_version = pair['old_jar'].split(lib.split(':')[-1] + '-')[-1].split('.jar')[0]
        new_version = pair['new_jar'].split(lib.split(':')[-1] + '-')[-1].split('.jar')[0]
        lines += '\\DefMacro{' + client + '--' + lib + 'Id}{CT' + str(i) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'Client}{' + client + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'Lib}{' + lib + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'SHA}{' + sha + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'URL}{' + url + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'OldVersion}{' + old_version + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'NewVersion}{' + new_version + '}\n'
        i += 1
    fw = open(numbers_tex_file, 'w')
    fw.write(lines)
    fw.close()

def genSubjectTable(client_lib_pairs=CLIENT_LIB_PAIRS, table_tex_file=SUBJECTS_TABLE_TEX_FILE):
    table_lines = ''
    table_lines += "%% Automatically generated by gen-tables.py\n"
    table_lines += "\\begin{table*}[t]\n"
    table_lines += "\\begin{small}\n"
    table_lines += "\\begin{center}\n"
    table_lines += "\\caption{\\TableCaptionCompatSubjects}\n"
    table_lines += "\\begin{tabular}{lllllll}\n"
    table_lines += "\\toprule\n"
    table_lines += "\\TableHeadSubjectId & \\TableHeadClient & \\TableHeadSHA & \\TableHeadURL & \\TableHeadLib & \\TableHeadLibOldVer & \\TableHeadLibNewVer \\\\\n"
    table_lines += "\\midrule\n"
    for pair in client_lib_pairs:
        client = pair['client']
        lib = pair['lib']
        table_lines += '\\UseMacro{' + client + '--' + lib + 'Id}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'Client}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'SHA}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'URL}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'Lib}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'OldVersion}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'NewVersion}'
        table_lines += ' \\\\\n'
    table_lines += "\\bottomrule\n"
    table_lines += "\\end{tabular}\n"
    table_lines += "\\end{center}\n"
    table_lines += "\\end{small}\n"
    table_lines += "\\end{table*}\n"
    fw = open(table_tex_file, 'w')
    fw.write(table_lines)
    fw.close()

def genAllClassesFile(client_lib_pairs=CLIENT_LIB_PAIRS, _downloads_dir=_DOWNLOADS_DIR, \
                      query_facts_dir=QUERY_FACTS_DIR):
    for pair in client_lib_pairs:
        lines = ''
        client = pair['client']
        lib = pair['lib']
        client_package = pair['client_package']
        for dir_path, subpaths, files in os.walk(_downloads_dir + '/' + client):
            for f in files:
                if f.endswith('.class') and '$' not in f:
                    #print (f)
                    if client_package in dir_path.replace('/', '.'):
                        lines += client_package + dir_path.replace('/', '.').\
                                 split(client_package)[1] + '.' + f.replace('.class', '') + '\n'
        fw = open(query_facts_dir + '/' + client + '/' + lib + '/all_classes.txt', 'w')
        fw.write(lines)
        fw.close()

def collectTestResultsOnOneLogFile(log_file):
    fr = open(log_file, 'r')
    lines = fr.readlines()
    fr.close()
    for i in range(len(lines)):
        if 'Tests run: ' in lines[i] and 'Failures: ' in lines[i]:
            num_of_test_methods = int(lines[i].split()[2].split(',')[0])
            num_of_failed_test_methods = int(lines[i].strip()[-1])
        if 'OK (' in lines[i] and 'test' in lines[i] and ')' in lines[i]:
            num_of_test_methods = int(lines[i].split()[1].split('(')[-1])
            num_of_failed_test_methods = 0
    return num_of_test_methods, num_of_failed_test_methods

def collectTestResults(client, lib, test_logs_dir=TEST_LOGS_DIR):
    total_num_of_generated_test_classes = 0
    total_num_of_generated_test_methods = 0
    total_num_of_failed_test_classes = 0
    total_num_of_failed_test_methods = 0
    total_num_of_old_failed_test_classes = 0
    total_num_of_old_failed_test_methods = 0
    log_dir = test_logs_dir + '/' + client + '/' + lib.replace(':', '=')
    for f in os.listdir(log_dir):
        if '.old.log' not in f:
            log_file = log_dir + '/' + f
            num_of_test_methods, num_of_failed_methods = collectTestResultsOnOneLogFile(log_file)
            total_num_of_generated_test_classes += 1
            if num_of_failed_methods != 0:
                #print ('NEW FAIL: ' + f + ' ' + str(num_of_failed_methods))
                total_num_of_failed_test_classes += 1
            total_num_of_generated_test_methods += num_of_test_methods
            total_num_of_failed_test_methods += num_of_failed_methods
        else:
            old_log_file = log_dir + '/' + f
            _, num_of_old_failed_methods = collectTestResultsOnOneLogFile(old_log_file)
            if num_of_old_failed_methods != 0:
                #print ('OLD FAIL: ' + f + ' ' + str(num_of_old_failed_methods))
                total_num_of_old_failed_test_classes += 1
            total_num_of_old_failed_test_methods += num_of_old_failed_methods
    print (client + ' ' + lib + ' ' + str(total_num_of_failed_test_classes) + ' ' + \
           str(total_num_of_old_failed_test_classes))
    total_num_of_failed_test_classes -= total_num_of_old_failed_test_classes
    total_num_of_failed_test_methods -= total_num_of_old_failed_test_methods
    return total_num_of_generated_test_classes, total_num_of_generated_test_methods, \
           total_num_of_failed_test_classes, total_num_of_failed_test_methods

def genCompatResultNumbers(client_lib_pairs=CLIENT_LIB_PAIRS, \
                           numbers_tex_file=COMPAT_RESULT_NUMBERS_TEX_FIE, \
                           query_facts_dir=QUERY_FACTS_DIR):
    lines = ''
    total_num_of_all_classes = 0
    total_num_of_affected_classes = 0
    total_reduction = 0
    total_num_of_generated_test_classes = 0
    total_num_of_generated_test_methods = 0
    total_num_of_failed_test_classes = 0
    total_num_of_failed_test_methods = 0
    for pair in client_lib_pairs:
        client = pair['client']
        lib = pair['lib']
        num_of_all_classes = len(open(query_facts_dir + '/' + client + '/' + lib + \
                                           '/all_classes.txt', 'r').readlines())
        num_of_affected_classes = len(open(query_facts_dir + '/' + client + '/' + lib + \
                                           '/affected-classes.txt', 'r').readlines())
        reduction = (num_of_all_classes - num_of_affected_classes) / num_of_all_classes * 100
        num_of_generated_test_classes, num_of_generated_test_methods, \
            num_of_failed_test_classes, num_of_failed_test_methods = \
                                                    collectTestResults(client, lib)
        lines += '\\DefMacro{' + client + '--' + lib + 'NumOfAllClasses}{' + \
                 str(num_of_all_classes) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'NumOfAffectedClasses}{' + \
                 str(num_of_affected_classes) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'Reduction}{' + \
                 '{0:.2f}'.format(reduction) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'NumOfGeneratedTestClasses}{' + \
                 str(num_of_generated_test_classes) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'NumOfGeneratedTestMethods}{' + \
                 str(num_of_generated_test_methods) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'NumOfFailedTestClasses}{' + \
                 str(num_of_failed_test_classes) + '}\n'
        lines += '\\DefMacro{' + client + '--' + lib + 'NumOfFailedTestMethods}{' + \
                 str(num_of_failed_test_methods) + '}\n'
        total_num_of_all_classes += num_of_all_classes
        total_num_of_affected_classes += num_of_affected_classes
        total_reduction += reduction
        total_num_of_generated_test_classes += num_of_generated_test_classes
        total_num_of_generated_test_methods += num_of_generated_test_methods
        total_num_of_failed_test_classes += num_of_failed_test_classes
        total_num_of_failed_test_methods += num_of_failed_test_methods
    avg_num_of_all_classes = total_num_of_all_classes / len (client_lib_pairs)
    avg_num_of_affected_classes = total_num_of_affected_classes / len (client_lib_pairs)
    avg_reduction = total_reduction / len (client_lib_pairs)
    avg_num_of_generated_test_classes = total_num_of_generated_test_classes / \
                                        len (client_lib_pairs)
    avg_num_of_generated_test_methods = total_num_of_generated_test_methods / \
                                        len (client_lib_pairs)
    avg_num_of_failed_test_classes = total_num_of_failed_test_classes / len (client_lib_pairs)
    avg_num_of_failed_test_methods = total_num_of_failed_test_methods / len (client_lib_pairs)
    lines += '\\DefMacro{TotalNumOfAllClasses}{' + \
             str(total_num_of_all_classes) + '}\n'
    lines += '\\DefMacro{TotalNumOfAffectedClasses}{' + \
             str(total_num_of_affected_classes) + '}\n'
    lines += '\\DefMacro{TotalReduction}{' + \
             '{0:.2f}'.format(total_reduction) + '}\n'
    lines += '\\DefMacro{TotalNumOfGeneratedTestClasses}{' + \
             str(total_num_of_generated_test_classes) + '}\n'
    lines += '\\DefMacro{TotalNumOfGeneratedTestMethods}{' + \
             str(total_num_of_generated_test_methods) + '}\n'
    lines += '\\DefMacro{TotalNumOfFailedTestClasses}{' + \
             str(total_num_of_failed_test_classes) + '}\n'
    lines += '\\DefMacro{TotalNumOfFailedTestMethods}{' + \
             str(total_num_of_failed_test_methods) + '}\n'
    lines += '\\DefMacro{AvgNumOfAllClasses}{' + \
             '{0:.2f}'.format(avg_num_of_all_classes) + '}\n'
    lines += '\\DefMacro{AvgNumOfAffectedClasses}{' + \
             '{0:.2f}'.format(avg_num_of_affected_classes) + '}\n'
    lines += '\\DefMacro{AvgReduction}{' + \
             '{0:.2f}'.format(avg_reduction) + '}\n'
    lines += '\\DefMacro{AvgNumOfGeneratedTestClasses}{' + \
             '{0:.2f}'.format(avg_num_of_generated_test_classes) + '}\n'
    lines += '\\DefMacro{AvgNumOfGeneratedTestMethods}{' + \
             '{0:.2f}'.format(avg_num_of_generated_test_methods) + '}\n'
    lines += '\\DefMacro{AvgNumOfFailedTestClasses}{' + \
             '{0:.2f}'.format(avg_num_of_failed_test_classes) + '}\n'
    lines += '\\DefMacro{AvgNumOfFailedTestMethods}{' + \
             '{0:.2f}'.format(avg_num_of_failed_test_methods) + '}\n'
    fw = open(numbers_tex_file, 'w')
    fw.write(lines)
    fw.close()

def genCompatResultTable(client_lib_pairs=CLIENT_LIB_PAIRS, \
                         table_tex_file=COMPAT_RESULT_TABLE_TEX_FIE):
    table_lines = ''
    table_lines += "%% Automatically generated by gen-tables.py\n"
    table_lines += "\\begin{table}[t]\n"
    #table_lines += "\\begin{small}\n"
    table_lines += "\\begin{center}\n"
    table_lines += "\\caption{\\TableCaptionCompatResults}\n"
    table_lines += "\\begin{tabular}{lrrrrr}\n"
    table_lines += "\\toprule\n"
    table_lines += "\\TableHeadSubjectId & \\TableHeadNumOfAllClasses & \\TableHeadNumOfAffectedClasses & \\TableHeadReduction & \\TableHeadNumOfGeneratedTestClasses & \\TableHeadNumOfFailedTestClasses \\\\\n"
    table_lines += "\\midrule\n"
    for pair in client_lib_pairs:
        client = pair['client']
        lib = pair['lib']
        table_lines += '\\UseMacro{' + client + '--' + lib + 'Id}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'NumOfAllClasses}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'NumOfAffectedClasses}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'Reduction}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'NumOfGeneratedTestMethods}'
        table_lines += ' & \\UseMacro{' + client + '--' + lib + 'NumOfFailedTestMethods}'
        table_lines += ' \\\\\n'
    table_lines += "\\midrule\n"
    table_lines += 'Total'
    table_lines += ' & \\UseMacro{TotalNumOfAllClasses}'
    table_lines += ' & \\UseMacro{TotalNumOfAffectedClasses}'
    table_lines += ' & \\UseMacro{TotalReduction}'
    table_lines += ' & \\UseMacro{TotalNumOfGeneratedTestMethods}'
    table_lines += ' & \\UseMacro{TotalNumOfFailedTestMethods}'
    table_lines += ' \\\\\n'
    table_lines += 'Avg'
    table_lines += ' & \\UseMacro{AvgNumOfAllClasses}'
    table_lines += ' & \\UseMacro{AvgNumOfAffectedClasses}'
    table_lines += ' & \\UseMacro{AvgReduction}'
    table_lines += ' & \\UseMacro{AvgNumOfGeneratedTestMethods}'
    table_lines += ' & \\UseMacro{AvgNumOfFailedTestMethods}'
    table_lines += ' \\\\\n'
    table_lines += "\\bottomrule\n"
    table_lines += "\\end{tabular}\n"
    table_lines += "\\end{center}\n"
    #table_lines += "\\end{small}\n"
    table_lines += "\\end{table}\n"
    fw = open(table_tex_file, 'w')
    fw.write(table_lines)
    fw.close()

if __name__ == '__main__':
    genSubjectNumbers()
    genSubjectTable()
    genAllClassesFile()
    genCompatResultNumbers()
    genCompatResultTable()
