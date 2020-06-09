/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 12 14:57:46 GMT 2019
 */

package com.github.pagehelper.cache;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CacheFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.pagehelper.cache.CacheFactory"; 
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
    java.lang.System.setProperty("user.dir", "/home/cgzhu/projects/gitslice/resources/facts/evosuite-eval-pipeline/rand-tests/Mybatis-PageHelper/org.mybatis=mybatis"); 
    java.lang.System.setProperty("user.home", "/home/cgzhu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgzhu"); 
    java.lang.System.setProperty("user.timezone", "Asia/Singapore"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CacheFactory_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.collect.ImmutableMultimap$Itr",
      "com.google.common.cache.AbstractCache$StatsCounter",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.collect.MapMaker$NullComputingConcurrentMap",
      "com.google.common.collect.ComputingConcurrentHashMap",
      "com.google.common.collect.ImmutableSet$Indexed",
      "org.apache.ibatis.cache.decorators.LoggingCache",
      "org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory",
      "org.apache.ibatis.reflection.TypeParameterResolver$GenericArrayTypeImpl",
      "com.google.common.base.Splitter$MapSplitter",
      "com.google.common.cache.LocalCache$WriteThroughEntry",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.cache.Weigher",
      "com.google.common.collect.Platform",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "org.apache.ibatis.reflection.TypeParameterResolver$ParameterizedTypeImpl",
      "com.google.common.collect.ImmutableMultimap$Values",
      "org.apache.ibatis.reflection.MetaClass",
      "com.google.common.cache.LocalCache$EntryFactory$6",
      "com.google.common.cache.LocalCache$EntryFactory$7",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.cache.LocalCache$EntryFactory$8",
      "org.apache.ibatis.reflection.invoker.SetFieldInvoker",
      "com.google.common.cache.LocalCache$EntryFactory$2",
      "com.google.common.collect.RegularImmutableMultiset$ElementSet",
      "com.google.common.cache.LocalCache$EntryFactory$3",
      "com.google.common.cache.LocalCache$StrongAccessWriteEntry",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.cache.LocalCache$EntryFactory$4",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$EntryFactory$5",
      "org.apache.ibatis.exceptions.IbatisException",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.base.Predicate",
      "com.google.common.cache.LocalCache$EntryFactory$1",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.base.CharMatcher$Invisible",
      "org.hsqldb.lib.FileUtil$DatabaseFilenameFilter",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.collect.ImmutableSet$Indexed$1",
      "com.google.common.cache.CacheBuilderSpec",
      "com.google.common.cache.LocalCache$WeakWriteEntry",
      "com.google.common.cache.LocalCache$KeyIterator",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.cache.CacheBuilderSpec$RefreshDurationParser",
      "com.google.common.cache.CacheBuilderSpec$LongParser",
      "com.google.common.util.concurrent.ExecutionError",
      "com.google.common.cache.LocalCache$ValueReference",
      "com.google.common.collect.RegularImmutableMultiset$NonTerminalEntry",
      "com.google.common.cache.LocalCache",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "org.apache.ibatis.logging.Log",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.cache.LocalCache$StrongAccessEntry",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.google.common.cache.LocalCache$KeySet",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "org.apache.ibatis.reflection.Reflector",
      "org.apache.ibatis.cache.Cache",
      "com.google.common.cache.LocalCache$StrongValueReference",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.base.Equivalence$Equals",
      "org.apache.ibatis.reflection.factory.ObjectFactory",
      "com.google.common.cache.ForwardingCache",
      "com.google.common.base.Equivalence$Wrapper",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ComputingConcurrentHashMap$ComputingSegment",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.MapMaker$ComputingMapAdapter",
      "com.github.pagehelper.cache.Cache",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.collect.ImmutableEntry",
      "org.apache.ibatis.cache.decorators.SynchronizedCache",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.collect.MapMakerInternalMap$ValueReference",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "org.apache.ibatis.reflection.wrapper.BeanWrapper",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.cache.LocalCache$ManualSerializationProxy",
      "com.github.pagehelper.cache.SimpleCache",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.cache.CacheBuilderSpec$MaximumWeightParser",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.cache.LocalCache$WeightedWeakValueReference",
      "org.apache.ibatis.reflection.invoker.GetFieldInvoker",
      "org.apache.ibatis.logging.LogException",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.cache.LocalCache$EntrySet",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "org.hsqldb.lib.FileAccess",
      "com.google.common.collect.ImmutableMapValues$1",
      "com.google.common.collect.ImmutableMapValues$2",
      "com.google.common.cache.CacheLoader",
      "org.apache.ibatis.mapping.CacheBuilder",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.base.CharMatcher$Is",
      "com.github.pagehelper.cache.GuavaCache",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.cache.LocalCache$SoftValueReference",
      "com.google.common.cache.CacheLoader$FunctionToCacheLoader",
      "com.google.common.base.Splitter$Strategy",
      "com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.util.concurrent.ListenableFuture",
      "org.apache.ibatis.logging.slf4j.Slf4jLocationAwareLoggerImpl",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "com.google.common.cache.LocalCache$WeakEntry",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.cache.LocalCache$WeakAccessWriteEntry",
      "org.apache.ibatis.cache.impl.PerpetualCache",
      "com.google.common.collect.ComputingConcurrentHashMap$ComputingValueReference",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "org.hsqldb.lib.FileAccess$FileSync",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.cache.CacheBuilderSpec$MaximumSizeParser",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.CacheBuilderSpec$KeyStrengthParser",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$StrongEntry",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.cache.LocalCache$Strength$3",
      "com.google.common.cache.LocalCache$Strength$2",
      "org.apache.ibatis.logging.LogFactory",
      "com.google.common.collect.MapMakerInternalMap$ReferenceEntry",
      "com.google.common.cache.LocalCache$Strength$1",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.MapMaker$RemovalListener",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.cache.LocalCache$ReferenceEntry",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.collect.NaturalOrdering",
      "org.apache.ibatis.reflection.DefaultReflectorFactory",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.cache.Cache",
      "com.google.common.cache.LocalCache$EntryIterator",
      "com.google.common.cache.CacheBuilderSpec$ConcurrencyLevelParser",
      "com.google.common.collect.AllEqualOrdering",
      "org.hsqldb.lib.FileUtil",
      "com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "com.google.common.cache.CacheBuilderSpec$WriteDurationParser",
      "com.google.common.collect.Hashing",
      "com.google.common.cache.LoadingCache",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.collect.ListMultimap",
      "com.google.common.cache.CacheBuilderSpec$ValueStrengthParser",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.Suppliers$SupplierFunctionImpl",
      "com.google.common.cache.CacheBuilderSpec$AccessDurationParser",
      "com.google.common.collect.ComputationException",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.cache.CacheLoader$1",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheBuilderSpec$DurationParser",
      "com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "com.google.common.cache.LocalCache$Values",
      "com.google.common.cache.LocalCache$WeakValueReference",
      "org.hsqldb.lib.FileUtil$FileAccessRes",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.collect.ImmutableMapKeySet",
      "com.google.common.cache.CacheBuilderSpec$RecordStatsParser",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilderSpec$IntegerParser",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.MapMaker$NullConcurrentMap",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableMultimap$1",
      "org.apache.ibatis.reflection.factory.DefaultObjectFactory",
      "com.google.common.base.Equivalence$1",
      "com.google.common.cache.CacheStats",
      "com.google.common.collect.ImmutableMultimap$2",
      "org.apache.ibatis.reflection.SystemMetaObject",
      "com.google.common.cache.RemovalCause$4",
      "com.google.common.cache.RemovalCause$5",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.cache.RemovalCause$1",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.cache.RemovalCause$2",
      "com.google.common.cache.RemovalCause$3",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.cache.LocalCache$HashIterator",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.cache.CacheLoader$SupplierToCacheLoader",
      "com.google.common.base.Suppliers$ThreadSafeSupplier",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.github.pagehelper.PageException",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.base.MoreObjects",
      "com.google.common.collect.GenericMapMaker",
      "com.google.common.cache.LocalCache$WriteQueue",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.google.common.base.CharMatcher$AnyOf",
      "org.apache.ibatis.reflection.wrapper.ObjectWrapper",
      "com.google.common.cache.RemovalListener",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet$1",
      "com.google.common.collect.MapMaker$RemovalNotification",
      "org.apache.ibatis.reflection.ReflectorFactory",
      "org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory",
      "com.google.common.collect.MapMaker$RemovalCause",
      "com.github.pagehelper.cache.CacheFactory",
      "org.apache.ibatis.cache.CacheException",
      "org.apache.ibatis.reflection.TypeParameterResolver",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.cache.CacheBuilderSpec$ValueParser",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Splitter",
      "com.google.common.collect.SingletonImmutableList",
      "org.apache.ibatis.reflection.property.PropertyNamer",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Multiset$Entry",
      "com.google.common.base.Suppliers$SupplierFunction",
      "com.google.common.collect.MapMakerInternalMap$Strength$3",
      "com.google.common.collect.ExplicitOrdering",
      "org.apache.ibatis.reflection.wrapper.BaseWrapper",
      "com.github.pagehelper.util.StringUtil",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.cache.LocalCache$Strength",
      "org.apache.ibatis.exceptions.PersistenceException",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.cache.LocalCache$WeakAccessEntry",
      "com.google.common.cache.LocalCache$NullEntry",
      "org.apache.ibatis.logging.slf4j.Slf4jImpl",
      "com.google.common.cache.LocalCache$LoadingSerializationProxy",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry",
      "org.apache.ibatis.reflection.SystemMetaObject$NullObject",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.cache.LocalCache$AbstractCacheSet",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "com.google.common.collect.ImmutableMultiset$1",
      "com.google.common.base.Suppliers",
      "org.apache.ibatis.reflection.ReflectionException",
      "com.google.common.collect.MapMakerInternalMap$2",
      "com.google.common.collect.MapMakerInternalMap$1",
      "org.apache.ibatis.reflection.invoker.MethodInvoker",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.cache.RemovalNotification",
      "com.google.common.cache.CacheBuilderSpec$InitialCapacityParser",
      "com.google.common.base.Equivalence",
      "org.apache.ibatis.reflection.TypeParameterResolver$WildcardTypeImpl",
      "org.apache.ibatis.reflection.invoker.Invoker",
      "com.google.common.cache.LocalCache$LoadingValueReference",
      "org.apache.ibatis.reflection.property.PropertyTokenizer",
      "org.apache.ibatis.cache.decorators.FifoCache",
      "com.google.common.cache.LocalCache$ValueIterator",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.cache.LocalCache$StrongWriteEntry",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.collect.SetMultimap",
      "org.apache.ibatis.logging.LogFactory$5",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "org.apache.ibatis.logging.LogFactory$6",
      "com.google.common.cache.RemovalCause",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.AbstractIterator",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder$2",
      "org.apache.ibatis.logging.LogFactory$3",
      "com.google.common.collect.RegularImmutableSortedSet",
      "org.apache.ibatis.reflection.MetaObject",
      "org.apache.ibatis.logging.LogFactory$4",
      "org.apache.ibatis.logging.LogFactory$1",
      "org.apache.ibatis.logging.LogFactory$2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CacheFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.pagehelper.cache.CacheFactory",
      "com.github.pagehelper.util.StringUtil",
      "com.github.pagehelper.PageException",
      "com.github.pagehelper.cache.GuavaCache",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.CacheStats",
      "com.google.common.base.Preconditions",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.cache.LocalCache",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.Equivalence",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.google.common.io.PatternFilenameFilter",
      "com.github.pagehelper.cache.SimpleCache",
      "org.apache.ibatis.mapping.CacheBuilder",
      "org.hsqldb.lib.FileUtil$FileAccessRes",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.lib.FileUtil$DatabaseFilenameFilter",
      "org.apache.ibatis.cache.impl.PerpetualCache",
      "org.apache.ibatis.reflection.factory.DefaultObjectFactory",
      "org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory",
      "org.apache.ibatis.reflection.DefaultReflectorFactory",
      "org.apache.ibatis.reflection.MetaObject",
      "org.apache.ibatis.reflection.wrapper.BaseWrapper",
      "org.apache.ibatis.reflection.wrapper.BeanWrapper",
      "org.apache.ibatis.reflection.MetaClass",
      "org.apache.ibatis.reflection.Reflector",
      "org.apache.ibatis.reflection.property.PropertyNamer",
      "org.apache.ibatis.reflection.invoker.MethodInvoker",
      "org.apache.ibatis.reflection.TypeParameterResolver",
      "org.apache.ibatis.reflection.TypeParameterResolver$WildcardTypeImpl",
      "org.apache.ibatis.reflection.TypeParameterResolver$ParameterizedTypeImpl",
      "org.apache.ibatis.reflection.TypeParameterResolver$GenericArrayTypeImpl",
      "org.apache.ibatis.reflection.invoker.SetFieldInvoker",
      "org.apache.ibatis.reflection.invoker.GetFieldInvoker",
      "org.apache.ibatis.reflection.SystemMetaObject",
      "org.apache.ibatis.cache.decorators.FifoCache",
      "org.apache.ibatis.cache.decorators.LoggingCache",
      "org.apache.ibatis.logging.LogFactory$1",
      "org.apache.ibatis.logging.slf4j.Slf4jImpl",
      "org.apache.ibatis.logging.slf4j.Slf4jLocationAwareLoggerImpl",
      "org.apache.ibatis.logging.LogFactory$2",
      "org.apache.ibatis.logging.LogFactory$3",
      "org.apache.ibatis.logging.LogFactory$4",
      "org.apache.ibatis.logging.LogFactory$5",
      "org.apache.ibatis.logging.LogFactory$6",
      "org.apache.ibatis.logging.LogFactory",
      "org.apache.ibatis.cache.decorators.SynchronizedCache",
      "org.apache.ibatis.reflection.property.PropertyTokenizer",
      "com.google.common.cache.CacheLoader",
      "com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "org.apache.ibatis.exceptions.IbatisException",
      "org.apache.ibatis.exceptions.PersistenceException",
      "org.apache.ibatis.cache.CacheException",
      "com.google.common.cache.LocalCache$StrongValueReference",
      "com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "org.apache.ibatis.reflection.ReflectionException",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.cache.LocalCache$SoftValueReference",
      "com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.google.common.cache.LocalCache$WeakValueReference",
      "com.google.common.util.concurrent.ExecutionError",
      "org.apache.ibatis.reflection.SystemMetaObject$NullObject"
    );
  }
}
