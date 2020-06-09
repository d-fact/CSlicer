/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 09:26:44 GMT 2019
 */

package org.restheart.handlers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.restheart.handlers.OptionsHandler;
import org.restheart.handlers.PipedHttpHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptionsHandler_ESTest extends OptionsHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OptionsHandler optionsHandler0 = null;
      try {
        optionsHandler0 = new OptionsHandler((PipedHttpHandler) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.restheart.db.DbsDAO
         //
         verifyException("org.restheart.handlers.PipedHttpHandler", e);
      }
  }
}
