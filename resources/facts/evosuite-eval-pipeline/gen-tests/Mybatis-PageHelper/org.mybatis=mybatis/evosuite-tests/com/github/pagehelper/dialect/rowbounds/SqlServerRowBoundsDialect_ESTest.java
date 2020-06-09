/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 10:06:08 GMT 2019
 */

package com.github.pagehelper.dialect.rowbounds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.pagehelper.dialect.ReplaceSql;
import com.github.pagehelper.dialect.replace.SimpleWithNolockReplaceSql;
import com.github.pagehelper.dialect.rowbounds.SqlServerRowBoundsDialect;
import java.util.Properties;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.cache.NullCacheKey;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.RowBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SqlServerRowBoundsDialect_ESTest extends SqlServerRowBoundsDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlServerRowBoundsDialect sqlServerRowBoundsDialect0 = new SqlServerRowBoundsDialect();
      // Undeclared exception!
      try { 
        sqlServerRowBoundsDialect0.setProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.rowbounds.SqlServerRowBoundsDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlServerRowBoundsDialect sqlServerRowBoundsDialect0 = new SqlServerRowBoundsDialect();
      SimpleWithNolockReplaceSql simpleWithNolockReplaceSql0 = new SimpleWithNolockReplaceSql();
      sqlServerRowBoundsDialect0.replaceSql = (ReplaceSql) simpleWithNolockReplaceSql0;
      RowBounds rowBounds0 = new RowBounds();
      CacheKey cacheKey0 = new CacheKey();
      // Undeclared exception!
      try { 
        sqlServerRowBoundsDialect0.getPageSql("mp$OX", rowBounds0, cacheKey0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // \u4E0D\u652F\u6301\u8BE5SQL\u8F6C\u6362\u4E3A\u5206\u9875\u67E5\u8BE2!
         //
         verifyException("com.github.pagehelper.parser.SqlServerParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlServerRowBoundsDialect sqlServerRowBoundsDialect0 = new SqlServerRowBoundsDialect();
      RowBounds rowBounds0 = new RowBounds();
      NullCacheKey nullCacheKey0 = (NullCacheKey)CacheKey.NULL_CACHE_KEY;
      // Undeclared exception!
      try { 
        sqlServerRowBoundsDialect0.getPageSql("JdJ<}RU-nND5LGc", rowBounds0, (CacheKey) nullCacheKey0);
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
      SqlServerRowBoundsDialect sqlServerRowBoundsDialect0 = new SqlServerRowBoundsDialect();
      Properties properties0 = new Properties();
      sqlServerRowBoundsDialect0.setProperties(properties0);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SqlServerRowBoundsDialect sqlServerRowBoundsDialect0 = new SqlServerRowBoundsDialect();
      RowBounds rowBounds0 = RowBounds.DEFAULT;
      Object[] objectArray0 = new Object[3];
      CacheKey cacheKey0 = new CacheKey(objectArray0);
      // Undeclared exception!
      try { 
        sqlServerRowBoundsDialect0.getCountSql((MappedStatement) null, (BoundSql) null, (Object) null, rowBounds0, cacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.rowbounds.SqlServerRowBoundsDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SqlServerRowBoundsDialect sqlServerRowBoundsDialect0 = new SqlServerRowBoundsDialect();
      NullCacheKey nullCacheKey0 = (NullCacheKey)CacheKey.NULL_CACHE_KEY;
      // Undeclared exception!
      try { 
        sqlServerRowBoundsDialect0.getPageSql("", (RowBounds) null, (CacheKey) nullCacheKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.pagehelper.dialect.rowbounds.SqlServerRowBoundsDialect", e);
      }
  }
}
