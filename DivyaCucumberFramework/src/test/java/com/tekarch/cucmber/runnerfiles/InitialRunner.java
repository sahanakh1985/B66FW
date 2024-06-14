package com.tekarch.cucmber.runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"E:\\Workspace\\GnaneshTraining\\DivyaCucumberFramework\\src\\test\\resources\\addtion.feature" }, glue = {
				"com.tekarch.cucumber.stepdefinition" }

)

public class InitialRunner extends AbstractTestNGCucumberTests {

}
