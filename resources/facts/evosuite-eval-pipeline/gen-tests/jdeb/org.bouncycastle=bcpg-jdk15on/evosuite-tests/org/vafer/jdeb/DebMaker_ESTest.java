/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:11:50 GMT 2019
 */

package org.vafer.jdeb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.vafer.jdeb.Console;
import org.vafer.jdeb.DataProducer;
import org.vafer.jdeb.DebMaker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DebMaker_ESTest extends DebMaker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        DebMaker.getDigestCode("SJZ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unknown hash algorithm tag in digestName: SJZ
         //
         verifyException("org.vafer.jdeb.DebMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = DebMaker.getDigestCode("SHA256");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = DebMaker.getDigestCode("MD5");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = DebMaker.getDigestCode("MD2");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = DebMaker.getDigestCode("SHA1");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = DebMaker.getDigestCode("SHA384");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          LinkedHashSet<DataProducer> linkedHashSet0 = new LinkedHashSet<DataProducer>();
          Console console0 = mock(Console.class, new ViolatedAssumptionAnswer());
          DebMaker debMaker0 = null;
          try {
            debMaker0 = new DebMaker(console0, linkedHashSet0, linkedHashSet0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.security.SecurityPermission\" \"insertProvider\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkSecurityAccess(SecurityManager.java:1759)
             // java.security.Security.checkInsertProvider(Security.java:862)
             // java.security.Security.insertProviderAt(Security.java:359)
             // java.security.Security.addProvider(Security.java:403)
             // org.vafer.jdeb.DebMaker.<init>(DebMaker.java:146)
             // sun.reflect.GeneratedConstructorAccessor150.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:233)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          DebMaker debMaker0 = null;
          try {
            debMaker0 = new DebMaker((Console) null, (Collection<DataProducer>) null, (Collection<DataProducer>) null);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.security.SecurityPermission\" \"insertProvider\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkSecurityAccess(SecurityManager.java:1759)
             // java.security.Security.checkInsertProvider(Security.java:862)
             // java.security.Security.insertProviderAt(Security.java:359)
             // java.security.Security.addProvider(Security.java:403)
             // org.vafer.jdeb.DebMaker.<init>(DebMaker.java:146)
             // sun.reflect.GeneratedConstructorAccessor150.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:233)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
