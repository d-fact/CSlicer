/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Aug 21 07:18:57 GMT 2019
 */

package com.pinterest.secor.tools;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ProgressMonitor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.pinterest.secor.tools.ProgressMonitor"; 
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
    java.lang.System.setProperty("user.dir", "/home/cgzhu/projects/gitslice/resources/facts/evosuite-eval-pipeline/gen-tests/secor/org.apache.hadoop=hadoop-common"); 
    java.lang.System.setProperty("user.home", "/home/cgzhu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgzhu"); 
    java.lang.System.setProperty("user.timezone", "Asia/Singapore"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ProgressMonitor_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.lang.StringUtils",
      "com.pinterest.secor.common.ZookeeperConnector",
      "org.apache.commons.configuration.interpol.ConstantLookup",
      "com.twitter.common.quantity.Time",
      "org.apache.commons.configuration.beanutils.DefaultBeanFactory",
      "org.apache.zookeeper.ZooKeeper$States",
      "org.apache.commons.configuration.PropertiesConfiguration$IOFactory",
      "com.pinterest.secor.common.SecorConfig",
      "org.apache.zookeeper.KeeperException$NoAuthException",
      "net.minidev.json.JSONAwareEx",
      "org.apache.commons.httpclient.Header",
      "org.apache.commons.configuration.HierarchicalConfiguration$CloneVisitor",
      "org.apache.commons.lang.exception.NestableException",
      "org.apache.commons.configuration.AbstractConfiguration",
      "org.apache.log4j.Level",
      "org.apache.commons.configuration.MapConfiguration",
      "org.apache.commons.lang.text.StrMatcher$StringMatcher",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$1",
      "org.apache.commons.httpclient.WireLogOutputStream",
      "org.apache.commons.configuration.PatternSubtreeConfigurationWrapper$1",
      "com.twitter.common.quantity.Amount",
      "org.apache.commons.lang.text.StrLookup$MapStrLookup",
      "org.apache.zookeeper.ClientCnxn$SessionTimeoutException",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams",
      "org.apache.zookeeper.server.ByteBufferInputStream",
      "org.apache.zookeeper.Op$Create",
      "org.apache.jute.Record",
      "org.apache.commons.httpclient.auth.AuthScheme",
      "org.apache.commons.configuration.PropertiesConfiguration$DefaultIOFactory",
      "org.apache.log4j.spi.Filter",
      "net.minidev.json.parser.JSONParserReader",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationBuilderProvider",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesWriter",
      "net.minidev.json.JStylerObj$MPAgressive",
      "org.apache.commons.configuration.tree.NodeAddData",
      "org.apache.commons.configuration.HierarchicalConfiguration$DefinedKeysVisitor",
      "org.apache.commons.lang.text.StrSubstitutor",
      "net.minidev.json.mapper.AMapper",
      "org.apache.zookeeper.ZooKeeper$ZKWatchManager",
      "org.apache.commons.configuration.PropertyConverter",
      "org.apache.log4j.Layout",
      "org.apache.commons.configuration.Configuration",
      "org.apache.zookeeper.KeeperException$InvalidACLException",
      "org.apache.zookeeper.client.ZooKeeperSaslClient",
      "org.apache.commons.configuration.tree.DefaultConfigurationNode$SubNodes",
      "org.apache.commons.lang.exception.NestableRuntimeException",
      "org.apache.commons.httpclient.HttpVersion",
      "net.minidev.json.JSONUtil",
      "org.apache.commons.lang.text.StrMatcher$CharMatcher",
      "org.apache.commons.configuration.DefaultConfigurationBuilder",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.zookeeper.Op$SetData",
      "org.apache.commons.httpclient.HttpConnectionManager",
      "org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory",
      "org.apache.commons.configuration.PropertiesConfiguration",
      "org.apache.commons.configuration.XMLConfiguration$XMLNode",
      "org.apache.commons.configuration.DataConfiguration",
      "org.apache.zookeeper.MultiTransactionRecord",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.commons.configuration.reloading.ManagedReloadingStrategyMBean",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "net.minidev.json.JSONStreamAware",
      "org.apache.zookeeper.Watcher",
      "org.apache.zookeeper.KeeperException$CodeDeprecated",
      "org.apache.commons.configuration.event.EventSource",
      "org.apache.commons.configuration.interpol.ConfigurationInterpolator",
      "org.apache.commons.logging.impl.NoOpLog",
      "net.minidev.json.JStylerObj",
      "org.apache.commons.configuration.DynamicCombinedConfiguration",
      "org.apache.commons.configuration.HierarchicalConfiguration$Node",
      "org.apache.zookeeper.Environment$Entry",
      "org.apache.commons.httpclient.Cookie",
      "org.apache.commons.configuration.DefaultFileSystem",
      "org.apache.commons.configuration.XMLConfiguration$XMLFileConfigurationDelegate",
      "org.apache.zookeeper.Watcher$Event$EventType",
      "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException",
      "net.minidev.json.JStylerObj$1",
      "org.apache.commons.httpclient.protocol.Protocol",
      "com.google.common.base.Preconditions",
      "org.apache.commons.httpclient.ConnectionPoolTimeoutException",
      "org.apache.zookeeper.AsyncCallback$DataCallback",
      "org.apache.zookeeper.KeeperException$BadVersionException",
      "org.apache.commons.httpclient.auth.AuthState",
      "org.apache.commons.httpclient.ProxyHost",
      "org.apache.zookeeper.KeeperException$OperationTimeoutException",
      "org.apache.commons.configuration.SubnodeConfiguration",
      "org.apache.commons.configuration.JNDIConfiguration",
      "org.apache.commons.configuration.tree.NodeCombiner",
      "org.apache.zookeeper.AsyncCallback$Children2Callback",
      "com.pinterest.secor.message.Message",
      "org.apache.zookeeper.data.Stat",
      "org.apache.zookeeper.KeeperException$NoNodeException",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$FileExtensionConfigurationProvider",
      "com.twitter.common.zookeeper.ZooKeeperClient",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.commons.httpclient.ConnectTimeoutException",
      "net.minidev.asm.BeansAccess",
      "org.apache.commons.configuration.ConfigurationKey$KeyIterator",
      "org.apache.commons.configuration.PrefixedKeysIterator",
      "net.minidev.json.JStylerObj$MustProtect",
      "org.apache.commons.configuration.DefaultFileSystem$HttpOutputStream",
      "net.minidev.json.JSONStyle",
      "net.minidev.json.JStylerObj$MPTrue",
      "org.apache.log4j.Category",
      "org.apache.zookeeper.Watcher$Event$KeeperState",
      "com.pinterest.secor.tools.ProgressMonitor",
      "com.twitter.common.zookeeper.DistributedLock$LockingException",
      "net.minidev.asm.ConvertDate",
      "org.apache.commons.configuration.PropertiesConfigurationLayout",
      "org.apache.commons.configuration.AbstractConfiguration$2",
      "org.apache.commons.configuration.HierarchicalConfiguration",
      "org.apache.commons.configuration.AbstractConfiguration$1",
      "org.ietf.jgss.GSSException",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.zookeeper.proto.RequestHeader",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.auth.AuthScope",
      "org.apache.zookeeper.KeeperException$AuthFailedException",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.zookeeper.Op$Check",
      "org.apache.commons.lang.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.configuration.HierarchicalConfiguration$DefinedVisitor",
      "org.apache.commons.configuration.tree.OverrideCombiner",
      "org.apache.zookeeper.version.Info",
      "org.apache.log4j.spi.LoggerFactory",
      "com.pinterest.secor.tools.ProgressMonitor$Stat$STAT_KEYS",
      "org.apache.commons.logging.impl.SLF4JLog",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.jute.Index",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.commons.httpclient.HttpHost",
      "org.apache.commons.configuration.FileSystemBased",
      "com.twitter.common.zookeeper.DistributedLock",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "net.minidev.json.JStylerObj$Escape4Web",
      "org.apache.commons.configuration.XMLPropertiesConfiguration$XMLPropertiesHandler",
      "org.apache.commons.lang.text.StrLookup",
      "net.minidev.json.parser.JSONParser",
      "org.apache.commons.configuration.beanutils.BeanFactory",
      "org.apache.commons.configuration.reloading.Reloadable",
      "org.apache.commons.lang.UnhandledException",
      "org.apache.commons.httpclient.URI$DefaultCharsetChanged",
      "com.twitter.common.base.ExceptionalCommand",
      "org.apache.commons.configuration.AbstractHierarchicalFileConfiguration",
      "org.apache.zookeeper.Op$Delete",
      "org.apache.zookeeper.KeeperException$APIErrorException",
      "org.apache.commons.configuration.tree.ConfigurationNodeVisitor",
      "org.apache.commons.httpclient.HttpException",
      "net.minidev.json.parser.JSONParserStream",
      "org.apache.commons.configuration.MultiFileHierarchicalConfiguration$1",
      "org.apache.commons.configuration.MultiFileHierarchicalConfiguration$2",
      "org.apache.commons.configuration.HierarchicalConfiguration$NodeVisitor",
      "org.apache.zookeeper.ClientCnxn$1",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.commons.configuration.tree.DefaultConfigurationKey",
      "org.apache.zookeeper.KeeperException",
      "org.apache.zookeeper.KeeperException$SystemErrorException",
      "org.apache.commons.configuration.resolver.EntityRegistry",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.commons.configuration.tree.DefaultConfigurationKey$KeyIterator",
      "org.apache.zookeeper.KeeperException$SessionExpiredException",
      "org.apache.zookeeper.proto.WatcherEvent",
      "org.apache.commons.configuration.HierarchicalConfiguration$BuilderVisitor",
      "org.apache.zookeeper.AsyncCallback$StringCallback",
      "org.apache.commons.lang.text.StrMatcher$TrimMatcher",
      "net.minidev.json.JSONStreamAwareEx",
      "com.twitter.common.zookeeper.ZooKeeperClient$Credentials$1",
      "net.minidev.json.JStylerObj$MPSimple",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationDeclaration",
      "org.apache.commons.lang.exception.Nestable",
      "org.apache.commons.configuration.tree.DefaultConfigurationNode",
      "org.apache.commons.configuration.PropertiesConfigurationLayout$PropertyLayoutData",
      "net.minidev.json.parser.JSONParserByteArray",
      "net.minidev.asm.FieldFilter",
      "org.apache.log4j.Priority",
      "org.apache.commons.httpclient.ProtocolException",
      "org.apache.commons.configuration.SubsetConfiguration",
      "org.apache.zookeeper.KeeperException$InvalidCallbackException",
      "org.apache.commons.httpclient.auth.AuthenticationException",
      "net.minidev.json.JStylerObj$EscapeLT",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationBeanFactory",
      "org.apache.zookeeper.CreateMode",
      "org.apache.zookeeper.client.HostProvider",
      "org.apache.zookeeper.KeeperException$DataInconsistencyException",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.jute.InputArchive",
      "net.minidev.json.parser.JSONParserInputStream",
      "org.apache.commons.httpclient.URIException",
      "org.apache.commons.configuration.CompositeConfiguration",
      "org.apache.commons.lang.BooleanUtils",
      "org.apache.commons.configuration.HierarchicalConfiguration$5",
      "org.apache.commons.configuration.SystemConfiguration",
      "net.minidev.json.parser.ParseException",
      "org.apache.commons.httpclient.HttpState",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderReader",
      "net.minidev.json.JStylerObj$StringProtector",
      "org.apache.commons.configuration.HierarchicalConfiguration$1",
      "org.apache.commons.configuration.HierarchicalConfiguration$2",
      "org.apache.zookeeper.ZooKeeper",
      "org.apache.zookeeper.ClientCnxnSocket",
      "org.apache.commons.configuration.Lock",
      "net.minidev.json.mapper.UpdaterMapper",
      "org.apache.zookeeper.ZooKeeper$ChildWatchRegistration",
      "org.apache.commons.codec.DecoderException",
      "org.apache.commons.configuration.reloading.InvariantReloadingStrategy",
      "net.minidev.json.parser.JSONParserString",
      "org.apache.commons.configuration.EnvironmentConfiguration",
      "org.apache.commons.configuration.FileOptionsProvider",
      "net.minidev.asm.ex.ConvertException",
      "org.apache.commons.httpclient.auth.MalformedChallengeException",
      "org.apache.commons.configuration.reloading.ReloadingStrategy",
      "org.apache.zookeeper.KeeperException$SessionMovedException",
      "org.apache.commons.configuration.ConfigurationException",
      "net.minidev.json.JSONValue",
      "org.apache.zookeeper.KeeperException$NotReadOnlyException",
      "org.apache.zookeeper.ClientWatchManager",
      "org.apache.commons.httpclient.HttpMethodRetryHandler",
      "org.apache.commons.configuration.FileConfiguration",
      "org.apache.commons.httpclient.params.HttpParams",
      "com.twitter.common.quantity.Amount$4",
      "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException",
      "org.apache.zookeeper.AsyncCallback$ACLCallback",
      "org.apache.commons.configuration.tree.UnionCombiner",
      "org.apache.zookeeper.client.ZooKeeperSaslClient$SaslState",
      "org.apache.commons.httpclient.NameValuePair",
      "org.apache.jute.OutputArchive",
      "org.apache.zookeeper.Version",
      "com.twitter.common.quantity.Amount$3",
      "com.pinterest.secor.common.TopicPartition",
      "com.twitter.common.quantity.Amount$2",
      "com.pinterest.secor.tools.ProgressMonitor$Stat",
      "com.twitter.common.quantity.Amount$1",
      "org.apache.zookeeper.KeeperException$UnimplementedException",
      "org.apache.commons.configuration.XMLPropertiesConfiguration",
      "org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.commons.configuration.AbstractFileConfiguration",
      "org.apache.zookeeper.ZooKeeper$WatchRegistration",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.commons.configuration.tree.ViewNode",
      "net.minidev.json.parser.JSONParserMemory",
      "org.apache.commons.configuration.tree.ConfigurationNodeVisitorAdapter",
      "net.minidev.json.JSONAware",
      "org.apache.commons.httpclient.URI$LocaleToCharsetMap",
      "org.apache.commons.httpclient.protocol.ProtocolSocketFactory",
      "org.apache.commons.httpclient.Credentials",
      "org.apache.commons.configuration.XMLPropertiesConfiguration$1",
      "org.apache.commons.httpclient.HttpMethod",
      "org.apache.commons.configuration.tree.DefaultExpressionEngine",
      "net.minidev.json.JSONArray",
      "org.apache.zookeeper.ClientCnxn$RWServerFoundException",
      "org.apache.zookeeper.AsyncCallback",
      "org.apache.commons.configuration.CombinedConfiguration",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$FileConfigurationProvider",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.zookeeper.AsyncCallback$StatCallback",
      "net.minidev.json.mapper.CompessorMapper",
      "org.apache.commons.configuration.ConfigurationKey",
      "org.apache.commons.configuration.FileSystem",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesReader",
      "org.apache.commons.configuration.beanutils.BeanDeclaration",
      "org.apache.commons.httpclient.HeaderElement",
      "org.apache.zookeeper.ClientCnxn$SessionExpiredException",
      "org.apache.zookeeper.KeeperException$BadArgumentsException",
      "org.apache.log4j.Logger",
      "net.minidev.asm.BasicFiledFilter",
      "com.twitter.common.zookeeper.ZooKeeperClient$ZooKeeperConnectionException",
      "org.apache.zookeeper.ClientCnxn$SendThread",
      "org.apache.commons.configuration.event.ConfigurationListener",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationProvider",
      "org.apache.zookeeper.ZooKeeper$DataWatchRegistration",
      "net.minidev.asm.DefaultConverter",
      "org.apache.zookeeper.KeeperException$ConnectionLossException",
      "net.minidev.json.JSONUtil$JsonSmartFieldFilter",
      "org.apache.commons.configuration.ConfigurationBuilder",
      "org.apache.commons.configuration.tree.ExpressionEngine",
      "org.apache.zookeeper.Op",
      "com.google.common.base.Function",
      "org.apache.zookeeper.KeeperException$MarshallingErrorException",
      "org.apache.zookeeper.Environment",
      "com.pinterest.secor.common.SecorConfig$1",
      "org.apache.commons.lang.text.StrTokenizer",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.configuration.DynamicCombinedConfiguration$1",
      "org.apache.commons.configuration.event.ConfigurationErrorListener",
      "net.minidev.json.JSONObject",
      "org.apache.commons.lang.text.StrMatcher$NoMatcher",
      "net.minidev.asm.BeansAccessConfig",
      "org.apache.zookeeper.proto.ReplyHeader",
      "org.apache.commons.lang.text.StrMatcher",
      "org.apache.commons.httpclient.URI",
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.configuration.event.ConfigurationEvent",
      "org.apache.commons.configuration.HierarchicalReloadableConfiguration",
      "org.apache.commons.configuration.MultiFileHierarchicalConfiguration",
      "org.apache.commons.configuration.resolver.DefaultEntityResolver",
      "org.apache.commons.configuration.beanutils.BeanHelper",
      "org.apache.commons.httpclient.HttpConnection",
      "org.apache.commons.configuration.ConfigurationUtils",
      "org.apache.zookeeper.ClientCnxn",
      "org.apache.commons.configuration.AbstractHierarchicalFileConfiguration$FileConfigurationDelegate",
      "com.twitter.common.collections.Pair",
      "org.apache.commons.configuration.reloading.ManagedReloadingStrategy",
      "org.apache.zookeeper.ZooKeeper$ExistsWatchRegistration",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.commons.configuration.resolver.EntityResolverSupport",
      "org.apache.zookeeper.KeeperException$Code",
      "org.apache.commons.configuration.ConversionException",
      "net.minidev.json.parser.JSONParserBase",
      "org.apache.zookeeper.ClientCnxn$Packet",
      "org.apache.log4j.Appender",
      "org.apache.zookeeper.AsyncCallback$ChildrenCallback",
      "org.apache.zookeeper.KeeperException$NotEmptyException",
      "org.apache.zookeeper.Transaction",
      "org.apache.commons.configuration.BaseConfiguration",
      "com.twitter.common.quantity.Unit",
      "org.apache.commons.httpclient.params.HttpParamsFactory",
      "org.apache.commons.configuration.VerifiableOutputStream",
      "com.twitter.common.zookeeper.ZooKeeperClient$Credentials",
      "org.apache.zookeeper.AsyncCallback$VoidCallback",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.commons.logging.impl.SLF4JLogFactory",
      "net.minidev.asm.Accessor",
      "org.apache.commons.configuration.PatternSubtreeConfigurationWrapper",
      "org.apache.zookeeper.WatchedEvent",
      "org.apache.commons.configuration.event.ConfigurationErrorEvent",
      "net.minidev.asm.ConvertDate$StringCmpNS",
      "org.apache.commons.configuration.tree.ConfigurationNode",
      "org.apache.commons.configuration.HierarchicalINIConfiguration",
      "org.apache.zookeeper.KeeperException$NodeExistsException",
      "org.apache.commons.logging.impl.LogKitLogger",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.commons.configuration.ConfigurationRuntimeException",
      "org.apache.commons.configuration.interpol.EnvironmentLookup",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$XMLConfigurationProvider",
      "org.apache.commons.configuration.XMLConfiguration",
      "org.apache.commons.configuration.tree.MergeCombiner",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.commons.httpclient.StatusLine",
      "com.twitter.common.base.Command",
      "org.apache.commons.configuration.beanutils.XMLBeanDeclaration",
      "org.apache.commons.lang.StringEscapeUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ProgressMonitor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.pinterest.secor.tools.ProgressMonitor",
      "net.minidev.json.JSONObject",
      "com.pinterest.secor.tools.ProgressMonitor$Stat",
      "com.pinterest.secor.tools.ProgressMonitor$Stat$STAT_KEYS",
      "net.minidev.json.JStylerObj$MPSimple",
      "net.minidev.json.JStylerObj$MPTrue",
      "net.minidev.json.JStylerObj$MPAgressive",
      "net.minidev.json.JStylerObj$EscapeLT",
      "net.minidev.json.JStylerObj$Escape4Web",
      "net.minidev.json.JStylerObj",
      "net.minidev.json.JSONStyle",
      "net.minidev.json.parser.JSONParser",
      "net.minidev.json.JSONValue",
      "net.minidev.json.JSONUtil$JsonSmartFieldFilter",
      "net.minidev.json.JSONUtil",
      "net.minidev.asm.BeansAccess",
      "net.minidev.asm.BasicFiledFilter",
      "net.minidev.asm.BeansAccessConfig",
      "com.pinterest.secor.common.SecorConfig$1",
      "com.pinterest.secor.common.SecorConfig",
      "com.pinterest.secor.common.ZookeeperConnector",
      "com.twitter.common.quantity.Time",
      "com.twitter.common.quantity.Amount",
      "com.twitter.common.quantity.Amount$3",
      "com.google.common.base.Preconditions",
      "com.twitter.common.collections.Pair",
      "com.twitter.common.zookeeper.ZooKeeperClient",
      "com.twitter.common.quantity.Amount$4",
      "org.apache.commons.configuration.event.EventSource",
      "org.apache.commons.configuration.AbstractConfiguration",
      "org.apache.commons.configuration.BaseConfiguration",
      "org.apache.commons.configuration.AbstractFileConfiguration",
      "org.apache.commons.configuration.PropertiesConfiguration$DefaultIOFactory",
      "org.apache.commons.configuration.PropertiesConfiguration",
      "org.apache.commons.logging.impl.NoOpLog",
      "org.apache.commons.configuration.Lock",
      "org.apache.commons.configuration.DefaultFileSystem",
      "org.apache.commons.logging.impl.SLF4JLogFactory",
      "org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.commons.configuration.FileSystem",
      "org.apache.commons.configuration.reloading.InvariantReloadingStrategy",
      "org.apache.commons.configuration.AbstractConfiguration$2",
      "org.apache.commons.configuration.ConfigurationUtils",
      "org.apache.commons.lang.exception.NestableException",
      "org.apache.commons.configuration.ConfigurationException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.commons.configuration.XMLPropertiesConfiguration",
      "org.apache.commons.lang.StringUtils",
      "org.apache.commons.configuration.PropertiesConfigurationLayout",
      "org.apache.commons.lang.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang.text.StrMatcher",
      "org.apache.commons.lang.text.StrMatcher$StringMatcher",
      "org.apache.commons.lang.text.StrSubstitutor",
      "org.apache.commons.lang.text.StrLookup$MapStrLookup",
      "org.apache.commons.lang.text.StrLookup",
      "org.apache.commons.configuration.interpol.ConstantLookup",
      "org.apache.commons.configuration.interpol.EnvironmentLookup",
      "org.apache.commons.configuration.MapConfiguration",
      "org.apache.commons.configuration.EnvironmentConfiguration",
      "org.apache.commons.configuration.interpol.ConfigurationInterpolator",
      "org.apache.commons.configuration.AbstractConfiguration$1",
      "org.apache.commons.configuration.PropertiesConfigurationLayout$PropertyLayoutData",
      "org.apache.commons.configuration.event.ConfigurationEvent",
      "org.apache.commons.configuration.PropertyConverter",
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.configuration.SubsetConfiguration",
      "org.apache.commons.lang.BooleanUtils",
      "org.apache.commons.configuration.HierarchicalConfiguration",
      "org.apache.commons.configuration.AbstractHierarchicalFileConfiguration",
      "org.apache.commons.configuration.MultiFileHierarchicalConfiguration$1",
      "org.apache.commons.configuration.MultiFileHierarchicalConfiguration",
      "org.apache.commons.configuration.tree.DefaultConfigurationNode",
      "org.apache.commons.configuration.HierarchicalConfiguration$Node",
      "org.apache.commons.configuration.tree.DefaultConfigurationNode$SubNodes",
      "org.apache.commons.configuration.AbstractHierarchicalFileConfiguration$FileConfigurationDelegate",
      "org.apache.commons.lang.exception.NestableRuntimeException",
      "org.apache.commons.configuration.ConfigurationRuntimeException",
      "org.apache.commons.configuration.HierarchicalReloadableConfiguration",
      "org.apache.commons.configuration.tree.DefaultExpressionEngine",
      "org.apache.commons.configuration.tree.NodeCombiner",
      "org.apache.commons.configuration.tree.UnionCombiner",
      "org.apache.commons.configuration.CombinedConfiguration",
      "org.apache.commons.configuration.DynamicCombinedConfiguration$1",
      "org.apache.commons.configuration.DynamicCombinedConfiguration",
      "org.apache.commons.configuration.PrefixedKeysIterator",
      "org.apache.commons.configuration.tree.OverrideCombiner",
      "org.apache.commons.configuration.reloading.ManagedReloadingStrategy",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesWriter",
      "org.apache.commons.configuration.HierarchicalINIConfiguration",
      "org.apache.commons.configuration.tree.DefaultConfigurationKey",
      "org.apache.commons.configuration.tree.DefaultConfigurationKey$KeyIterator",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesReader",
      "org.apache.commons.configuration.XMLPropertiesConfiguration$1",
      "org.apache.commons.configuration.XMLPropertiesConfiguration$XMLPropertiesHandler",
      "org.apache.commons.configuration.XMLConfiguration",
      "org.apache.commons.configuration.XMLConfiguration$XMLFileConfigurationDelegate",
      "org.apache.commons.configuration.resolver.DefaultEntityResolver",
      "org.apache.commons.configuration.MultiFileHierarchicalConfiguration$2",
      "org.apache.commons.configuration.tree.ViewNode",
      "org.apache.commons.configuration.beanutils.DefaultBeanFactory",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationProvider",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$FileConfigurationProvider",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$FileExtensionConfigurationProvider",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$XMLConfigurationProvider",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationBuilderProvider",
      "org.apache.commons.configuration.DefaultConfigurationBuilder",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$1",
      "org.apache.commons.configuration.beanutils.BeanHelper",
      "org.apache.commons.configuration.DefaultConfigurationBuilder$ConfigurationBeanFactory",
      "org.apache.commons.configuration.DataConfiguration",
      "org.apache.commons.configuration.PatternSubtreeConfigurationWrapper$1",
      "org.apache.commons.configuration.PatternSubtreeConfigurationWrapper",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.lang.StringEscapeUtils",
      "org.apache.commons.configuration.tree.MergeCombiner",
      "org.apache.commons.configuration.tree.ConfigurationNodeVisitorAdapter",
      "org.apache.commons.configuration.HierarchicalConfiguration$DefinedKeysVisitor",
      "org.apache.commons.configuration.SubnodeConfiguration",
      "org.apache.commons.configuration.HierarchicalConfiguration$2",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.commons.httpclient.HttpConnection",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.configuration.CompositeConfiguration",
      "org.apache.commons.logging.impl.LogKitLogger"
    );
  }
}
