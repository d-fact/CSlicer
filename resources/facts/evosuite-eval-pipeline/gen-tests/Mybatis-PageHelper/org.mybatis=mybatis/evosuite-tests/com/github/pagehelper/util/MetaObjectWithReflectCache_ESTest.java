/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 10:03:37 GMT 2019
 */

package com.github.pagehelper.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.pagehelper.util.MetaObjectWithReflectCache;
import org.apache.ibatis.reflection.MetaObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MetaObjectWithReflectCache_ESTest extends MetaObjectWithReflectCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      MetaObject metaObject0 = MetaObjectWithReflectCache.forObject(object0);
      assertFalse(metaObject0.isCollection());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MetaObjectWithReflectCache metaObjectWithReflectCache0 = new MetaObjectWithReflectCache();
  }
}
