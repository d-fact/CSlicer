/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 16:56:01 GMT 2019
 */

package io.ebean.config.dbplatform.h2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.ebean.BackgroundExecutor;
import io.ebean.config.dbplatform.h2.H2SequenceIdGenerator;
import io.ebeaninternal.server.core.DefaultBackgroundExecutor;
import javax.sql.DataSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.hsqldb.jdbc.JDBCPool;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class H2SequenceIdGenerator_ESTest extends H2SequenceIdGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultBackgroundExecutor defaultBackgroundExecutor0 = new DefaultBackgroundExecutor(0, (-886), "");
      JDBCPool jDBCPool0 = new JDBCPool();
      H2SequenceIdGenerator h2SequenceIdGenerator0 = new H2SequenceIdGenerator(defaultBackgroundExecutor0, jDBCPool0, "", 1100);
      String string0 = h2SequenceIdGenerator0.getSql((-886));
      assertEquals("select .nextval", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      H2SequenceIdGenerator h2SequenceIdGenerator0 = new H2SequenceIdGenerator((BackgroundExecutor) null, (DataSource) null, "CREATE CACHED TABLE IF NOT EXISTS INFORMATION_SCHEMA.LOBS(ID BIGINT PRIMARY KEY, BYTE_COUNT BIGINT, TABLE INT) HIDDEN", 2120);
      // Undeclared exception!
      h2SequenceIdGenerator0.getSql(44000);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultBackgroundExecutor defaultBackgroundExecutor0 = new DefaultBackgroundExecutor(219, 219, "[Uqf?_");
      JDBCPool jDBCPool0 = new JDBCPool();
      H2SequenceIdGenerator h2SequenceIdGenerator0 = new H2SequenceIdGenerator(defaultBackgroundExecutor0, jDBCPool0, "[Uqf?_", 219);
      String string0 = h2SequenceIdGenerator0.getSql(219);
      assertNotNull(string0);
  }
}
