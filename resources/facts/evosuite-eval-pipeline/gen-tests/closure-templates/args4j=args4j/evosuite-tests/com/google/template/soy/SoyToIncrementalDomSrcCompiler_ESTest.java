/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 12:03:32 GMT 2019
 */

package com.google.template.soy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.template.soy.SoyFileSet;
import com.google.template.soy.SoyToIncrementalDomSrcCompiler;
import com.google.template.soy.coredirectives.EscapeHtmlDirective;
import com.google.template.soy.shared.internal.GuiceSimpleScope;
import com.google.template.soy.shared.restricted.SoyFunction;
import com.google.template.soy.shared.restricted.SoyPrintDirective;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SoyToIncrementalDomSrcCompiler_ESTest extends SoyToIncrementalDomSrcCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SoyToIncrementalDomSrcCompiler soyToIncrementalDomSrcCompiler0 = new SoyToIncrementalDomSrcCompiler();
      GuiceSimpleScope guiceSimpleScope0 = new GuiceSimpleScope();
      EscapeHtmlDirective escapeHtmlDirective0 = new EscapeHtmlDirective();
      ImmutableBiMap<String, SoyPrintDirective> immutableBiMap0 = ImmutableBiMap.of("5OY,rBg bLv?#f/", (SoyPrintDirective) escapeHtmlDirective0);
      SoyFileSet.CoreDependencies soyFileSet_CoreDependencies0 = new SoyFileSet.CoreDependencies(guiceSimpleScope0, (ImmutableMap<String, ? extends SoyFunction>) null, immutableBiMap0);
      SoyFileSet.Builder soyFileSet_Builder0 = new SoyFileSet.Builder(soyFileSet_CoreDependencies0);
      // Undeclared exception!
      try { 
        soyToIncrementalDomSrcCompiler0.compile(soyFileSet_Builder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must have non-zero number of input Soy files.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      SoyToIncrementalDomSrcCompiler soyToIncrementalDomSrcCompiler0 = new SoyToIncrementalDomSrcCompiler(classLoader0);
      // Undeclared exception!
      try { 
        soyToIncrementalDomSrcCompiler0.compile((SoyFileSet.Builder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.template.soy.SoyToIncrementalDomSrcCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        SoyToIncrementalDomSrcCompiler.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
