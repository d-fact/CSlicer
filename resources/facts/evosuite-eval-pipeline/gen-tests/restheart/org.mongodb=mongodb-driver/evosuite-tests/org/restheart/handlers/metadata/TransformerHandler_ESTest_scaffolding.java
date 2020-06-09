/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 22 08:46:06 GMT 2019
 */

package org.restheart.handlers.metadata;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TransformerHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.restheart.handlers.metadata.TransformerHandler"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TransformerHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.restheart.handlers.collection.DeleteCollectionHandler",
      "org.restheart.handlers.RequestDispatcherHandler",
      "org.restheart.handlers.RequestContext$REPRESENTATION_FORMAT",
      "com.codahale.metrics.MetricSet",
      "org.xnio.Option$SetBuilder",
      "org.xnio.conduits.StreamSinkConduit",
      "org.xnio.channels.StreamSourceChannel",
      "org.xnio.OptionMap",
      "org.restheart.Bootstrapper",
      "io.undertow.security.api.AuthenticationMechanism$AuthenticationMechanismOutcome",
      "io.undertow.server.protocol.framed.AbstractFramedChannel",
      "io.undertow.io.Sender",
      "org.bson.codecs.Decoder",
      "io.undertow.server.protocol.ajp.AjpServerResponseConduit",
      "io.undertow.io.Receiver$PartialBytesCallback",
      "org.restheart.security.handlers.AuthTokenInjecterHandler",
      "org.bson.BsonDecimal128",
      "org.restheart.handlers.files.DeleteBucketHandler",
      "com.mongodb.client.MongoCollection",
      "org.restheart.handlers.metadata.AbstractTransformerMetadataHandler",
      "org.bson.BsonBoolean",
      "io.undertow.protocols.http2.AbstractHttp2StreamSourceChannel",
      "io.undertow.server.ExchangeCompletionListener",
      "org.xnio.channels.FixedLengthOverflowException",
      "org.restheart.handlers.document.PatchDocumentHandler",
      "org.bson.BsonDocument",
      "io.undertow.util.PathTemplateMatch",
      "org.xnio.Pooled",
      "org.restheart.handlers.collection.PatchCollectionHandler",
      "io.undertow.io.Receiver$PartialStringCallback",
      "org.restheart.handlers.injectors.RequestContextInjectorHandler",
      "io.undertow.util.ConduitFactory",
      "io.undertow.protocols.http2.Http2RstStreamStreamSourceChannel",
      "org.restheart.handlers.root.GetRootHandler",
      "org.xnio.channels.SuspendableAcceptChannel",
      "org.restheart.handlers.files.PutFileHandler",
      "org.xnio.XnioExecutor$Key$1",
      "org.restheart.security.handlers.AuthenticationCallHandler",
      "org.restheart.handlers.applicationlogic.ApplicationLogicHandler",
      "org.bson.BSONException",
      "io.undertow.server.handlers.ResponseCodeHandler",
      "org.bson.diagnostics.Loggers",
      "org.restheart.security.handlers.SecurityHandlerDispacher",
      "org.restheart.utils.RHDaemon",
      "io.undertow.io.Receiver$FullStringCallback",
      "org.jboss.logging.JDKLoggerProvider",
      "org.bson.BsonReader",
      "org.bson.BsonValue",
      "io.undertow.util.HeaderMap",
      "com.codahale.metrics.Counting",
      "org.restheart.metadata.transformers.FilterTransformer",
      "io.undertow.server.protocol.framed.FramePriority",
      "org.xnio.conduits.WriteReadyHandler$ReadyTask",
      "org.restheart.handlers.indexes.GetIndexesHandler",
      "org.restheart.metadata.transformers.RepresentationTransformer$SCOPE",
      "org.restheart.ConfigurationException",
      "io.undertow.UndertowOptions",
      "org.xnio.IoFuture",
      "org.xnio.CompressionType",
      "io.undertow.protocols.http2.ConnectionErrorException",
      "org.restheart.handlers.collection.PutCollectionHandler",
      "org.xnio.XnioIoThread",
      "io.undertow.server.ConnectorStatisticsImpl$1",
      "org.restheart.security.handlers.AuthTokenHandler",
      "io.undertow.protocols.http2.Http2DataStreamSinkChannel$TrailersProducer",
      "org.bson.codecs.Encoder",
      "org.restheart.db.Database",
      "com.mongodb.DB",
      "org.restheart.handlers.document.PutDocumentHandler",
      "org.xnio.ChannelListener$SimpleSetter",
      "io.undertow.security.idm.Account",
      "io.undertow.server.handlers.resource.ResourceManager",
      "org.bson.BsonType",
      "org.xnio.conduits.ConduitStreamSourceChannel",
      "io.undertow.util.PathTemplateMatcher$PathMatchResult",
      "org.xnio.conduits.TerminateHandler",
      "com.codahale.metrics.Meter",
      "org.xnio._private.Messages",
      "io.undertow.server.protocol.ajp.AjpServerConnection",
      "org.xnio.Bits",
      "io.undertow.protocols.http2.HpackEncoder$TableEntry",
      "org.bson.diagnostics.Logger",
      "io.undertow.conduits.ReadDataStreamSourceConduit",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$1",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$2",
      "org.restheart.metadata.transformers.RequestPropsInjecterTransformer",
      "org.jboss.logging.DelegatingBasicLogger",
      "io.undertow.util.ReferenceCountedPooled",
      "org.xnio.Cancellable",
      "io.undertow.server.RenegotiationRequiredException",
      "io.undertow.protocols.http2.HpackEncoder",
      "io.undertow.server.protocol.http.HttpResponseConduit",
      "io.undertow.server.JvmRouteHandler$JvmRouteWrapper",
      "com.codahale.metrics.MetricRegistry$MetricSupplier",
      "io.undertow.protocols.http2.HpackException",
      "io.undertow.util.PathTemplate",
      "org.xnio.channels.ReadListenerSettable",
      "com.codahale.metrics.MetricRegistry$MetricBuilder",
      "com.codahale.metrics.MetricRegistryListener",
      "io.undertow.server.SSLSessionInfo",
      "io.undertow.protocols.http2.Hpack",
      "org.xnio.channels.SuspendableChannel",
      "io.undertow.util.HttpString",
      "org.bson.BsonNumber",
      "io.undertow.conduits.AbstractFramedStreamSinkConduit",
      "org.bson.BsonDbPointer",
      "org.restheart.handlers.files.FileMetadataHandler",
      "io.undertow.protocols.http2.Http2StreamSourceChannel",
      "io.undertow.protocols.http2.HpackEncoder$State",
      "org.xnio.channels.MultipointMessageChannel",
      "io.undertow.conduits.IdleTimeoutConduit",
      "org.restheart.handlers.files.DeleteFileHandler",
      "org.restheart.handlers.metadata.InvalidMetadataException",
      "org.restheart.security.handlers.CORSHandler",
      "org.xnio.channels.BoundMultipointMessageChannel",
      "com.codahale.metrics.Sampling",
      "com.codahale.metrics.Timer",
      "org.bson.BsonWriter",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache",
      "io.undertow.server.protocol.http.HttpRequestParser",
      "org.restheart.handlers.PipedWrappingHandler",
      "org.jboss.logging.AbstractLoggerProvider",
      "org.xnio.conduits.Conduit",
      "org.bson.BsonString",
      "org.bson.BsonMaxKey",
      "org.bson.BsonMinKey",
      "io.undertow.server.DefaultResponseListener",
      "io.undertow.server.protocol.ParseTimeoutUpdater",
      "org.xnio.conduits.WriteReadyHandler$ChannelListenerHandler",
      "org.bson.BsonDateTime",
      "io.undertow.protocols.http2.Http2FrameHeaderParser",
      "io.undertow.security.api.AuthenticationMechanism$ChallengeResult",
      "org.restheart.metadata.transformers.RepresentationTransformer$PHASE",
      "io.undertow.server.DefaultByteBufferPool",
      "org.restheart.metadata.transformers.ValidOidsStringsAsOidsTransformer",
      "io.undertow.server.protocol.framed.AbstractFramedStreamSinkChannel",
      "com.codahale.metrics.MetricRegistry",
      "org.restheart.handlers.ResponseSenderHandler",
      "io.undertow.util.AbstractAttachable",
      "io.undertow.server.JvmRouteHandler$Builder",
      "org.restheart.handlers.metadata.TransformerHandler",
      "org.xnio.XnioExecutor$Key",
      "org.bson.BsonJavaScript",
      "org.xnio.TypeSequenceOption",
      "io.undertow.protocols.http2.Http2GoAwayStreamSourceChannel",
      "io.undertow.protocols.http2.HpackDecoder",
      "org.jboss.logging.LoggerProvider",
      "com.mongodb.util.JSONParseException",
      "org.xnio.channels.SuspendableWriteChannel",
      "org.restheart.handlers.injectors.BodyInjectorHandler",
      "org.restheart.db.DbsDAO",
      "org.xnio.LocalSocketAddress",
      "io.undertow.server.protocol.framed.SendFrameHeader",
      "io.undertow.server.ResponseCommitListener",
      "org.xnio.conduits.AbstractSourceConduit",
      "io.undertow.io.IoCallback",
      "org.restheart.handlers.OptionsHandler",
      "org.bson.BsonArray",
      "io.undertow.util.Headers$1",
      "org.jboss.logging.AbstractMdcLoggerProvider",
      "io.undertow.server.JvmRouteHandler",
      "org.bson.diagnostics.SLF4JLogger",
      "org.bson.assertions.Assertions",
      "org.restheart.handlers.RequestContext",
      "org.xnio.sasl.SaslStrength",
      "org.restheart.handlers.collection.PostCollectionHandler",
      "io.undertow.server.handlers.resource.ResourceChangeListener",
      "org.restheart.Bootstrapper$1",
      "org.xnio.ChannelExceptionHandler",
      "org.restheart.handlers.IllegalQueryParamenterException",
      "io.undertow.conduits.ConduitListener",
      "org.xnio.sasl.SaslQop",
      "org.xnio.XnioWorker$2",
      "org.xnio.Options",
      "org.xnio.XnioWorker$3",
      "org.bson.codecs.Codec",
      "com.codahale.metrics.Gauge",
      "io.undertow.protocols.http2.AbstractHttp2StreamSinkChannel",
      "io.undertow.util.BadRequestException",
      "org.restheart.hal.InvalidHalException",
      "com.codahale.metrics.Histogram",
      "io.undertow.util.PathTemplateMatcher",
      "io.undertow.server.BasicSSLSessionInfo",
      "org.xnio.channels.SimpleAcceptingChannel",
      "org.restheart.handlers.document.GetDocumentHandler",
      "org.jboss.logging.LoggerProviders$1",
      "org.restheart.security.AccessManager",
      "org.xnio.channels.FixedLengthUnderflowException",
      "org.restheart.metadata.transformers.PlainJsonTransformer",
      "org.xnio.conduits.StreamSourceConduit",
      "io.undertow.server.BlockingHttpExchange",
      "io.undertow.server.handlers.PathHandler",
      "org.xnio.AutomaticReference",
      "io.undertow.connector.PooledByteBuffer",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.xnio.XnioExecutor",
      "org.xnio.ByteBufferSlicePool$Slice",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "io.undertow.protocols.http2.HpackDecoder$HeaderEmitter",
      "org.restheart.handlers.bulk.BulkPostCollectionHandler",
      "org.restheart.db.CursorPool$EAGER_CURSOR_ALLOCATION_POLICY",
      "org.restheart.metadata.transformers.Transformer",
      "org.jboss.logging.Logger$Level",
      "io.undertow.server.handlers.builder.HandlerBuilder",
      "org.restheart.handlers.metadata.AfterWriteCheckMetadataHandler",
      "org.xnio.ChannelPipe",
      "io.undertow.server.handlers.form.FormData",
      "org.xnio.channels.SuspendableReadChannel",
      "org.xnio.channels.MulticastMessageChannel",
      "org.xnio.channels.ConnectedChannel",
      "io.undertow.server.handlers.resource.Resource",
      "io.undertow.server.AbstractServerConnection",
      "org.restheart.handlers.metadata.HookMetadataHandler",
      "io.undertow.protocols.http2.Http2DataStreamSinkChannel",
      "io.undertow.server.HandlerWrapper",
      "org.restheart.handlers.NormalOrBulkDispatcherHandler",
      "com.codahale.metrics.MetricFilter",
      "org.restheart.handlers.injectors.AccountInjectorHandler",
      "io.undertow.server.ConnectorStatistics",
      "org.bson.BsonObjectId",
      "org.restheart.handlers.bulk.BulkDeleteDocumentsHandler",
      "com.codahale.metrics.Metric",
      "org.bson.json.JsonParseException",
      "org.xnio.SingleOption",
      "org.xnio.ChannelListener$Setter",
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
      "io.undertow.protocols.http2.Http2Stream",
      "org.bson.BsonWriterSettings",
      "com.mongodb.MongoClientURI",
      "io.undertow.util.CopyOnWriteMap",
      "org.xnio.FileAccess",
      "io.undertow.util.ReferenceCountedPooled$FreeNotifier",
      "org.bson.conversions.Bson",
      "org.jboss.logging.BasicLogger",
      "org.bson.BsonInvalidOperationException",
      "org.xnio.IoFuture$Notifier",
      "org.bson.BsonInt64",
      "org.restheart.handlers.metadata.BeforeWriteCheckMetadataHandler",
      "org.restheart.security.handlers.AuthenticationMechanismsHandler",
      "org.restheart.Configuration",
      "io.undertow.util.AttachmentKey",
      "org.xnio.channels.WriteTimeoutException",
      "org.restheart.handlers.PipedHttpHandler",
      "org.restheart.handlers.files.PostBucketHandler",
      "org.restheart.handlers.RequestLoggerHandler",
      "org.restheart.handlers.indexes.DeleteIndexHandler",
      "io.undertow.connector.ByteBufferPool",
      "org.restheart.handlers.files.GetFileBinaryHandler",
      "org.xnio.conduits.AbstractStreamSinkConduit",
      "org.restheart.handlers.files.PutBucketHandler",
      "io.undertow.server.handlers.GracefulShutdownHandler",
      "org.bson.BsonRegularExpression",
      "org.xnio.channels.Configurable$1",
      "io.undertow.protocols.http2.Hpack$HeaderField",
      "io.undertow.security.idm.Credential",
      "io.undertow.server.handlers.resource.ResourceManager$1",
      "org.restheart.metadata.transformers.RepresentationTransformer",
      "org.restheart.metadata.transformers.OidsAsStringsTransformer",
      "io.undertow.protocols.http2.Http2FramePriority",
      "io.undertow.server.AbstractServerConnection$CloseSetter",
      "org.restheart.handlers.database.DeleteDBHandler",
      "org.xnio.channels.ConcurrentStreamChannelAccessException",
      "org.bson.BsonNull",
      "io.undertow.server.protocol.ajp.AjpReadListener",
      "org.restheart.handlers.bulk.BulkPatchDocumentsHandler",
      "io.undertow.server.ExchangeCompletionListener$NextListener",
      "org.restheart.handlers.RequestContext$TYPE",
      "org.xnio.conduits.AbstractStreamSourceConduit",
      "org.restheart.handlers.document.DeleteDocumentHandler",
      "io.undertow.io.Receiver$ErrorCallback",
      "io.undertow.protocols.http2.Http2PushPromiseStreamSourceChannel",
      "org.xnio.channels.CloseableChannel",
      "io.undertow.server.protocol.framed.FrameHeaderData",
      "org.xnio.Xnio",
      "org.jboss.logging.Logger",
      "org.xnio.channels.Configurable",
      "org.xnio.conduits.WriteReadyHandler",
      "org.xnio.Sequence",
      "io.undertow.protocols.http2.HpackEncoder$HpackHeaderFunction",
      "org.xnio.channels.ReadTimeoutException",
      "org.restheart.utils.URLUtils",
      "org.restheart.handlers.RequestContext$DOC_ID_TYPE",
      "org.jboss.logging.LoggerProviders",
      "io.undertow.util.SimpleAttachmentKey",
      "org.xnio.channels.BoundChannel",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache$1",
      "org.xnio.XnioWorker",
      "org.xnio.conduits.ConduitStreamSinkChannel",
      "io.undertow.server.ConnectorStatisticsImpl",
      "io.undertow.server.handlers.Cookie",
      "org.restheart.handlers.files.GetFileHandler",
      "io.undertow.server.HttpHandler",
      "org.xnio.conduits.ReadReadyHandler",
      "org.jboss.logging.JDKLogger",
      "io.undertow.protocols.http2.HpackEncoder$1",
      "org.xnio.OptionMap$Builder",
      "io.undertow.server.protocol.http.HttpReadListener",
      "org.bson.BsonInt32",
      "org.bson.BsonBinary",
      "io.undertow.server.JvmRouteHandler$Wrapper",
      "io.undertow.server.HttpServerExchange",
      "com.mongodb.client.MongoDatabase",
      "io.undertow.server.ServerConnection",
      "org.xnio.IoFuture$HandlingNotifier",
      "org.xnio.channels.CloseListenerSettable",
      "io.undertow.protocols.http2.Http2StreamSinkChannel",
      "org.restheart.security.handlers.HeadersManager",
      "org.restheart.handlers.MetricsInstrumentationHandler",
      "org.restheart.metadata.transformers.HashTransformer",
      "org.xnio.channels.StreamSinkChannel",
      "io.undertow.server.ServerConnection$CloseListener",
      "org.restheart.handlers.database.GetDBHandler",
      "org.jboss.logging.Slf4jLogger",
      "org.bson.BsonJavaScriptWithScope",
      "org.xnio.BufferAllocator",
      "io.undertow.server.RoutingHandler",
      "io.undertow.conduits.AbstractFixedLengthStreamSinkConduit",
      "org.restheart.handlers.injectors.DbPropsInjectorHandler",
      "org.xnio.channels.ReadableMultipointMessageChannel",
      "org.bson.json.JsonWriterSettings",
      "org.bson.codecs.configuration.CodecRegistry",
      "io.undertow.server.protocol.framed.AbstractFramedStreamSourceChannel",
      "org.restheart.security.handlers.AccessManagerHandler",
      "io.undertow.protocols.http2.Http2HeadersStreamSinkChannel",
      "org.xnio.SslClientAuthMode",
      "org.restheart.Configuration$METRICS_GATHERING_LEVEL",
      "org.bson.types.Decimal128",
      "org.restheart.hal.UnsupportedDocumentIdException",
      "io.undertow.protocols.http2.Http2PingStreamSourceChannel",
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
      "org.restheart.metadata.transformers.WriteResultTransformer",
      "org.bson.BsonSymbol",
      "io.undertow.protocols.http2.Http2Channel",
      "org.xnio.channels.WriteListenerSettable",
      "io.undertow.security.api.NotificationReceiver",
      "io.undertow.util.HeaderValues",
      "io.undertow.protocols.http2.Http2SettingsStreamSourceChannel",
      "org.xnio.Option",
      "org.xnio.TypeOption",
      "io.undertow.security.idm.IdentityManager",
      "io.undertow.util.ImmediatePooledByteBuffer",
      "com.codahale.metrics.Counter",
      "com.codahale.metrics.Metered",
      "io.undertow.server.ConduitWrapper",
      "org.xnio.ChannelListener",
      "org.xnio.SequenceOption",
      "org.xnio.conduits.AbstractSinkConduit",
      "io.undertow.server.HttpUpgradeListener",
      "org.xnio._private.Messages_$logger",
      "org.restheart.security.handlers.SecurityInitialHandler",
      "org.jboss.logging.Logger$1",
      "org.restheart.handlers.indexes.PutIndexHandler",
      "org.xnio.Pool",
      "io.undertow.util.ListAttachmentKey",
      "org.restheart.security.handlers.AuthenticationConstraintHandler",
      "io.undertow.util.AttachmentList",
      "org.xnio.conduits.SinkConduit",
      "org.restheart.handlers.RequestContext$METHOD",
      "io.undertow.util.Attachable",
      "io.undertow.io.Receiver",
      "io.undertow.server.protocol.http.HttpServerConnection",
      "org.restheart.handlers.RequestContext$HAL_MODE",
      "org.restheart.handlers.RequestContext$ETAG_CHECK_POLICY",
      "org.xnio.channels.AcceptingChannel",
      "org.xnio.StreamConnection",
      "io.undertow.conduits.ByteActivityCallback",
      "org.xnio.conduits.AbstractConduit",
      "org.xnio.ByteBufferSlicePool$Ref",
      "org.bson.BsonTimestamp",
      "org.xnio.Option$ValueParser",
      "org.restheart.handlers.database.PutDBHandler",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option$9",
      "io.undertow.protocols.http2.Http2StreamSourceChannel$TrailersHandler",
      "org.restheart.db.OperationResult",
      "io.undertow.server.XnioByteBufferPool",
      "org.restheart.handlers.metadata.RequestTransformerMetadataHandler",
      "org.xnio.Option$10",
      "org.restheart.handlers.collection.GetCollectionHandler",
      "org.xnio.conduits.SourceConduit",
      "io.undertow.server.AbstractServerConnection$ConduitState",
      "org.xnio.Option$3",
      "org.xnio.Option$4",
      "org.restheart.handlers.metadata.ResponseTransformerMetadataHandler",
      "io.undertow.util.Headers",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "io.undertow.io.Receiver$FullBytesCallback",
      "org.xnio.Option$1",
      "org.xnio.Option$2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TransformerHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.restheart.handlers.PipedHttpHandler",
      "org.restheart.handlers.metadata.TransformerHandler",
      "org.restheart.metadata.transformers.RepresentationTransformer$PHASE",
      "org.restheart.handlers.ResponseSenderHandler",
      "org.restheart.db.DbsDAO",
      "org.restheart.handlers.MetricsInstrumentationHandler",
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
      "org.restheart.handlers.RequestLoggerHandler",
      "org.restheart.metadata.transformers.ValidOidsStringsAsOidsTransformer",
      "org.restheart.metadata.transformers.PlainJsonTransformer",
      "org.restheart.metadata.transformers.OidsAsStringsTransformer",
      "org.restheart.metadata.transformers.WriteResultTransformer",
      "org.restheart.metadata.transformers.RequestPropsInjecterTransformer",
      "org.restheart.metadata.transformers.FilterTransformer",
      "org.restheart.handlers.NormalOrBulkDispatcherHandler",
      "org.restheart.metadata.transformers.HashTransformer",
      "org.xnio.Option$1",
      "org.xnio.Option$2",
      "org.xnio.Option$3",
      "org.xnio.Option$4",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option",
      "org.xnio.Connection",
      "org.xnio.StreamConnection",
      "io.undertow.server.DefaultByteBufferPool",
      "io.undertow.util.ImmediatePooledByteBuffer",
      "org.xnio.SingleOption",
      "org.xnio.OptionMap",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$2",
      "io.undertow.server.protocol.framed.AbstractFramedChannel",
      "io.undertow.util.HttpString",
      "io.undertow.protocols.http2.Http2Channel",
      "io.undertow.protocols.http2.Http2FramePriority",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$1",
      "io.undertow.UndertowOptions",
      "io.undertow.util.ReferenceCountedPooled",
      "io.undertow.conduits.IdleTimeoutConduit",
      "io.undertow.conduits.IdleTimeoutConduit$1",
      "io.undertow.server.JvmRouteHandler",
      "io.undertow.server.JvmRouteHandler$JvmRouteWrapper",
      "org.restheart.handlers.OptionsHandler",
      "org.restheart.handlers.PipedWrappingHandler",
      "io.undertow.util.AbstractAttachable",
      "io.undertow.server.ServerConnection",
      "io.undertow.server.AbstractServerConnection",
      "io.undertow.server.protocol.ajp.AjpServerConnection",
      "io.undertow.server.AbstractServerConnection$CloseSetter",
      "org.xnio.conduits.WriteReadyHandler$ChannelListenerHandler",
      "org.restheart.handlers.RequestContext",
      "org.restheart.handlers.RequestContext$DOC_ID_TYPE",
      "org.restheart.handlers.RequestContext$HAL_MODE",
      "org.restheart.utils.URLUtils",
      "io.undertow.util.AttachmentKey",
      "io.undertow.util.SimpleAttachmentKey",
      "org.xnio.Bits",
      "io.undertow.server.HttpServerExchange",
      "io.undertow.util.HeaderMap",
      "org.xnio.ReadPropertyAction",
      "org.xnio.ByteBufferSlicePool",
      "org.xnio.BufferAllocator$1",
      "org.xnio.BufferAllocator$2",
      "org.xnio.BufferAllocator",
      "org.xnio.ByteBufferSlicePool$1",
      "org.jboss.logging.Logger$1",
      "org.jboss.logging.DelegatingBasicLogger",
      "org.xnio._private.Messages_$logger",
      "org.xnio._private.Messages",
      "io.undertow.server.ConnectorStatisticsImpl",
      "io.undertow.server.ConnectorStatisticsImpl$1",
      "io.undertow.util.HeaderValues",
      "io.undertow.server.XnioByteBufferPool",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache",
      "org.xnio.ByteBufferSlicePool$ThreadLocalCache$1",
      "org.xnio.ByteBufferSlicePool$Slice",
      "io.undertow.server.protocol.http.HttpServerConnection"
    );
  }
}
