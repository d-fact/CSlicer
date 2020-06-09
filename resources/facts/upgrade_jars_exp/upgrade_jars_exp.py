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

CLIENTS = [{'name': 'commons-csv',
            'sha': 'f76a1357057cd3caaf9b0904d9cc57ce384658a3', # 1.5
            'url': 'https://github.com/apache/commons-csv'},
           {'name': 'la4j',
            'sha': 'e77dca708b386000562ec0c0def44a59d61add3d', # 0.6.0
            'url': 'https://github.com/vkostyukov/la4j'},
           {'name': 'Argo',
            'sha': '083e851e1ed4f29a6e228fb1506224cbca6687eb',
            'url': 'https://github.com/58code/Argo'},
           {'name': 'commafeed',
            'sha': 'ea5fccfe5f931fa4483c8fff72c7bb20f9e91825', # 2.5.0-beta1
            'url': 'https://github.com/Athou/commafeed'},
           {'name': 'reflectasm',
            'sha': 'ade0542b625ca094cab3662402a17d92c2e54615', # 1.11.5
            'url': 'https://github.com/EsotericSoftware/reflectasm'},
           {'name': 'graphify',
            'sha': '971fe1fbc031b1e6d37d32849b5723e91f125146',
            'url': 'https://github.com/Graphify/graphify'},
           {'name': 'Surus',
            'sha': '05659af43697f6dae5743fd0a1931c210757e1e7',
            'url': 'https://github.com/Netflix/Surus'},
           {'name': 'curator',
            'sha': '8987c7ec746893d15ca030e02d627d8737e957cc', # curator-x-zkclient-bridge-3.0.0
            'url': 'https://github.com/Netflix/curator'},
           {'name': 'Nukkit',
            'sha': 'feb254f995c9fe3ca936f0677c69cb3857c2009d',
            'url': 'https://github.com/Nukkit/Nukkit'},
           {'name': 'restheart',
            'sha': 'd7877495a24253367f6850e314a3d92e35adb357', # 3.2.2
            'url': 'https://github.com/SoftInstigate/restheart'},
           {'name': 'jafka',
            'sha': 'a9ee7d90f2ff6825397819076f8dd2fedf50b2c6', # 3.0.6
            'url': 'https://github.com/adyliu/jafka'},
           {'name': 'TProfiler',
            'sha': '6fda97aec16ec5a40c013ad9bd5359fae0c25758', # 1.0
            'url': 'https://github.com/alibaba/TProfiler'},
           {'name': 'yugong',
            'sha': '7dc938d70ec745a841aa74a3b9a7d0ffcdb50872', # 1.0.3
            'url': 'https://github.com/alibaba/yugong'},
           {'name': 'purdue-fastr',
            'sha': '64d3a6aa7ca9c09f1810f141c614d7bd7e586ac3', # 0.168
            'url': 'https://github.com/allr/purdue-fastr'},
           {'name': 'log4j',
            'sha': 'de9f0ea504db9d1178db2cf45323d8e182a5df0a', # 1.2.17
            'url': 'https://github.com/apache/log4j'},
           {'name': 'solo',
            'sha': 'bd58610079fc6fdb8c4ed990ce496f2de3538c0e', # 2.8.0
            'url': 'https://github.com/b3log/solo'},
           {'name': 'symphony',
            'sha': '6ebd82e0578b9160f43dc9d105ba1ca372e45a27', # 2.6.0
            'url': 'https://github.com/b3log/symphony'},
           {'name': 'xiaov',
            'sha': '0a6344c0f6620e034b4cbf73b906e75399b3f0f0', # 2.3.0
            'url': 'https://github.com/b3log/xiaov'},
           {'name': 'jongo',
            'sha': '7f15d205cc696895e83743f602ddabc25c6fe7e9', # 1.4.0
            'url': 'https://github.com/bguerout/jongo'},
           {'name': 'HikariCP',
            'sha': '234ba765b478cc0bf7a30e766730ce0aea7c901d', # 3.1.0
            'url': 'https://github.com/brettwooldridge/HikariCP'},
           {'name': 'RedisClient',
            'sha': '8c85f2679ae5d48c7c332321b17a86cc414bfb5a', # 2.0.0
            'url': 'https://github.com/caoxinyu/RedisClient'},
           {'name': 'checkstyle',
            'sha': '87c8fef8c7520bca93cfb675dd908278162f3273', # 8.9
            'url': 'https://github.com/checkstyle/checkstyle'},
           {'name': 'mmseg4j-solr',
            'sha': '8f281b128369c02d5c690c1c9bf9f216a7450309', # 2.4.0
            'url': 'https://github.com/chenlb/mmseg4j-solr'},
           {'name': 'elasticsearch-taste',
            'sha': '577a74f148c4ffc71c204e8ab5d0a9afd6de45be', # 2.3.0
            'url': 'https://github.com/codelibs/elasticsearch-taste'},
           {'name': 'learning-spark',
            'sha': '6b34161e2c1351500784a0d500c664c90846cacf',
            'url': 'https://github.com/databricks/learning-spark'},
           {'name': 'kafka-spark-consumer',
            'sha': '78b2737e0ab3e6ea4ecd03a95ae57188f708b144',
            'url': 'https://github.com/dibbhatt/kafka-spark-consumer'},
           {'name': 'lavagna',
            'sha': 'b5972ad4086bca3086b6a2eb32e277aab89275fe', # 1.1
            'url': 'https://github.com/digitalfondue/lavagna'},
           {'name': 'dynjs',
            'sha': 'bf9c14d3618553cf37982b7673a2e9f695f0d516', # 0.3.1
            'url': 'https://github.com/dynjs/dynjs'},
           {'name': 'parallec',
            'sha': 'dac23bf3ff7efbf70f2c2ab02d974698651eb3c0', # 0.10.0
            'url': 'https://github.com/eBay/parallec'},
           {'name': 'ebean',
            'sha': '04e0069eb39584c16726c6f6cd1d571fdc2f1011', # 11.15.3
            'url': 'https://github.com/ebean-orm/ebean'},
           {'name': 'linkbench',
            'sha': 'ac67d54bf291eb9546d5480ffa4b2c2ef9ff0740',
            'url': 'https://github.com/facebookarchive/linkbench'},
           {'name': 'bateman',
            'sha': '08db4a68fbc4bc01453957bd35707bcdea04bd93',
            'url': 'https://github.com/fearofcode/bateman'},
           {'name': 'search-guard',
            'sha': 'e0408f57f92f8881681e6a42dc173b101058c26a', # 6.1.3-22.2
            'url': 'https://github.com/floragunncom/search-guard'},
           {'name': 'closure-templates',
            'sha': 'd10daa56c6ab298901d7950f0d5ddd0b3c60aacb', # 2018-03-14
            'url': 'https://github.com/google/closure-templates'},
           {'name': 'ormlite-core',
            'sha': '75d26c0b58f553f466bc00a85b0af961d142f739', # 5.1
            'url': 'https://github.com/j256/ormlite-core'},
           {'name': 'mango',
            'sha': 'eeacecee3cade5c909389443dc3fa32a5f75d38e', # 1.6.1
            'url': 'https://github.com/jfaster/mango'},
           {'name': 'jhipster-sample-app',
            'sha': 'a2d81ec645cba5489061a5439023d8cbcb3bfcfe', # 5.0.0-beta1
            'url': 'https://github.com/jhipster/jhipster-sample-app'},
           {'name': 'jpush-api-java-client',
            'sha': '0cf5390a2d4cfa42a58c787534d48462219a90c9', # 3.3.3
            'url': 'https://github.com/jpush/jpush-api-java-client'},
           {'name': 'http-request',
            'sha': '405c3fe77795bb426f97bf9f63aa7573ce6f64fb', # 6.0
            'url': 'https://github.com/kevinsawicki/http-request'},
           {'name': 'brickhouse',
            'sha': 'e651028dfa777cf3b604b92e56d90cfa8a88baba', # 0.1
            'url': 'https://github.com/klout/brickhouse'},
           {'name': 'photon',
            'sha': 'de5611cc0a7954c1644cb9e53542e934bc77438b', # 0.3.0
            'url': 'https://github.com/komoot/photon'}]

CLIENTS = [{'name': 'maven-git-commit-id-plugin',
            'sha': 'ca51baaa9cff03f580b3ab70ece2a99a29825cd1', # 2.2.4
            'url': 'https://github.com/git-commit-id/maven-git-commit-id-plugin'},
           {'name': 'packr',
            'sha': 'db9f1c4c996c9b3c3ef92e4851ab810151911bfb', # 1.2
            'url': 'https://github.com/libgdx/packr'},
           {'name': 'indextank-engine',
            'sha': 'f2354fe9db43786126e304d12aae4322ae7b98b1',
            'url': 'https://github.com/linkedin/indextank-engine'},
           {'name': 'weixin-popular',
            'sha': 'b2770175faf1bd05cb6564fb5ccc9cf360713a61', # 2.8.19
            'url': 'https://github.com/liyiorg/weixin-popular'},
           {'name': 'logstash-logback-encoder',
            'sha': '65d804bb2a1d909f50d4e6b7177ae1dd880f8673', # 5.1
            'url': 'https://github.com/logstash/logstash-logback-encoder'},
           {'name': 'android-volley',
            'sha': '9aba4f5f861ab547751aa572c8559467dfa59270', # 1.0.19
            'url': 'https://github.com/mcxiaoke/android-volley'},
           {'name': 'HTTP-Proxy-Servlet',
            'sha': '84fcc41ea0ad1387fefeaa9af9b16da1d300cb81', # 1.10
            'url': 'https://github.com/mitre/HTTP-Proxy-Servlet'},
           {'name': 'netty-socketio',
            'sha': '59b99ddc303e5bf3cb17b8911ab77ff56dba62c7', # 1.7.15
            'url': 'https://github.com/mrniko/netty-socketio'},
           {'name': 'mybatis-3',
            'sha': 'e7f59b629b0c2107e27cc8449ff957aac293c624', # 3.4.6
            'url': 'https://github.com/mybatis/mybatis-3'},
           {'name': 'nodebox',
            'sha': '6653934c5a663f34b3942daf229b1db3faa06903', # 3.0.51
            'url': 'https://github.com/nodebox/nodebox'},
           {'name': 'OpenTripPlanner',
            'sha': '23d319183a7d6fa9b3caef5412fc3ad8fcc54290', # 1.3.0
            'url': 'https://github.com/opentripplanner/OpenTripPlanner'},
           {'name': 'Mybatis-PageHelper',
            'sha': 'f4df55cc6bded85a3585a3056a965aae74acdcd1', # 5.1.5
            'url': 'https://github.com/pagehelper/Mybatis-PageHelper'},
           {'name': 'spark',
            'sha': '030e9d00125cbd1ad759668f85488aba1019c668', # 2.7.2
            'url': 'https://github.com/perwendel/spark'},
           {'name': 'secor',
            'sha': '93097322a812d2c2ed4c25a6bc1c0e30499d0153', # 0.26
            'url': 'https://github.com/pinterest/secor'},
           {'name': 'couchdb-lucene',
            'sha': '855473709bd4e3d92d3f62ece86ab739d0f0de13', # 2.1.0
            'url': 'https://github.com/rnewson/couchdb-lucene'},
           {'name': 'reflections',
            'sha': 'c95609a4e83e1f3fc71e4b2fc58b17352a16eef7', # 0.9.11
            'url': 'https://github.com/ronmamo/reflections'},
           {'name': 'jasmine-maven-plugin',
            'sha': 'ce365e7c908666e883908dd8e271f92c39d1be49', # 3.0-alpha-01
            'url': 'https://github.com/searls/jasmine-maven-plugin'},
           {'name': 'mysql-binlog-connector-java',
            'sha': '6cdecfd6214b1a74b6054eb0fa5813d4cfa76898', # 0.16.1
            'url': 'https://github.com/shyiko/mysql-binlog-connector-java'},
           {'name': 'elasticsearch-jetty',
            'sha': '1f8463aaf993966e76f8065293b8e0e15198c089', # 1.2.3
            'url': 'https://github.com/sonian/elasticsearch-jetty'},
           {'name': 'docker-maven-plugin',
            'sha': '4b1209d66cc2f73be5d0cf8e4300f0922f5514fe', # 1.1.1
            'url': 'https://github.com/spotify/docker-maven-plugin'},
           {'name': 'spring-data-elasticsearch',
            'sha': '4c9c03ac0bfe65c49733bdbc1cd1167b3b3ced7e', # 3.0.7
            'url': 'https://github.com/spring-projects/spring-data-elasticsearch'},
           {'name': 'spring-data-jpa',
            'sha': '75b721a686d0b598ee694fb0abe7ecc52a689d3a', # 2.0.7
            'url': 'https://github.com/spring-projects/spring-data-jpa'},
           {'name': 'spring-data-solr',
            'sha': 'ab9e86ae73df701d47c554b840c1e1be0e69ac5f', # 3.0.7
            'url': 'https://github.com/spring-projects/spring-data-solr'},
           {'name': 'spring-hateoas',
            'sha': '635aa3b04a3adedc74b99cb2d6776ff36f037a49', # 0.25.0
            'url': 'https://github.com/spring-projects/spring-hateoas'},
           {'name': 'spring-mvc-showcase',
            'sha': 'fa09f61c31c8dc525154d77d8b0317df1766740a',
            'url': 'https://github.com/spring-projects/spring-mvc-showcase'},
           {'name': 'spring-petclinic',
            'sha': 'c36452a2c34443ae26b4ecbba4f149906af14717', # 1.5.x
            'url': 'https://github.com/spring-projects/spring-petclinic'},
           {'name': 'jdeb',
            'sha': '7d07c1c5ab45241719d25c28306618eeb52fbb26', # 1.6
            'url': 'https://github.com/tcurdt/jdeb'},
           {'name': 'MiA',
            'sha': '5b8956fffe45a93bb5d9b226c141efd82f57f3fe', # 0.5
            'url': 'https://github.com/tdunning/MiA'},
           {'name': 'Solandra',
            'sha': 'b439fb633461737e5774971613e77e1d32704881', # 1.1
            'url': 'https://github.com/tjake/Solandra'},
           {'name': 'dashboard-demo',
            'sha': 'a87525ad1970ad664a863c69ffe8511c3bad823a', # 1.0.1
            'url': 'https://github.com/vaadin/dashboard-demo'},
           {'name': 'webbit',
            'sha': 'f628a7a3ffdd8c288514784f5b0426faaee2a2e3', # 0.4.19
            'url': 'https://github.com/webbit/webbit'},
           {'name': 'lemon',
            'sha': '28e13a2d7434aedcf12a61a591a59365e17eb3b2', # 1.9.0
            'url': 'https://github.com/xuhuisheng/lemon'},
           {'name': 'word',
            'sha': 'a6f4a4263444669ee7c87c428dfd8797be9e75bf', # 1.3
            'url': 'https://github.com/ysc/word'},
           {'name': 'OfflineReverseGeocode',
            'sha': 'a57ee1822728f4e819a448d498e6559877246d0c', # 1.0
            'url': 'https://github.com/AReallyGoodName/OfflineReverseGeocode'},
           {'name': 'Bukkit',
            'sha': '9b2d3d1a5a303c393d89cd27ff12fadd589b37f1', # 1.7.9-R0.2
            'url': 'https://github.com/Bukkit/Bukkit'},
           {'name': 'java-faker',
            'sha': '335ce585858e0b5a731b4009321722c9b06011ee', # 0.15
            'url': 'https://github.com/DiUS/java-faker'},
           {'name': 'FizzBuzzEnterpriseEdition',
            'sha': 'cdfac751e51e18607b67d6ca3794a8d703863aa9',
            'url': 'https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition'},
           {'name': 'jackson-annotations',
            'sha': 'd542ec4680480a0a56d39fc5344a91f545ceeb5f', # 2.9.5
            'url': 'https://github.com/FasterXML/jackson-annotations'},
           {'name': 'jackson-core',
            'sha': '3fdce0cce98a0ff60b30bfdc3ff0d50b124cfe9f', # 2.9.5
            'url': 'https://github.com/FasterXML/jackson-core'},
           {'name': 'jackson-databind',
            'sha': '5c95315ffbaf6f64bd3a2970a001ecce51c10032', # 2.9.5
            'url': 'https://github.com/FasterXML/jackson-databind'},
           {'name': 'user-agent-utils',
            'sha': '2a6db839a58a699295cd4faab1ca2681ac0c33bc', # 1.21
            'url': 'https://github.com/HaraldWalker/user-agent-utils'},
           {'name': 'JSqlParser',
            'sha': '1d119091a1c0a9d174154f398d5ed546687dbe16', # 1.2
            'url': 'https://github.com/JSQLParser/JSqlParser'},
           {'name': 'DiskLruCache',
            'sha': 'c25de9c0a01974c41c75a41ba1bc4be8b3a1513a', # 2.0.2
            'url': 'https://github.com/JakeWharton/DiskLruCache'},
           {'name': 'RxRelay',
            'sha': '218158ec6fa602144837f8608f6876399ffd9f33', # 2.1.0
            'url': 'https://github.com/JakeWharton/RxRelay'},
           {'name': 'flip-tables',
            'sha': 'b2165ab2fa7ec90b90fdfbe4f3f89b44030b67bb', # 1.0.2
            'url': 'https://github.com/JakeWharton/flip-tables'},
           {'name': 'joda-time',
            'sha': '0ae53118955118d4618ccf8ae7cf1b6d96cbc02d', # 2.10
            'url': 'https://github.com/JodaOrg/joda-time'},
           {'name': 'jBrowserDriver',
            'sha': '1f1e9ddcd1c6f13e5fa33017d9de1cc0de7868fc', # 1.0.0
            'url': 'https://github.com/MachinePublishers/jBrowserDriver'},
           {'name': 'nlp-lang',
            'sha': 'cb093b378d5d496bf5cbb39a423104be6ec99c80', # 1.7.6
            'url': 'https://github.com/NLPchina/nlp-lang'},
           {'name': 'ews-java-api',
            'sha': '5c5d11da6659d627d809c15aaa6f48a7d28f8d5c', # 2.0
            'url': 'https://github.com/OfficeDev/ews-java-api'},
           {'name': 'SikuliX2',
            'sha': '95372ca85cdf214361ab715538c793b4cd010190',
            'url': 'https://github.com/RaiMan/SikuliX2'},
           {'name': 'red5-server',
            'sha': 'd12aa0546c842a897814a9a4395fdf83bda0994d', # 1.0.10 Milestone 7
            'url': 'https://github.com/Red5/red5-server'},
           {'name': 'fast-serialization',
            'sha': '40f1b012d8f1e8a11f086a8895219fcba48ef5e4', # 2.56
            'url': 'https://github.com/RuedigerMoeller/fast-serialization'},
           {'name': 'soot',
            'sha': '1c28106d91dc0643f30d78ed5fb32b7b9c924495', # 3.1.0
            'url': 'https://github.com/Sable/soot'},
           {'name': 'nv-websocket-client',
            'sha': '9617d5e348db4ad804a8b4192e5a237ce7d667fa', # 2.4
            'url': 'https://github.com/TakahikoKawasaki/nv-websocket-client'},
           {'name': 'JavaVerbalExpressions',
            'sha': '4ee34e6c96ea2cf8335e3b425afa44c535229347', # 1.6
            'url': 'https://github.com/VerbalExpressions/JavaVerbalExpressions'},
           {'name': 'BlossomsPokemonGoManager',
            'sha': 'b9a16734363381f0081811ec0481b86cfe134920', # 0.1.7
            'url': 'https://github.com/Wolfsblvt/BlossomsPokemonGoManager'},
           {'name': 'stream-lib',
            'sha': '30ad9f9d9b7d8a7e627f51abe897381432b59c8a', # 2.9.6
            'url': 'https://github.com/addthis/stream-lib'},
           {'name': 'airline',
            'sha': '072f9ae31cbcc222bda36c03a479b6d9f3189e83', # 0.8
            'url': 'https://github.com/airlift/airline'}]

CLIENTS = [{'name': 'transmittable-thread-local',
            'sha': 'a133ee7863be55ae5da5f2f92076214ccc2fd737', # 2.3.1
            'url': 'https://github.com/alibaba/transmittable-thread-local'},
           {'name': 'streamex',
            'sha': 'ca19a51fce66585e62fe7722c9243b89997f8076', # 0.6.7
            'url': 'https://github.com/amaembo/streamex'},
           {'name': 'extentreports-java',
            'sha': '61115256494f887238d5306ee767879bbd20d59a',
            'url': 'https://github.com/anshooarora/extentreports-java'},
           {'name': 'commons-io',
            'sha': '2ae025fe5c4a7d2046c53072b0898e37a079fe62', # 2.6-RC3
            'url': 'https://github.com/apache/commons-io'},
           {'name': 'commons-lang',
            'sha': '9801e2fb9fcbf7ddd19221e9342608940d778f8c', # 3.8
            'url': 'https://github.com/apache/commons-lang'},
           {'name': 'amazon-echo-ha-bridge',
            'sha': '0ab78729eecf0df20ff839439e1072f8a985fa61', # 0.4.0
            'url': 'https://github.com/armzilla/amazon-echo-ha-bridge'},
           {'name': 'AsciidocFX',
            'sha': '3c61cacbda9218fe285b43552238652a0d0a5f4e', # 1.5.9
            'url': 'https://github.com/asciidocfx/AsciidocFX'},
           {'name': 'fastjson',
            'sha': '28da8e194bb7bca71676bb10b9cb343653289de6', # 1.2.48
            'url': 'https://github.com/alibaba/fastjson'}]

def parseArgs(argv):
    '''
    Parse the args of the script.
    '''
    parser = argparse.ArgumentParser()
    parser.add_argument('--run', help='Run the entire experiment', \
                        action='store_true', required=False)
    parser.add_argument('--run-all-libs-one-client', \
                        help='Run all libs of one client project', required=False)
    parser.add_argument('--run-one-lib-one-client', help='Run one lib of one client project', required=False)
    parser.add_argument('--groupid', help='Specify the library to be upgraded', required=False)
    parser.add_argument('--artifactid', help='Specify the library to be upgraded', required=False)
    parser.add_argument('--old', help='Specify the library to be upgraded', required=False)
    parser.add_argument('--new', help='Specify the library to be upgraded', required=False)

    if (len(argv) == 0):
        parser.print_help()
        exit(1)
    opts = parser.parse_args(argv)
    return opts

def cloneClient(client, downloads_dir=_DOWNLOADS_DIR):
    cwd = os.getcwd()
    client_dir = downloads_dir + '/' + client['name']
    if os.path.isdir(client_dir):
        shutil.rmtree(client_dir)
    if os.path.isdir(client_dir + '-fake'):
        shutil.copytree(client_dir + '-fake', client_dir)
    else:
        os.chdir(downloads_dir)
        sub.run('git clone ' + client['url'], shell=True, \
                stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
        shutil.copytree(client_dir, client_dir + '-fake')
    os.chdir(client_dir)
    sub.run('git checkout ' + client['sha'], shell=True, \
                stdout=open(os.devnull, 'w'), stderr=sub.STDOUT)
    os.chdir(cwd)

def isLibToBeExcluded(lib):
    if lib == 'junit:junit' or lib.startswith('org.mockito:mockito') or \
       lib.startswith('org.powermock:powermock'):
        return True
    else:
        return False

def findAllUpgradableLibs(client, downloads_dir=_DOWNLOADS_DIR):
    cwd = os.getcwd()
    all_libs = []
    upgradable = False
    os.chdir(downloads_dir + '/' + client['name'])
    p = sub.Popen('mvn versions:display-dependency-updates' + \
                  ' -DprocessDependencyManagement=false -DprocessPluginDependencies=false' + \
                  ' -DprocessPluginDependenciesInPluginManagement=false', shell=True, \
                  stdout=sub.PIPE, stderr=sub.STDOUT) # exclude? TO DISCUSS
    p.wait()
    lines = p.stdout.readlines()
    for i in range(len(lines)):
        lines[i] = lines[i].decode("utf-8")[:-1]
        if 'The following dependencies in Dependencies have newer versions:' in lines[i]:
            upgradable = True
    if upgradable:
        for i in range(len(lines)):
            if '...' in lines[i] and ' -> ' in lines[i]:
                lib_name = lines[i].split(' ..')[0].split()[-1]
                if isLibToBeExcluded(lib_name):
                    continue
                old_version = lines[i].split(' -> ')[0].split('.. ')[1]
                new_version = lines[i].strip().split(' -> ')[-1]
                group_id = lib_name.split(':')[0]
                artifact_id = lib_name.split(':')[1]
                libs_dict = collections.OrderedDict({})
                libs_dict['lib_name'] = lib_name
                libs_dict['old_version'] = old_version
                libs_dict['new_version'] = new_version
                libs_dict['group_id'] = group_id
                libs_dict['artifact_id'] = artifact_id
                all_libs.append(libs_dict)
    for lib in all_libs:
        print (client['name'] + ' >> ' + lib['lib_name'] + ' ' + lib['old_version'] + ' -> ' + \
               lib['new_version'])
    os.chdir(cwd)
    return all_libs

def insertLibVersionInLog(lib_version, log):
    fr = open(log, 'r')
    lines = fr.readlines()
    fr.close()
    lines.insert(0, '[VERSION]: ' + lib_version + '\n')
    fw = open(log, 'w')
    fw.write(''.join(lines))
    fw.close()    

def runClientWithLibVersion(client, lib, i, downloads_dir=_DOWNLOADS_DIR, results_dir=_RESULTS_DIR):
    cwd = os.getcwd()
    os.chdir(downloads_dir + '/' + client['name'])
    if lib == None: # old
        log_dir = results_dir + '/' + client['name']
        log = log_dir + '/old.txt'
        if not os.path.isdir(log_dir):
            os.makedirs(log_dir)
        sub.run('mvn clean dependency:list test -fn', shell=True, \
                stdout=open(log, 'w'), stderr=sub.STDOUT)
    else: # new
        log_dir = results_dir + '/' + client['name'] + '/' + lib['lib_name']
        old_log = log_dir + '/old.txt'
        new_log = log_dir + '/new-' + str(i) + '.txt'
        old_version = lib['old_version']
        new_version = lib['new_version']
        if not os.path.isdir(log_dir):
            os.makedirs(log_dir)
        sub.run('mvn clean dependency:list test -fn', shell=True, \
                stdout=open(new_log, 'w'), stderr=sub.STDOUT)
        shutil.copyfile(results_dir + '/' + client['name'] + '/old.txt', old_log)
        insertLibVersionInLog(old_version, old_log)
        insertLibVersionInLog(new_version, new_log)
    os.chdir(cwd)

def changeLibVersionOfOnePomFile(lib, pom_file):
    fr = open(pom_file, 'r')
    lines = fr.readlines()
    fr.close()
    for i in range(len(lines)):
        if '<groupId>' + lib['group_id'] + '</groupId>' in lines[i]:
            if '<artifactId>' + lib['artifact_id'] + '</artifactId>' in lines[i+1]:
                lines[i+2] = lines[i+2].replace(lib['old_version'], lib['new_version'])
    fw = open(pom_file, 'w')
    fw.write(''.join(lines))
    fw.close()

def changeLibVersion(client, lib, downloads_dir=_DOWNLOADS_DIR):
    client_dir = downloads_dir + '/' + client['name']
    for dir_path, subpaths, files in os.walk(client_dir):
        for f in files:
            if f == 'pom.xml':
                pom_file = dir_path + '/' + f
                changeLibVersionOfOnePomFile(lib, pom_file)

def upgradeAllLibsOfAllClients(clients=CLIENTS):
    for client in clients:
        upgradeAllLibsOfOneClient(client)

def upgradeAllLibsOfOneClient(client, downloads_dir=_DOWNLOADS_DIR):
    cwd = os.getcwd()
    cloneClient(client)
    os.chdir(downloads_dir + '/' + client['name'])
    sub.run('git checkout .', shell=True, stdout=open(os.devnull, 'w'), stderr=sub.PIPE)
    runClientWithLibVersion(client, None, 0) # run old client once
    upgradable_libs = findAllUpgradableLibs(client)
    for lib in upgradable_libs:
        for i in range(3):
            os.chdir(downloads_dir + '/' + client['name'])
            sub.run('git checkout .', shell=True, stdout=open(os.devnull, 'w'), stderr=sub.PIPE)
            upgradeOneLibOfOneClient(client, lib, i) # run each new lib once
    os.chdir(cwd)

def upgradeOneLibOfOneClient(client, lib, i):
    changeLibVersion(client, lib)
    runClientWithLibVersion(client, lib, i)

if __name__ == '__main__':
    opts = parseArgs(sys.argv[1:])
    if not os.path.isdir(_DOWNLOADS_DIR):
        os.makedirs(_DOWNLOADS_DIR)
    if opts.run:
        upgradeAllLibsOfAllClients()
        exit(0)
    elif opts.run_all_libs_one_client:
        client = opts.run_all_libs_one_client
        upgradeAllLibsOfOneClient(client)
        exit(0)
    elif opts.run_one_lib_one_client:
        client = opts.run_one_lib_one_client
        for c in CLIENTS:
            if c['name'] == client:
                client = c
                break
        group_id = opts.groupid
        artifact_id = opts.artifactid
        name = group_id + ':' + artifact_id
        old_version = opts.old
        new_version = opts.new
        library = collections.OrderedDict({'lib_name': name, 'group_id': group_id, 'artifact_id': artifact_id,
                                           'old_version': old_version, 'new_version': new_version})
        upgradeOneLibOfOneClient(client, library)
        exit(0)
