/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 17:46:21 GMT 2019
 */

package io.ebean.config.dbplatform.postgres;

import org.junit.Test;
import static org.junit.Assert.*;
import io.ebean.BackgroundExecutor;
import io.ebean.config.dbplatform.postgres.PostgresSequenceIdGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.hsqldb.jdbc.JDBCPool;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PostgresSequenceIdGenerator_ESTest extends PostgresSequenceIdGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JDBCPool jDBCPool0 = new JDBCPool();
      PostgresSequenceIdGenerator postgresSequenceIdGenerator0 = new PostgresSequenceIdGenerator((BackgroundExecutor) null, jDBCPool0, "", (-3543));
      String string0 = postgresSequenceIdGenerator0.getSql((-3995));
      assertEquals("select nextval(''), s.generate_series from (select generate_series from generate_series(1,-3995) ) as s", string0);
  }
}
