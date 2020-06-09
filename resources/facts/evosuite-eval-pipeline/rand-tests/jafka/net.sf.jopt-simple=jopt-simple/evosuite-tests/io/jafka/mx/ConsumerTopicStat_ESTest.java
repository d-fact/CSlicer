/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 12 14:32:51 GMT 2019
 */

package io.jafka.mx;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.jafka.mx.ConsumerTopicStat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConsumerTopicStat_ESTest extends ConsumerTopicStat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConsumerTopicStat consumerTopicStat0 = new ConsumerTopicStat();
      long long0 = consumerTopicStat0.getMessagesPerTopic();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConsumerTopicStat consumerTopicStat0 = ConsumerTopicStat.getConsumerTopicStat("io.jafka.utils.Pool");
      long long0 = consumerTopicStat0.getMessagesPerTopic();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConsumerTopicStat consumerTopicStat0 = ConsumerTopicStat.getConsumerTopicStat("");
      String string0 = consumerTopicStat0.getMbeanName();
      assertEquals("jafka:type=jafka.ConsumerTopicStat.", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConsumerTopicStat.getConsumerTopicStat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConsumerTopicStat consumerTopicStat0 = new ConsumerTopicStat();
      consumerTopicStat0.getMbeanName();
      assertEquals(0L, consumerTopicStat0.getMessagesPerTopic());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConsumerTopicStat consumerTopicStat0 = ConsumerTopicStat.getConsumerTopicStat("pOHHuV;=:");
      consumerTopicStat0.recordMessagesPerTopic(0);
      assertEquals(0L, consumerTopicStat0.getMessagesPerTopic());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConsumerTopicStat consumerTopicStat0 = ConsumerTopicStat.getConsumerTopicStat("z");
      long long0 = consumerTopicStat0.getMessagesPerTopic();
      assertEquals(0L, long0);
  }
}
