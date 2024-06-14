package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json" }, features = {
				"E:\\Workspace\\GnaneshTraining\\SimpleCucumberSeleniumFirebaseFramework\\src\\test\\resources\\features\\firebase.feature" }, glue = "com.training.steps", dryRun = true)

public class RunnerFirebase {

}
