/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Aug 21 07:26:10 GMT 2019
 */

package com.pinterest.secor.main;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConsumerMain_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.pinterest.secor.main.ConsumerMain"; 
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
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConsumerMain_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.hadoop.fs.ChecksumFileSystem$ChecksumFSOutputSummer",
      "org.apache.commons.lang.StringUtils",
      "org.apache.commons.configuration.interpol.ConstantLookup",
      "com.google.common.collect.ImmutableMultimap$Itr",
      "org.apache.hadoop.fs.FileSystem",
      "org.apache.hadoop.fs.BlockLocation",
      "com.pinterest.secor.common.SecorConfig",
      "org.apache.hadoop.fs.permission.AclEntryScope",
      "com.google.common.collect.Collections2",
      "org.apache.hadoop.metrics2.lib.MutableQuantiles",
      "org.apache.hadoop.fs.permission.FsPermission$ImmutableFsPermission",
      "org.apache.hadoop.metrics2.lib.MethodMetric$3",
      "org.apache.hadoop.metrics2.lib.MethodMetric$2",
      "org.apache.commons.lang.exception.NestableException",
      "org.apache.hadoop.metrics2.lib.MethodMetric$1",
      "org.apache.hadoop.conf.Configuration",
      "org.apache.hadoop.security.token.Token$TrivialRenewer",
      "org.apache.hadoop.io.WritableFactories",
      "org.apache.commons.lang.text.StrMatcher$StringMatcher",
      "org.apache.hadoop.security.Credentials",
      "org.apache.hadoop.classification.InterfaceStability$Stable",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$2",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$1",
      "org.apache.hadoop.metrics2.lib.Interns$Info",
      "com.google.common.collect.NullsLastOrdering",
      "org.apache.commons.lang.text.StrLookup$MapStrLookup",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$4",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$3",
      "com.google.common.collect.RegularImmutableMultiset",
      "org.apache.hadoop.metrics2.lib.UniqueNames$Count",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "org.apache.hadoop.fs.FileChecksum",
      "org.apache.hadoop.metrics2.impl.MetricsConfigException",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$6",
      "org.apache.commons.configuration.PropertiesConfiguration$DefaultIOFactory",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$5",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration$7",
      "org.apache.commons.collections.IterableMap",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "org.apache.hadoop.fs.ChecksumFileSystem$FSDataBoundedInputStream",
      "org.apache.hadoop.metrics2.lib.UniqueNames",
      "com.google.common.collect.ImmutableMapEntry$TerminalEntry",
      "com.google.common.base.Joiner",
      "com.google.common.collect.NullsFirstOrdering",
      "org.apache.hadoop.metrics2.impl.MetricsSinkAdapter",
      "org.apache.commons.lang.exception.NestableRuntimeException",
      "org.apache.hadoop.fs.RawLocalFileSystem$DeprecatedRawLocalFileStatus",
      "org.apache.hadoop.fs.BufferedFSInputStream",
      "com.google.common.collect.Lists$Partition",
      "org.apache.hadoop.io.serializer.SerializationFactory",
      "org.apache.hadoop.fs.Syncable",
      "org.apache.hadoop.io.DataInputBuffer",
      "org.apache.commons.configuration.event.EventSource",
      "org.apache.commons.configuration.interpol.ConfigurationInterpolator",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.base.CharMatcher$5",
      "org.apache.hadoop.metrics2.lib.MutableMetric",
      "com.google.common.base.CharMatcher$4",
      "org.apache.hadoop.fs.FSInputStream",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "org.apache.commons.configuration.DefaultFileSystem",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.Equivalence$Wrapper",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$6",
      "org.apache.hadoop.security.Groups",
      "org.apache.hadoop.metrics2.MetricsSystem$Callback",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.collect.ImmutableMapValues",
      "org.apache.commons.configuration.SubnodeConfiguration",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.Joiner$1",
      "org.apache.hadoop.util.Progressable",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "org.apache.hadoop.util.Timer",
      "com.google.common.collect.AbstractNavigableMap",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ImmutableCollection",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.hadoop.fs.FileSystem$3",
      "org.apache.commons.configuration.ConfigurationKey$KeyIterator",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "org.apache.hadoop.metrics2.impl.MetricsBuffer",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "org.apache.hadoop.fs.ReadOption",
      "org.apache.hadoop.util.Shell$ExitCodeException",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "org.apache.commons.configuration.HierarchicalConfiguration",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.ietf.jgss.GSSException",
      "com.google.common.collect.ImmutableMapValues$1",
      "com.google.common.collect.ImmutableEnumMap$2$1",
      "org.apache.hadoop.fs.ChecksumFileSystem$1",
      "org.apache.hadoop.io.DataOutputBuffer",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.collect.Lists$2",
      "org.apache.hadoop.metrics2.util.SampleStat",
      "org.apache.hadoop.fs.FileSystem$Statistics$StatisticsAggregator",
      "com.google.common.base.Ticker$1",
      "org.apache.hadoop.metrics2.lib.MutableRate",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.RegularImmutableMap$NonTerminalMapEntry",
      "org.apache.hadoop.fs.FsServerDefaults",
      "org.apache.hadoop.metrics2.MetricType",
      "org.apache.commons.configuration.FileSystemBased",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.util.concurrent.ListenableFuture",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.base.Supplier",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "org.apache.hadoop.metrics2.lib.DefaultMetricsFactory",
      "org.apache.hadoop.security.UserGroupInformation$DynamicConfiguration",
      "com.google.common.collect.Maps$ImprovedAbstractMap",
      "org.apache.hadoop.fs.permission.AclEntryType",
      "org.apache.commons.configuration.reloading.Reloadable",
      "com.google.common.collect.ImmutableList",
      "org.apache.hadoop.fs.FileSystem$Cache$ClientFinalizer",
      "com.google.common.collect.ReverseOrdering",
      "org.apache.commons.configuration.tree.ConfigurationNodeVisitor",
      "com.google.common.collect.Maps$FilteredEntrySortedMap",
      "org.apache.commons.configuration.HierarchicalConfiguration$NodeVisitor",
      "org.apache.hadoop.metrics2.MetricsRecord",
      "org.apache.hadoop.metrics2.MetricsSource",
      "org.apache.commons.lang.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang.exception.Nestable",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "org.apache.hadoop.metrics2.impl.MetricsSinkAdapter$1",
      "com.google.common.collect.AllEqualOrdering",
      "org.apache.hadoop.fs.FSInputChecker",
      "org.apache.hadoop.io.Text",
      "org.apache.hadoop.util.DataChecksum$Type",
      "com.google.common.cache.CacheLoader$1",
      "org.apache.hadoop.security.GroupMappingServiceProvider",
      "org.apache.hadoop.metrics2.MetricsPlugin",
      "org.apache.hadoop.metrics2.lib.MutableGaugeInt",
      "org.apache.hadoop.fs.FileSystem$Statistics",
      "org.apache.commons.configuration.Lock",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "org.apache.hadoop.metrics2.util.SampleStat$MinMax",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "org.apache.hadoop.metrics2.lib.MutableStat",
      "com.google.common.collect.SortedMapDifference",
      "org.apache.commons.configuration.EnvironmentConfiguration",
      "com.google.common.collect.RegularImmutableSet",
      "org.apache.hadoop.metrics2.AbstractMetric",
      "org.apache.hadoop.security.token.TokenRenewer",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ImmutableListMultimap",
      "org.apache.commons.configuration.reloading.ReloadingStrategy",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "org.apache.hadoop.fs.RemoteIterator",
      "org.apache.hadoop.util.ReflectionUtils$1",
      "org.apache.commons.configuration.ConfigurationException",
      "org.apache.hadoop.fs.FSOutputSummer",
      "org.apache.hadoop.metrics2.lib.MutableCounter",
      "org.apache.hadoop.metrics2.util.SampleQuantiles",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "org.apache.hadoop.classification.InterfaceStability$Evolving",
      "org.apache.hadoop.fs.permission.FsAction",
      "org.apache.hadoop.metrics2.lib.Interns$Tags$1",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.cache.CacheLoader$SupplierToCacheLoader",
      "org.apache.hadoop.security.token.TokenIdentifier",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "org.apache.hadoop.fs.FSError",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "org.apache.hadoop.metrics2.lib.Interns$CacheWith2Keys$2",
      "org.apache.hadoop.fs.XAttrSetFlag",
      "org.apache.hadoop.metrics2.lib.Interns$CacheWith2Keys$1",
      "com.google.common.collect.ObjectArrays",
      "org.apache.commons.logging.impl.SLF4JLocationAwareLog",
      "org.apache.commons.configuration.AbstractFileConfiguration",
      "org.apache.hadoop.conf.Configuration$IntegerRanges",
      "org.apache.hadoop.io.Text$2",
      "org.apache.hadoop.fs.HasEnhancedByteBufferAccess",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "org.apache.hadoop.io.Text$1",
      "org.apache.hadoop.metrics2.impl.MetricsBufferBuilder",
      "com.google.common.collect.UnmodifiableIterator",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration",
      "org.apache.hadoop.metrics2.annotation.Metric",
      "org.apache.hadoop.fs.RawLocalFileSystem$LocalFSFileInputStream",
      "org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.metrics2.MetricsTag",
      "org.apache.commons.configuration.ConfigurationKey",
      "com.google.common.collect.ImmutableMapKeySet$1",
      "org.apache.commons.configuration.FileSystem",
      "org.apache.hadoop.util.ReflectionUtils$CopyInCopyOutBuffer",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "org.apache.hadoop.metrics2.annotation.Metrics",
      "org.apache.commons.collections.map.AbstractMapDecorator",
      "org.apache.commons.configuration.event.ConfigurationListener",
      "org.apache.hadoop.io.Text$Comparator",
      "org.apache.hadoop.fs.Path",
      "org.apache.hadoop.classification.InterfaceAudience$Public",
      "org.apache.hadoop.conf.Configurable",
      "org.apache.hadoop.metrics2.lib.MetricsSourceBuilder$1",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "org.apache.hadoop.metrics2.MetricsFilter",
      "com.google.common.base.Converter",
      "com.google.common.base.Function",
      "com.pinterest.secor.common.SecorConfig$1",
      "com.google.common.collect.ImmutableMap",
      "org.apache.commons.lang.text.StrTokenizer",
      "org.apache.hadoop.metrics2.MetricsSystemMXBean",
      "org.apache.hadoop.metrics2.impl.MetricsRecordBuilderImpl",
      "org.apache.hadoop.util.PlatformName",
      "com.google.common.collect.Multiset$Entry",
      "org.apache.hadoop.io.DataInputBuffer$Buffer",
      "org.apache.hadoop.fs.RawLocalFileSystem$LocalFSFileOutputStream",
      "org.apache.commons.configuration.event.ConfigurationErrorListener",
      "org.apache.hadoop.metrics2.impl.SinkQueue$Consumer",
      "com.google.common.collect.ExplicitOrdering",
      "org.apache.hadoop.fs.permission.AccessControlException",
      "org.apache.commons.lang.text.StrMatcher",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "org.apache.hadoop.fs.HasFileDescriptor",
      "org.apache.hadoop.metrics2.MetricsSink",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl",
      "com.google.common.collect.CompoundOrdering",
      "org.apache.hadoop.metrics2.MetricsVisitor",
      "org.apache.commons.configuration.ConversionException",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.SingletonImmutableBiMap",
      "org.apache.hadoop.fs.ParentNotDirectoryException",
      "com.google.common.collect.ImmutableMultiset$1",
      "org.apache.hadoop.fs.permission.AclStatus",
      "org.apache.commons.configuration.BaseConfiguration",
      "org.apache.commons.configuration.VerifiableOutputStream",
      "org.apache.hadoop.metrics2.impl.MetricsSourceAdapter",
      "com.google.common.base.Equivalence",
      "org.apache.commons.logging.impl.SLF4JLogFactory",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SetMultimap",
      "org.apache.hadoop.security.UserGroupInformation$HadoopLoginModule",
      "org.apache.commons.configuration.interpol.EnvironmentLookup",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.base.Splitter$SplittingIterator",
      "org.apache.hadoop.security.AccessControlException",
      "org.apache.commons.collections.Unmodifiable",
      "org.apache.hadoop.fs.FileSystem$Cache",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "org.apache.commons.configuration.PropertiesConfiguration$IOFactory",
      "org.apache.hadoop.io.Writable",
      "org.apache.hadoop.fs.FileStatus",
      "org.apache.hadoop.classification.InterfaceAudience$Private",
      "org.apache.hadoop.security.Groups$TimerToTickerAdapter",
      "org.apache.hadoop.fs.CanUnbuffer",
      "org.apache.commons.configuration.AbstractConfiguration",
      "org.apache.hadoop.metrics2.MetricsRecordBuilder",
      "org.apache.commons.configuration.MapConfiguration",
      "org.apache.commons.collections.MapIterator",
      "com.google.common.base.Splitter$MapSplitter",
      "org.apache.hadoop.fs.StorageType",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "org.apache.hadoop.security.UserGroupInformation$AuthenticationMethod",
      "org.apache.hadoop.fs.FileSystem$Statistics$StatisticsData",
      "org.apache.hadoop.metrics2.MetricsSystem",
      "org.apache.hadoop.metrics2.lib.Interns$CacheWith2Keys",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.collect.ImmutableMultimap$Values",
      "org.ietf.jgss.Oid",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl$3",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl$1",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.AbstractMapEntry",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesWriter",
      "org.apache.hadoop.fs.FsStatus",
      "com.google.common.collect.ImmutableEnumMap$1",
      "com.google.common.collect.EmptyImmutableBiMap",
      "org.apache.commons.configuration.tree.NodeAddData",
      "com.google.common.base.Predicate",
      "org.apache.hadoop.fs.CanSetReadahead",
      "org.apache.commons.lang.text.StrSubstitutor",
      "com.google.common.collect.ImmutableEnumMap$2",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "org.apache.hadoop.metrics2.filter.AbstractPatternFilter",
      "org.apache.hadoop.fs.FSDataOutputStream$PositionCache",
      "org.apache.commons.configuration.Configuration",
      "org.apache.hadoop.metrics2.lib.MetricsSourceBuilder",
      "org.apache.commons.configuration.tree.DefaultConfigurationNode$SubNodes",
      "org.apache.hadoop.io.WritableComparable",
      "org.apache.hadoop.security.UserGroupInformation$TestingGroups",
      "org.apache.hadoop.io.WritableComparator",
      "org.apache.commons.lang.text.StrMatcher$CharMatcher",
      "com.google.common.collect.Lists",
      "org.apache.hadoop.security.UserGroupInformation",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.apache.hadoop.fs.CanSetDropBehind",
      "org.apache.commons.configuration.PropertiesConfiguration",
      "com.google.common.collect.ImmutableMultimap",
      "org.apache.commons.io.Charsets",
      "com.google.common.collect.ImmutableSortedSet",
      "org.apache.hadoop.fs.FileSystem$Cache$Key",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1",
      "com.google.common.base.CharMatcher",
      "org.apache.commons.logging.impl.NoOpLog",
      "com.google.common.base.Joiner$MapJoiner",
      "org.apache.commons.configuration.HierarchicalConfiguration$Node",
      "org.apache.hadoop.fs.UnsupportedFileSystemException",
      "com.google.common.base.Preconditions",
      "org.apache.hadoop.metrics2.impl.MetricsConfig",
      "org.apache.hadoop.util.ReflectionUtils",
      "org.apache.hadoop.metrics2.lib.DefaultMetricsSystem",
      "org.apache.hadoop.fs.permission.FsPermission",
      "org.apache.hadoop.fs.Seekable",
      "org.apache.hadoop.metrics2.lib.MutableMetricsFactory",
      "org.apache.hadoop.metrics2.lib.MutableRates",
      "org.apache.hadoop.conf.Configuration$NegativeCacheSentinel",
      "org.apache.commons.configuration.DefaultFileSystem$HttpOutputStream",
      "org.apache.hadoop.metrics2.lib.MutableCounterInt",
      "com.google.common.collect.BiMap",
      "org.apache.hadoop.io.serializer.Deserializer",
      "com.google.common.collect.ImmutableSet",
      "com.pinterest.secor.main.ConsumerMain",
      "org.apache.commons.configuration.PropertiesConfigurationLayout",
      "com.google.common.collect.ImmutableMapEntry",
      "org.apache.commons.configuration.AbstractConfiguration$2",
      "org.apache.hadoop.metrics2.util.Quantile",
      "org.apache.hadoop.metrics2.impl.MetricsRecordImpl",
      "org.apache.commons.configuration.AbstractConfiguration$1",
      "com.google.common.cache.CacheLoader",
      "org.apache.hadoop.metrics2.lib.MutableGaugeLong",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "org.apache.commons.lang.text.StrMatcher$CharSetMatcher",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "org.apache.avro.reflect.Stringable",
      "org.apache.commons.logging.impl.SLF4JLog",
      "com.google.common.collect.Maps$FilteredEntryBiMap",
      "com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.google.common.base.Splitter$Strategy",
      "com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.collect.AbstractMultimap",
      "org.apache.hadoop.fs.PathFilter",
      "org.apache.commons.lang.text.StrLookup",
      "com.google.common.collect.EmptyImmutableSet",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl$4",
      "com.pinterest.secor.main.ConsumerMain$1",
      "org.apache.hadoop.HadoopIllegalArgumentException",
      "org.apache.hadoop.metrics2.lib.MetricsRegistry",
      "org.apache.hadoop.security.Groups$GroupCacheLoader",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.hadoop.metrics2.lib.MetricsAnnotations",
      "org.apache.hadoop.metrics2.impl.AbstractMetricsRecord",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "org.apache.commons.configuration.tree.DefaultConfigurationNode",
      "org.apache.commons.configuration.PropertiesConfigurationLayout$PropertyLayoutData",
      "org.apache.hadoop.io.RawComparator",
      "org.apache.hadoop.security.UserGroupInformation$HadoopConfiguration",
      "org.apache.commons.configuration.SubsetConfiguration",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl$InitMode",
      "com.google.common.collect.NaturalOrdering",
      "com.pinterest.secor.util.FileUtil",
      "org.apache.hadoop.metrics2.impl.MetricsRecordFiltered",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.collect.RegularImmutableList",
      "org.apache.commons.configuration.HierarchicalConfiguration$5",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderReader",
      "com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "com.google.common.collect.RegularImmutableBiMap$NonTerminalBiMapEntry",
      "org.apache.commons.configuration.HierarchicalConfiguration$1",
      "org.apache.hadoop.fs.FSDataInputStream",
      "com.google.common.collect.ImmutableMapKeySet",
      "org.apache.commons.configuration.reloading.InvariantReloadingStrategy",
      "org.apache.hadoop.io.DataOutputBuffer$Buffer",
      "com.google.common.base.Ticker",
      "org.apache.hadoop.metrics2.annotation.Metric$Type",
      "org.apache.hadoop.fs.ByteBufferReadable",
      "org.apache.hadoop.metrics2.MetricsSystem$AbstractCallback",
      "org.apache.commons.configuration.FileOptionsProvider",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.collect.Maps$AbstractFilteredMap",
      "com.google.common.collect.ImmutableMultimap$2",
      "org.apache.hadoop.fs.FsServerDefaults$1",
      "org.apache.commons.configuration.FileConfiguration",
      "com.google.common.collect.ImmutableSet$Builder",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.google.common.collect.Maps$FilteredEntryMap",
      "org.apache.hadoop.fs.ContentSummary",
      "org.apache.hadoop.fs.FSDataOutputStream",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.apache.hadoop.fs.FilterFileSystem",
      "org.apache.hadoop.metrics2.lib.Interns",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.apache.hadoop.security.UserGroupInformation$RealUser",
      "org.apache.hadoop.io.serializer.Serializer",
      "org.apache.hadoop.fs.FileAlreadyExistsException",
      "org.apache.hadoop.fs.RawLocalFileSystem",
      "com.google.common.base.CharMatcher$NegatedMatcher",
      "org.apache.hadoop.security.token.Token",
      "com.google.common.collect.MapDifference",
      "org.apache.hadoop.fs.Options$Rename",
      "org.apache.hadoop.metrics2.impl.MsInfo",
      "org.apache.hadoop.classification.InterfaceAudience$LimitedPrivate",
      "org.apache.hadoop.metrics2.filter.GlobFilter",
      "com.google.common.collect.Maps$FilteredEntryNavigableMap",
      "org.apache.hadoop.fs.ChecksumException",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$10",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesReader",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "org.apache.hadoop.conf.Configured",
      "org.apache.hadoop.fs.Options$ChecksumOpt",
      "org.apache.hadoop.metrics2.MetricsException",
      "org.apache.hadoop.metrics2.lib.MethodMetric",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.apache.hadoop.metrics2.lib.MutableGauge",
      "org.apache.hadoop.metrics2.lib.Interns$Tags",
      "com.google.common.base.Splitter",
      "org.apache.commons.configuration.tree.ExpressionEngine",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Maps$1",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderWriter",
      "org.apache.hadoop.metrics2.lib.MetricsInfoImpl",
      "org.apache.hadoop.metrics2.lib.Interns$Info$1",
      "org.apache.commons.lang.text.StrMatcher$NoMatcher",
      "org.apache.hadoop.fs.permission.AclEntry",
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.configuration.event.ConfigurationEvent",
      "org.apache.commons.configuration.HierarchicalReloadableConfiguration",
      "org.apache.commons.configuration.ConfigurationUtils",
      "org.apache.hadoop.io.BinaryComparable",
      "org.apache.hadoop.metrics2.lib.MutableCounterLong",
      "com.google.common.collect.Multimap",
      "org.apache.hadoop.io.ByteBufferPool",
      "org.apache.hadoop.fs.ChecksumFileSystem$ChecksumFSInputChecker",
      "com.google.common.collect.ImmutableBiMap",
      "org.apache.hadoop.security.UserGroupInformation$UgiMetrics",
      "com.google.common.base.Splitter$1$1",
      "org.apache.hadoop.conf.Configuration$Resource",
      "org.apache.hadoop.security.SaslRpcServer$AuthMethod",
      "com.google.common.base.PairwiseEquivalence",
      "org.apache.hadoop.fs.PositionedReadable",
      "com.google.common.collect.RegularImmutableBiMap$1",
      "org.apache.hadoop.classification.InterfaceStability$Unstable",
      "org.apache.hadoop.security.authentication.util.KerberosUtil",
      "org.apache.hadoop.fs.CreateFlag",
      "org.apache.hadoop.io.serializer.Serialization",
      "org.apache.hadoop.metrics2.MetricsCollector",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "org.apache.hadoop.io.WritableFactory",
      "org.apache.hadoop.metrics2.impl.MetricsCollectorImpl",
      "org.apache.hadoop.metrics2.MetricsInfo",
      "org.apache.commons.configuration.event.ConfigurationErrorEvent",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "org.apache.commons.configuration.tree.ConfigurationNode",
      "org.apache.commons.configuration.ConfigurationRuntimeException",
      "com.google.common.base.AbstractIterator",
      "org.apache.hadoop.fs.permission.FsPermission$1",
      "com.google.common.collect.RegularImmutableSortedSet",
      "org.apache.hadoop.fs.LocalFileSystem"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConsumerMain_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.pinterest.secor.main.ConsumerMain",
      "com.pinterest.secor.main.ConsumerMain$1",
      "com.pinterest.secor.common.SecorConfig$1",
      "com.pinterest.secor.common.SecorConfig",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.google.common.base.Preconditions",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.apache.commons.collections.map.AbstractMapDecorator",
      "org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.conf.Configuration",
      "com.pinterest.secor.util.FileUtil",
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
      "org.apache.commons.lang.exception.NestableDelegate"
    );
  }
}
