/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 22 09:42:39 GMT 2019
 */

package org.restheart.handlers.applicationlogic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ApplicationLogicHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.restheart.handlers.applicationlogic.ApplicationLogicHandler"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ApplicationLogicHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.restheart.security.handlers.AuthenticationMechanismsHandler",
      "org.restheart.handlers.applicationlogic.ApplicationLogicHandler",
      "org.restheart.security.handlers.AccessManagerHandler",
      "org.restheart.security.handlers.AuthenticationCallHandler",
      "org.restheart.security.handlers.SecurityInitialHandler",
      "org.restheart.db.Database",
      "org.restheart.security.handlers.AuthenticationConstraintHandler",
      "org.restheart.security.handlers.AuthTokenInjecterHandler",
      "org.restheart.handlers.PipedHttpHandler",
      "io.undertow.server.HttpHandler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ApplicationLogicHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.restheart.handlers.PipedHttpHandler",
      "org.restheart.handlers.applicationlogic.ApplicationLogicHandler",
      "org.bson.BsonValue",
      "org.bson.BsonString",
      "org.restheart.handlers.applicationlogic.CsvLoaderHandler",
      "org.restheart.handlers.applicationlogic.GetRoleHandler",
      "org.bson.Document",
      "org.restheart.handlers.applicationlogic.CacheInvalidator",
      "org.restheart.db.DbsDAO",
      "org.restheart.handlers.ResponseSenderHandler",
      "org.bson.codecs.ValueCodecProvider",
      "org.bson.codecs.BinaryCodec",
      "org.bson.codecs.BooleanCodec",
      "org.bson.codecs.DateCodec",
      "org.bson.codecs.DoubleCodec",
      "org.bson.codecs.IntegerCodec",
      "org.bson.codecs.LongCodec",
      "org.bson.codecs.MinKeyCodec",
      "org.bson.codecs.MaxKeyCodec",
      "org.bson.codecs.CodeCodec",
      "org.bson.codecs.Decimal128Codec",
      "org.bson.codecs.BigDecimalCodec",
      "org.bson.codecs.ObjectIdCodec",
      "org.bson.codecs.CharacterCodec",
      "org.bson.codecs.StringCodec",
      "org.bson.codecs.SymbolCodec",
      "org.bson.codecs.UuidCodec",
      "org.bson.UuidRepresentation",
      "org.bson.codecs.ByteCodec",
      "org.bson.codecs.PatternCodec",
      "org.bson.codecs.ShortCodec",
      "org.bson.codecs.ByteArrayCodec",
      "org.bson.codecs.FloatCodec",
      "org.bson.codecs.AtomicBooleanCodec",
      "org.bson.codecs.AtomicIntegerCodec",
      "org.bson.codecs.AtomicLongCodec",
      "org.bson.BsonType",
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
      "org.bson.codecs.DocumentCodecProvider",
      "org.bson.assertions.Assertions",
      "org.bson.codecs.configuration.CodecRegistries",
      "org.bson.codecs.configuration.ProvidersCodecRegistry",
      "org.bson.codecs.configuration.CodecCache",
      "org.bson.codecs.DocumentCodec",
      "org.bson.codecs.BsonTypeCodecMap",
      "org.bson.codecs.configuration.ChildCodecRegistry",
      "org.bson.codecs.configuration.Optional$1",
      "org.bson.codecs.configuration.Optional",
      "org.bson.codecs.configuration.Optional$Some",
      "org.bson.codecs.CodeWithScopeCodec",
      "org.bson.codecs.configuration.LazyCodec",
      "org.bson.codecs.configuration.CodecConfigurationException",
      "org.bson.codecs.ObjectIdGenerator",
      "org.bson.codecs.DocumentCodec$1",
      "org.bson.AbstractBsonReader",
      "org.bson.json.JsonReader",
      "org.bson.AbstractBsonReader$State",
      "org.bson.json.JsonScanner",
      "org.bson.json.JsonBuffer",
      "org.bson.AbstractBsonReader$Context",
      "org.bson.json.JsonReader$Context",
      "org.bson.BsonContextType",
      "org.bson.codecs.DecoderContext$Builder",
      "org.bson.codecs.DecoderContext",
      "org.bson.json.JsonToken",
      "org.bson.json.JsonTokenType",
      "org.bson.json.JsonReader$1",
      "org.bson.json.JsonParseException",
      "org.restheart.handlers.PipedWrappingHandler",
      "org.restheart.handlers.OptionsHandler",
      "org.restheart.handlers.NormalOrBulkDispatcherHandler",
      "org.xnio.Option$1",
      "org.xnio.Option$2",
      "org.xnio.Option$3",
      "org.xnio.Option$4",
      "org.xnio.Option$5",
      "org.xnio.Option$6",
      "org.xnio.Option$7",
      "org.xnio.Option$8",
      "org.xnio.Option",
      "org.bson.BSONException",
      "org.bson.BsonInvalidOperationException",
      "org.restheart.handlers.RequestLoggerHandler",
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
      "org.restheart.handlers.MetricsInstrumentationHandler",
      "org.restheart.handlers.applicationlogic.PingHandler",
      "io.undertow.server.JvmRouteHandler",
      "io.undertow.server.JvmRouteHandler$JvmRouteWrapper",
      "org.bson.codecs.IterableCodecProvider",
      "org.bson.codecs.MapCodecProvider",
      "org.bson.codecs.MapCodec",
      "org.bson.codecs.MapCodec$1",
      "org.bson.BsonDocument",
      "io.undertow.server.protocol.framed.AbstractFramedChannel$2",
      "io.undertow.server.protocol.framed.AbstractFramedChannel",
      "io.undertow.util.HttpString",
      "io.undertow.protocols.http2.Http2Channel",
      "org.bson.BsonDocumentReader",
      "org.bson.BsonDocumentReader$Context",
      "org.bson.BsonDocumentReader$BsonDocumentMarkableIterator",
      "org.xnio.Connection",
      "org.xnio.StreamConnection",
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
      "io.undertow.server.XnioByteBufferPool",
      "org.bson.BsonBinaryReader",
      "org.bson.io.ByteBufferBsonInput",
      "org.bson.ByteBufNIO",
      "org.bson.BsonBinaryReader$Context",
      "io.undertow.server.ConnectorStatisticsImpl",
      "io.undertow.server.ConnectorStatisticsImpl$1",
      "io.undertow.util.HeaderMap",
      "io.undertow.server.protocol.framed.AbstractFramedStreamSourceChannel",
      "io.undertow.protocols.http2.AbstractHttp2StreamSourceChannel",
      "io.undertow.protocols.http2.Http2StreamSourceChannel",
      "org.xnio.OptionMap",
      "io.undertow.server.DefaultByteBufferPool",
      "org.xnio.SingleOption",
      "io.undertow.util.AbstractAttachable",
      "io.undertow.util.AttachmentKey",
      "io.undertow.util.SimpleAttachmentKey",
      "org.xnio.Bits",
      "io.undertow.server.HttpServerExchange",
      "org.restheart.handlers.RequestContext",
      "org.restheart.utils.URLUtils",
      "io.undertow.util.HeaderValues",
      "org.bson.BsonWriterSettings",
      "org.bson.json.JsonNullConverter",
      "org.bson.json.JsonStringConverter",
      "org.bson.json.JsonBooleanConverter",
      "org.bson.json.JsonDoubleConverter",
      "org.bson.json.ExtendedJsonDoubleConverter",
      "org.bson.json.RelaxedExtendedJsonDoubleConverter",
      "org.bson.json.JsonInt32Converter",
      "org.bson.json.ExtendedJsonInt32Converter",
      "org.bson.json.JsonSymbolConverter",
      "org.bson.json.ExtendedJsonMinKeyConverter",
      "org.bson.json.ShellMinKeyConverter",
      "org.bson.json.ExtendedJsonMaxKeyConverter",
      "org.bson.json.ShellMaxKeyConverter",
      "org.bson.json.ExtendedJsonUndefinedConverter",
      "org.bson.json.ShellUndefinedConverter",
      "org.bson.json.LegacyExtendedJsonDateTimeConverter",
      "org.bson.json.ExtendedJsonDateTimeConverter",
      "org.bson.json.RelaxedExtendedJsonDateTimeConverter",
      "org.bson.json.ShellDateTimeConverter",
      "org.bson.json.ExtendedJsonBinaryConverter",
      "org.bson.json.LegacyExtendedJsonBinaryConverter",
      "org.bson.json.ShellBinaryConverter",
      "org.bson.json.ExtendedJsonInt64Converter",
      "org.bson.json.RelaxedExtendedJsonInt64Converter",
      "org.bson.json.ShellInt64Converter",
      "org.bson.json.ExtendedJsonDecimal128Converter",
      "org.bson.json.ShellDecimal128Converter",
      "org.bson.json.ExtendedJsonObjectIdConverter",
      "org.bson.json.ShellObjectIdConverter",
      "org.bson.json.ExtendedJsonTimestampConverter",
      "org.bson.json.ShellTimestampConverter",
      "org.bson.json.ExtendedJsonRegularExpressionConverter",
      "org.bson.json.LegacyExtendedJsonRegularExpressionConverter",
      "org.bson.json.ShellRegularExpressionConverter",
      "org.bson.json.JsonWriterSettings",
      "org.bson.json.JsonWriterSettings$Builder",
      "org.bson.json.JsonMode",
      "org.bson.json.JsonJavaScriptConverter",
      "org.bson.AbstractBsonWriter",
      "org.bson.json.JsonWriter",
      "org.bson.NoOpFieldNameValidator",
      "org.bson.AbstractBsonWriter$State",
      "org.bson.AbstractBsonWriter$Context",
      "org.bson.json.JsonWriter$Context",
      "org.bson.json.StrictCharacterStreamJsonWriter",
      "org.bson.json.StrictCharacterStreamJsonWriterSettings",
      "org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder",
      "org.bson.json.StrictCharacterStreamJsonWriter$StrictJsonContext",
      "org.bson.json.StrictCharacterStreamJsonWriter$JsonContextType",
      "org.bson.json.StrictCharacterStreamJsonWriter$State",
      "org.bson.codecs.EncoderContext$Builder",
      "org.bson.codecs.EncoderContext",
      "org.bson.codecs.IterableCodec",
      "org.bson.codecs.IterableCodec$1",
      "org.bson.BsonSerializationException",
      "org.bson.diagnostics.Loggers",
      "org.bson.diagnostics.SLF4JLogger",
      "org.bson.types.ObjectId",
      "org.bson.BsonBinaryReader$1",
      "org.bson.json.JsonScanner$NumberState",
      "org.bson.json.JsonScanner$RegularExpressionState",
      "org.bson.json.JsonScanner$1",
      "org.bson.codecs.BsonDocumentCodec",
      "org.bson.codecs.BsonJavaScriptWithScopeCodec",
      "org.bson.codecs.BsonArrayCodec",
      "org.bson.AbstractBsonReader$1",
      "org.bson.BsonDocumentReader$1",
      "org.bson.BsonDocumentWrapper",
      "org.bson.BsonDocumentWriter",
      "org.bson.BsonDocumentWriter$Context",
      "org.bson.BsonDocumentWriter$1",
      "org.bson.BsonArray",
      "org.bson.BsonNumber",
      "org.bson.BsonDouble",
      "org.bson.BsonRegularExpression",
      "org.bson.RawBsonDocument",
      "io.undertow.predicate.AuthenticationRequiredPredicate",
      "io.undertow.util.Methods",
      "io.undertow.util.PathTemplate",
      "io.undertow.server.RoutingHandler$RoutingMatch",
      "io.undertow.util.PathTemplateMatcher$PathTemplateHolder",
      "io.undertow.util.PathTemplateMatcher$1",
      "io.undertow.server.RoutingHandler$HandlerHolder",
      "org.bson.BsonInt32",
      "org.bson.BsonNull",
      "org.bson.codecs.BsonDocumentWrapperCodec",
      "io.undertow.predicate.FalsePredicate",
      "io.undertow.predicate.TruePredicate",
      "org.bson.BsonObjectId",
      "org.restheart.handlers.RequestContext$TYPE",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Converter$ConverterComposition",
      "org.bson.BsonUndefined",
      "org.bson.codecs.RawBsonDocumentCodec",
      "org.bson.io.OutputBuffer",
      "org.bson.io.BasicOutputBuffer",
      "org.bson.BsonBinaryWriter",
      "org.bson.BsonBinaryWriterSettings",
      "org.bson.BsonElement",
      "org.bson.StringUtils",
      "io.undertow.server.ServerConnection",
      "io.undertow.server.AbstractServerConnection",
      "io.undertow.server.protocol.ajp.AjpServerConnection",
      "io.undertow.server.AbstractServerConnection$CloseSetter",
      "org.xnio.conduits.WriteReadyHandler$ChannelListenerHandler",
      "org.xnio.Option$10",
      "com.google.common.base.Converter$IdentityConverter",
      "org.everit.json.schema.loader.internal.DefaultSchemaClient",
      "org.restheart.handlers.schema.SchemaStoreClient",
      "org.restheart.handlers.schema.SchemaStoreURL",
      "com.codahale.metrics.MetricRegistry",
      "com.codahale.metrics.InstrumentedThreadFactory",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$1",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$2",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$3",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$4",
      "com.codahale.metrics.MetricRegistry$MetricBuilder",
      "com.codahale.metrics.Meter",
      "com.codahale.metrics.Clock$UserTimeClock",
      "com.codahale.metrics.Clock",
      "com.codahale.metrics.EWMA",
      "com.codahale.metrics.LongAdderProxy$JdkProvider",
      "com.codahale.metrics.LongAdderProxy$JdkProvider$1",
      "com.codahale.metrics.LongAdderProxy",
      "com.codahale.metrics.Counter",
      "com.codahale.metrics.InstrumentedThreadFactory$InstrumentedRunnable",
      "org.bson.BsonBinaryWriter$Context",
      "org.bson.BsonBinary",
      "org.bson.BsonTimestamp",
      "io.undertow.predicate.IdempotentPredicate",
      "io.undertow.util.ReferenceCountedPooled",
      "io.undertow.util.PooledAdaptor"
    );
  }
}
