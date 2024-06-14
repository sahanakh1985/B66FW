package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = { "src/test/resources/feature/salesforce.feature" }, glue = {
		"com.cucumber.stepdefinition" }, plugin = { "pretty",
				"html:target/cucumber-reports/cucumber.html" }, monochrome = false, dryRun = false

)

public class RunnerSalesforce extends AbstractTestNGCucumberTests {

}
