/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 10:38:57 GMT 2019
 */

package org.restheart.handlers.applicationlogic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.ServerConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.restheart.handlers.applicationlogic.CsvRequestParams;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CsvRequestParams_ESTest extends CsvRequestParams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpServerExchange httpServerExchange0 = new HttpServerExchange((ServerConnection) null);
      httpServerExchange0.addQueryParam("coll", "coll");
      CsvRequestParams csvRequestParams0 = null;
      try {
        csvRequestParams0 = new CsvRequestParams(httpServerExchange0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // db qparam is mandatory
         //
         verifyException("org.restheart.handlers.applicationlogic.CsvRequestParams", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpServerExchange httpServerExchange0 = new HttpServerExchange((ServerConnection) null);
      CsvRequestParams csvRequestParams0 = null;
      try {
        csvRequestParams0 = new CsvRequestParams(httpServerExchange0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // db qparam is mandatory
         //
         verifyException("org.restheart.handlers.applicationlogic.CsvRequestParams", e);
      }
  }
}
