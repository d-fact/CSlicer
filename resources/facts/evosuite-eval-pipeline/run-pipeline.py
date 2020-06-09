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

### Requires:
### 1. Java 1.8

SCRIPT_DIR = os.path.dirname(os.path.realpath(__file__)) # Dir of this script
_DOWNLOADS_DIR = SCRIPT_DIR + '/_downloads'
_RESULTS_DIR = SCRIPT_DIR + '/_results'
DIFF_FACTS_EXTRACTOR_JAR = SCRIPT_DIR + '/../libs-bytecode-diff-facts/jar-diff-facts-extractor/target/jar-diff-facts-extractor-1.0-SNAPSHOT.jar'
TEST_JARS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/test'
LIB_JARS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/lib-jars'
LIB_DIFF_FACTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/diff-facts'
DEPS_DIFF_FACTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/deps-facts'
CSLICER_JAR = SCRIPT_DIR + '/../../../target/cslicer-1.0.0-jar-with-dependencies.jar'
GROK_SH_SCRIPT = SCRIPT_DIR + '/../grok-related/jgrok_m.sh'
GROK_QL_FILE = SCRIPT_DIR + '/../grok-related/diffDeps.ql'
QUERY_FACTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/query-facts'
GEN_TESTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/gen-tests'
FULL_TESTS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/full-tests'
TEST_LOGS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/test-logs'
FULL_TEST_LOGS_DIR = SCRIPT_DIR + '/../evosuite-eval-pipeline/full-logs'
EVOSUITE_JAR = SCRIPT_DIR + '/evosuite-1.0.6.jar'

# too big
# {'client': 'purdue-fastr',
#  'client_package': 'r',
#  'sha': '64d3a6aa7ca9c09f1810f141c614d7bd7e586ac3',
#  'url': 'https://github.com/allr/purdue-fastr',
#  'lib': 'com.googlecode.netlib-java:netlib-java',
#  'old_jar': 'netlib-java-0.9.3.jar',
#  'new_jar': 'netlib-java-1.1.jar'},

CLIENT_LIB_PAIRS = [{'client': 'jdeb',
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
                    {'client': 'secor',
                     'client_package': 'com.pinterest.secor',
                     'sha': '93097322a812d2c2ed4c25a6bc1c0e30499d0153',
                     'url': 'https://github.com/pinterest/secor',
                     'lib': 'org.apache.hadoop:hadoop-openstack',
                     'old_jar': 'hadoop-openstack-2.7.0.jar',
                     'new_jar': 'hadoop-openstack-3.2.0.jar'},
                    {'client': 'log4j',
                     'client_package': 'org.apache.log4j',
                     'sha': 'de9f0ea504db9d1178db2cf45323d8e182a5df0a',
                     'url': 'https://github.com/apache/log4j',
                     'lib': 'javax.mail:mail',
                     'old_jar': 'mail-1.4.3.jar',
                     'new_jar': 'mail-1.5.0-b01.jar'},
                    {'client': 'photon',
                     'client_package': 'de.komoot.photon',
                     'sha': 'de5611cc0a7954c1644cb9e53542e934bc77438b',
                     'url': 'https://github.com/komoot/photon',
                     'lib': 'org.openstreetmap.osmosis:osmosis-hstore-jdbc',
                     'old_jar': 'osmosis-hstore-jdbc-0.43.1.jar',
                     'new_jar': 'osmosis-hstore-jdbc-0.47.jar'},
                    {'client': 'ebean',
                     'client_package': 'io.ebean',
                     'sha': '04e0069eb39584c16726c6f6cd1d571fdc2f1011',
                     'url': 'https://github.com/ebean-orm/ebean',
                     'lib': 'com.fasterxml.jackson.core:jackson-databind',
                     'old_jar': 'jackson-databind-2.9.0.jar',
                     'new_jar': 'jackson-databind-2.10.0.pr1.jar'},
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
                    {'client': 'closure-templates',
                     'client_package': 'com.google.template',
                     'sha': 'd10daa56c6ab298901d7950f0d5ddd0b3c60aacb',
                     'url': 'https://github.com/google/closure-templates',
                     'lib': 'args4j:args4j',
                     'old_jar': 'args4j-2.0.23.jar',
                     'new_jar': 'args4j-2.33.jar'},
                    {'client': 'restheart',
                     'client_package': 'org.restheart',
                     'sha': 'd7877495a24253367f6850e314a3d92e35adb357',
                     'url': 'https://github.com/SoftInstigate/restheart',
                     'lib': 'org.mongodb:mongodb-driver',
                     'old_jar': 'mongodb-driver-3.6.0.jar',
                     'new_jar': 'mongodb-driver-3.11.0.jar'},
                    {'client': 'ebean',
                     'client_package': 'io.ebean',
                     'sha': '04e0069eb39584c16726c6f6cd1d571fdc2f1011',
                     'url': 'https://github.com/ebean-orm/ebean',
                     'lib': 'org.slf4j:slf4j-api',
                     'old_jar': 'slf4j-api-1.7.25.jar',
                     'new_jar': 'slf4j-api-2.0.0-alpha0.jar'},
                    {'client': 'mmseg4j-solr',
                     'client_package': 'com.chenlb.mmseg4j',
                     'sha': '8f281b128369c02d5c690c1c9bf9f216a7450309',
                     'url': 'https://github.com/chenlb/mmseg4j-solr',
                     'lib': 'org.apache.solr:solr-core',
                     'old_jar': 'solr-core-6.0.0.jar',
                     'new_jar': 'solr-core-8.2.0.jar'},
                    {'client': 'photon',
                     'client_package': 'de.komoot.photon',
                     'sha': 'de5611cc0a7954c1644cb9e53542e934bc77438b',
                     'url': 'https://github.com/komoot/photon',
                     'lib': 'org.springframework:spring-jdbc',
                     'old_jar': 'spring-jdbc-4.0.0.RELEASE.jar',
                     'new_jar': 'spring-jdbc-5.1.9.RELEASE.jar'},
                    {'client': 'ebean',
                     'client_package': 'io.ebean',
                     'sha': '04e0069eb39584c16726c6f6cd1d571fdc2f1011',
                     'url': 'https://github.com/ebean-orm/ebean',
                     'lib': 'ch.qos.logback:logback-classic',
                     'old_jar': 'logback-classic-1.2.3.jar',
                     'new_jar': 'logback-classic-1.3.0-alpha4.jar'},
                    {'client': 'extentreports-java',
                     'client_package': 'com.aventstack.extentreports',
                     'sha': '61115256494f887238d5306ee767879bbd20d59a',
                     'url': 'https://github.com/anshooarora/extentreports-java',
                     'lib': 'org.jsoup:jsoup',
                     'old_jar': 'jsoup-1.9.2.jar',
                     'new_jar': 'jsoup-1.12.1.jar'}]

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

def parseArgs(argv):
    '''
    Parse the args of the script.
    '''
    parser = argparse.ArgumentParser()
    parser.add_argument('--run', help='Run the entire experiment', \
                        action='store_true', required=False)
    parser.add_argument('--run-one', help='Run one lib1-lib2-client tuple', \
                        action='store_true', required=False)
    parser.add_argument('--client', help='Specify the name of the client', required=False)
    parser.add_argument('--lib', help='Specify the name of the library', required=False)
    parser.add_argument('--old', help='Specify the old version the library', required=False)
    parser.add_argument('--new', help='Specify the new version the library', required=False)
    parser.add_argument('--url', help='Specify the new version the library', required=False)
    parser.add_argument('--sha', help='Specify the new version the library', required=False)
    parser.add_argument('--client-package', help='The package the client', required=False)

    if (len(argv) == 0):
        parser.print_help()
        exit(1)
    opts = parser.parse_args(argv)
    return opts

def extractLibDiffFacts(client, lib, old_jar, new_jar, \
                        diff_facts_extractor_jar=DIFF_FACTS_EXTRACTOR_JAR, \
                        lib_diff_facts_dir=LIB_DIFF_FACTS_DIR):
    output_dir = lib_diff_facts_dir + '/' + client + '/' + lib
    if not os.path.isdir(output_dir):
        os.makedirs(output_dir)
    sub.run('java -jar ' + diff_facts_extractor_jar + ' -old ' + old_jar + \
            ' -new ' + new_jar + ' -out ' + output_dir, shell=True)

def cloneClient(client, url, sha, downloads_dir=_DOWNLOADS_DIR):
    cwd = os.getcwd()
    client_dir = downloads_dir + '/' + client
    if os.path.isdir(client_dir):
        shutil.rmtree(client_dir)
    if os.path.isdir(client_dir + '-fake'):
        shutil.copytree(client_dir + '-fake', client_dir)
    else:
        os.chdir(downloads_dir)
        sub.run('git clone ' + url, shell=True, \
                stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
        shutil.copytree(client_dir, client_dir + '-fake')
    os.chdir(client_dir)
    sub.run('git checkout ' + sha, shell=True, \
                stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
    if os.path.isdir(client_dir + '-new'):
        shutil.rmtree(client_dir + '-new')
    shutil.copytree(client_dir, client_dir + '-new')
    os.chdir(cwd)
    
def generatePropertiesFile(client, lib, lib_old_jar, lib_new_jar, \
                           _downloads_dir=_DOWNLOADS_DIR, \
                           deps_diff_facts_dir=DEPS_DIFF_FACTS_DIR):
    lines = 'classRoot = '
    client_class_root_old = _downloads_dir + '/' + client + '/target/classes'
    client_class_root_new = _downloads_dir + '/' + client + '-new/target/classes'
    # client_class_root_old = _downloads_dir + '/' + client + '/target/test-classes' # TODO
    # client_class_root_new = _downloads_dir + '/' + client + '-new/target/test-classes' # TODO
    shutil.copytree(client_class_root_old, client_class_root_new)
    shutil.copyfile(lib_old_jar, client_class_root_old + '/' + lib_old_jar.split('/')[-1])
    shutil.copyfile(lib_new_jar, client_class_root_new + '/' + lib_new_jar.split('/')[-1])
    cwd = os.getcwd()
    os.chdir(client_class_root_old)
    sub.run('unzip -qn ' + lib_old_jar, shell=True)
    os.chdir(client_class_root_new)
    sub.run('unzip -qn ' + lib_new_jar, shell=True)
    os.chdir(cwd)
    lines += client_class_root_old + '\n'
    output_dir = deps_diff_facts_dir + '/' + client + '/' + lib
    if not os.path.isdir(output_dir):
        os.makedirs(output_dir)
    deps_facts_file = output_dir + '/deps-facts.ta'
    lines += 'depsFactsFile = ' + deps_facts_file + '\n'
    md5_to_plain_string_map_file = output_dir + '/md5-to-plain-string-map.txt'
    lines += 'MD5ToPlainStringMapFile = ' + md5_to_plain_string_map_file + '\n'
    deps_plain_file = output_dir + '/deps-plain.txt'
    lines += 'depsPlainFile = ' + deps_plain_file + '\n'
    prop_file = output_dir + '/depsutil.properties'
    fw = open(prop_file, 'w')
    fw.write(lines)
    fw.close()
    return prop_file

def getPlainStringEntityNameFromMap(md5, md5_map_file):
    fr = open(md5_map_file, 'r')
    map_lines = fr.readlines()
    fr.close()
    for i in range(len(map_lines)):
        if md5 in map_lines[i]:
            plain_string = map_lines[i].strip().split()[1]
    return plain_string

def extractClientOldLibDepsFacts(client, lib, old_jar, new_jar, url, sha, \
                                 cslicer_jar=CSLICER_JAR, \
                                 _downloads_dir=_DOWNLOADS_DIR, \
                                 deps_diff_facts_dir=DEPS_DIFF_FACTS_DIR):
    cwd = os.getcwd()
    cloneClient(client, url, sha)
    os.chdir(_downloads_dir + '/' + client)
    sub.run('mvn install -DskipTests -fn', shell=True)
    properties_file = generatePropertiesFile(client, lib, old_jar, new_jar)
    sub.run('java -jar ' + cslicer_jar + ' -c ' + properties_file + ' -e depsutil', shell=True)
    fr = open(deps_diff_facts_dir + '/' + client + '/' + lib + '/deps-facts.ta', 'r')
    md5_lines = fr.readlines()[1:]
    fr.close()
    md5_map_file = deps_diff_facts_dir + '/' + client + '/' + lib + \
                   '/md5-to-plain-string-map.txt'
    plain_lines = ''
    for i in range(len(md5_lines)):
        md5_1 = md5_lines[i].strip().split()[1]
        md5_2 = md5_lines[i].strip().split()[2]
        plain_1 = getPlainStringEntityNameFromMap(md5_1, md5_map_file)
        plain_2 = getPlainStringEntityNameFromMap(md5_2, md5_map_file)
        plain_lines += md5_lines[i].replace(md5_1, plain_1).replace(md5_2, plain_2)
    fw = open(deps_diff_facts_dir + '/' + client + '/' + lib + '/deps-plain.ta', 'w')
    fw.write(plain_lines)
    fw.close()
    os.chdir(cwd)

def queryAffectedEntities(client, lib, grok_sh_script=GROK_SH_SCRIPT, \
                          grok_ql_file=GROK_QL_FILE, query_facts_dir=QUERY_FACTS_DIR, \
                          lib_diff_facts_dir=LIB_DIFF_FACTS_DIR, \
                          deps_diff_facts_dir=DEPS_DIFF_FACTS_DIR):
    cwd = os.getcwd()
    output_dir = query_facts_dir + '/' + client + '/' + lib
    if not os.path.isdir(output_dir):
        os.makedirs(output_dir)
    os.chdir(output_dir)
    shutil.copy(lib_diff_facts_dir + '/' + client + '/' + lib + '/jar-diff-facts.ta', output_dir)
    shutil.copy(deps_diff_facts_dir + '/' + client + '/' + lib + '/deps-facts.ta', output_dir)
    sub.run(grok_sh_script + ' ' + grok_ql_file + ' ' + output_dir, shell=True)
    os.chdir(cwd)
    query_result_file = output_dir + '/query-results.dat'
    fr = open(query_result_file, 'r')
    md5_list = [l.strip() for l in fr.readlines()[1:]]
    fr.close()
    md5_map_file = deps_diff_facts_dir + '/' + client + '/' \
                   + lib + '/md5-to-plain-string-map.txt'
    entity_list = []
    for md5 in md5_list:
        plain = getPlainStringEntityNameFromMap(md5, md5_map_file)
        entity_list.append(plain)
    return entity_list

def getAffectedClientEntities(affected_entities, client_package):
    affected_client_entities = []
    for entity in affected_entities:
        if entity.startswith(client_package + '.'):
            affected_client_entities.append(entity)
    return affected_client_entities

def isInnerClass(entity):
    segments = entity.split('.')[:-1]
    for seg in segments:
        if seg[0].isupper():
            return True
    return False

def getAffectedClientClasses(affected_client_entities, client, lib, \
                             query_facts_dir=QUERY_FACTS_DIR):
    affected_client_classes = []
    for entity in affected_client_entities:
        if '(' in entity or '{' in entity or ':' in entity:
            continue
        if isInnerClass(entity):
            print (entity + ' is inner class!')
            continue
        affected_client_classes.append(entity)
    fw = open(query_facts_dir + '/' + client + '/' + lib + '/affected-classes.txt', 'w')
    for c in affected_client_classes:
        fw.write(c + '\n')
    fw.close()
    return affected_client_classes

def runEvoSuiteROnAffectedEntities(affected_client_entities, client, lib, old_jar, new_jar, \
                                   _downloads_dir=_DOWNLOADS_DIR, \
                                   gen_tests_dir=GEN_TESTS_DIR, evosuite_jar=EVOSUITE_JAR):
    cwd = os.getcwd()
    generation_target_classes = ':'.join(affected_client_entities)
    print (generation_target_classes)
    # clean classes
    os.chdir(_downloads_dir + '/' + client)
    sub.run('mvn clean test -fn', shell=True, stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
    os.chdir(_downloads_dir + '/' + client + '-new')
    sub.run('mvn clean test -fn', shell=True, stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
    client_class_path_old = _downloads_dir + '/' + client + '/target/classes'
    client_class_path_new = _downloads_dir + '/' + client + '/target/classes'
    # client_class_path_old += ':' + _downloads_dir + '/' + client + \
    #                          '/target/test-classes' # TODO
    # client_class_path_new += ':' + _downloads_dir + '/' + client + \
    #                          '-new/target/test-classes' # TODO
    # collect dependency jars
    if os.path.isdir('/tmp/jars'):
        shutil.rmtree('/tmp/jars')
    os.makedirs('/tmp/jars')
    os.chdir(_downloads_dir + '/' + client)
    sub.run('mvn dependency:copy-dependencies', shell=True, \
            stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
    for jar in os.listdir(_downloads_dir + '/' + client + '/target/dependency'):
        if not jar.endswith('.jar'):
            continue
        if jar.startswith(lib.split(':')[1]):
            continue
        shutil.copy(_downloads_dir + '/' + client + '/target/dependency/' + jar, '/tmp/jars')
    client_class_path_old += '$(for i in $(ls /tmp/jars); do printf \':/tmp/jars/\'$i;done)'
    client_class_path_new += '$(for i in $(ls /tmp/jars); do printf \':/tmp/jars/\'$i;done)'
    client_class_path_old += ':' + old_jar
    client_class_path_new += ':' + new_jar
    client_class_path_old += ':' + evosuite_jar
    client_class_path_new += ':' + evosuite_jar
    #
    output_dir = gen_tests_dir + '/' + client + '/' + lib.replace(':', '=')
    if not os.path.isdir(output_dir):
        os.makedirs(output_dir)
    os.chdir(output_dir)
    for target_class in generation_target_classes.split(':'):
        # print ('CMD: java -jar ' + evosuite_jar + ' -regressionSuite -projectCP ' + \
        #     client_class_path_old  + ' -Dregressioncp=' + client_class_path_new + \
        #        ' -class ' + target_class)
        # sub.run('java -jar ' + evosuite_jar + ' -regressionSuite -projectCP ' + \
        #         client_class_path_old  + ' -Dregressioncp=' + client_class_path_new + \
        #         ' -class ' + target_class, shell=True)
        #
        print ('CMD: java -jar ' + evosuite_jar + ' -projectCP ' + \
                client_class_path_old + ' -class ' + target_class)
        sub.run('java -jar ' + evosuite_jar + ' -projectCP ' + \
                client_class_path_old + ' -class ' + target_class, shell=True, \
                stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
    os.chdir(cwd)
    return client_class_path_old, client_class_path_new

def runGeneratedTests(affected_client_classes, old_class_path, new_class_path, \
                      client, lib, old_jar, new_jar, gen_tests_dir=GEN_TESTS_DIR, \
                      test_logs_dir=TEST_LOGS_DIR):
    # compile
    test_class_path = gen_tests_dir + '/' + client + '/' + \
                      lib.replace(':', '=') + '/evosuite-tests'
    gen_tests_client_lib_dir = gen_tests_dir + '/' + client + '/' + lib.replace(':', '=')
    for dir_path, subpaths, files in os.walk(gen_tests_client_lib_dir, False):
        for f in files:
            if f.endswith('.java'):
                sub.run('javac -cp ' + test_class_path + ':' + old_class_path + ' ' + \
                        dir_path + '/' + f, shell=True)
    output_dir = test_logs_dir + '/' + client + '/' + lib.replace(':', '=')
    if not os.path.isdir(output_dir):
        os.makedirs(output_dir)
    # run old
    for client_class in affected_client_classes:
        test_class = client_class + '_ESTest'
        test_log = output_dir + '/' + test_class + '.old.log'
        test_cmd = 'java -cp ' + test_class_path + ':' + old_class_path + \
                   ' org.junit.runner.JUnitCore ' + test_class
        print ('OLD TEST CMD: ' + test_cmd)
        sub.run(test_cmd, shell=True, stdout=open(test_log, 'w'), stderr=sub.STDOUT)
        prependTestCommandToLog(test_log, 'OLD TEST CMD: ' + test_cmd)
    # run new
    for client_class in affected_client_classes:
        test_class = client_class + '_ESTest'
        test_log = output_dir + '/' + test_class + '.log'
        test_cmd = 'java -cp ' + test_class_path + ':' + new_class_path + \
                   ' org.junit.runner.JUnitCore ' + test_class
        print ('NEW TEST CMD: ' + test_cmd)
        sub.run(test_cmd, shell=True, stdout=open(test_log, 'w'), stderr=sub.STDOUT)
        prependTestCommandToLog(test_log, 'NEW TEST CMD: ' + test_cmd)

def prependTestCommandToLog(log, test_cmd):
    fr = open(log, 'r')
    lines = fr.readlines()
    fr.close()
    lines.insert(0, test_cmd)
    fw = open(log, 'w')
    fw.write(''.join(lines))
    fw.close()

def getAllClassesOfClient(client, lib, query_facts_dir=QUERY_FACTS_DIR):
    all_classes_list_file = query_facts_dir + '/' + client + '/' + lib + '/all_classes.txt'
    fr = open(all_classes_list_file, 'r')
    lines = fr.readlines()
    fr.close()
    return [l.strip() for l in lines]

# --- ICSE'20: to estimate time ---
def getRandom10ClassesOfClient(client, lib, query_facts_dir=QUERY_FACTS_DIR):
    all_classes_list_file = query_facts_dir + '/' + client + '/' + lib + '/all_classes.txt'
    fr = open(all_classes_list_file, 'r')
    lines = fr.readlines()
    fr.close()
    return random.sample([l.strip() for l in lines], 10)

def runPipelineOnOneLibClientPair(client, lib, old_jar, new_jar, url, sha, client_package):
    extractLibDiffFacts(client, lib, old_jar, new_jar)
    extractClientOldLibDepsFacts(client, lib, old_jar, new_jar, url, sha)
    affected_entities = queryAffectedEntities(client, lib)
    affected_client_entities = getAffectedClientEntities(affected_entities, \
                                                         client_package)
    affected_client_classes = getAffectedClientClasses(affected_client_entities, \
                                                       client, lib)
    # for entity in affected_client_entities:
    #     print (entity)
    # affected_client_classses = getAllClassesOfClient(client, lib) # for full gen
    # --- ICSE'20: to estimate time ---
    random_client_classes = getRandom10ClassesOfClient(client, lib)
    print (random_client_classes)
    exit(0)
    old_class_path, new_class_path = \
        runEvoSuiteROnAffectedEntities(affected_client_classes, client, lib, old_jar, \
                                       new_jar)
    runGeneratedTests(affected_client_classes, old_class_path, new_class_path, \
                      client, lib, old_jar, new_jar)

def runPipelineOnAllLibClientPairs(client_lib_pairs=CLIENT_LIB_PAIRS, lib_jars_dir=LIB_JARS_DIR):
    for pair in client_lib_pairs:
        client = pair['client']
        lib = pair['lib']
        old_jar = lib_jars_dir + '/' + client + '/' + lib.replace(':','=') + '/' + \
                  pair['old_jar']
        new_jar = lib_jars_dir + '/' + client + '/' + lib.replace(':','=') + '/' + \
                  pair['new_jar']
        url = pair['url']
        sha = pair['sha']
        client_package = pair['client_package']
        runPipelineOnOneLibClientPair(client, lib, old_jar, new_jar, url, sha, \
                                      client_package)

if __name__ == '__main__':
    if not os.path.isdir(_DOWNLOADS_DIR):
        os.makedirs(_DOWNLOADS_DIR)
    opts = parseArgs(sys.argv[1:])
    if opts.run:
        runPipelineOnAllLibClientPairs()
        exit(0)
    elif opts.run_one:
        client = opts.client
        lib = opts.lib
        old_jar = opts.old
        new_jar = opts.new
        url = opts.url
        sha = opts.sha
        client_package = opts.client_package
        runPipelineOnOneLibClientPair(client, lib, old_jar, new_jar, url, sha, client_package)
        exit(0)

