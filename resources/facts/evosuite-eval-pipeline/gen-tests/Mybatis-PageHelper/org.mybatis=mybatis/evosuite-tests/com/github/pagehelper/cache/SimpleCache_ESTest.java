/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:57:27 GMT 2019
 */

package com.github.pagehelper.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.cache.SimpleCache;
import java.util.Properties;
import java.util.function.BiFunction;
import org.apache.ibatis.cache.decorators.FifoCache;
import org.apache.ibatis.cache.impl.PerpetualCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleCache_ESTest extends SimpleCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Properties properties0 = new Properties();
      SimpleCache<Object, String> simpleCache0 = new SimpleCache<Object, String>(properties0, "com.github.pagehelper.cache.SimpleCache");
      PerpetualCache perpetualCache0 = new PerpetualCache((String) null);
      // Undeclared exception!
      try { 
        simpleCache0.put(perpetualCache0, "E.<H}L0\"v^^,");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cache instances require an ID.
         //
         verifyException("org.apache.ibatis.cache.impl.PerpetualCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      SimpleCache<Object, FifoCache> simpleCache0 = new SimpleCache<Object, FifoCache>(properties0, "");
      PerpetualCache perpetualCache0 = new PerpetualCache((String) null);
      // Undeclared exception!
      try { 
        simpleCache0.get(perpetualCache0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cache instances require an ID.
         //
         verifyException("org.apache.ibatis.cache.impl.PerpetualCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleCache<String, String> simpleCache0 = null;
      try {
        simpleCache0 = new SimpleCache<String, String>((Properties) null, "org.apache.ibatis.exceptions.IbatisException");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.cache.SimpleCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties();
      Object object0 = new Object();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.merge(object0, "6o>FJ9ACVtf!", biFunction0);
      SimpleCache<String, String> simpleCache0 = null;
      try {
        simpleCache0 = new SimpleCache<String, String>(properties0, "6o>FJ9ACVtf!");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.apache.ibatis.mapping.CacheBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Properties properties0 = new Properties();
      SimpleCache<Object, Integer> simpleCache0 = new SimpleCache<Object, Integer>(properties0, "Pf[j");
      Object object0 = new Object();
      Integer integer0 = simpleCache0.get(object0);
      SimpleCache<Integer, Object> simpleCache1 = new SimpleCache<Integer, Object>(properties0, "Pf[j");
      simpleCache1.put(integer0, properties0);
      Object object1 = simpleCache1.get(integer0);
      assertSame(properties0, object1);
  }
}
