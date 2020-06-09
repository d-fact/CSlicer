/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 11:23:53 GMT 2019
 */

package com.github.searls.jasmine.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.searls.jasmine.config.JasmineConfiguration;
import com.github.searls.jasmine.format.FormatsScriptTags;
import com.github.searls.jasmine.io.IoUtilities;
import com.github.searls.jasmine.io.RelativizesFilePaths;
import com.github.searls.jasmine.io.ScansDirectory;
import com.github.searls.jasmine.io.scripts.ConvertsFileToUriString;
import com.github.searls.jasmine.io.scripts.FindsScriptLocationsInDirectory;
import com.github.searls.jasmine.io.scripts.ResolvesLocationOfPreloadSources;
import com.github.searls.jasmine.runner.CreatesRunner;
import com.github.searls.jasmine.runner.DefaultSpecRunnerHtmlGenerator;
import com.github.searls.jasmine.runner.HtmlGeneratorConfigurationFactory;
import com.github.searls.jasmine.server.ResourceHandlerConfigurator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResourceHandlerConfigurator_ESTest extends ResourceHandlerConfigurator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RelativizesFilePaths relativizesFilePaths0 = new RelativizesFilePaths();
      FormatsScriptTags formatsScriptTags0 = new FormatsScriptTags();
      DefaultSpecRunnerHtmlGenerator defaultSpecRunnerHtmlGenerator0 = new DefaultSpecRunnerHtmlGenerator(formatsScriptTags0);
      IoUtilities ioUtilities0 = new IoUtilities();
      HtmlGeneratorConfigurationFactory htmlGeneratorConfigurationFactory0 = new HtmlGeneratorConfigurationFactory(ioUtilities0);
      ConvertsFileToUriString convertsFileToUriString0 = new ConvertsFileToUriString();
      FindsScriptLocationsInDirectory findsScriptLocationsInDirectory0 = new FindsScriptLocationsInDirectory((ScansDirectory) null, convertsFileToUriString0);
      ResolvesLocationOfPreloadSources resolvesLocationOfPreloadSources0 = new ResolvesLocationOfPreloadSources(convertsFileToUriString0);
      CreatesRunner createsRunner0 = new CreatesRunner(defaultSpecRunnerHtmlGenerator0, htmlGeneratorConfigurationFactory0, findsScriptLocationsInDirectory0, resolvesLocationOfPreloadSources0, ioUtilities0);
      ResourceHandlerConfigurator resourceHandlerConfigurator0 = new ResourceHandlerConfigurator(relativizesFilePaths0, createsRunner0);
      // Undeclared exception!
      try { 
        resourceHandlerConfigurator0.createHandler((JasmineConfiguration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.searls.jasmine.server.ResourceHandlerConfigurator", e);
      }
  }
}
