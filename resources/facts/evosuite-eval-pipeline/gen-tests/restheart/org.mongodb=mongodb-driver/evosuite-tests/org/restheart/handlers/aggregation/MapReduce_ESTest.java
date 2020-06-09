/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 09:55:00 GMT 2019
 */

package org.restheart.handlers.aggregation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.bson.BsonDateTime;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.RawBsonDocument;
import org.bson.codecs.Codec;
import org.bson.codecs.IntegerCodec;
import org.bson.codecs.configuration.CodecRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.restheart.handlers.aggregation.MapReduce;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapReduce_ESTest extends MapReduce_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BsonDocument bsonDocument0 = new BsonDocument();
      MapReduce mapReduce0 = null;
      try {
        mapReduce0 = new MapReduce(bsonDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // query does not have 'type' property
         //
         verifyException("org.restheart.handlers.aggregation.AbstractAggregationOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Codec<Object> codec0 = (Codec<Object>) mock(Codec.class, new ViolatedAssumptionAnswer());
      RawBsonDocument rawBsonDocument0 = new RawBsonDocument((Object) "o&bh/~?\"", codec0);
      MapReduce mapReduce0 = null;
      try {
        mapReduce0 = new MapReduce(rawBsonDocument0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // While decoding a BSON document 4 bytes were required, but only 0 remain
         //
         verifyException("org.bson.io.ByteBufferBsonInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapReduce mapReduce0 = null;
      try {
        mapReduce0 = new MapReduce((BsonDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.handlers.aggregation.AbstractAggregationOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)1;
      RawBsonDocument rawBsonDocument0 = new RawBsonDocument(byteArray0);
      MapReduce mapReduce0 = null;
      try {
        mapReduce0 = new MapReduce(rawBsonDocument0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BsonDateTime bsonDateTime0 = new BsonDateTime(0L);
      Document document0 = new Document("STANDARD", bsonDateTime0);
      Class<Integer> class0 = Integer.class;
      IntegerCodec integerCodec0 = new IntegerCodec();
      CodecRegistry codecRegistry0 = mock(CodecRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(integerCodec0).when(codecRegistry0).get(nullable(java.lang.Class.class));
      BsonDocument bsonDocument0 = document0.toBsonDocument(class0, codecRegistry0);
      MapReduce mapReduce0 = null;
      try {
        mapReduce0 = new MapReduce(bsonDocument0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.bson.Document cannot be cast to java.lang.Integer
         //
         verifyException("org.bson.codecs.IntegerCodec", e);
      }
  }
}
