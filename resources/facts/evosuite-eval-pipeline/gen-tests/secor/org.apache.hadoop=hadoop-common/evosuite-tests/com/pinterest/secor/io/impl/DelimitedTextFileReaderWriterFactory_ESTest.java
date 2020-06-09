/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 07:15:00 GMT 2019
 */

package com.pinterest.secor.io.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pinterest.secor.common.LogFilePath;
import com.pinterest.secor.io.impl.DelimitedTextFileReaderWriterFactory;
import com.pinterest.secor.message.ParsedMessage;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.parquet.hadoop.codec.SnappyCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DelimitedTextFileReaderWriterFactory_ESTest extends DelimitedTextFileReaderWriterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      DelimitedTextFileReaderWriterFactory.DelimitedTextFileWriter delimitedTextFileReaderWriterFactory_DelimitedTextFileWriter0 = null;
      try {
        delimitedTextFileReaderWriterFactory_DelimitedTextFileWriter0 = delimitedTextFileReaderWriterFactory0.new DelimitedTextFileWriter((LogFilePath) null, (CompressionCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pinterest.secor.io.impl.DelimitedTextFileReaderWriterFactory$DelimitedTextFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      String[] stringArray0 = new String[0];
      ParsedMessage parsedMessage0 = new ParsedMessage("Non-empty message without delimiter", 135, 135, (byte[]) null, (byte[]) null, stringArray0, 135);
      LogFilePath logFilePath0 = new LogFilePath("Non-empty message without delimiter", 135, 33554432L, parsedMessage0, "Non-empty message without delimiter");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      DelimitedTextFileReaderWriterFactory.DelimitedTextFileReader delimitedTextFileReaderWriterFactory_DelimitedTextFileReader0 = null;
      try {
        delimitedTextFileReaderWriterFactory_DelimitedTextFileReader0 = delimitedTextFileReaderWriterFactory0.new DelimitedTextFileReader(logFilePath0, snappyCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 64: java.lang.String@0000000024/java.lang.String@0000000025Non-empty message without delimiter
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      String[] stringArray0 = new String[7];
      byte[] byteArray0 = new byte[8];
      ParsedMessage parsedMessage0 = new ParsedMessage("YPP", 0, 0L, byteArray0, byteArray0, stringArray0, (byte) (-119));
      LogFilePath logFilePath0 = new LogFilePath(stringArray0[4], 0, 0, parsedMessage0, "+m?U(");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileWriter(logFilePath0, snappyCodec0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.hadoop.util.StringUtils
         //
         verifyException("org.apache.hadoop.fs.FileSystem$Cache$Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      String[] stringArray0 = new String[4];
      LogFilePath logFilePath0 = new LogFilePath((String) null, (String) null, stringArray0, 0, 0, 0, "QT~v)$*[p#p@$");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileWriter(logFilePath0, snappyCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 62: java.lang.String@0000000020/java.lang.String@0000000021QT~v)$*[p#p@$
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      String[] stringArray0 = new String[7];
      int[] intArray0 = new int[0];
      long[] longArray0 = new long[3];
      LogFilePath logFilePath0 = new LogFilePath((String) null, (String) null, stringArray0, 1887, intArray0, longArray0, "com.pinterest.secor.io.impl.DelimitedTextFileReaderWriterFactory");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileWriter(logFilePath0, snappyCodec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pinterest.secor.common.LogFilePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      String[] stringArray0 = new String[9];
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[4];
      LogFilePath logFilePath0 = new LogFilePath("I_ZgqunO", "", stringArray0, 2334, intArray0, longArray0, "");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileReader(logFilePath0, snappyCodec0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.hadoop.util.StringUtils
         //
         verifyException("org.apache.hadoop.fs.FileSystem$Cache$Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      byte[] byteArray0 = new byte[1];
      String[] stringArray0 = new String[9];
      ParsedMessage parsedMessage0 = new ParsedMessage((String) null, 45, 0, (byte[]) null, byteArray0, stringArray0, 45);
      LogFilePath logFilePath0 = new LogFilePath((String) null, 0, 0, parsedMessage0, "ePrj9SK,xHy}X@#nyU'");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileReader(logFilePath0, snappyCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 66: java.lang.String@0000000021/java.lang.String@0000000022ePrj9SK,xHy}X@#nyU'
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      String[] stringArray0 = new String[0];
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[0];
      LogFilePath logFilePath0 = new LogFilePath("a!6*35ilsf[)#/", "X8AR:ed!!pa", stringArray0, 4485, intArray0, longArray0, "X8AR:ed!!pa");
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileReader(logFilePath0, snappyCodec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pinterest.secor.common.LogFilePath", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileWriter((LogFilePath) null, snappyCodec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pinterest.secor.io.impl.DelimitedTextFileReaderWriterFactory$DelimitedTextFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DelimitedTextFileReaderWriterFactory delimitedTextFileReaderWriterFactory0 = new DelimitedTextFileReaderWriterFactory();
      SnappyCodec snappyCodec0 = new SnappyCodec();
      // Undeclared exception!
      try { 
        delimitedTextFileReaderWriterFactory0.BuildFileReader((LogFilePath) null, snappyCodec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pinterest.secor.io.impl.DelimitedTextFileReaderWriterFactory$DelimitedTextFileReader", e);
      }
  }
}
