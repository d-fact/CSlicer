/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:14:04 GMT 2019
 */

package org.vafer.jdeb.signing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;
import org.vafer.jdeb.signing.PGPSigner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PGPSigner_ESTest extends PGPSigner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PGPSigner pGPSigner0 = null;
      try {
        pGPSigner0 = new PGPSigner(byteArrayInputStream0, "'D=VO8i<E1`v4^", "", (byte)0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Specified key 'D=VO8i<E1`v4^ does not exist in key ring java.io.ByteArrayInputStream@24da44b5
         //
         verifyException("org.vafer.jdeb.signing.PGPSigner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PGPSigner pGPSigner0 = null;
      try {
        pGPSigner0 = new PGPSigner((InputStream) null, "MD5", "MD5", 890);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.bouncycastle.openpgp.PGPUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-49), 1330);
      PGPSigner pGPSigner0 = null;
      try {
        pGPSigner0 = new PGPSigner(byteArrayInputStream0, "M\"nZSQrOl", "M\"nZSQrOl", (byte) (-49));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -49
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      PGPSigner pGPSigner0 = null;
      try {
        pGPSigner0 = new PGPSigner(bufferedInputStream0, "", "", 68);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-95);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      PGPSigner pGPSigner0 = null;
      try {
        pGPSigner0 = new PGPSigner(bufferedInputStream0, "Specified key %s does not exist in key ring %s", (String) null, (byte) (-95));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // premature end of stream in PartialInputStream
         //
         verifyException("org.bouncycastle.bcpg.BCPGInputStream$PartialInputStream", e);
      }
  }
}
