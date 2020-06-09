/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 08:41:29 GMT 2019
 */

package org.restheart.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mongodb.util.JSONParseException;
import io.undertow.connector.ByteBufferPool;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.JvmRouteHandler;
import io.undertow.server.RoutingHandler;
import io.undertow.server.ServerConnection;
import io.undertow.server.protocol.ajp.AjpServerConnection;
import io.undertow.util.HeaderMap;
import java.sql.BatchUpdateException;
import java.sql.DataTruncation;
import java.sql.SQLDataException;
import java.sql.SQLNonTransientException;
import org.bson.BsonBoolean;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.BsonTimestamp;
import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import org.restheart.hal.Representation;
import org.restheart.handlers.RequestContext;
import org.restheart.utils.ResponseHelper;
import org.xnio.OptionMap;
import org.xnio.StreamConnection;
import org.xnio.conduits.ConduitStreamSinkChannel;
import org.xnio.conduits.ConduitStreamSourceChannel;
import org.xnio.conduits.StreamSinkConduit;
import org.xnio.conduits.StreamSourceConduit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResponseHelper_ESTest extends ResponseHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HeaderMap headerMap0 = new HeaderMap();
      HttpServerExchange httpServerExchange0 = new HttpServerExchange((ServerConnection) null, headerMap0, headerMap0, (-1227L));
      ResponseHelper.setETagHeader(httpServerExchange0, "i}oMu/");
      assertEquals("", httpServerExchange0.getQueryString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResponseHelper.setETagHeader((HttpServerExchange) null, "VOnA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.utils.ResponseHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BsonTimestamp bsonTimestamp0 = new BsonTimestamp((-1164));
      CodecRegistry codecRegistry0 = mock(CodecRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((Codec) null).when(codecRegistry0).get(nullable(java.lang.Class.class));
      BsonDocument bsonDocument0 = BsonDocumentWrapper.asBsonDocument(bsonTimestamp0, codecRegistry0);
      // Undeclared exception!
      try { 
        ResponseHelper.injectEtagHeader((HttpServerExchange) null, bsonDocument0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not unwrap a BsonDocumentWrapper with no Encoder
         //
         verifyException("org.bson.BsonDocumentWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResponseHelper.injectEtagHeader((HttpServerExchange) null, (Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.utils.ResponseHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLDataException sQLDataException0 = new SQLDataException();
      // Undeclared exception!
      try { 
        ResponseHelper.getErrorJsonDocument((String) null, (-1950), (RequestContext) null, (String) null, "Rh*@[?+401d0hVPh", sQLDataException0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value can not be null
         //
         verifyException("org.bson.BsonString", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ResponseHelper.getMessageFromErrorCode((-1164));
      assertEquals("Error handling the request, see log for more information", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ResponseHelper.getMessageFromErrorCode(121);
      assertEquals("Document failed collection validation.", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ResponseHelper.getMessageFromErrorCode(66);
      assertEquals("Update tried to change the immutable shardkey.", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ResponseHelper.getMessageFromErrorCode(18);
      assertEquals("Wrong MongoDB user credentials (wrong password or need to specify the authentication dababase with 'authSource=<db>' option in mongo-uri).", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ResponseHelper.getMessageFromErrorCode(61);
      assertEquals("Write request for sharded collection must specify the shardkey. Use the 'shardkey' query parameter.", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ResponseHelper.getMessageFromErrorCode(13);
      assertEquals("The MongoDB user does not have enough permissions to execute this operation.", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = ResponseHelper.getHttpStatusFromErrorCode(121);
      assertEquals(400, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = ResponseHelper.getHttpStatusFromErrorCode(66);
      assertEquals(403, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = ResponseHelper.getHttpStatusFromErrorCode(61);
      assertEquals(400, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = ResponseHelper.getHttpStatusFromErrorCode(18);
      assertEquals(403, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = ResponseHelper.getHttpStatusFromErrorCode((-120));
      assertEquals(500, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = ResponseHelper.getHttpStatusFromErrorCode(13);
      assertEquals(403, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[9];
      DataTruncation dataTruncation0 = new DataTruncation(1, false, false, 500, 500);
      BatchUpdateException batchUpdateException0 = new BatchUpdateException("", (String) null, intArray0, dataTruncation0);
      ResponseHelper.injectEtagHeader((HttpServerExchange) null, (Object) batchUpdateException0);
      assertNull(batchUpdateException0.getSQLState());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConduitStreamSinkChannel conduitStreamSinkChannel0 = mock(ConduitStreamSinkChannel.class, new ViolatedAssumptionAnswer());
      doReturn((StreamSinkConduit) null).when(conduitStreamSinkChannel0).getConduit();
      ConduitStreamSourceChannel conduitStreamSourceChannel0 = mock(ConduitStreamSourceChannel.class, new ViolatedAssumptionAnswer());
      doReturn((StreamSourceConduit) null).when(conduitStreamSourceChannel0).getConduit();
      ConduitStreamSinkChannel conduitStreamSinkChannel1 = mock(ConduitStreamSinkChannel.class, new ViolatedAssumptionAnswer());
      StreamConnection streamConnection0 = mock(StreamConnection.class, new ViolatedAssumptionAnswer());
      doReturn(conduitStreamSinkChannel0, conduitStreamSinkChannel1).when(streamConnection0).getSinkChannel();
      doReturn(conduitStreamSourceChannel0).when(streamConnection0).getSourceChannel();
      RoutingHandler routingHandler0 = new RoutingHandler(false);
      JvmRouteHandler jvmRouteHandler0 = new JvmRouteHandler(routingHandler0, "Error handling the request, see log for more information", "<5!");
      OptionMap optionMap0 = OptionMap.EMPTY;
      AjpServerConnection ajpServerConnection0 = new AjpServerConnection(streamConnection0, (ByteBufferPool) null, jvmRouteHandler0, optionMap0, (-262145));
      HttpServerExchange httpServerExchange0 = new HttpServerExchange(ajpServerConnection0, (-262145));
      BsonBoolean bsonBoolean0 = BsonBoolean.TRUE;
      ResponseHelper.injectEtagHeader(httpServerExchange0, (Object) bsonBoolean0);
      assertFalse(bsonBoolean0.isDouble());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResponseHelper.injectEtagHeader((HttpServerExchange) null, (Object) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResponseHelper.injectEtagHeader((HttpServerExchange) null, (Document) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ConduitStreamSinkChannel conduitStreamSinkChannel0 = mock(ConduitStreamSinkChannel.class, new ViolatedAssumptionAnswer());
      doReturn((StreamSinkConduit) null).when(conduitStreamSinkChannel0).getConduit();
      ConduitStreamSourceChannel conduitStreamSourceChannel0 = mock(ConduitStreamSourceChannel.class, new ViolatedAssumptionAnswer());
      doReturn((StreamSourceConduit) null).when(conduitStreamSourceChannel0).getConduit();
      ConduitStreamSinkChannel conduitStreamSinkChannel1 = mock(ConduitStreamSinkChannel.class, new ViolatedAssumptionAnswer());
      StreamConnection streamConnection0 = mock(StreamConnection.class, new ViolatedAssumptionAnswer());
      doReturn(conduitStreamSinkChannel0, conduitStreamSinkChannel1).when(streamConnection0).getSinkChannel();
      doReturn(conduitStreamSourceChannel0).when(streamConnection0).getSourceChannel();
      RoutingHandler routingHandler0 = new RoutingHandler(false);
      JvmRouteHandler jvmRouteHandler0 = new JvmRouteHandler(routingHandler0, "Error handling the request, see log for more information", "<5!");
      OptionMap optionMap0 = OptionMap.EMPTY;
      AjpServerConnection ajpServerConnection0 = new AjpServerConnection(streamConnection0, (ByteBufferPool) null, jvmRouteHandler0, optionMap0, (-262145));
      HttpServerExchange httpServerExchange0 = new HttpServerExchange(ajpServerConnection0, (-262145));
      Document document0 = new Document("Error handling the request, see log for more information", (Object) null);
      ResponseHelper.injectEtagHeader(httpServerExchange0, document0);
      assertNull(httpServerExchange0.getRequestURI());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResponseHelper.injectEtagHeader((HttpServerExchange) null, (BsonDocument) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SQLDataException sQLDataException0 = new SQLDataException();
      Representation representation0 = ResponseHelper.getErrorJsonDocument("qD9]/17>&Bf``/", 403, (RequestContext) null, "qD9]/17>&Bf``/", "", sQLDataException0, false);
      HeaderMap headerMap0 = new HeaderMap();
      HttpServerExchange httpServerExchange0 = new HttpServerExchange((ServerConnection) null, headerMap0, headerMap0, 500);
      BsonDocument bsonDocument0 = representation0.asBsonDocument();
      ResponseHelper.injectEtagHeader(httpServerExchange0, bsonDocument0);
      assertFalse(bsonDocument0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONParseException jSONParseException0 = new JSONParseException("w*J+\"ao1 [", 407);
      Representation representation0 = ResponseHelper.getErrorJsonDocument("", 407, (RequestContext) null, "l", (String) null, jSONParseException0, true);
      assertNotNull(representation0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SQLDataException sQLDataException0 = new SQLDataException();
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException("^rPcrEs.'Y(W.`2_D[", (String) null, sQLDataException0);
      Representation representation0 = ResponseHelper.getErrorJsonDocument("qD9]/17>&Bf``/", 403, (RequestContext) null, "qD9]/17>&Bf``/", "", sQLNonTransientException0, false);
      assertNotNull(representation0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Representation representation0 = ResponseHelper.getErrorJsonDocument("", 1, (RequestContext) null, "", "", (Throwable) null, true);
      assertNotNull(representation0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SQLDataException sQLDataException0 = new SQLDataException();
      Representation representation0 = ResponseHelper.getErrorJsonDocument("qD9]/17>&Bf``/", 403, (RequestContext) null, "qD9]/17>&Bf``/", "", sQLDataException0, false);
      HeaderMap headerMap0 = new HeaderMap();
      HttpServerExchange httpServerExchange0 = new HttpServerExchange((ServerConnection) null, headerMap0, headerMap0, 500);
      // Undeclared exception!
      try { 
        ResponseHelper.endExchangeWithRepresentation(httpServerExchange0, (RequestContext) null, 370, representation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.utils.ResponseHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResponseHelper.endExchangeWithMessage((HttpServerExchange) null, (RequestContext) null, 403, "+ba");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.utils.ResponseHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONParseException jSONParseException0 = new JSONParseException("w*J+\"ao1 [", 407);
      // Undeclared exception!
      try { 
        ResponseHelper.endExchangeWithMessage((HttpServerExchange) null, (RequestContext) null, 407, "l", (Throwable) jSONParseException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.restheart.utils.ResponseHelper", e);
      }
  }
}
