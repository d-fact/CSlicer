#!/usr/bin/python3

import os
import sys
import time
import subprocess as sub
import re
import shutil
import argparse
import datetime
import random
import collections
import distutils.core

SCRIPT_DIR = os.path.dirname(os.path.realpath(__file__)) # Dir of this script
GEN_TESTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/gen-tests'
FULL_TESTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/full-tests'
RAND_TESTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/rand-tests'
TEST_LOGS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/test-logs'
FULL_TEST_LOGS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/full-logs'
RAND_TEST_LOGS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/rand-logs'

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
                    {'client': 'restheart', # > 24 hrs
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

def getTimeFromESTimeLog(log_file):
    fr = open(log_file, 'r')
    lines = fr.readlines()
    fr.close()
    for i in range(len(lines)):
        if lines[i].startswith('[TIME]: '):
            exec_time = float(lines[i].strip().split()[-1])
    return exec_time

def getTimeFromJUnitLog(log_file):
    fr = open(log_file, 'r')
    lines = fr.readlines()
    fr.close()
    for i in range(len(lines)):
        if lines[i].startswith('Time: '):
            exec_time = float(lines[i].strip().split()[-1])
    return exec_time

def computeAvgGenTimeAndRunTimeOfEachClient(client_lib_pairs=CLIENT_LIB_PAIRS,
                                            rand_tests_dir=RAND_TESTS_DIR,
                                            rand_test_logs_dir=RAND_TEST_LOGS_DIR):
    for pair in client_lib_pairs:
        acc_gen_time = 0
        acc_run_time = 0
        client = pair['client']
        lib = pair['lib']
        gen_tests_dir = rand_tests_dir + '/' + client + '/' + lib.replace(':', '=')
        for dir_path, subpaths, files in os.walk(gen_tests_dir, False):
            for f in files:
                if f.endswith('.time'):
                    gen_time = getTimeFromESTimeLog(dir_path + '/' + f)
                    # print (f, gen_time)
                    acc_gen_time += gen_time
        test_logs_dir = rand_test_logs_dir + '/' + client + '/' + lib.replace(':', '=')
        for dir_path, subpaths, files in os.walk(test_logs_dir, False):
            for f in files:
                if f.endswith('_ESTest.log'):
                    run_time = getTimeFromJUnitLog(dir_path + '/' + f)
                    print (f, run_time)
                    acc_run_time += run_time
        avg_gen_time = acc_gen_time / len(client_lib_pairs)
        avg_run_time = acc_run_time / len(client_lib_pairs)
        print ('Client: ' + client + \
               ', Lib: ' + lib + \
               ', AVG Gen Time: ' + '{0:.2f}'.format(avg_gen_time) + \
               ', AVG Run Time: ' + '{0:.2f}'.format(avg_run_time))

if __name__ == '__main__':
    computeAvgGenTimeAndRunTimeOfEachClient()
