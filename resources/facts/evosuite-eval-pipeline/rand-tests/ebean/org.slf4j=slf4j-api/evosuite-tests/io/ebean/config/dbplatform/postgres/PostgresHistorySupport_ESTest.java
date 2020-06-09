/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 12 14:10:04 GMT 2019
 */

package io.ebean.config.dbplatform.postgres;

import org.junit.Test;
import static org.junit.Assert.*;
import io.ebean.config.dbplatform.postgres.PostgresHistorySupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PostgresHistorySupport_ESTest extends PostgresHistorySupport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PostgresHistorySupport postgresHistorySupport0 = new PostgresHistorySupport();
      String string0 = postgresHistorySupport0.getSysPeriodUpper("", "fV@FM&6~DD");
      assertEquals("upper(.fV@FM&6~DD)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PostgresHistorySupport postgresHistorySupport0 = new PostgresHistorySupport();
      String string0 = postgresHistorySupport0.getAsOfPredicate(".", "xj|_*mJG\"yv+lieo");
      assertEquals("..xj|_*mJG\"yv+lieo @> ?::timestamptz", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PostgresHistorySupport postgresHistorySupport0 = new PostgresHistorySupport();
      int int0 = postgresHistorySupport0.getBindCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PostgresHistorySupport postgresHistorySupport0 = new PostgresHistorySupport();
      String string0 = postgresHistorySupport0.getSysPeriodLower("kctppmrD.kctppmrD @> ?::timestamptz", "upper(kctppmrD.kctppmrD)");
      assertEquals("lower(kctppmrD.kctppmrD @> ?::timestamptz.upper(kctppmrD.kctppmrD))", string0);
  }
}
