/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 22 09:49:54 GMT 2019
 */

package org.restheart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ConfigurationHelper_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.restheart.ConfigurationHelper"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/home/cgzhu/projects/gitslice/resources/facts/evosuite-eval-pipeline/gen-tests/restheart/org.mongodb=mongodb-driver"); 
    java.lang.System.setProperty("user.home", "/home/cgzhu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgzhu"); 
    java.lang.System.setProperty("user.timezone", "Asia/Singapore"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConfigurationHelper_ESTest_scaffolding.class.getClassLoader() ,
      "org.yaml.snakeyaml.nodes.SequenceNode",
      "org.xnio.management.XnioProviderMXBean",
      "org.restheart.handlers.RequestContext$REPRESENTATION_FORMAT",
      "org.xnio.Option$SetBuilder",
      "org.xnio.conduits.StreamSinkConduit",
      "org.xnio.channels.StreamSourceChannel",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList",
      "org.xnio.OptionMap",
      "org.yaml.snakeyaml.nodes.Node",
      "org.yaml.snakeyaml.composer.Composer",
      "org.yaml.snakeyaml.tokens.FlowMappingStartToken",
      "org.yaml.snakeyaml.constructor.SafeConstructor",
      "org.yaml.snakeyaml.events.SequenceEndEvent",
      "io.undertow.io.Sender",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat",
      "org.yaml.snakeyaml.error.Mark",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceEntry",
      "org.yaml.snakeyaml.reader.UnicodeReader",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap",
      "org.xnio.channels.FixedLengthOverflowException",
      "io.undertow.server.ExchangeCompletionListener",
      "org.bson.BsonDocument",
      "io.undertow.util.PathTemplateMatch",
      "org.xnio.Pooled",
      "com.google.common.collect.DiscreteDomain",
      "org.yaml.snakeyaml.resolver.Resolver",
      "org.yaml.snakeyaml.tokens.Token",
      "com.google.common.collect.Cut",
      "org.yaml.snakeyaml.events.SequenceStartEvent",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap",
      "org.xnio.channels.SuspendableAcceptChannel",
      "org.yaml.snakeyaml.scanner.ScannerException",
      "org.yaml.snakeyaml.nodes.NodeTuple",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceFirstEntry",
      "io.undertow.server.handlers.ResponseCodeHandler",
      "com.google.common.collect.Sets$1$1",
      "org.yaml.snakeyaml.DumperOptions$FlowStyle",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingValue",
      "com.google.common.collect.ImmutableCollection",
      "org.jboss.logging.JDKLoggerProvider",
      "org.yaml.snakeyaml.tokens.FlowMappingEndToken",
      "org.bson.BsonValue",
      "io.undertow.util.HeaderMap",
      "org.yaml.snakeyaml.representer.BaseRepresenter",
      "io.undertow.Undertow$ListenerBuilder",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingEmptyValue",
      "com.google.common.collect.ImmutableCollection$Builder",
      "io.undertow.UndertowOptions",
      "org.restheart.ConfigurationException",
      "org.xnio.IoFuture",
      "org.xnio.CompressionType",
      "org.xnio.XnioIoThread",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum",
      "io.undertow.security.idm.Account",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingKey",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray",
      "org.xnio.conduits.ConduitStreamSourceChannel",
      "io.undertow.util.PathTemplateMatcher$PathMatchResult",
      "org.xnio.conduits.TerminateHandler",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructScalar",
      "org.yaml.snakeyaml.scanner.SimpleKey",
      "com.google.common.collect.ImmutableList",
      "org.xnio._private.Messages",
      "org.xnio.Bits",
      "org.yaml.snakeyaml.representer.Represent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentEnd",
      "org.jboss.logging.DelegatingBasicLogger",
      "io.undertow.server.OpenListener",
      "org.xnio.Cancellable",
      "io.undertow.Undertow$ListenerConfig",
      "io.undertow.Undertow$ListenerInfo",
      "org.xnio.XnioFileChannel",
      "com.google.common.collect.Ordering",
      "io.undertow.util.PathTemplate",
      "org.yaml.snakeyaml.composer.ComposerException",
      "org.xnio.channels.ReadListenerSettable",
      "com.google.common.collect.Sets$3$1",
      "io.undertow.Undertow$1",
      "org.xnio.channels.SuspendableChannel",
      "io.undertow.util.HttpString",
      "org.bson.BsonNumber",
      "org.yaml.snakeyaml.emitter.Emitable",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowMappingFirstKey",
      "org.yaml.snakeyaml.nodes.NodeId",
      "org.xnio.Xnio$1",
      "org.xnio.channels.MultipointMessageChannel",
      "org.yaml.snakeyaml.tokens.AnchorToken",
      "com.google.common.collect.Range",
      "org.yaml.snakeyaml.introspector.Property",
      "org.yaml.snakeyaml.constructor.ConstructorException",
      "org.yaml.snakeyaml.introspector.PropertySubstitute",
      "org.yaml.snakeyaml.representer.SafeRepresenter$IteratorWrapper",
      "com.google.common.collect.RegularImmutableSet",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull",
      "org.xnio.channels.BoundMultipointMessageChannel",
      "org.yaml.snakeyaml.events.StreamStartEvent",
      "org.yaml.snakeyaml.error.YAMLException",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache",
      "com.google.common.collect.Sets$2$1",
      "org.jboss.logging.AbstractLoggerProvider",
      "org.xnio.conduits.Conduit",
      "com.google.common.collect.ImmutableAsList",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode",
      "com.google.common.collect.RegularImmutableAsList",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper",
      "com.google.common.collect.SingletonImmutableSet",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr",
      "com.google.common.collect.Cut$BelowValue",
      "io.undertow.server.DefaultResponseListener",
      "org.yaml.snakeyaml.DumperOptions",
      "io.undertow.Undertow$Builder",
      "com.mongodb.MongoClientOptions",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructMapping",
      "org.yaml.snakeyaml.tokens.ScalarToken",
      "io.undertow.util.AbstractAttachable",
      "com.google.common.collect.AbstractIterator",
      "org.yaml.snakeyaml.LoaderOptions",
      "com.google.common.collect.ImmutableList$1",
      "org.xnio.XnioExecutor$Key",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingValue",
      "org.xnio.TypeSequenceOption",
      "io.undertow.Undertow$ListenerType",
      "org.yaml.snakeyaml.TypeDescription",
      "com.google.common.collect.UnmodifiableIterator",
      "org.xnio.ObjectProperties",
      "org.yaml.snakeyaml.tokens.DocumentStartToken",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingKey",
      "org.jboss.logging.LoggerProvider",
      "org.xnio.channels.SuspendableWriteChannel",
      "com.google.common.collect.ImmutableEnumSet",
      "org.xnio.LocalSocketAddress",
      "io.undertow.server.ResponseCommitListener",
      "org.bson.BsonArray",
      "org.jboss.logging.AbstractMdcLoggerProvider",
      "com.google.common.collect.SingletonImmutableList",
      "org.xnio.sasl.SaslStrength",
      "org.restheart.handlers.RequestContext",
      "com.google.common.base.Function",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseImplicitDocumentStart",
      "org.xnio.ChannelExceptionHandler",
      "org.xnio.sasl.SaslQop",
      "org.xnio.XnioWorker$2",
      "org.xnio.Options",
      "org.xnio.XnioWorker$3",
      "org.yaml.snakeyaml.scanner.Constant",
      "com.google.common.collect.ImmutableList$Builder",
      "io.undertow.util.PathTemplateMatcher",
      "org.xnio.channels.SimpleAcceptingChannel",
      "org.jboss.logging.LoggerProviders$1",
      "com.google.common.collect.Sets$4$1",
      "org.yaml.snakeyaml.serializer.AnchorGenerator",
      "org.yaml.snakeyaml.tokens.StreamEndToken",
      "org.xnio.channels.FixedLengthUnderflowException",
      "org.xnio.conduits.StreamSourceConduit",
      "io.undertow.server.BlockingHttpExchange",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingFirstKey",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator",
      "io.undertow.connector.PooledByteBuffer",
      "org.xnio.XnioExecutor",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.xnio.ByteBufferSlicePool$Slice",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "com.google.common.collect.Cut$BelowAll",
      "org.yaml.snakeyaml.util.ArrayStack",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString",
      "org.yaml.snakeyaml.events.ImplicitTuple",
      "org.restheart.db.CursorPool$EAGER_CURSOR_ALLOCATION_POLICY",
      "org.xnio.ChannelPipe",
      "org.jboss.logging.Logger$Level",
      "org.xnio.channels.SuspendableReadChannel",
      "org.yaml.snakeyaml.reader.StreamReader",
      "org.xnio.channels.MulticastMessageChannel",
      "com.google.common.collect.Cut$AboveAll",
      "org.xnio.channels.ConnectedChannel",
      "org.yaml.snakeyaml.events.ScalarEvent",
      "org.yaml.snakeyaml.parser.ParserImpl",
      "org.yaml.snakeyaml.introspector.BeanAccess",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean",
      "org.yaml.snakeyaml.scanner.ScannerImpl$Chomping",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs",
      "org.yaml.snakeyaml.introspector.MissingProperty",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject",
      "org.yaml.snakeyaml.events.MappingStartEvent",
      "io.undertow.server.DelegateOpenListener",
      "org.yaml.snakeyaml.parser.Parser",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.Sets$1",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceFirstEntry",
      "io.undertow.server.ConnectorStatistics",
      "org.yaml.snakeyaml.parser.Production",
      "org.bson.json.JsonParseException",
      "org.xnio.SingleOption",
      "org.yaml.snakeyaml.error.MarkedYAMLException",
      "org.xnio.channels.WritableMultipointMessageChannel",
      "org.xnio.ChannelListener$Setter",
      "org.yaml.snakeyaml.events.DocumentEndEvent",
      "org.xnio.ByteBufferSlicePool$1",
      "com.google.common.base.Predicate",
      "org.yaml.snakeyaml.tokens.DocumentEndToken",
      "io.undertow.predicate.Predicate",
      "org.xnio.ByteBufferSlicePool",
      "io.undertow.security.api.SecurityContext",
      "org.xnio.management.XnioWorkerMXBean",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper",
      "org.yaml.snakeyaml.scanner.ScannerImpl",
      "com.mongodb.MongoClientURI",
      "org.xnio.IoFuture$Status",
      "io.undertow.util.CopyOnWriteMap",
      "org.xnio.FileAccess",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentStart",
      "org.jboss.logging.BasicLogger",
      "org.bson.conversions.Bson",
      "org.xnio.IoFuture$Notifier",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet",
      "com.google.common.collect.Sets$4",
      "org.restheart.ConfigurationHelper",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentContent",
      "org.yaml.snakeyaml.constructor.Constructor",
      "org.restheart.Configuration",
      "io.undertow.util.AttachmentKey",
      "org.xnio.channels.WriteTimeoutException",
      "org.yaml.snakeyaml.constructor.AbstractConstruct",
      "io.undertow.connector.ByteBufferPool",
      "org.yaml.snakeyaml.nodes.CollectionNode",
      "com.google.common.base.Preconditions",
      "org.yaml.snakeyaml.util.PlatformFeatureDetector",
      "org.xnio.channels.Configurable$1",
      "org.yaml.snakeyaml.parser.VersionTagsTuple",
      "org.yaml.snakeyaml.events.MappingEndEvent",
      "org.yaml.snakeyaml.events.DocumentStartEvent",
      "io.undertow.Undertow",
      "org.yaml.snakeyaml.tokens.FlowSequenceEndToken",
      "org.yaml.snakeyaml.tokens.TagTuple",
      "com.google.common.collect.ImmutableSet",
      "org.xnio.channels.ConcurrentStreamChannelAccessException",
      "org.yaml.snakeyaml.events.Event$ID",
      "org.yaml.snakeyaml.DumperOptions$LineBreak",
      "io.undertow.server.ExchangeCompletionListener$NextListener",
      "org.restheart.handlers.RequestContext$TYPE",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntryMappingKey",
      "org.xnio.channels.CloseableChannel",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray",
      "org.yaml.snakeyaml.parser.ParserException",
      "com.google.common.collect.Cut$AboveValue",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined",
      "org.yaml.snakeyaml.events.CollectionStartEvent",
      "org.xnio.ssl.XnioSsl",
      "org.xnio.Xnio",
      "org.xnio.channels.Configurable",
      "org.yaml.snakeyaml.DumperOptions$ScalarStyle",
      "org.jboss.logging.Logger",
      "org.yaml.snakeyaml.constructor.BaseConstructor",
      "org.yaml.snakeyaml.nodes.MappingNode",
      "org.xnio.conduits.WriteReadyHandler",
      "org.xnio.ssl.JsseXnioSsl",
      "org.xnio.Sequence",
      "org.yaml.snakeyaml.tokens.DirectiveToken",
      "org.xnio.channels.ReadTimeoutException",
      "org.restheart.handlers.RequestContext$DOC_ID_TYPE",
      "org.jboss.logging.LoggerProviders",
      "org.yaml.snakeyaml.tokens.Token$ID",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntryMappingValue",
      "io.undertow.util.SimpleAttachmentKey",
      "org.xnio.FileSystemWatcher",
      "org.xnio.channels.BoundChannel",
      "org.xnio.XnioWorker",
      "org.xnio.channels.MulticastMessageChannel$Key",
      "org.xnio.conduits.ConduitStreamSinkChannel",
      "org.yaml.snakeyaml.scanner.Scanner",
      "io.undertow.server.handlers.Cookie",
      "io.undertow.server.HttpHandler",
      "org.xnio.conduits.ReadReadyHandler",
      "org.xnio.Xnio$Opener",
      "org.jboss.logging.JDKLogger",
      "org.yaml.snakeyaml.events.NodeEvent",
      "org.xnio.OptionMap$Builder",
      "org.bson.BsonInt32",
      "org.yaml.snakeyaml.serializer.NumberAnchorGenerator",
      "org.yaml.snakeyaml.representer.Representer$RepresentJavaBean",
      "com.google.common.collect.ImmutableList$SubList",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper",
      "io.undertow.server.HttpServerExchange",
      "org.xnio.IoFuture$HandlingNotifier",
      "io.undertow.server.ServerConnection",
      "org.xnio.channels.CloseListenerSettable",
      "org.yaml.snakeyaml.events.Event",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt",
      "com.google.common.collect.RegularImmutableList",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray",
      "org.xnio.channels.StreamSinkChannel",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate",
      "org.yaml.snakeyaml.DumperOptions$Version",
      "org.yaml.snakeyaml.tokens.StreamStartToken",
      "org.jboss.logging.Slf4jLogger",
      "org.yaml.snakeyaml.introspector.PropertyUtils",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntryMappingEnd",
      "io.undertow.server.RoutingHandler",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$Builder",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap",
      "org.xnio.channels.ReadableMultipointMessageChannel",
      "org.yaml.snakeyaml.events.CollectionEndEvent",
      "org.xnio.SslClientAuthMode",
      "org.restheart.Configuration$METRICS_GATHERING_LEVEL",
      "org.xnio.Property",
      "org.yaml.snakeyaml.resolver.ResolverTuple",
      "org.yaml.snakeyaml.tokens.TagToken",
      "org.xnio.ReadPropertyAction",
      "org.xnio.XnioIoFactory",
      "org.yaml.snakeyaml.nodes.ScalarNode",
      "org.xnio.Connection",
      "org.xnio.XnioWorker$TaskPool",
      "org.yaml.snakeyaml.events.AliasEvent",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet",
      "org.xnio.management.XnioServerMXBean",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructSequence",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq",
      "org.yaml.snakeyaml.reader.ReaderException",
      "org.yaml.snakeyaml.util.UriEncoder",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$2",
      "org.xnio.Version",
      "org.xnio.channels.WriteListenerSettable",
      "org.xnio.Option",
      "org.xnio.TypeOption",
      "org.yaml.snakeyaml.tokens.FlowSequenceStartToken",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.xnio.Xnio$Nio2Opener",
      "io.undertow.server.ConduitWrapper",
      "org.xnio.channels.SocketAddressBuffer",
      "org.xnio.ChannelListener",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.xnio.SequenceOption",
      "org.yaml.snakeyaml.constructor.Construct",
      "io.undertow.server.HttpUpgradeListener",
      "com.google.common.collect.Sets",
      "org.xnio._private.Messages_$logger",
      "org.jboss.logging.Logger$1",
      "org.yaml.snakeyaml.representer.SafeRepresenter",
      "com.mongodb.MongoClientOptions$Builder",
      "com.google.common.collect.BoundType",
      "org.yaml.snakeyaml.tokens.AliasToken",
      "io.undertow.util.ListAttachmentKey",
      "org.xnio.Pool",
      "io.undertow.util.AttachmentList",
      "org.xnio.conduits.SinkConduit",
      "org.restheart.handlers.RequestContext$METHOD",
      "io.undertow.util.Attachable",
      "io.undertow.io.Receiver",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseStreamStart",
      "org.restheart.handlers.RequestContext$HAL_MODE",
      "org.restheart.handlers.RequestContext$ETAG_CHECK_POLICY",
      "org.xnio.channels.AcceptingChannel",
      "org.yaml.snakeyaml.representer.BaseRepresenter$1",
      "org.yaml.snakeyaml.Yaml",
      "org.xnio.StreamConnection",
      "org.yaml.snakeyaml.resolver.Resolver$1",
      "org.xnio.Result",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseIndentlessSequenceEntry",
      "org.xnio.Option$ValueParser",
      "org.yaml.snakeyaml.events.StreamEndEvent",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option$9",
      "org.xnio.Option$10",
      "org.restheart.db.OperationResult",
      "org.yaml.snakeyaml.nodes.Tag",
      "org.xnio.conduits.SourceConduit",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentUuid",
      "org.xnio.FutureResult",
      "org.xnio.Option$3",
      "org.xnio.Option$4",
      "org.yaml.snakeyaml.representer.Representer",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntry",
      "org.xnio.Option$1",
      "org.xnio.Option$2"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.undertow.Undertow$Builder", false, ConfigurationHelper_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConfigurationHelper_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.Sets",
      "org.xnio.Option$1",
      "org.xnio.Option$2",
      "org.xnio.Option$3",
      "org.xnio.Option$4",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option",
      "org.xnio.SingleOption",
      "io.undertow.UndertowOptions",
      "org.restheart.ConfigurationHelper",
      "org.restheart.handlers.RequestContext$REPRESENTATION_FORMAT",
      "org.restheart.handlers.RequestContext$ETAG_CHECK_POLICY",
      "org.restheart.Configuration",
      "com.mongodb.MongoClientURI",
      "com.mongodb.MongoClientOptions$Builder",
      "io.undertow.Undertow$Builder",
      "org.yaml.snakeyaml.Yaml",
      "org.yaml.snakeyaml.constructor.BaseConstructor",
      "org.yaml.snakeyaml.constructor.AbstractConstruct",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined",
      "org.yaml.snakeyaml.constructor.SafeConstructor",
      "org.yaml.snakeyaml.constructor.Constructor",
      "org.yaml.snakeyaml.TypeDescription",
      "org.yaml.snakeyaml.nodes.NodeId",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$2",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper",
      "org.yaml.snakeyaml.util.UriEncoder",
      "org.yaml.snakeyaml.nodes.Tag",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructScalar",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructMapping",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructSequence",
      "org.yaml.snakeyaml.introspector.PropertyUtils",
      "org.yaml.snakeyaml.util.PlatformFeatureDetector",
      "org.yaml.snakeyaml.introspector.BeanAccess",
      "org.yaml.snakeyaml.representer.BaseRepresenter",
      "org.yaml.snakeyaml.representer.SafeRepresenter",
      "org.yaml.snakeyaml.representer.Representer",
      "org.yaml.snakeyaml.DumperOptions$FlowStyle",
      "org.yaml.snakeyaml.representer.BaseRepresenter$1",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentUuid",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum",
      "org.yaml.snakeyaml.representer.Representer$RepresentJavaBean",
      "org.yaml.snakeyaml.DumperOptions",
      "org.yaml.snakeyaml.DumperOptions$ScalarStyle",
      "org.yaml.snakeyaml.DumperOptions$LineBreak",
      "org.yaml.snakeyaml.serializer.NumberAnchorGenerator",
      "org.yaml.snakeyaml.LoaderOptions",
      "org.yaml.snakeyaml.resolver.Resolver",
      "org.yaml.snakeyaml.resolver.ResolverTuple",
      "org.restheart.ConfigurationException",
      "org.yaml.snakeyaml.reader.StreamReader",
      "org.yaml.snakeyaml.reader.UnicodeReader",
      "org.yaml.snakeyaml.composer.Composer",
      "org.yaml.snakeyaml.parser.ParserImpl",
      "org.yaml.snakeyaml.scanner.ScannerImpl",
      "org.yaml.snakeyaml.util.ArrayStack",
      "org.yaml.snakeyaml.error.Mark",
      "org.yaml.snakeyaml.tokens.Token",
      "org.yaml.snakeyaml.tokens.StreamStartToken",
      "org.yaml.snakeyaml.parser.VersionTagsTuple",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseStreamStart",
      "org.yaml.snakeyaml.events.Event",
      "org.yaml.snakeyaml.events.StreamStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseImplicitDocumentStart",
      "org.yaml.snakeyaml.events.Event$ID",
      "org.yaml.snakeyaml.tokens.Token$ID",
      "org.yaml.snakeyaml.tokens.StreamEndToken",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentStart",
      "org.yaml.snakeyaml.events.StreamEndEvent",
      "org.xnio.Connection",
      "org.xnio.StreamConnection",
      "io.undertow.server.RoutingHandler",
      "io.undertow.util.CopyOnWriteMap",
      "io.undertow.util.PathTemplateMatcher",
      "org.jboss.logging.Logger",
      "org.jboss.logging.LoggerProviders$1",
      "org.jboss.logging.AbstractLoggerProvider",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.jboss.logging.Logger$Level",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "org.jboss.logging.LoggerProviders",
      "io.undertow.server.handlers.ResponseCodeHandler",
      "io.undertow.util.AttachmentKey",
      "io.undertow.util.SimpleAttachmentKey",
      "org.yaml.snakeyaml.scanner.Constant",
      "org.yaml.snakeyaml.scanner.SimpleKey",
      "org.yaml.snakeyaml.tokens.ScalarToken",
      "org.yaml.snakeyaml.events.DocumentStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentEnd",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode",
      "org.yaml.snakeyaml.events.ImplicitTuple",
      "org.yaml.snakeyaml.events.NodeEvent",
      "org.yaml.snakeyaml.events.ScalarEvent",
      "org.yaml.snakeyaml.resolver.Resolver$1",
      "org.yaml.snakeyaml.nodes.Node",
      "org.yaml.snakeyaml.nodes.ScalarNode",
      "org.yaml.snakeyaml.events.DocumentEndEvent",
      "org.xnio.ReadPropertyAction",
      "org.xnio.ByteBufferSlicePool",
      "org.xnio.ByteBufferSlicePool$1",
      "org.jboss.logging.Logger$1",
      "org.jboss.logging.DelegatingBasicLogger",
      "org.xnio._private.Messages_$logger",
      "org.xnio._private.Messages",
      "org.yaml.snakeyaml.error.YAMLException"
    );
  }
}
