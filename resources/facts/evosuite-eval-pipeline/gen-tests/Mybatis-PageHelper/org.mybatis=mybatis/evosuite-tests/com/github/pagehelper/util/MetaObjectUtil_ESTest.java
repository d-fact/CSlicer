/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:36:10 GMT 2019
 */

package com.github.pagehelper.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.util.MetaObjectUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MetaObjectUtil_ESTest extends MetaObjectUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MetaObjectUtil metaObjectUtil0 = new MetaObjectUtil();
      MetaObjectUtil.method = metaObjectUtil0.method;
      MetaObjectUtil.method = null;
      // Undeclared exception!
      try { 
        MetaObjectUtil.forObject(metaObjectUtil0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("com.github.pagehelper.util.MetaObjectUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MetaObjectUtil metaObjectUtil0 = new MetaObjectUtil();
      MetaObject metaObject0 = MetaObjectUtil.forObject(metaObjectUtil0);
      assertFalse(metaObject0.isCollection());
  }
}
