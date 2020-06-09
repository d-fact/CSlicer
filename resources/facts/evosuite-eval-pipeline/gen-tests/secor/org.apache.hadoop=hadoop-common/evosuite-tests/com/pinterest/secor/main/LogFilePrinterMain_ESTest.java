/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 07:31:08 GMT 2019
 */

package com.pinterest.secor.main;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pinterest.secor.main.LogFilePrinterMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LogFilePrinterMain_ESTest extends LogFilePrinterMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "}F";
      stringArray0[1] = "Log file printer failed";
      stringArray0[2] = "";
      stringArray0[3] = "o1";
      stringArray0[4] = "o";
      stringArray0[5] = "";
      stringArray0[6] = "!MGPJ73p.:8>?m";
      stringArray0[7] = "7_S~yr9`";
      // Undeclared exception!
      try { 
        LogFilePrinterMain.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LogFilePrinterMain logFilePrinterMain0 = new LogFilePrinterMain();
  }
}
