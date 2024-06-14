package com.tekarch.cucmber.runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/salesforce.feature" },

		glue = { "com.tekarch.cucumber.stepdefinition" }, dryRun = false, plugin = { "pretty",
				"html:target/cucumber-reports/cucumber.html" }, monochrome = false)

public class SalesforceRunner extends AbstractTestNGCucumberTests {

}
