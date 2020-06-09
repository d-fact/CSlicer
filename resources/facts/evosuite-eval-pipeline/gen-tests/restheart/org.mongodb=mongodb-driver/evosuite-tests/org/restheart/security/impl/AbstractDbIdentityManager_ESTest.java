/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 10:18:36 GMT 2019
 */

package org.restheart.security.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.restheart.security.impl.AbstractDbIdentityManager;
import org.restheart.security.impl.DbIdentityManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractDbIdentityManager_ESTest extends AbstractDbIdentityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[9];
      char[] charArray1 = new char[8];
      boolean boolean0 = AbstractDbIdentityManager.checkPassword(false, charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[7];
      char[] charArray1 = new char[5];
      boolean boolean0 = AbstractDbIdentityManager.checkPassword(true, charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DbIdentityManager dbIdentityManager0 = null;
      try {
        dbIdentityManager0 = new DbIdentityManager(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[1];
      boolean boolean0 = AbstractDbIdentityManager.checkPassword(false, charArray0, charArray0);
      assertTrue(boolean0);
  }
}
