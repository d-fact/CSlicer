/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:31:06 GMT 2019
 */

package com.github.pagehelper.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.util.PageObjectUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageObjectUtil_ESTest extends PageObjectUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PageObjectUtil.setParams("no!a=D6yj~DM:`4m-{");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageObjectUtil.setParams("|9p");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PageObjectUtil.getParamValue((MetaObject) null, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.util.PageObjectUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PageObjectUtil.setParams("gIvJNxg*L:wi");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageObjectUtil.setParams("");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Page<Object> page0 = PageObjectUtil.getPageFromObject((Object) "gIvJNxg*L:wi", false);
      assertNull(page0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        PageObjectUtil.getPageFromObject((Object) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // \u65E0\u6CD5\u83B7\u53D6\u5206\u9875\u67E5\u8BE2\u53C2\u6570!
         //
         verifyException("com.github.pagehelper.util.PageObjectUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        PageObjectUtil.getPageFromObject(object0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // \u5206\u9875\u67E5\u8BE2\u7F3A\u5C11\u5FC5\u8981\u7684\u53C2\u6570:pageNum
         //
         verifyException("com.github.pagehelper.util.PageObjectUtil", e);
      }
  }
}
