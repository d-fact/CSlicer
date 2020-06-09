/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:52:46 GMT 2019
 */

package com.github.pagehelper.dialect.rowbounds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.dialect.rowbounds.OracleRowBoundsDialect;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.cache.NullCacheKey;
import org.apache.ibatis.session.RowBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OracleRowBoundsDialect_ESTest extends OracleRowBoundsDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OracleRowBoundsDialect oracleRowBoundsDialect0 = new OracleRowBoundsDialect();
      RowBounds rowBounds0 = new RowBounds(0, 0);
      CacheKey cacheKey0 = new CacheKey();
      String string0 = oracleRowBoundsDialect0.getPageSql("", rowBounds0, cacheKey0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OracleRowBoundsDialect oracleRowBoundsDialect0 = new OracleRowBoundsDialect();
      RowBounds rowBounds0 = new RowBounds();
      NullCacheKey nullCacheKey0 = (NullCacheKey)CacheKey.NULL_CACHE_KEY;
      // Undeclared exception!
      try { 
        oracleRowBoundsDialect0.getPageSql("com.github.pagehelper.dialect.rowbounds.OracleRowBoundsDialect", rowBounds0, (CacheKey) nullCacheKey0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not allowed to update a NullCacheKey instance.
         //
         verifyException("org.apache.ibatis.cache.NullCacheKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OracleRowBoundsDialect oracleRowBoundsDialect0 = new OracleRowBoundsDialect();
      CacheKey cacheKey0 = new CacheKey();
      // Undeclared exception!
      try { 
        oracleRowBoundsDialect0.getPageSql("SELECT * FROM ( ", (RowBounds) null, cacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.rowbounds.OracleRowBoundsDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OracleRowBoundsDialect oracleRowBoundsDialect0 = new OracleRowBoundsDialect();
      RowBounds rowBounds0 = new RowBounds(120, 120);
      CacheKey cacheKey0 = new CacheKey();
      String string0 = oracleRowBoundsDialect0.getPageSql("bn_&vv0ULF{", rowBounds0, cacheKey0);
      assertEquals(2, cacheKey0.getUpdateCount());
      assertEquals("SELECT * FROM (  SELECT TMP_PAGE.*, ROWNUM ROW_ID FROM ( bn_&vv0ULF{ ) TMP_PAGE WHERE ROWNUM <= 240 ) WHERE ROW_ID > 120", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OracleRowBoundsDialect oracleRowBoundsDialect0 = new OracleRowBoundsDialect();
      RowBounds rowBounds0 = new RowBounds((-275), (-275));
      NullCacheKey nullCacheKey0 = (NullCacheKey)CacheKey.NULL_CACHE_KEY;
      String string0 = oracleRowBoundsDialect0.getPageSql("", rowBounds0, (CacheKey) nullCacheKey0);
      assertEquals("", string0);
  }
}
