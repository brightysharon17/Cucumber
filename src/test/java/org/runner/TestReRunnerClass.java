package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.pojoClasses.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\loginfunction.feature",   glue = "org.step" , monochrome=true, snippets = SnippetType.CAMELCASE, dryRun = false,
plugin = {
		"html:target\\Reports",
		"junit:target\\Reports\\fb.xml",
		"json:target\\Reports\\face.json",
		"rerun:src\\test\\resources\\Rerun\\failed.txt"
})

public class TestReRunnerClass {
	
	@AfterClass
	public static void pullReport() {
		
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\face.json");

}

}
