/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 12 14:41:57 GMT 2019
 */

package org.vafer.jdeb.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.vafer.jdeb.utils.MapVariableResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapVariableResolver_ESTest extends MapVariableResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      MapVariableResolver mapVariableResolver0 = new MapVariableResolver(hashMap0);
      BiFunction<String, String, String> biFunction0 = (BiFunction<String, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge((String) null, "X@{q|R^fus", biFunction0);
      String string0 = mapVariableResolver0.get((String) null);
      assertEquals("X@{q|R^fus", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      MapVariableResolver mapVariableResolver0 = new MapVariableResolver(hashMap0);
      hashMap0.put("ccVLW-\"D3cKW9mPJ Y", "");
      String string0 = mapVariableResolver0.get("ccVLW-\"D3cKW9mPJ Y");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapVariableResolver mapVariableResolver0 = new MapVariableResolver((Map<String, String>) null);
      // Undeclared exception!
      try { 
        mapVariableResolver0.get("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.vafer.jdeb.utils.MapVariableResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      MapVariableResolver mapVariableResolver0 = new MapVariableResolver(hashMap0);
      String string0 = mapVariableResolver0.get("5");
      assertNull(string0);
  }
}
