/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 18:52:25 GMT 2019
 */

package com.aventstack.extentreports.reporter.converters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aventstack.extentreports.reporter.converters.ExtentHtmlBddNodesConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtentHtmlBddNodesConverter_ESTest extends ExtentHtmlBddNodesConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      com.aventstack.extentreports.model.Test test0 = new com.aventstack.extentreports.model.Test();
      Tag tag0 = Tag.valueOf("*rI");
      Element element0 = new Element(tag0, "6");
      element0.appendChild(element0);
      ExtentHtmlBddNodesConverter extentHtmlBddNodesConverter0 = new ExtentHtmlBddNodesConverter(test0, element0);
      // Undeclared exception!
      extentHtmlBddNodesConverter0.parseAndAddNodes();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtentHtmlBddNodesConverter extentHtmlBddNodesConverter0 = new ExtentHtmlBddNodesConverter((com.aventstack.extentreports.model.Test) null, (Element) null);
      // Undeclared exception!
      try { 
        extentHtmlBddNodesConverter0.parseAndAddNodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aventstack.extentreports.reporter.converters.ExtentHtmlBddNodesConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      com.aventstack.extentreports.model.Test test0 = new com.aventstack.extentreports.model.Test();
      Tag tag0 = Tag.valueOf("com.aventstack.extentreports.gherkin.model.Scenario");
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "com.aventstack.extentreports.gherkin.model.Scenario", attributes0);
      element0.prependChild(element0);
      ExtentHtmlBddNodesConverter extentHtmlBddNodesConverter0 = new ExtentHtmlBddNodesConverter(test0, element0);
      // Undeclared exception!
      extentHtmlBddNodesConverter0.parseAndAddNode(element0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      com.aventstack.extentreports.model.Test test0 = new com.aventstack.extentreports.model.Test();
      ExtentHtmlBddNodesConverter extentHtmlBddNodesConverter0 = new ExtentHtmlBddNodesConverter(test0, (Element) null);
      // Undeclared exception!
      try { 
        extentHtmlBddNodesConverter0.parseAndAddNode((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aventstack.extentreports.reporter.converters.ExtentHtmlBddNodesConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      com.aventstack.extentreports.model.Test test0 = new com.aventstack.extentreports.model.Test();
      Tag tag0 = Tag.valueOf("w[ES");
      Element element0 = new Element(tag0, "w[ES");
      ExtentHtmlBddNodesConverter extentHtmlBddNodesConverter0 = new ExtentHtmlBddNodesConverter(test0, element0);
      extentHtmlBddNodesConverter0.parseAndAddNodes();
      //  // Unstable assertion: assertEquals(41, test0.getID());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      com.aventstack.extentreports.model.Test test0 = new com.aventstack.extentreports.model.Test();
      Tag tag0 = Tag.valueOf("W8R");
      Element element0 = new Element(tag0, "W8R");
      ExtentHtmlBddNodesConverter extentHtmlBddNodesConverter0 = new ExtentHtmlBddNodesConverter(test0, element0);
      // Undeclared exception!
      try { 
        extentHtmlBddNodesConverter0.parseAndAddNode(element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.aventstack.extentreports.Status.
         //
         verifyException("java.lang.Enum", e);
      }
  }
}
