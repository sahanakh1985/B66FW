package com.tekarch.cucmber.runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"E:\\Workspace\\GnaneshTraining\\DivyaCucumberFramework\\src\\test\\resources\\firebase2.feature" }, glue = {
				"com.tekarch.cucumber.stepdefinition" }, dryRun = false, monochrome = false, plugin = { "pretty",
						"html:target/cucumber-reports/cucumber.html" }

)

public class RunnerFirebase2 extends AbstractTestNGCucumberTests {

}
