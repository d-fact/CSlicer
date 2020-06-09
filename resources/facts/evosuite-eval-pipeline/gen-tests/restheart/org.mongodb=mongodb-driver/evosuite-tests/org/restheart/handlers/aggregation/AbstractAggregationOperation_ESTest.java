/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 09:56:09 GMT 2019
 */

package org.restheart.handlers.aggregation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import java.util.List;
import org.bson.BsonArray;
import org.bson.BsonBoolean;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.BsonValue;
import org.bson.codecs.BsonBooleanCodec;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.restheart.handlers.aggregation.AbstractAggregationOperation;
import org.restheart.handlers.aggregation.MapReduce;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractAggregationOperation_ESTest extends AbstractAggregationOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.PROLEPTIC_MONTH;
      CodecRegistry codecRegistry0 = mock(CodecRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Codec) null).when(codecRegistry0).get(nullable(java.lang.Class.class));
      BsonDocument bsonDocument0 = BsonDocumentWrapper.asBsonDocument(chronoField0, codecRegistry0);
      // Undeclared exception!
      try { 
        AbstractAggregationOperation.getFromJson(bsonDocument0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not unwrap a BsonDocumentWrapper with no Encoder
         //
         verifyException("org.bson.BsonDocumentWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BsonBoolean bsonBoolean0 = BsonBoolean.valueOf(true);
      BsonBooleanCodec bsonBooleanCodec0 = new BsonBooleanCodec();
      BsonDocumentWrapper<BsonBoolean> bsonDocumentWrapper0 = new BsonDocumentWrapper<BsonBoolean>(bsonBoolean0, bsonBooleanCodec0);
      // Undeclared exception!
      try { 
        AbstractAggregationOperation.getFromJson(bsonDocumentWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.bson.BsonDocumentWriter$Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.PROLEPTIC_MONTH;
      BsonBooleanCodec bsonBooleanCodec0 = new BsonBooleanCodec();
      CodecRegistry codecRegistry0 = mock(CodecRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(bsonBooleanCodec0).when(codecRegistry0).get(nullable(java.lang.Class.class));
      BsonDocument bsonDocument0 = BsonDocumentWrapper.asBsonDocument(chronoField0, codecRegistry0);
      // Undeclared exception!
      try { 
        AbstractAggregationOperation.getFromJson(bsonDocument0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.temporal.ChronoField cannot be cast to org.bson.BsonBoolean
         //
         verifyException("org.bson.codecs.BsonBooleanCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BsonArray bsonArray0 = new BsonArray();
      bsonArray0.add((BsonValue) null);
      // Undeclared exception!
      try { 
        AbstractAggregationOperation.checkAggregationVariables(bsonArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.handlers.aggregation.AbstractAggregationOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      BsonArray bsonArray0 = new BsonArray();
      AbstractAggregationOperation.checkAggregationVariables(bsonArray0);
      assertFalse(bsonArray0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BsonBoolean bsonBoolean0 = BsonBoolean.TRUE;
      AbstractAggregationOperation.checkAggregationVariables(bsonBoolean0);
      assertFalse(bsonBoolean0.isTimestamp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractAggregationOperation.checkAggregationVariables((BsonValue) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BsonDocument bsonDocument0 = new BsonDocument();
      AbstractAggregationOperation.checkAggregationVariables(bsonDocument0);
      assertFalse(bsonDocument0.isDateTime());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<AbstractAggregationOperation> list0 = AbstractAggregationOperation.getFromJson((BsonDocument) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BsonDocument bsonDocument0 = new BsonDocument();
      List<AbstractAggregationOperation> list0 = AbstractAggregationOperation.getFromJson(bsonDocument0);
      assertTrue(list0.isEmpty());
  }
}
