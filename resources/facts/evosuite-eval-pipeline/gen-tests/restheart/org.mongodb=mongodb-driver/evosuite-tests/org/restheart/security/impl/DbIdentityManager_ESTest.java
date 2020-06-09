/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 10:17:28 GMT 2019
 */

package org.restheart.security.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.restheart.security.impl.DbIdentityManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DbIdentityManager_ESTest extends DbIdentityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DbIdentityManager dbIdentityManager0 = null;
      try {
        dbIdentityManager0 = new DbIdentityManager((Map<String, Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // missing required arguments conf-file
         //
         verifyException("org.restheart.security.impl.AbstractSimpleSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
}
