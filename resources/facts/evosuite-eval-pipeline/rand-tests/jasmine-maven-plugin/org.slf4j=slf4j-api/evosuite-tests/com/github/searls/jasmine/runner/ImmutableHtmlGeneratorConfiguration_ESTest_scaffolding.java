/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 12 14:41:19 GMT 2019
 */

package com.github.searls.jasmine.runner;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ImmutableHtmlGeneratorConfiguration_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ImmutableHtmlGeneratorConfiguration_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.github.searls.jasmine.model.ScriptSearch",
      "com.github.searls.jasmine.model.ImmutableScriptSearch",
      "com.github.searls.jasmine.io.scripts.FindsScriptLocationsInDirectory",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.RegularImmutableList",
      "com.github.searls.jasmine.model.ImmutableScriptSearch$Builder",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration$Builder",
      "com.google.common.base.Function",
      "com.github.searls.jasmine.io.scripts.ContextPathScriptResolver",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.github.searls.jasmine.io.scripts.BasicScriptResolver",
      "com.github.searls.jasmine.runner.ReporterType",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.github.searls.jasmine.runner.HtmlGeneratorConfiguration",
      "com.google.common.collect.CollectPreconditions",
      "com.github.searls.jasmine.io.scripts.AbstractScriptResolver",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.github.searls.jasmine.io.ScansDirectory",
      "com.github.searls.jasmine.runner.SpecRunnerTemplate",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.base.MoreObjects$1",
      "org.codehaus.plexus.util.Scanner",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.github.searls.jasmine.io.scripts.ConvertsFileToUriString",
      "com.github.searls.jasmine.io.scripts.ResolvesLocationOfPreloadSources",
      "com.github.searls.jasmine.io.scripts.ScriptResolver",
      "com.google.common.base.MoreObjects",
      "org.codehaus.plexus.util.MatchPattern",
      "org.codehaus.plexus.util.AbstractScanner",
      "com.google.common.collect.ImmutableList$1",
      "org.seleniumhq.jetty9.util.RegexSet",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.codehaus.plexus.util.DirectoryScanner"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ImmutableHtmlGeneratorConfiguration_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.searls.jasmine.runner.HtmlGeneratorConfiguration",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration",
      "com.github.searls.jasmine.runner.ImmutableHtmlGeneratorConfiguration$Builder",
      "com.google.common.collect.Lists",
      "com.github.searls.jasmine.io.scripts.FindsScriptLocationsInDirectory",
      "com.github.searls.jasmine.io.ScansDirectory",
      "org.codehaus.plexus.util.AbstractScanner",
      "org.codehaus.plexus.util.DirectoryScanner",
      "org.codehaus.plexus.util.MatchPattern",
      "com.github.searls.jasmine.io.scripts.ConvertsFileToUriString",
      "com.github.searls.jasmine.io.scripts.AbstractScriptResolver",
      "com.github.searls.jasmine.io.scripts.BasicScriptResolver",
      "com.github.searls.jasmine.io.scripts.ResolvesLocationOfPreloadSources",
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
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.Preconditions"
    );
  }
}
