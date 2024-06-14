package com.cucumber.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.home.HomePage;
import com.cucumber.login.LoginPage;
import com.cucumber.utility.CommonUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceStepDefinition {

	WebDriver driver;
	HomePage home = null;
	LoginPage login = null;

	public void launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		System.out.println(browser + " is opened");
	}

	@Before
	public void openBrowser() {
		launchBrowser("chrome");
	}

	public void closeBrowser() {
		driver.close();

	}

	@After
	public void tearDown() {
		closeBrowser();
	}

	@Given("user opens salesforce application")
	public void user_opens_salesforce_application() throws IOException {
//		CommonUtilities common = new CommonUtilities();
//
//		String url = common.getApplicatinProperty("url");

		driver.get("https://login.salesforce.com");

	}

	@When("user is on {string}")
	public void user_is_on(String page) throws InterruptedException {

		if (page.equalsIgnoreCase("loginPage")) {
			login = new LoginPage(driver);
		} else if (page.equalsIgnoreCase("homePage")) {
			home = new HomePage(driver);
		}
		Thread.sleep(5000);

	}

	@When("user enters the username in username textbox as {string}")
	public void user_enters_the_username_in_username_textbox_as(String string) {
		login.setUn(string);

	}

	@When("user enters the password in password textbox as {string}")
	public void user_enters_the_password_in_password_textbox_as(String string) {
		login.setpw(string);
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver = login.clickLogin();
		Thread.sleep(3000);
	}

	@Then("user validates the homepage")
	public void user_validates_the_homepage() throws InterruptedException {
		home.verifyUserMenu();

	}

}
