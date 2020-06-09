/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 11:28:58 GMT 2019
 */

package com.github.searls.jasmine.runner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.searls.jasmine.runner.WebDriverWaiter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebDriverWaiter_ESTest extends WebDriverWaiter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebDriverWaiter webDriverWaiter0 = new WebDriverWaiter();
      // Undeclared exception!
      try { 
        webDriverWaiter0.waitForRunnerToFinish((WebDriver) null, (-128), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
