/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:46:16 GMT 2019
 */

package com.github.pagehelper.page;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.dialect.AbstractHelperDialect;
import com.github.pagehelper.dialect.helper.MySqlDialect;
import com.github.pagehelper.page.PageAutoDialect;
import java.util.Properties;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageAutoDialect_ESTest extends PageAutoDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PageAutoDialect pageAutoDialect0 = new PageAutoDialect();
      // Undeclared exception!
      try { 
        pageAutoDialect0.setProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.page.PageAutoDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageAutoDialect pageAutoDialect0 = new PageAutoDialect();
      Properties properties0 = new Properties();
      properties0.setProperty("autoRuntimeDialect", "autoRuntimeDialect");
      pageAutoDialect0.setProperties(properties0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PageAutoDialect pageAutoDialect0 = new PageAutoDialect();
      Configuration configuration0 = new Configuration();
      Properties properties0 = configuration0.getVariables();
      pageAutoDialect0.setProperties(properties0);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PageAutoDialect pageAutoDialect0 = new PageAutoDialect();
      AbstractHelperDialect abstractHelperDialect0 = pageAutoDialect0.getDelegate();
      assertNull(abstractHelperDialect0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageAutoDialect pageAutoDialect0 = new PageAutoDialect();
      // Undeclared exception!
      try { 
        pageAutoDialect0.initDelegateDialect((MappedStatement) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.page.PageAutoDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageAutoDialect pageAutoDialect0 = new PageAutoDialect();
      pageAutoDialect0.clearDelegate();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<MySqlDialect> class0 = MySqlDialect.class;
      PageAutoDialect.registerDialectAlias("U4", class0);
  }
}
