/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 08:51:58 GMT 2019
 */

package org.restheart.handlers.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.restheart.handlers.PipedHttpHandler;
import org.restheart.handlers.database.PutDBHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PutDBHandler_ESTest extends PutDBHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PutDBHandler putDBHandler0 = null;
      try {
        putDBHandler0 = new PutDBHandler();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.restheart.db.DbsDAO
         //
         verifyException("org.restheart.handlers.PipedHttpHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PutDBHandler putDBHandler0 = null;
      try {
        putDBHandler0 = new PutDBHandler((PipedHttpHandler) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.restheart.db.DbsDAO
         //
         verifyException("org.restheart.handlers.PipedHttpHandler", e);
      }
  }
}
