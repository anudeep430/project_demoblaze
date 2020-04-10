package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", plugin = { "pretty", "html:reports/cucumber-html-report",
		"json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" }, glue = {
				"com.stepdefinition.login", "com.stepdefinition.phone", "com.stepdefinition.laptop",
				"com.stepdefinition.monitor", "com.stepdefinition.purchase", "com.stepdefinition.signup",
				"com.stepdefinition.count" },

		monochrome = true

)
public class Test_Runner {
	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
