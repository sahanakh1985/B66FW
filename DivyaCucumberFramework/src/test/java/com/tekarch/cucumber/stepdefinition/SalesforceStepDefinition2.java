package com.tekarch.cucumber.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tekarch.page.home.SalesforceHomePage;
import com.tekarch.page.login.SalesforceLoginPage;
import com.tekarch.utility.PropertiesUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceStepDefinition2 {
	WebDriver driver;

	SalesforceLoginPage login;
	SalesforceHomePage home;

	public void launchBrowser(String browserName) {
		switch (browserName) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		}
		System.out.println(browserName + "browser opened");

	}

	public void gotoUrl(String url) {
		driver.get(url);
		System.out.println(url + " is entered");
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("current browser closed");
	}

	@Before
	public void setUpEachScenario() {
		launchBrowser("chrome");

	}

	@After
	public void tearDownEachScenario() {
		closeBrowser();

	}

	@Given("user open Salesforce application")
	public void user_open_salesforce_application() throws IOException, InterruptedException {
		PropertiesUtility prop = new PropertiesUtility();
		String url = prop.getApplicationProperty("salesforceUrl");
		Thread.sleep(1000);
		gotoUrl(url);

	}

	@When("user enters the username in unTextBox as {string}")
	public void user_enters_the_username_in_un_text_box_as(String string) throws InterruptedException {
		login.setUn(string);
	}

	@When("user enters the password in pwdTextBox as {string}")
	public void user_enters_the_password_in_pwd_text_box_as(String string) throws InterruptedException {
		login.setPwd(string);
	}

	@When("click on login button")
	public void click_on_login_button() {
		login.clickLogin();
	}

	@Then("verify homepage with url as {string}")
	public void verify_homepage_with_url_as(String string) {
		home.verifyUrl();
	}

}
