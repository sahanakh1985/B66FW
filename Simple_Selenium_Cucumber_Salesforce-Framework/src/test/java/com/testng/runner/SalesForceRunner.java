package com.testng.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json" }, features = "E:\\Workspace\\GnaneshTraining\\Simple_Selenium_Cucumber_Salesforce-Framework\\src\\main\\resources\\resources\\Salesforce.feature", glue = "com.testng.steps")

public class SalesForceRunner {

}
