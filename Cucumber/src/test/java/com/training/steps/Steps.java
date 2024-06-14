package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;

	@Given("User launch the Salesforce application")
	public void user_launch_the_salesforce_application() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
	}

	@When("User enter value into UN textbox")
	public void user_enter_value_into_un_textbox() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("sahana@tec.com");

	}

	@When("User enter value into PWD textbox")
	public void user_enter_value_into_pwd_textbox() {
		driver.findElement(By.id("password")).sendKeys("Siri@123");

	}

	@Then("user click on rememberme checkbox .")

	public void user_click_on_rememberme_checkbox() {
		driver.findElement(By.id("rememberUn")).click();

	}

	@Then("user click on login button.")
	public void user_click_on_login_button() {
		driver.findElement(By.id("Login")).click();
	}

}
