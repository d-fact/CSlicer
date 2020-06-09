/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 10:08:11 GMT 2019
 */

package org.restheart.metadata.transformers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.undertow.server.HttpServerExchange;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.BsonTimestamp;
import org.bson.BsonValue;
import org.bson.codecs.StringCodec;
import org.bson.codecs.configuration.CodecRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.restheart.handlers.RequestContext;
import org.restheart.metadata.transformers.FilterTransformer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilterTransformer_ESTest extends FilterTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilterTransformer filterTransformer0 = new FilterTransformer();
      StringCodec stringCodec0 = new StringCodec();
      CodecRegistry codecRegistry0 = mock(CodecRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(stringCodec0).when(codecRegistry0).get(nullable(java.lang.Class.class));
      BsonDocument bsonDocument0 = BsonDocumentWrapper.asBsonDocument("org.xnio.DelegatingChnnelListener", codecRegistry0);
      BsonTimestamp bsonTimestamp0 = new BsonTimestamp(0, 0);
      // Undeclared exception!
      try { 
        filterTransformer0.transform((HttpServerExchange) null, (RequestContext) null, (BsonValue) bsonDocument0, (BsonValue) bsonTimestamp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.metadata.transformers.FilterTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilterTransformer filterTransformer0 = new FilterTransformer();
      BsonTimestamp bsonTimestamp0 = new BsonTimestamp();
      // Undeclared exception!
      try { 
        filterTransformer0.transform((HttpServerExchange) null, (RequestContext) null, (BsonValue) bsonTimestamp0, (BsonValue) bsonTimestamp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // content to transform is not a document
         //
         verifyException("org.restheart.metadata.transformers.FilterTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilterTransformer filterTransformer0 = new FilterTransformer();
      filterTransformer0.transform((HttpServerExchange) null, (RequestContext) null, (BsonValue) null, (BsonValue) null);
  }
}
