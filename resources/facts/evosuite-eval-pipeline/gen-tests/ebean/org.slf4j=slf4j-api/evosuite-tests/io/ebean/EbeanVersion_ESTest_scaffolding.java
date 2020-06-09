/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 22 17:19:48 GMT 2019
 */

package io.ebean;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EbeanVersion_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.ebean.EbeanVersion"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "SG"); 
    java.lang.System.setProperty("user.dir", "/home/cgzhu/projects/gitslice/resources/facts/evosuite-eval-pipeline/gen-tests/ebean/org.slf4j=slf4j-api"); 
    java.lang.System.setProperty("user.home", "/home/cgzhu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgzhu"); 
    java.lang.System.setProperty("user.timezone", "Asia/Singapore"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EbeanVersion_ESTest_scaffolding.class.getClassLoader() ,
      "io.ebean.config.ProfilingConfig",
      "io.ebean.config.ServerConfig$UuidVersion",
      "io.ebean.config.PropertiesWrapper",
      "org.yaml.snakeyaml.nodes.SequenceNode",
      "org.yaml.snakeyaml.introspector.BeanAccess",
      "io.ebean.config.CurrentTenantProvider",
      "io.ebean.bean.BeanLoader",
      "io.ebeaninternal.server.core.JndiDataSourceLookup",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean",
      "io.ebean.PagedList",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs",
      "org.avaje.classpath.scanner.core.ClassPathScanException",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList",
      "org.avaje.datasource.pool.FreeConnectionBuffer",
      "org.yaml.snakeyaml.nodes.Node",
      "org.yaml.snakeyaml.introspector.MissingProperty",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject",
      "io.ebean.config.dbplatform.ExtraDbTypes",
      "org.yaml.snakeyaml.composer.Composer",
      "org.yaml.snakeyaml.constructor.SafeConstructor",
      "org.avaje.classpath.scanner.internal.scanner.classpath.UrlResolver",
      "org.avaje.docker.container.Container",
      "io.ebean.BeanState",
      "org.yaml.snakeyaml.parser.Parser",
      "org.avaje.datasource.PoolStatistics",
      "org.avaje.datasource.pool.PooledConnectionStatistics$LoadValues",
      "io.ebeaninternal.api.TxnProfileEventCodes",
      "io.ebean.config.TenantCatalogProvider",
      "io.ebean.config.Encryptor",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool",
      "io.ebean.Transaction",
      "org.avaje.classpath.scanner.core.ScannerFactory",
      "org.yaml.snakeyaml.error.MarkedYAMLException",
      "io.ebean.DocumentStore",
      "io.ebean.cache.ServerCachePlugin",
      "io.ebean.config.IdGenerator",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat",
      "org.yaml.snakeyaml.error.Mark",
      "io.ebean.Query",
      "io.ebean.EbeanServerFactory",
      "io.ebeaninternal.dbmigration.DbOffline",
      "org.avaje.classpath.scanner.internal.scanner.filesystem.FileSystemScanner",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper",
      "org.yaml.snakeyaml.reader.UnicodeReader",
      "io.ebean.config.JsonConfig$Include",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap",
      "io.ebean.config.ClassLoadConfig$ClassLoaderContext",
      "io.ebean.config.DbMigrationConfig",
      "io.ebean.config.AutoTuneConfig",
      "org.avaje.datasource.core.Factory",
      "io.ebean.plugin.SpiServer",
      "org.avaje.classpath.scanner.FilterResource",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet",
      "org.yaml.snakeyaml.resolver.Resolver",
      "io.ebean.config.UnderscoreNamingConvention",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap",
      "io.ebean.config.dbplatform.h2.H2Platform",
      "io.ebean.config.dbplatform.DbHistorySupport",
      "org.yaml.snakeyaml.constructor.Constructor",
      "io.ebean.meta.MetaInfoManager",
      "io.ebean.TxScope",
      "org.yaml.snakeyaml.nodes.NodeTuple",
      "org.yaml.snakeyaml.constructor.AbstractConstruct",
      "org.avaje.classpath.scanner.internal.ResourceAndClassScanner",
      "org.yaml.snakeyaml.nodes.CollectionNode",
      "io.ebean.config.JsonConfig$DateTime",
      "org.avaje.classpath.scanner.internal.scanner.classpath.ClassPathScanner",
      "org.avaje.classpath.scanner.core.Location",
      "io.ebean.config.dbplatform.DbPlatformType",
      "io.ebean.CallableSql",
      "org.yaml.snakeyaml.util.PlatformFeatureDetector",
      "io.ebean.migration.MigrationException",
      "io.ebean.event.changelog.ChangeLogListener",
      "io.ebeaninternal.api.SpiDtoQuery",
      "org.yaml.snakeyaml.DumperOptions$FlowStyle",
      "io.ebeaninternal.server.core.bootup.BootupClasses",
      "io.ebean.SqlUpdate",
      "com.fasterxml.jackson.core.Versioned",
      "io.ebean.config.dbplatform.DbEncrypt",
      "io.ebean.event.BeanPersistController",
      "org.yaml.snakeyaml.representer.BaseRepresenter",
      "io.ebean.service.SpiContainerFactory",
      "io.ebeaninternal.server.query.STreeType",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary",
      "io.ebean.config.properties.Loader$Source",
      "org.avaje.classpath.scanner.internal.EnvironmentDetection",
      "org.avaje.docker.container.AutoStart",
      "org.yaml.snakeyaml.events.Event$ID",
      "io.ebeaninternal.server.deploy.BeanDescriptor",
      "io.ebeaninternal.api.SpiTransaction",
      "org.yaml.snakeyaml.DumperOptions$LineBreak",
      "io.ebean.config.DbConstraintNaming",
      "io.ebeaninternal.server.query.CQuery",
      "io.ebean.config.ServerConfig",
      "org.avaje.classpath.scanner.ResourceFilter",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray",
      "org.avaje.classpath.scanner.FilterResource$BySuffix",
      "io.ebean.bean.BeanCollection",
      "io.ebean.annotation.Platform",
      "io.ebean.event.BeanPostLoad",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined",
      "io.ebean.config.dbplatform.BasicSqlLimiter",
      "io.ebean.config.dbplatform.SqlExceptionTranslator",
      "io.ebean.Query$ForUpdate",
      "org.yaml.snakeyaml.DumperOptions$ScalarStyle",
      "io.ebean.BackgroundExecutor",
      "org.yaml.snakeyaml.constructor.BaseConstructor",
      "io.ebean.config.dbplatform.PlatformIdGenerator",
      "io.ebean.meta.MetricVisitor",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray",
      "org.yaml.snakeyaml.nodes.MappingNode",
      "io.ebeaninternal.server.core.ClassPathScanners",
      "io.ebean.cache.ServerCache",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructScalar",
      "org.avaje.classpath.scanner.internal.scanner.classpath.FileSystemClassPathLocationScanner",
      "io.ebean.docker.run.Bootup",
      "io.ebean.QueryIterator",
      "io.ebean.config.dbplatform.DbIdentity",
      "io.ebean.Ebean",
      "io.ebean.config.ContainerConfig",
      "io.ebean.config.NamingConvention",
      "org.avaje.datasource.pool.PooledConnectionQueue",
      "org.yaml.snakeyaml.representer.Represent",
      "org.avaje.classpath.scanner.ClassPathScanner",
      "io.ebeaninternal.api.LoadRequest",
      "io.ebean.cache.ServerCacheManager",
      "io.ebeaninternal.server.core.timezone.DataTimeZone",
      "io.ebean.SqlRow",
      "io.ebean.event.BeanQueryAdapter",
      "io.ebean.config.dbplatform.DbType",
      "org.avaje.datasource.pool.ExtendedPreparedStatement",
      "io.ebean.config.ClassLoadConfig",
      "io.ebean.config.EncryptKeyManager",
      "io.ebean.config.dbplatform.SqlLimiter",
      "io.ebean.config.DocStoreConfig",
      "io.ebean.config.AutoTuneMode",
      "io.ebeaninternal.api.SpiTransactionManager",
      "io.ebean.MergeOptions",
      "io.ebean.EbeanServer",
      "org.avaje.datasource.pool.PooledConnectionStatistics",
      "org.yaml.snakeyaml.serializer.NumberAnchorGenerator",
      "io.ebean.event.changelog.ChangeLogPrepare",
      "io.ebeaninternal.dbmigration.ddlgeneration.DdlHandler",
      "org.yaml.snakeyaml.representer.Representer$RepresentJavaBean",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper",
      "io.ebeaninternal.api.SpiJsonContext",
      "org.yaml.snakeyaml.events.Event",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt",
      "io.ebeaninternal.server.deploy.DbReadContext",
      "io.ebeaninternal.api.SpiBackgroundExecutor",
      "org.yaml.snakeyaml.emitter.Emitable",
      "io.ebeaninternal.api.TransactionEventTable",
      "org.avaje.datasource.DataSourceConfig",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp",
      "io.ebean.Filter",
      "org.yaml.snakeyaml.nodes.NodeId",
      "io.ebeaninternal.server.cluster.ClusterManager",
      "org.avaje.datasource.delegate.ConnectionDelegator",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray",
      "io.ebeaninternal.api.SpiContainerBootup",
      "org.avaje.datasource.DataSourceFactory",
      "org.avaje.datasource.delegate.PreparedStatementDelegator",
      "io.ebean.event.BeanPersistListener",
      "io.ebean.config.dbplatform.DatabasePlatform",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate",
      "io.ebean.UpdateQuery",
      "io.ebeaninternal.api.SpiSqlBinding",
      "org.yaml.snakeyaml.introspector.Property",
      "org.yaml.snakeyaml.DumperOptions$Version",
      "org.yaml.snakeyaml.constructor.ConstructorException",
      "io.ebeaninternal.server.lib.ShutdownHook",
      "org.yaml.snakeyaml.introspector.PropertySubstitute",
      "io.ebean.PrimaryServer",
      "io.ebeaninternal.server.core.bootup.ManifestReader",
      "io.ebean.config.TenantSchemaProvider",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull",
      "io.ebean.annotation.DocStoreMode",
      "io.ebeaninternal.server.cache.SpiCacheManager",
      "io.ebean.event.changelog.ChangeLogRegister",
      "io.ebeaninternal.server.core.bootup.BootupClassPathSearch",
      "io.ebean.config.DbConstraintNaming$MaxLength",
      "io.ebean.plugin.BeanType",
      "org.yaml.snakeyaml.introspector.PropertyUtils",
      "io.ebean.config.DbConstraintNormalise",
      "org.yaml.snakeyaml.error.YAMLException",
      "org.avaje.datasource.pool.ConnectionPool",
      "io.ebean.event.BulkTableEventListener",
      "io.ebean.FutureList",
      "io.ebean.config.EncryptDeployManager",
      "io.ebean.config.properties.YamlLoader",
      "io.ebean.FutureIds",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr",
      "io.ebeaninternal.api.SpiProfileTransactionEvent",
      "org.avaje.datasource.ConfigPropertiesHelper",
      "io.ebean.bean.ObjectGraphNode",
      "org.yaml.snakeyaml.DumperOptions",
      "io.ebeaninternal.api.LoadBeanRequest",
      "io.ebean.config.dbplatform.DatabasePlatform$OnQueryOnly",
      "org.avaje.datasource.DataSourcePool",
      "org.avaje.classpath.scanner.internal.scanner.classpath.DefaultUrlResolver",
      "io.ebean.ExpressionFactory",
      "io.ebean.AutoTune",
      "io.ebean.service.SpiContainer",
      "io.ebeaninternal.server.query.CancelableQuery",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructMapping",
      "io.ebeaninternal.server.lib.ShutdownManager",
      "io.ebean.cache.ServerCacheFactory",
      "io.ebean.text.json.JsonContext",
      "org.yaml.snakeyaml.LoaderOptions",
      "io.ebean.config.AutoConfigure",
      "org.avaje.datasource.PoolStatus",
      "org.yaml.snakeyaml.resolver.ResolverTuple",
      "io.ebean.config.CurrentUserProvider",
      "io.ebean.TransactionCallback",
      "io.ebean.migration.MigrationRunner",
      "io.ebeaninternal.server.core.DefaultContainer",
      "io.ebean.config.dbplatform.DbPlatformTypeMapping",
      "com.fasterxml.jackson.core.JsonFactory",
      "io.ebean.text.csv.CsvReader",
      "org.yaml.snakeyaml.nodes.ScalarNode",
      "org.yaml.snakeyaml.TypeDescription",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructSequence",
      "io.ebean.config.EncryptDeploy",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq",
      "io.ebeaninternal.server.DContainerFactory",
      "org.yaml.snakeyaml.util.UriEncoder",
      "io.ebean.config.AbstractNamingConvention",
      "io.ebean.config.PlatformConfig$DbUuid",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$2",
      "io.ebean.bean.EntityBeanIntercept",
      "io.ebean.Ebean$ServerManager",
      "io.ebean.SqlQuery",
      "io.ebean.FutureRowCount",
      "org.avaje.docker.container.ContainerFactory",
      "io.ebean.config.PlatformConfig",
      "io.ebeaninternal.server.transaction.RemoteTransactionEvent",
      "io.ebean.config.TenantDataSourceProvider",
      "io.ebean.migration.MigrationConfig",
      "io.ebean.config.dbplatform.DbDefaultValue",
      "io.ebean.DtoQuery",
      "io.ebean.bean.CallStack",
      "io.ebean.config.ExternalTransactionManager",
      "io.ebean.event.readaudit.ReadAuditPrepare",
      "io.ebeaninternal.server.cluster.ClusterBroadcastFactory",
      "io.ebeaninternal.server.core.bootup.DistillPackages",
      "io.ebean.event.ServerConfigStartup",
      "org.yaml.snakeyaml.constructor.Construct",
      "io.ebeaninternal.server.core.SpiResultSet",
      "io.ebean.config.dbplatform.IdType",
      "org.avaje.classpath.scanner.internal.UrlUtils",
      "io.ebean.config.properties.LoadContext",
      "org.yaml.snakeyaml.representer.SafeRepresenter",
      "io.ebean.bean.BeanCollectionLoader",
      "io.ebean.config.TenantMode",
      "io.ebean.config.properties.PropertiesLoader",
      "io.ebean.event.readaudit.ReadAuditLogger",
      "org.avaje.classpath.scanner.ClassPathScannerFactory",
      "io.ebean.EbeanVersion",
      "org.yaml.snakeyaml.serializer.AnchorGenerator",
      "org.yaml.snakeyaml.representer.BaseRepresenter$1",
      "org.yaml.snakeyaml.Yaml",
      "org.avaje.classpath.scanner.ClassFilter",
      "org.avaje.datasource.pool.ConnectionPool$HeartBeatRunnable",
      "org.avaje.datasource.pool.BusyConnectionBuffer",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator",
      "org.avaje.classpath.scanner.internal.scanner.classpath.ClassPathLocationScanner",
      "io.ebeaninternal.api.LoadManyRequest",
      "io.ebeaninternal.api.SpiQuery",
      "org.avaje.datasource.DataSourceAlertFactory",
      "org.avaje.datasource.DataSourceAlert",
      "io.ebean.config.EncryptKey",
      "org.avaje.datasource.pool.PooledConnection",
      "io.ebean.config.SlowQueryListener",
      "io.ebeaninternal.api.SpiEbeanServer",
      "io.ebean.Update",
      "org.avaje.docker.container.ContainerConfig",
      "org.yaml.snakeyaml.nodes.Tag",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentUuid",
      "io.ebean.annotation.PersistBatch",
      "org.avaje.classpath.scanner.core.Scanner",
      "io.ebean.annotation.TxIsolation",
      "io.ebean.config.TableName",
      "io.ebean.config.dbplatform.DbEncryptFunction",
      "org.avaje.datasource.DataSourcePoolListener",
      "org.avaje.datasource.pool.ExtendedStatement",
      "io.ebean.config.properties.Loader",
      "io.ebean.PersistenceContextScope",
      "org.yaml.snakeyaml.representer.Representer",
      "org.yaml.snakeyaml.reader.StreamReader",
      "io.ebeaninternal.server.cluster.ClusterBroadcast",
      "io.ebean.event.BeanPostConstructListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EbeanVersion_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.ebean.EbeanVersion"
    );
  }
}
