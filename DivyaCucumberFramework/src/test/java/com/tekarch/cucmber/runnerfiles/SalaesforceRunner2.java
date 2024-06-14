package com.tekarch.cucmber.runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class SalaesforceRunner2 {

	@CucumberOptions(features = {
			"E:\\Workspace\\GnaneshTraining\\DivyaCucumberFramework\\src\\test\\resources\\feature\\salesforce.feature" }, glue = {
					"com.tekarch.cucumber.stepdefinition" }, dryRun = false

	)

	public class RunnerFairbase extends AbstractTestNGCucumberTests {

	}
}
