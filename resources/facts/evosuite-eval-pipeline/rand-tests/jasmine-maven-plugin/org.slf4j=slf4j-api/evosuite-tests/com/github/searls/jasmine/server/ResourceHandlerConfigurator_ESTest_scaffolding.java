/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 12 14:36:01 GMT 2019
 */

package com.github.searls.jasmine.server;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ResourceHandlerConfigurator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.searls.jasmine.server.ResourceHandlerConfigurator"; 
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
    java.lang.System.setProperty("user.dir", "/home/cgzhu/projects/gitslice/resources/facts/evosuite-eval-pipeline/rand-tests/jasmine-maven-plugin/org.slf4j=slf4j-api"); 
    java.lang.System.setProperty("user.home", "/home/cgzhu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgzhu"); 
    java.lang.System.setProperty("user.timezone", "Asia/Singapore"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("sun.boot.library.path", "/home/cgzhu/opt/jdk1.8.0_151/jre/lib/amd64"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("master_log_port", "41697"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile5402979740515655776.txt"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("process_communication_port", "14802"); 
    java.lang.System.setProperty("sun.boot.class.path", "/home/cgzhu/opt/jdk1.8.0_151/jre/lib/resources.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/lib/rt.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/lib/sunrsasign.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/lib/jsse.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/lib/jce.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/lib/charsets.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/lib/jfr.jar:/home/cgzhu/opt/jdk1.8.0_151/jre/classes"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-evosuite.xml"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("TARGET_CLASS", "com.github.searls.jasmine.server.ResourceHandlerConfigurator"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ResourceHandlerConfigurator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover",
      "com.github.searls.jasmine.model.ScriptSearch",
      "com.google.common.math.LongMath$1",
      "com.google.common.hash.Striped64$1",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.seleniumhq.jetty9.util.IncludeExcludeSet",
      "org.apache.commons.lang3.StringUtils",
      "org.seleniumhq.jetty9.util.IncludeExcludeSet$SetContainsPredicate",
      "com.google.common.hash.BloomFilter$Strategy",
      "org.eclipse.jetty.util.MultiMap$1",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "com.github.searls.jasmine.mojo.Context",
      "org.eclipse.jetty.util.MultiException",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.NullsLastOrdering",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration$Builder",
      "org.eclipse.jetty.util.InetAddressSet$MinMaxInetRange",
      "com.google.common.base.Converter$IdentityConverter",
      "com.github.searls.jasmine.runner.HtmlGeneratorConfiguration",
      "org.apache.commons.io.output.ByteArrayOutputStream",
      "com.google.common.collect.ByFunctionOrdering",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.seleniumhq.jetty9.util.InetAddressSet$CidrInetRange",
      "com.google.common.base.Predicate",
      "org.eclipse.jetty.http.MimeTypes",
      "com.google.common.hash.Striped64",
      "org.eclipse.jetty.server.Handler",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.seleniumhq.jetty9.util.InetAddressSet$SingletonInetRange",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.DiscreteDomain$BigIntegerDomain",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.server.UserIdentity",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.DiscreteDomain",
      "org.eclipse.jetty.util.log.Log$1",
      "com.github.searls.jasmine.io.scripts.ConvertsFileToUriString",
      "org.apache.commons.io.Charsets",
      "com.google.common.collect.Cut",
      "org.eclipse.jetty.server.RequestLog",
      "org.eclipse.jetty.http.CompressedContentFormat",
      "org.eclipse.jetty.util.MultiMap",
      "org.apache.commons.io.FileUtils",
      "com.github.searls.jasmine.runner.CreatesRunner",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION",
      "org.eclipse.jetty.util.resource.Resource",
      "org.apache.commons.io.output.NullOutputStream",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration",
      "com.google.common.base.Preconditions",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.base.Converter$ConverterComposition",
      "org.eclipse.jetty.server.handler.ContextHandlerCollection",
      "com.google.common.collect.ImmutableCollection",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "com.google.common.hash.BloomFilterStrategies",
      "org.stringtemplate.v4.ST$AttributeList",
      "org.eclipse.jetty.util.component.Container",
      "com.github.searls.jasmine.model.ImmutableScriptSearch$Builder",
      "org.eclipse.jetty.util.resource.BadResource",
      "org.eclipse.jetty.server.handler.ContextHandler$Context",
      "org.eclipse.jetty.util.IncludeExclude",
      "com.github.searls.jasmine.server.JasmineResourceHandler",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$1",
      "com.google.common.collect.ImmutableCollection$Builder",
      "org.eclipse.jetty.util.Loader",
      "org.stringtemplate.v4.gui.STViz",
      "org.eclipse.jetty.server.handler.ContextHandler$StaticContext",
      "org.eclipse.jetty.util.component.Graceful",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "org.seleniumhq.jetty9.util.InetAddressSet",
      "com.google.common.math.LongMath",
      "org.seleniumhq.jetty9.util.IncludeExclude",
      "org.eclipse.jetty.util.component.Container$Listener",
      "com.google.common.collect.DiscreteDomain$LongDomain",
      "com.google.common.base.Converter$ReverseConverter",
      "org.apache.commons.io.FileExistsException",
      "com.google.common.collect.Cut$AboveValue",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.eclipse.jetty.util.Trie",
      "com.github.searls.jasmine.runner.SpecRunnerTemplate",
      "com.github.searls.jasmine.io.RelativizesFilePaths",
      "org.eclipse.jetty.http.BadMessageException",
      "org.eclipse.jetty.util.AttributesMap",
      "com.google.common.hash.LongAdder",
      "org.eclipse.jetty.util.resource.PathResource",
      "org.seleniumhq.jetty9.util.InetAddressSet$MinMaxInetRange",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.util.resource.URLResource",
      "com.google.common.base.Supplier",
      "org.apache.commons.lang3.ArrayUtils",
      "com.google.common.hash.LongAddable",
      "org.eclipse.jetty.util.resource.ResourceFactory",
      "com.google.common.hash.Striped64$Cell",
      "org.eclipse.jetty.http.HttpURI",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.http.Http1FieldPreEncoder",
      "org.eclipse.jetty.http.HttpFields",
      "com.google.common.hash.LongAddables",
      "com.google.common.hash.BloomFilter",
      "org.eclipse.jetty.io.QuietException",
      "org.eclipse.jetty.server.handler.ResourceHandler$1",
      "org.codehaus.plexus.util.AbstractScanner",
      "org.codehaus.plexus.util.MatchPatterns",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "org.apache.commons.lang3.StringEscapeUtils$CsvEscaper",
      "org.seleniumhq.jetty9.util.RegexSet",
      "com.google.common.collect.Ordering",
      "org.eclipse.jetty.util.log.Log",
      "com.github.searls.jasmine.server.ResourceHandlerConfigurator",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "com.google.common.collect.NaturalOrdering",
      "org.eclipse.jetty.http.MetaData$Request",
      "com.github.searls.jasmine.format.FormatsScriptTags",
      "org.eclipse.jetty.util.log.Logger",
      "org.eclipse.jetty.server.Connector",
      "org.eclipse.jetty.server.Request",
      "org.apache.commons.io.LineIterator",
      "com.google.common.collect.AllEqualOrdering",
      "org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper",
      "com.google.common.collect.ImmutableList$SubList",
      "com.github.searls.jasmine.io.scripts.FindsScriptLocationsInDirectory",
      "com.github.searls.jasmine.model.Reporter",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.hash.BloomFilterStrategies$1",
      "org.eclipse.jetty.server.handler.ErrorHandler",
      "com.google.common.hash.BloomFilterStrategies$2",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.apache.commons.lang3.StringEscapeUtils",
      "org.eclipse.jetty.server.HttpInput",
      "com.github.searls.jasmine.config.JasmineConfiguration",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.server.HandlerContainer",
      "org.eclipse.jetty.http.HttpContent",
      "com.github.searls.jasmine.io.scripts.BasicScriptResolver",
      "com.github.searls.jasmine.io.scripts.ContextPathScriptResolver",
      "org.eclipse.jetty.http.MimeTypes$Type",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.MultiPartOutputStream",
      "org.eclipse.jetty.server.PushBuilder",
      "com.google.common.collect.Range",
      "org.apache.commons.io.IOUtils",
      "com.google.common.hash.Funnel",
      "org.stringtemplate.v4.ST",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.http.PreEncodedHttpField",
      "org.eclipse.jetty.server.ResourceService$WelcomeFactory",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "com.google.common.collect.LexicographicalOrdering",
      "org.eclipse.jetty.util.InetAddressSet$CidrInetRange",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.server.Response",
      "com.google.common.collect.ImmutableAsList",
      "org.eclipse.jetty.server.SessionIdManager",
      "com.google.common.collect.RegularImmutableAsList",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "com.google.common.collect.Cut$BelowValue",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.http.PreEncodedHttpField$1",
      "org.codehaus.plexus.util.Scanner",
      "com.github.searls.jasmine.model.FileSystemReporter",
      "org.apache.commons.io.output.StringBuilderWriter",
      "com.google.common.collect.UsingToStringOrdering",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.eclipse.jetty.server.ResourceService",
      "com.google.common.hash.PrimitiveSink",
      "org.eclipse.jetty.server.UserIdentity$Scope",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "org.seleniumhq.jetty9.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.server.Authentication$Failed",
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.codehaus.plexus.util.SelectorUtils",
      "org.stringtemplate.v4.STErrorListener",
      "com.google.common.collect.ImmutableList$1",
      "org.eclipse.jetty.server.QuietServletException",
      "org.eclipse.jetty.http.HttpFieldPreEncoder",
      "com.github.searls.jasmine.config.ImmutableJasmineConfiguration",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "com.github.searls.jasmine.runner.DefaultSpecRunnerHtmlGenerator",
      "org.eclipse.jetty.util.resource.JarFileResource",
      "com.github.searls.jasmine.io.IoUtilities",
      "com.github.searls.jasmine.config.ImmutableJasmineConfiguration$Builder",
      "org.eclipse.jetty.util.InetAddressSet$LegacyInetRange",
      "org.codehaus.plexus.util.DirectoryScanner",
      "com.google.common.collect.UnmodifiableIterator",
      "org.eclipse.jetty.server.handler.HandlerCollection",
      "org.eclipse.jetty.util.Attributes",
      "org.eclipse.jetty.util.component.LifeCycle",
      "com.github.searls.jasmine.model.ImmutableScriptSearch",
      "org.stringtemplate.v4.STWriter",
      "org.stringtemplate.v4.misc.ErrorManager",
      "org.seleniumhq.jetty9.util.InetAddressSet$LegacyInetRange",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.server.handler.ContextHandler$AliasCheck",
      "org.eclipse.jetty.server.HttpChannelState",
      "org.eclipse.jetty.http.MetaData",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.eclipse.jetty.io.RuntimeIOException",
      "com.google.common.collect.SingletonImmutableList",
      "org.eclipse.jetty.util.Jetty",
      "com.google.common.base.Converter",
      "org.eclipse.jetty.http.HttpContent$ContentFactory",
      "com.google.common.base.Function",
      "com.github.searls.jasmine.runner.ReporterType",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.primitives.Ints$IntConverter",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$AbstractLifeCycleListener",
      "com.github.searls.jasmine.io.scripts.AbstractScriptResolver",
      "com.google.common.collect.BoundType",
      "com.google.common.collect.ExplicitOrdering",
      "com.github.searls.jasmine.io.ScansDirectory",
      "com.google.common.collect.ImmutableList$Builder",
      "org.eclipse.jetty.server.handler.ResourceHandler",
      "com.github.searls.jasmine.runner.HtmlGeneratorConfigurationFactory",
      "org.eclipse.jetty.util.Uptime",
      "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.eclipse.jetty.util.resource.JarResource",
      "org.eclipse.jetty.server.HttpChannel",
      "org.eclipse.jetty.http.HttpVersion",
      "com.google.common.collect.CompoundOrdering",
      "org.eclipse.jetty.http.HttpHeader",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.github.searls.jasmine.io.scripts.ResolvesLocationOfPreloadSources",
      "org.apache.commons.lang3.text.translate.EntityArrays",
      "org.apache.commons.io.input.ClosedInputStream",
      "com.github.searls.jasmine.io.scripts.ScriptResolver",
      "com.google.common.collect.Cut$BelowAll",
      "com.github.searls.jasmine.runner.SpecRunnerHtmlGenerator",
      "org.codehaus.plexus.util.MatchPattern",
      "org.eclipse.jetty.server.HttpOutput$Interceptor",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "com.google.common.primitives.Ints",
      "org.eclipse.jetty.server.session.SessionHandler",
      "org.eclipse.jetty.http.HostPortHttpField",
      "org.eclipse.jetty.server.Authentication",
      "org.eclipse.jetty.server.Request$1",
      "org.eclipse.jetty.http.HttpField",
      "org.eclipse.jetty.io.WriterOutputStream",
      "com.google.common.collect.Cut$AboveAll"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ResourceHandlerConfigurator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.searls.jasmine.server.ResourceHandlerConfigurator",
      "com.github.searls.jasmine.io.RelativizesFilePaths",
      "com.github.searls.jasmine.format.FormatsScriptTags",
      "com.github.searls.jasmine.runner.DefaultSpecRunnerHtmlGenerator",
      "com.github.searls.jasmine.runner.HtmlGeneratorConfigurationFactory",
      "com.github.searls.jasmine.io.ScansDirectory",
      "org.codehaus.plexus.util.AbstractScanner",
      "org.codehaus.plexus.util.DirectoryScanner",
      "org.codehaus.plexus.util.MatchPattern",
      "com.github.searls.jasmine.io.scripts.FindsScriptLocationsInDirectory",
      "com.github.searls.jasmine.runner.CreatesRunner",
      "com.github.searls.jasmine.config.JasmineConfiguration",
      "com.github.searls.jasmine.config.ImmutableJasmineConfiguration",
      "com.github.searls.jasmine.config.ImmutableJasmineConfiguration$Builder",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$AbstractLifeCycleListener",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$1",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.server.handler.HandlerCollection",
      "org.eclipse.jetty.server.handler.ContextHandlerCollection",
      "com.github.searls.jasmine.io.IoUtilities",
      "org.apache.commons.io.FileUtils",
      "com.github.searls.jasmine.io.scripts.ConvertsFileToUriString",
      "org.apache.commons.io.output.StringBuilderWriter",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.io.Charsets",
      "com.github.searls.jasmine.io.scripts.ResolvesLocationOfPreloadSources",
      "com.github.searls.jasmine.io.scripts.AbstractScriptResolver",
      "com.github.searls.jasmine.io.scripts.BasicScriptResolver",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "org.apache.commons.lang3.text.translate.EntityArrays",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover",
      "org.apache.commons.lang3.StringEscapeUtils$CsvEscaper",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION",
      "org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper",
      "org.apache.commons.lang3.StringEscapeUtils",
      "org.seleniumhq.jetty9.util.InetAddressSet",
      "com.github.searls.jasmine.runner.HtmlGeneratorConfiguration",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration$Builder",
      "org.eclipse.jetty.util.InetAddressSet",
      "com.github.searls.jasmine.model.ImmutableScriptSearch",
      "com.github.searls.jasmine.model.ImmutableScriptSearch$Builder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.CollectPreconditions",
      "com.github.searls.jasmine.io.scripts.ContextPathScriptResolver",
      "org.seleniumhq.jetty9.util.RegexSet",
      "org.codehaus.plexus.util.MatchPatterns",
      "org.codehaus.plexus.util.SelectorUtils",
      "org.seleniumhq.jetty9.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.RegexSet",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "com.github.searls.jasmine.model.Reporter",
      "com.github.searls.jasmine.model.FileSystemReporter",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$BelowValue",
      "org.seleniumhq.jetty9.util.IncludeExclude",
      "org.seleniumhq.jetty9.util.IncludeExcludeSet$SetContainsPredicate"
    );
  }
}
