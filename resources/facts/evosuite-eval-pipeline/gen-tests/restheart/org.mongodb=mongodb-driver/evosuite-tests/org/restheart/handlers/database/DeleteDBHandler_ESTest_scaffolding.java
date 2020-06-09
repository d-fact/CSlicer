/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 22 08:53:05 GMT 2019
 */

package org.restheart.handlers.database;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DeleteDBHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.restheart.handlers.database.DeleteDBHandler"; 
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
    java.lang.System.setProperty("user.dir", "/home/cgzhu/projects/gitslice/resources/facts/evosuite-eval-pipeline/gen-tests/restheart/org.mongodb=mongodb-driver"); 
    java.lang.System.setProperty("user.home", "/home/cgzhu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgzhu"); 
    java.lang.System.setProperty("user.timezone", "Asia/Singapore"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DeleteDBHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.restheart.handlers.collection.DeleteCollectionHandler",
      "org.restheart.handlers.RequestDispatcherHandler",
      "org.restheart.metadata.checkers.RequestChecker",
      "org.xnio.management.XnioProviderMXBean",
      "org.restheart.handlers.RequestContext$REPRESENTATION_FORMAT",
      "org.jboss.logging.JBossLogRecord",
      "com.codahale.metrics.MetricSet",
      "org.xnio.Option$SetBuilder",
      "org.xnio.conduits.StreamSinkConduit",
      "org.xnio.channels.StreamSourceChannel",
      "org.xnio.OptionMap",
      "org.restheart.Bootstrapper",
      "org.bson.codecs.BsonInt64Codec",
      "io.undertow.security.api.AuthenticationMechanism$AuthenticationMechanismOutcome",
      "io.undertow.server.protocol.framed.AbstractFramedChannel",
      "org.bson.codecs.EncoderContext",
      "org.restheart.db.GridFsRepository",
      "io.undertow.io.Sender",
      "org.xnio.ByteBufferSlicePool$PooledByteBuffer",
      "org.bson.BsonDocumentWrapper",
      "org.bson.codecs.Decoder",
      "io.undertow.protocols.http2.Http2DiscardParser",
      "io.undertow.server.protocol.ajp.AjpServerResponseConduit",
      "io.undertow.io.Receiver$PartialBytesCallback",
      "org.restheart.security.handlers.AuthTokenInjecterHandler",
      "org.bson.BsonDecimal128",
      "org.restheart.handlers.files.DeleteBucketHandler",
      "io.undertow.protocols.http2.Http2SettingsParser",
      "com.mongodb.client.MongoCollection",
      "org.bson.json.RelaxedExtendedJsonDateTimeConverter",
      "org.restheart.handlers.metadata.AbstractTransformerMetadataHandler",
      "org.bson.BsonBoolean",
      "io.undertow.util.ETag",
      "io.undertow.protocols.http2.AbstractHttp2StreamSourceChannel",
      "io.undertow.server.ExchangeCompletionListener",
      "org.xnio.channels.FixedLengthOverflowException",
      "org.restheart.handlers.document.PatchDocumentHandler",
      "io.undertow.protocols.http2.Http2WindowUpdateParser",
      "org.bson.BsonDocument",
      "io.undertow.util.PathTemplateMatch",
      "org.xnio.Pooled",
      "org.restheart.handlers.collection.PatchCollectionHandler",
      "org.bson.json.LegacyExtendedJsonRegularExpressionConverter",
      "io.undertow.io.Receiver$PartialStringCallback",
      "org.restheart.handlers.injectors.RequestContextInjectorHandler",
      "io.undertow.util.ConduitFactory",
      "io.undertow.server.DefaultByteBufferPool$ThreadLocalData",
      "org.bson.json.ShellMinKeyConverter",
      "io.undertow.protocols.http2.Http2RstStreamStreamSourceChannel",
      "org.restheart.handlers.root.GetRootHandler",
      "org.bson.AbstractBsonReader$State",
      "org.bson.json.JsonWriterSettings$Builder",
      "org.xnio.channels.SuspendableAcceptChannel",
      "org.bson.codecs.BsonBinaryCodec",
      "org.bson.json.ShellObjectIdConverter",
      "org.restheart.handlers.files.PutFileHandler",
      "org.xnio.XnioExecutor$Key$1",
      "org.restheart.security.handlers.AuthenticationCallHandler",
      "org.restheart.handlers.applicationlogic.ApplicationLogicHandler",
      "org.bson.BSONException",
      "io.undertow.server.handlers.ResponseCodeHandler",
      "io.undertow.protocols.http2.Http2DataFrameParser",
      "org.jboss.logging.Messages",
      "org.bson.diagnostics.Loggers",
      "org.restheart.security.handlers.SecurityHandlerDispacher",
      "io.undertow.util.PathTemplateMatcher$PathTemplateHolder",
      "io.undertow.io.DefaultIoCallback$1",
      "io.undertow.server.RoutingHandler$HandlerHolder",
      "org.restheart.utils.RHDaemon",
      "io.undertow.io.Receiver$FullStringCallback",
      "org.jboss.logging.JDKLoggerProvider",
      "org.bson.json.RelaxedExtendedJsonInt64Converter",
      "org.bson.BsonReader",
      "org.bson.BsonValue",
      "io.undertow.util.HeaderMap",
      "com.codahale.metrics.Counting",
      "io.undertow.server.protocol.framed.FramePriority",
      "org.xnio.conduits.WriteReadyHandler$ReadyTask",
      "org.restheart.handlers.indexes.GetIndexesHandler",
      "org.restheart.metadata.transformers.RepresentationTransformer$SCOPE",
      "org.bson.json.ShellInt64Converter",
      "org.restheart.ConfigurationException",
      "io.undertow.UndertowOptions",
      "org.xnio.IoFuture",
      "org.xnio.CompressionType",
      "io.undertow.protocols.http2.ConnectionErrorException",
      "org.restheart.utils.HttpStatus",
      "org.restheart.handlers.collection.PutCollectionHandler",
      "org.xnio.XnioIoThread",
      "org.bson.codecs.BsonTimestampCodec",
      "io.undertow.server.ConnectorStatisticsImpl$1",
      "org.restheart.security.handlers.AuthTokenHandler",
      "org.bson.codecs.Encoder",
      "io.undertow.protocols.http2.Http2DataStreamSinkChannel$TrailersProducer",
      "org.restheart.db.Database",
      "org.restheart.handlers.document.PutDocumentHandler",
      "org.bson.json.ExtendedJsonTimestampConverter",
      "org.bson.AbstractBsonReader",
      "org.xnio.ChannelListener$SimpleSetter",
      "io.undertow.security.idm.Account",
      "io.undertow.server.handlers.resource.ResourceManager",
      "org.bson.json.ExtendedJsonMaxKeyConverter",
      "org.bson.BsonType",
      "org.xnio.conduits.ConduitStreamSourceChannel",
      "io.undertow.util.PathTemplateMatcher$PathMatchResult",
      "org.xnio.conduits.TerminateHandler",
      "com.codahale.metrics.Meter",
      "org.bson.json.JsonInt32Converter",
      "org.xnio._private.Messages",
      "org.xnio.Bits",
      "io.undertow.server.protocol.ajp.AjpServerConnection",
      "io.undertow.protocols.http2.HpackEncoder$TableEntry",
      "org.bson.codecs.DecoderContext",
      "org.bson.diagnostics.Logger",
      "io.undertow.conduits.ReadDataStreamSourceConduit",
      "io.undertow.security.api.SecurityNotification",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$1",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$2",
      "org.jboss.logging.DelegatingBasicLogger",
      "io.undertow.util.ReferenceCountedPooled",
      "org.xnio.Cancellable",
      "io.undertow.server.RenegotiationRequiredException",
      "io.undertow.protocols.http2.HpackEncoder",
      "org.bson.json.LegacyExtendedJsonBinaryConverter",
      "org.bson.codecs.BsonInt32Codec",
      "org.xnio.XnioFileChannel",
      "org.bson.codecs.BsonRegularExpressionCodec",
      "io.undertow.server.protocol.http.HttpResponseConduit",
      "io.undertow.server.JvmRouteHandler$JvmRouteWrapper",
      "org.bson.json.JsonDoubleConverter",
      "org.bson.json.ExtendedJsonDateTimeConverter",
      "com.codahale.metrics.MetricRegistry$MetricSupplier",
      "io.undertow.protocols.http2.Http2RstStreamParser",
      "io.undertow.protocols.http2.HpackException",
      "io.undertow.util.PathTemplate",
      "com.codahale.metrics.MetricFilter$1",
      "org.xnio.channels.ReadListenerSettable",
      "com.codahale.metrics.MetricRegistry$MetricBuilder",
      "com.codahale.metrics.MetricRegistryListener",
      "io.undertow.server.handlers.GracefulShutdownHandler$ShutdownListener",
      "io.undertow.server.SSLSessionInfo",
      "io.undertow.UndertowMessages_$bundle",
      "io.undertow.protocols.http2.Hpack",
      "org.xnio.channels.SuspendableChannel",
      "com.codahale.metrics.Reservoir",
      "io.undertow.util.HttpString",
      "org.bson.BsonNumber",
      "io.undertow.conduits.AbstractFramedStreamSinkConduit",
      "org.bson.json.ShellDecimal128Converter",
      "org.xnio.Xnio$1",
      "org.bson.BsonDbPointer",
      "org.restheart.handlers.files.FileMetadataHandler",
      "io.undertow.protocols.http2.Http2StreamSourceChannel",
      "io.undertow.protocols.http2.HpackEncoder$State",
      "org.xnio.channels.MultipointMessageChannel",
      "io.undertow.conduits.IdleTimeoutConduit",
      "org.restheart.handlers.files.DeleteFileHandler",
      "org.bson.RawBsonDocument",
      "org.restheart.handlers.metadata.InvalidMetadataException",
      "org.restheart.security.handlers.CORSHandler",
      "io.undertow.server.DefaultByteBufferPool$DefaultPooledBuffer",
      "org.bson.types.Code",
      "org.xnio.channels.BoundMultipointMessageChannel",
      "io.undertow.predicate.AuthenticationRequiredPredicate",
      "com.codahale.metrics.Sampling",
      "com.codahale.metrics.Timer",
      "org.bson.BsonWriter",
      "io.undertow.io.DefaultIoCallback",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache",
      "io.undertow.server.protocol.http.HttpRequestParser",
      "org.restheart.handlers.PipedWrappingHandler",
      "org.jboss.logging.AbstractLoggerProvider",
      "org.bson.codecs.configuration.CodecCache",
      "org.xnio.conduits.Conduit",
      "org.bson.json.ShellDateTimeConverter",
      "org.bson.BsonString",
      "org.bson.BsonMaxKey",
      "io.undertow.server.DefaultResponseListener",
      "org.bson.BsonMinKey",
      "io.undertow.server.protocol.ParseTimeoutUpdater",
      "org.xnio.conduits.WriteReadyHandler$ChannelListenerHandler",
      "org.bson.BsonDateTime",
      "org.bson.json.ShellTimestampConverter",
      "io.undertow.protocols.http2.Http2FrameHeaderParser",
      "io.undertow.security.api.AuthenticationMechanism$ChallengeResult",
      "io.undertow.server.DefaultByteBufferPool",
      "org.restheart.metadata.transformers.RepresentationTransformer$PHASE",
      "io.undertow.server.protocol.framed.AbstractFramedStreamSinkChannel",
      "com.codahale.metrics.MetricRegistry",
      "org.bson.types.Binary",
      "org.restheart.handlers.ResponseSenderHandler",
      "io.undertow.util.AbstractAttachable",
      "io.undertow.server.JvmRouteHandler$Builder",
      "org.restheart.handlers.injectors.LocalCachesSingleton$LocalCachesSingletonHolder",
      "org.restheart.db.FileMetadataRepository",
      "org.restheart.handlers.metadata.TransformerHandler",
      "io.undertow.server.RoutingHandler$RoutingMatch",
      "org.xnio.XnioExecutor$Key",
      "org.bson.BsonJavaScript",
      "org.xnio.TypeSequenceOption",
      "io.undertow.protocols.http2.Http2GoAwayStreamSourceChannel",
      "org.bson.BsonBinaryReader",
      "org.bson.codecs.BsonMaxKeyCodec",
      "org.xnio.ObjectProperties",
      "io.undertow.protocols.http2.HpackDecoder",
      "org.jboss.logging.LoggerProvider",
      "com.mongodb.util.JSONParseException",
      "org.xnio.channels.SuspendableWriteChannel",
      "org.restheart.handlers.injectors.BodyInjectorHandler",
      "org.restheart.db.DbsDAO",
      "io.undertow.protocols.http2.Http2PushBackParser",
      "io.undertow.protocols.http2.Http2PriorityParser",
      "org.xnio.LocalSocketAddress",
      "org.xnio.ObjectProperties$Property",
      "io.undertow.server.protocol.framed.SendFrameHeader",
      "io.undertow.server.ResponseCommitListener",
      "org.xnio.conduits.AbstractSourceConduit",
      "io.undertow.io.IoCallback",
      "org.restheart.handlers.OptionsHandler",
      "org.bson.BsonArray",
      "io.undertow.util.Headers$1",
      "org.jboss.logging.AbstractMdcLoggerProvider",
      "io.undertow.server.JvmRouteHandler",
      "org.bson.codecs.BsonDoubleCodec",
      "org.bson.codecs.configuration.CodecConfigurationException",
      "org.bson.diagnostics.SLF4JLogger",
      "org.bson.assertions.Assertions",
      "org.restheart.handlers.RequestContext",
      "org.xnio.sasl.SaslStrength",
      "org.restheart.handlers.collection.PostCollectionHandler",
      "org.bson.json.ShellUndefinedConverter",
      "io.undertow.server.handlers.resource.ResourceChangeListener",
      "org.restheart.Bootstrapper$1",
      "org.xnio.ChannelExceptionHandler",
      "org.bson.codecs.configuration.CodecRegistries",
      "org.restheart.handlers.IllegalQueryParamenterException",
      "org.bson.codecs.BsonValueCodecProvider",
      "io.undertow.conduits.ConduitListener",
      "org.xnio.sasl.SaslQop",
      "org.xnio.XnioWorker$2",
      "org.xnio.Options",
      "org.bson.codecs.configuration.ChildCodecRegistry",
      "org.xnio.XnioWorker$3",
      "io.undertow.protocols.http2.Http2HeadersParser",
      "org.bson.codecs.BsonBooleanCodec",
      "org.bson.codecs.Codec",
      "io.undertow.util.Methods",
      "com.codahale.metrics.Gauge",
      "io.undertow.protocols.http2.AbstractHttp2StreamSinkChannel",
      "io.undertow.util.BadRequestException",
      "org.bson.codecs.BsonSymbolCodec",
      "org.restheart.hal.InvalidHalException",
      "com.codahale.metrics.Histogram",
      "io.undertow.util.PathTemplateMatcher",
      "io.undertow.server.BasicSSLSessionInfo",
      "org.xnio.channels.SimpleAcceptingChannel",
      "org.restheart.handlers.document.GetDocumentHandler",
      "org.jboss.logging.LoggerProviders$1",
      "org.restheart.security.AccessManager",
      "org.xnio.channels.FixedLengthUnderflowException",
      "org.jboss.logging.JDKLevel",
      "org.xnio.conduits.StreamSourceConduit",
      "io.undertow.server.BlockingHttpExchange",
      "io.undertow.server.handlers.PathHandler",
      "org.xnio.AutomaticReference",
      "io.undertow.connector.PooledByteBuffer",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.xnio.XnioExecutor",
      "com.codahale.metrics.Timer$Context",
      "org.xnio.ByteBufferSlicePool$Slice",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "io.undertow.protocols.http2.HpackDecoder$HeaderEmitter",
      "org.bson.types.Symbol",
      "org.restheart.handlers.bulk.BulkPostCollectionHandler",
      "org.restheart.db.CursorPool$EAGER_CURSOR_ALLOCATION_POLICY",
      "org.bson.codecs.configuration.ProvidersCodecRegistry",
      "org.bson.io.BsonInput",
      "org.restheart.metadata.transformers.Transformer",
      "org.jboss.logging.Logger$Level",
      "io.undertow.server.handlers.builder.HandlerBuilder",
      "org.xnio.ChannelPipe",
      "org.restheart.handlers.metadata.AfterWriteCheckMetadataHandler",
      "io.undertow.server.handlers.form.FormData",
      "org.xnio.channels.SuspendableReadChannel",
      "org.xnio.channels.MulticastMessageChannel",
      "org.bson.json.ShellBinaryConverter",
      "org.xnio.channels.ConnectedChannel",
      "io.undertow.server.handlers.resource.Resource",
      "io.undertow.server.AbstractServerConnection",
      "org.bson.types.CodeWithScope",
      "org.bson.BsonReaderMark",
      "org.restheart.handlers.metadata.HookMetadataHandler",
      "io.undertow.protocols.http2.Http2DataStreamSinkChannel",
      "io.undertow.server.HandlerWrapper",
      "org.bson.codecs.BsonUndefinedCodec",
      "io.undertow.protocols.http2.Http2PingParser",
      "org.restheart.handlers.NormalOrBulkDispatcherHandler",
      "io.undertow.server.DefaultByteBufferPool$LeakDetector",
      "com.codahale.metrics.MetricFilter",
      "org.restheart.handlers.injectors.AccountInjectorHandler",
      "io.undertow.server.ConnectorStatistics",
      "org.bson.BsonObjectId",
      "org.restheart.handlers.bulk.BulkDeleteDocumentsHandler",
      "io.undertow.protocols.http2.Http2GoAwayParser",
      "com.codahale.metrics.Metric",
      "org.bson.json.JsonParseException",
      "org.bson.io.BsonOutput",
      "org.xnio.SingleOption",
      "org.xnio.ChannelListener$Setter",
      "org.bson.json.ExtendedJsonBinaryConverter",
      "org.xnio.channels.WritableMultipointMessageChannel",
      "org.xnio.ByteBufferSlicePool$1",
      "org.restheart.handlers.database.PatchDBHandler",
      "io.undertow.server.protocol.http.ParseState",
      "io.undertow.server.protocol.http.PipeliningBufferingStreamSinkConduit",
      "org.xnio.BufferAllocator$2",
      "io.undertow.server.protocol.http.ServerFixedLengthStreamSinkConduit",
      "io.undertow.security.api.SecurityContext",
      "io.undertow.predicate.Predicate",
      "org.xnio.ByteBufferSlicePool",
      "org.xnio.BufferAllocator$1",
      "org.xnio.management.XnioWorkerMXBean",
      "io.undertow.protocols.http2.Http2Stream",
      "org.bson.BsonWriterSettings",
      "com.mongodb.MongoClientURI",
      "org.xnio.IoFuture$Status",
      "io.undertow.util.CopyOnWriteMap",
      "io.undertow.UndertowMessages",
      "org.xnio.FileAccess",
      "org.bson.json.ShellRegularExpressionConverter",
      "io.undertow.util.MimeMappings$Builder",
      "io.undertow.util.ReferenceCountedPooled$FreeNotifier",
      "org.bson.codecs.configuration.CodecProvider",
      "org.bson.conversions.Bson",
      "org.jboss.logging.BasicLogger",
      "io.undertow.util.MimeMappings",
      "org.bson.BsonInvalidOperationException",
      "org.xnio.IoFuture$Notifier",
      "org.bson.BsonInt64",
      "org.restheart.handlers.metadata.BeforeWriteCheckMetadataHandler",
      "org.bson.json.ShellMaxKeyConverter",
      "org.restheart.security.handlers.AuthenticationMechanismsHandler",
      "org.bson.ByteBuf",
      "org.bson.json.ExtendedJsonInt64Converter",
      "org.bson.json.ExtendedJsonDecimal128Converter",
      "org.restheart.Configuration",
      "io.undertow.util.AttachmentKey",
      "org.xnio.channels.WriteTimeoutException",
      "org.bson.json.JsonStringConverter",
      "org.restheart.handlers.PipedHttpHandler",
      "org.restheart.handlers.files.PostBucketHandler",
      "org.restheart.handlers.RequestLoggerHandler",
      "org.restheart.handlers.indexes.DeleteIndexHandler",
      "org.bson.json.StrictJsonWriter",
      "io.undertow.connector.ByteBufferPool",
      "org.restheart.handlers.files.GetFileBinaryHandler",
      "io.undertow.protocols.http2.Http2PushPromiseParser",
      "org.restheart.db.BulkOperationResult",
      "org.xnio.conduits.AbstractStreamSinkConduit",
      "io.undertow.protocols.http2.Http2HeaderBlockParser",
      "org.bson.codecs.BsonStringCodec",
      "org.restheart.handlers.files.PutBucketHandler",
      "io.undertow.server.handlers.GracefulShutdownHandler",
      "org.bson.BsonRegularExpression",
      "org.xnio.channels.Configurable$1",
      "io.undertow.protocols.http2.Hpack$HeaderField",
      "io.undertow.security.idm.Credential",
      "io.undertow.server.handlers.resource.ResourceManager$1",
      "org.bson.codecs.BsonObjectIdCodec",
      "org.restheart.metadata.transformers.RepresentationTransformer",
      "io.undertow.predicate.FalsePredicate",
      "io.undertow.protocols.http2.Http2FramePriority",
      "io.undertow.attribute.ExchangeAttribute",
      "org.bson.BsonSerializationException",
      "io.undertow.server.AbstractServerConnection$CloseSetter",
      "org.restheart.handlers.database.DeleteDBHandler",
      "io.undertow.util.PathTemplateMatcher$1",
      "org.xnio.channels.ConcurrentStreamChannelAccessException",
      "org.bson.json.ExtendedJsonInt32Converter",
      "org.bson.BsonNull",
      "io.undertow.server.protocol.ajp.AjpReadListener",
      "org.bson.types.MaxKey",
      "org.restheart.handlers.bulk.BulkPatchDocumentsHandler",
      "io.undertow.server.ExchangeCompletionListener$NextListener",
      "org.restheart.handlers.RequestContext$TYPE",
      "org.bson.json.ExtendedJsonMinKeyConverter",
      "org.xnio.conduits.AbstractStreamSourceConduit",
      "org.restheart.handlers.document.DeleteDocumentHandler",
      "org.bson.json.LegacyExtendedJsonDateTimeConverter",
      "io.undertow.io.Receiver$ErrorCallback",
      "io.undertow.protocols.http2.Http2PushPromiseStreamSourceChannel",
      "com.codahale.metrics.Snapshot",
      "org.xnio.channels.CloseableChannel",
      "io.undertow.server.protocol.framed.FrameHeaderData",
      "org.bson.json.ExtendedJsonObjectIdConverter",
      "org.xnio.ssl.XnioSsl",
      "org.xnio.Xnio",
      "org.jboss.logging.Logger",
      "org.xnio.channels.Configurable",
      "org.xnio.conduits.WriteReadyHandler",
      "org.xnio.ssl.JsseXnioSsl",
      "org.xnio.Sequence",
      "io.undertow.protocols.http2.HpackEncoder$HpackHeaderFunction",
      "org.xnio.channels.ReadTimeoutException",
      "org.bson.BsonUndefined",
      "org.restheart.utils.URLUtils",
      "org.restheart.handlers.RequestContext$DOC_ID_TYPE",
      "org.jboss.logging.LoggerProviders",
      "io.undertow.util.SimpleAttachmentKey",
      "org.xnio.FileSystemWatcher",
      "io.undertow.security.api.SecurityNotification$EventType",
      "org.xnio.channels.BoundChannel",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache$1",
      "org.xnio.XnioWorker",
      "org.xnio.channels.MulticastMessageChannel$Key",
      "org.xnio.conduits.ConduitStreamSinkChannel",
      "org.bson.codecs.BsonDBPointerCodec",
      "io.undertow.server.ConnectorStatisticsImpl",
      "io.undertow.conduits.AbstractFramedStreamSinkConduit$FrameCallBack",
      "io.undertow.server.handlers.Cookie",
      "org.restheart.handlers.files.GetFileHandler",
      "io.undertow.server.HttpHandler",
      "org.xnio.conduits.ReadReadyHandler",
      "org.xnio.Xnio$Opener",
      "org.jboss.logging.JDKLogger",
      "io.undertow.protocols.http2.HpackEncoder$1",
      "org.xnio.OptionMap$Builder",
      "io.undertow.server.protocol.http.HttpReadListener",
      "org.bson.BsonInt32",
      "org.bson.BsonBinary",
      "org.bson.Document",
      "io.undertow.server.JvmRouteHandler$Wrapper",
      "org.bson.AbstractBsonReader$Context",
      "io.undertow.server.HttpServerExchange",
      "org.bson.codecs.BsonDecimal128Codec",
      "com.mongodb.client.MongoDatabase",
      "io.undertow.server.ServerConnection",
      "org.xnio.IoFuture$HandlingNotifier",
      "io.undertow.protocols.http2.StreamErrorException",
      "org.xnio.channels.CloseListenerSettable",
      "io.undertow.protocols.http2.Http2StreamSinkChannel",
      "io.undertow.util.ParameterLimitException",
      "org.restheart.security.handlers.HeadersManager",
      "org.restheart.handlers.MetricsInstrumentationHandler",
      "org.xnio.channels.StreamSinkChannel",
      "io.undertow.server.ServerConnection$CloseListener",
      "org.restheart.handlers.database.GetDBHandler",
      "org.jboss.logging.Slf4jLogger",
      "io.undertow.server.handlers.GracefulShutdownHandler$GracefulShutdownListener",
      "org.bson.BsonJavaScriptWithScope",
      "org.xnio.BufferAllocator",
      "io.undertow.attribute.ResponseTimeAttribute",
      "io.undertow.server.RoutingHandler",
      "io.undertow.conduits.AbstractFixedLengthStreamSinkConduit",
      "org.restheart.handlers.injectors.DbPropsInjectorHandler",
      "org.xnio.channels.ReadableMultipointMessageChannel",
      "org.bson.json.JsonWriterSettings",
      "org.bson.codecs.configuration.CodecRegistry",
      "org.bson.codecs.DecoderContext$Builder",
      "org.restheart.metadata.checkers.Checker$PHASE",
      "io.undertow.server.protocol.framed.AbstractFramedStreamSourceChannel",
      "org.restheart.security.handlers.AccessManagerHandler",
      "org.bson.json.JsonMode",
      "org.bson.json.Converter",
      "io.undertow.protocols.http2.Http2HeadersStreamSinkChannel",
      "org.xnio.SslClientAuthMode",
      "org.restheart.Configuration$METRICS_GATHERING_LEVEL",
      "org.xnio.FutureResult$1",
      "org.restheart.handlers.injectors.LocalCachesSingleton",
      "org.bson.types.Decimal128",
      "org.bson.codecs.BsonJavaScriptCodec",
      "org.restheart.hal.UnsupportedDocumentIdException",
      "io.undertow.predicate.PathTemplatePredicate",
      "org.restheart.metadata.checkers.Checker",
      "io.undertow.protocols.http2.Http2PingStreamSourceChannel",
      "org.bson.json.ExtendedJsonDoubleConverter",
      "org.xnio.Property",
      "org.bson.BsonDouble",
      "org.xnio.ReadPropertyAction",
      "org.xnio.XnioIoFactory",
      "io.undertow.security.api.AuthenticationMechanism",
      "org.restheart.handlers.injectors.CollectionPropsInjectorHandler",
      "org.xnio.Connection",
      "org.bson.types.ObjectId",
      "org.xnio.XnioWorker$TaskPool",
      "io.undertow.conduits.IdleTimeoutConduit$1",
      "org.bson.json.JsonNullConverter",
      "org.xnio.management.XnioServerMXBean",
      "org.bson.BsonBinaryReader$Context",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$2",
      "org.bson.BsonSymbol",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$1",
      "io.undertow.protocols.http2.Http2Channel",
      "org.xnio.Version",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$4",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$3",
      "org.xnio.channels.WriteListenerSettable",
      "io.undertow.security.api.NotificationReceiver",
      "org.bson.json.ExtendedJsonUndefinedConverter",
      "io.undertow.util.HeaderValues",
      "io.undertow.protocols.http2.Http2SettingsStreamSourceChannel",
      "org.xnio.Option",
      "org.xnio.TypeOption",
      "io.undertow.security.idm.IdentityManager",
      "io.undertow.util.ImmediatePooledByteBuffer",
      "com.codahale.metrics.Counter",
      "com.codahale.metrics.Metered",
      "org.xnio.Xnio$Nio2Opener",
      "io.undertow.server.ConduitWrapper",
      "org.xnio.channels.SocketAddressBuffer",
      "org.jboss.logging.Messages$1",
      "org.xnio.ChannelListener",
      "org.xnio.SequenceOption",
      "org.xnio.conduits.AbstractSinkConduit",
      "io.undertow.server.HttpUpgradeListener",
      "org.xnio.AbstractIoFuture",
      "org.xnio._private.Messages_$logger",
      "org.restheart.security.handlers.SecurityInitialHandler",
      "org.jboss.logging.Logger$1",
      "org.restheart.handlers.indexes.PutIndexHandler",
      "org.xnio.Pool",
      "io.undertow.util.ListAttachmentKey",
      "org.restheart.security.handlers.AuthenticationConstraintHandler",
      "org.bson.BsonContextType",
      "org.bson.json.RelaxedExtendedJsonDoubleConverter",
      "io.undertow.util.AttachmentList",
      "org.xnio.conduits.SinkConduit",
      "io.undertow.attribute.ReadOnlyAttributeException",
      "org.bson.codecs.EncoderContext$Builder",
      "org.restheart.handlers.RequestContext$METHOD",
      "io.undertow.util.Attachable",
      "io.undertow.io.Receiver",
      "org.xnio.ssl.SslConnection",
      "io.undertow.server.protocol.http.HttpServerConnection",
      "org.restheart.handlers.RequestContext$HAL_MODE",
      "org.restheart.handlers.RequestContext$ETAG_CHECK_POLICY",
      "org.xnio.channels.AcceptingChannel",
      "org.bson.json.ExtendedJsonRegularExpressionConverter",
      "io.undertow.server.handlers.form.FormData$FormValue",
      "org.bson.codecs.BsonDateTimeCodec",
      "org.bson.json.JsonSymbolConverter",
      "org.xnio.StreamConnection",
      "io.undertow.conduits.ByteActivityCallback",
      "org.xnio.channels.SslChannel",
      "org.xnio.FileChangeCallback",
      "org.bson.codecs.BsonTypeClassMap",
      "org.xnio.conduits.AbstractConduit",
      "org.xnio.Result",
      "org.xnio.ByteBufferSlicePool$Ref",
      "org.bson.BsonTimestamp",
      "org.bson.types.MinKey",
      "io.undertow.server.protocol.ajp.AjpServerRequestConduit",
      "org.xnio.Option$ValueParser",
      "org.restheart.handlers.database.PutDBHandler",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option$9",
      "io.undertow.protocols.http2.Http2StreamSourceChannel$TrailersHandler",
      "org.bson.codecs.BsonMinKeyCodec",
      "org.restheart.db.OperationResult",
      "io.undertow.server.XnioByteBufferPool",
      "org.xnio.Option$10",
      "org.restheart.handlers.metadata.RequestTransformerMetadataHandler",
      "org.restheart.handlers.collection.GetCollectionHandler",
      "org.xnio.conduits.SourceConduit",
      "org.bson.json.JsonBooleanConverter",
      "io.undertow.server.AbstractServerConnection$ConduitState",
      "org.bson.codecs.BsonNullCodec",
      "org.xnio.FutureResult",
      "org.xnio.Option$3",
      "io.undertow.util.Headers",
      "org.xnio.Option$4",
      "org.restheart.handlers.metadata.ResponseTransformerMetadataHandler",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "io.undertow.io.Receiver$FullBytesCallback",
      "org.xnio.Option$1",
      "io.undertow.server.protocol.http.CacheMap",
      "org.xnio.Option$2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DeleteDBHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.restheart.handlers.PipedHttpHandler",
      "org.restheart.handlers.database.DeleteDBHandler",
      "io.undertow.util.HttpString",
      "io.undertow.util.Headers$1",
      "io.undertow.util.Headers",
      "org.restheart.utils.HttpStatus",
      "org.restheart.handlers.injectors.LocalCachesSingleton",
      "org.restheart.db.DbsDAO",
      "org.restheart.handlers.injectors.LocalCachesSingleton$LocalCachesSingletonHolder",
      "org.restheart.handlers.RequestLoggerHandler",
      "org.restheart.handlers.MetricsInstrumentationHandler",
      "org.restheart.handlers.ResponseSenderHandler",
      "org.restheart.handlers.PipedWrappingHandler",
      "org.restheart.handlers.OptionsHandler",
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
      "io.undertow.server.JvmRouteHandler",
      "io.undertow.server.JvmRouteHandler$JvmRouteWrapper",
      "org.restheart.handlers.NormalOrBulkDispatcherHandler",
      "org.xnio.Option$1",
      "org.xnio.Option$2",
      "org.xnio.Option$3",
      "org.xnio.Option$4",
      "org.xnio.Connection",
      "org.xnio.StreamConnection",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option",
      "io.undertow.server.DefaultByteBufferPool",
      "org.xnio.OptionMap",
      "io.undertow.util.ReferenceCountedPooled",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$2",
      "io.undertow.server.protocol.framed.AbstractFramedChannel",
      "io.undertow.protocols.http2.Http2Channel",
      "io.undertow.protocols.http2.Http2FramePriority",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$1",
      "org.xnio.SingleOption",
      "io.undertow.UndertowOptions",
      "io.undertow.server.protocol.framed.AbstractFramedStreamSourceChannel",
      "io.undertow.protocols.http2.AbstractHttp2StreamSourceChannel",
      "io.undertow.protocols.http2.Http2StreamSourceChannel",
      "org.xnio.ReadPropertyAction",
      "org.xnio.ByteBufferSlicePool",
      "org.xnio.ByteBufferSlicePool$1",
      "io.undertow.server.XnioByteBufferPool",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache$1",
      "org.xnio.ByteBufferSlicePool$Slice",
      "io.undertow.util.AbstractAttachable",
      "io.undertow.util.AttachmentKey",
      "io.undertow.util.SimpleAttachmentKey",
      "org.xnio.Bits",
      "io.undertow.server.HttpServerExchange",
      "io.undertow.util.HeaderMap",
      "io.undertow.server.ConnectorStatisticsImpl",
      "io.undertow.server.ConnectorStatisticsImpl$1",
      "org.restheart.handlers.RequestContext",
      "org.restheart.utils.URLUtils",
      "org.bson.BsonValue",
      "org.bson.BsonDateTime",
      "io.undertow.util.HeaderValues",
      "org.xnio.BufferAllocator$1",
      "org.xnio.BufferAllocator$2",
      "org.xnio.BufferAllocator",
      "org.jboss.logging.Logger$1",
      "org.jboss.logging.DelegatingBasicLogger",
      "org.xnio._private.Messages_$logger",
      "org.xnio._private.Messages",
      "org.xnio.ByteBufferSlicePool$PooledByteBuffer",
      "io.undertow.conduits.IdleTimeoutConduit",
      "io.undertow.conduits.IdleTimeoutConduit$1",
      "org.bson.BsonJavaScript",
      "org.xnio.TypeSequenceOption",
      "org.xnio.Option$9",
      "io.undertow.util.ImmediatePooledByteBuffer",
      "org.xnio.Option$10",
      "io.undertow.server.DefaultByteBufferPool$DefaultPooledBuffer",
      "io.undertow.server.ServerConnection",
      "io.undertow.server.AbstractServerConnection",
      "io.undertow.server.protocol.ajp.AjpServerConnection",
      "io.undertow.server.AbstractServerConnection$CloseSetter",
      "org.xnio.conduits.ConduitStreamSinkChannel",
      "org.jboss.logging.Messages",
      "org.jboss.logging.Messages$1",
      "io.undertow.UndertowMessages_$bundle",
      "io.undertow.UndertowMessages",
      "org.xnio.TypeOption",
      "org.xnio.Option$SetBuilder",
      "org.xnio.SequenceOption",
      "io.undertow.server.DefaultByteBufferPool$ThreadLocalData",
      "org.bson.BsonType",
      "org.bson.BSONException",
      "org.bson.BsonInvalidOperationException",
      "org.bson.BsonDocument",
      "org.bson.codecs.BsonTypeClassMap",
      "org.bson.codecs.BsonValueCodecProvider",
      "org.bson.codecs.BsonNullCodec",
      "org.bson.codecs.BsonBinaryCodec",
      "org.bson.codecs.BsonBooleanCodec",
      "org.bson.codecs.BsonDateTimeCodec",
      "org.bson.codecs.BsonDBPointerCodec",
      "org.bson.codecs.BsonDoubleCodec",
      "org.bson.codecs.BsonInt32Codec",
      "org.bson.codecs.BsonInt64Codec",
      "org.bson.codecs.BsonDecimal128Codec",
      "org.bson.codecs.BsonMinKeyCodec",
      "org.bson.codecs.BsonMaxKeyCodec",
      "org.bson.codecs.BsonJavaScriptCodec",
      "org.bson.codecs.BsonObjectIdCodec",
      "org.bson.codecs.BsonRegularExpressionCodec",
      "org.bson.codecs.BsonStringCodec",
      "org.bson.codecs.BsonSymbolCodec",
      "org.bson.codecs.BsonTimestampCodec",
      "org.bson.codecs.BsonUndefinedCodec",
      "org.bson.codecs.configuration.CodecRegistries",
      "org.bson.codecs.configuration.ProvidersCodecRegistry",
      "org.bson.codecs.configuration.CodecCache",
      "org.bson.assertions.Assertions",
      "org.bson.RawBsonDocument",
      "io.undertow.predicate.FalsePredicate",
      "io.undertow.util.Methods",
      "io.undertow.util.PathTemplate",
      "io.undertow.server.RoutingHandler$RoutingMatch",
      "io.undertow.util.PathTemplateMatcher$PathTemplateHolder",
      "io.undertow.util.PathTemplateMatcher$1",
      "io.undertow.server.RoutingHandler$HandlerHolder",
      "org.xnio.XnioIoThread",
      "io.undertow.predicate.AuthenticationRequiredPredicate",
      "org.xnio.conduits.WriteReadyHandler$ChannelListenerHandler",
      "io.undertow.server.protocol.http.HttpServerConnection",
      "io.undertow.attribute.ResponseTimeAttribute",
      "io.undertow.predicate.PathTemplatePredicate"
    );
  }
}
