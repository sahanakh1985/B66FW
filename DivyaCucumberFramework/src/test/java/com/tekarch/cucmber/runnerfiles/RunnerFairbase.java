package com.tekarch.cucmber.runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"E:\\Workspace\\GnaneshTraining\\DivyaCucumberFramework\\src\\test\\resources\\fairbase.feature" }, glue = {
				"com.tekarch.cucumber.stepdefinition" }, dryRun = false

)

public class RunnerFairbase extends AbstractTestNGCucumberTests {

}
