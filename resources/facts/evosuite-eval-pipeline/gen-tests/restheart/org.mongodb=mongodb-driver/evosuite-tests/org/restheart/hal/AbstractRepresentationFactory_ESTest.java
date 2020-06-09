/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 09:30:27 GMT 2019
 */

package org.restheart.hal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.ServerConnection;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
import org.bson.BsonDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.restheart.handlers.RequestContext;
import org.restheart.handlers.bulk.BulkResultRepresentationFactory;
import org.restheart.handlers.collection.CollectionRepresentationFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractRepresentationFactory_ESTest extends AbstractRepresentationFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollectionRepresentationFactory collectionRepresentationFactory0 = new CollectionRepresentationFactory();
      ArrayList<BsonDocument> arrayList0 = new ArrayList<BsonDocument>();
      HttpServerExchange httpServerExchange0 = new HttpServerExchange((ServerConnection) null);
      // Undeclared exception!
      try { 
        collectionRepresentationFactory0.getRepresentation(httpServerExchange0, (RequestContext) null, arrayList0, 1415L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.handlers.collection.CollectionRepresentationFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BulkResultRepresentationFactory bulkResultRepresentationFactory0 = new BulkResultRepresentationFactory();
      Vector<BsonDocument> vector0 = new Vector<BsonDocument>();
      // Undeclared exception!
      try { 
        bulkResultRepresentationFactory0.getRepresentation((HttpServerExchange) null, (RequestContext) null, vector0, 253402300799999L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported.
         //
         verifyException("org.restheart.handlers.bulk.BulkResultRepresentationFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionRepresentationFactory collectionRepresentationFactory0 = new CollectionRepresentationFactory();
      Stack<BsonDocument> stack0 = new Stack<BsonDocument>();
      // Undeclared exception!
      try { 
        collectionRepresentationFactory0.getRepresentation((HttpServerExchange) null, (RequestContext) null, stack0, (-150L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.hal.AbstractRepresentationFactory", e);
      }
  }
}
