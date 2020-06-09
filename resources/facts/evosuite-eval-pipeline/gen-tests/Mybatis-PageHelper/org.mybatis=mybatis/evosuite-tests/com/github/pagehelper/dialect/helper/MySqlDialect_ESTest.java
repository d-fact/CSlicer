/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 09:41:07 GMT 2019
 */

package com.github.pagehelper.dialect.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.dialect.helper.MySqlDialect;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.cache.NullCacheKey;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MySqlDialect_ESTest extends MySqlDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      CacheKey cacheKey0 = new CacheKey();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      Page<Object> page0 = new Page<Object>(intArray0, false);
      String string0 = mySqlDialect0.getPageSql("dataFileCache commit end LIMIT ? ", page0, cacheKey0);
      assertEquals("dataFileCache commit end LIMIT ?  LIMIT ?, ? ", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      CacheKey cacheKey0 = new CacheKey();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      Page<Object> page0 = new Page<Object>(intArray0, false);
      HashMap<String, MockFileInputStream> hashMap0 = new HashMap<String, MockFileInputStream>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>(hashMap0);
      Configuration configuration0 = new Configuration();
      Page<ParameterMapping> page1 = new Page<ParameterMapping>();
      RowBounds rowBounds0 = RowBounds.DEFAULT;
      Object object0 = mySqlDialect0.afterPage(page1, configuration0, rowBounds0);
      BoundSql boundSql0 = new BoundSql(configuration0, (String) null, page1, object0);
      // Undeclared exception!
      try { 
        mySqlDialect0.processPageParameter((MappedStatement) null, hashMap1, page0, boundSql0, cacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.helper.MySqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      int[] intArray0 = new int[5];
      Page<Object> page0 = new Page<Object>(intArray0, false);
      NullCacheKey nullCacheKey0 = (NullCacheKey)CacheKey.NULL_CACHE_KEY;
      // Undeclared exception!
      try { 
        mySqlDialect0.processPageParameter((MappedStatement) null, hashMap0, page0, (BoundSql) null, nullCacheKey0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not allowed to update a NullCacheKey instance.
         //
         verifyException("org.apache.ibatis.cache.NullCacheKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      NullCacheKey nullCacheKey0 = (NullCacheKey)CacheKey.NULL_CACHE_KEY;
      // Undeclared exception!
      try { 
        mySqlDialect0.getPageSql("", (Page) null, (CacheKey) nullCacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.helper.MySqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      Page<VFS> page0 = new Page<VFS>((-8), (-8));
      CacheKey cacheKey0 = new CacheKey();
      String string0 = mySqlDialect0.getPageSql("dataFileCache commit end", page0, cacheKey0);
      assertEquals("dataFileCache commit end LIMIT ? ", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      CacheKey cacheKey0 = new CacheKey();
      int[] intArray0 = new int[6];
      intArray0[0] = 26;
      Page<Object> page0 = new Page<Object>(intArray0, false);
      String string0 = mySqlDialect0.getPageSql("dataFileCache commit end LIMIT ? ", page0, cacheKey0);
      assertEquals("dataFileCache commit end LIMIT ?  LIMIT ?, ? ", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      CacheKey cacheKey0 = new CacheKey();
      int[] intArray0 = new int[6];
      intArray0[0] = 26;
      Page<Object> page0 = new Page<Object>(intArray0, false);
      Configuration configuration0 = new Configuration();
      Page<ParameterMapping> page1 = new Page<ParameterMapping>();
      RowBounds rowBounds0 = RowBounds.DEFAULT;
      Object object0 = mySqlDialect0.afterPage(page1, configuration0, rowBounds0);
      BoundSql boundSql0 = new BoundSql(configuration0, "dataFileCache commit end LIMIT ? ", page1, object0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        mySqlDialect0.processPageParameter((MappedStatement) null, hashMap0, page0, boundSql0, cacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.helper.MySqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      CacheKey cacheKey0 = new CacheKey();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Configuration configuration0 = new Configuration();
      Page<ParameterMapping> page0 = new Page<ParameterMapping>();
      BoundSql boundSql0 = new BoundSql(configuration0, "yc0NF6p9wCJ)", page0, cacheKey0);
      // Undeclared exception!
      try { 
        mySqlDialect0.processPageParameter((MappedStatement) null, hashMap0, page0, boundSql0, cacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.helper.MySqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MySqlDialect mySqlDialect0 = new MySqlDialect();
      CacheKey cacheKey0 = new CacheKey();
      int[] intArray0 = new int[6];
      Page<Object> page0 = new Page<Object>(intArray0, true);
      HashMap<String, MockFileInputStream> hashMap0 = new HashMap<String, MockFileInputStream>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>(hashMap0);
      Configuration configuration0 = new Configuration();
      Page<ParameterMapping> page1 = new Page<ParameterMapping>();
      RowBounds rowBounds0 = RowBounds.DEFAULT;
      Object object0 = mySqlDialect0.afterPage(page1, configuration0, rowBounds0);
      BoundSql boundSql0 = new BoundSql(configuration0, "H| LIMIT ? ", (List<ParameterMapping>) null, object0);
      HashMap hashMap2 = (HashMap)mySqlDialect0.processPageParameter((MappedStatement) null, hashMap1, page0, boundSql0, cacheKey0);
      assertFalse(hashMap2.isEmpty());
  }
}
