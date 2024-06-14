package com.tekarch.cucumber.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.tekarch.page.home.HomePage;
import com.tekarch.page.login.LoginPage;
import com.tekarch.utility.PropertiesUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirebaseStepDefinition2 {
	public WebDriver driver;
	LoginPage login;
	HomePage home;

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
		launchBrowser("firefox");

	}

	@After
	public void tearDownEachScenario() {
		closeBrowser();

	}

	@Given("user open firebase application")
	public void user_open_firebase_application() throws IOException {
		PropertiesUtility prop = new PropertiesUtility();
		String url = prop.getApplicationProperty("url");
		gotoUrl(url);
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

	@When("user enters value into textbox as {string}")
	public void user_enters_value_into_textbox_as(String userId) throws InterruptedException {
		login.enterUserName(userId);

	}

	@When("user enters value intotext box password as {string}")
	public void user_enters_value_intotext_box_password_as(String password) throws InterruptedException {
		login.enterPassword(password);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		driver = login.clickLoginBtn();
	}

	@Then("verify we can see {string}")
	public void verify_we_can_see(String expectedTitle) {
		String actTitle = home.getUrl();
		Assert.assertEquals(actTitle, expectedTitle);

	}

	@Given("click on {string} tab")
	public void click_on_tab(String string) {
		home.clickOnHomeTab();

	}

	@Then("we can see {string}")
	public void we_can_see(String expText) {
		String actText = home.getStudentRegistrationText();
		Assert.assertEquals(actText, expText);

	}

	@When("enters the name in  textbox as {string}")
	public void enters_the_name_in_textbox_as(String name) {
		home.setName(name);

	}

	@When("enters the  father name in  textbox as {string}")
	public void enters_the_father_name_in_textbox_as(String string) {
		home.setFatherName(string);

	}

	@When("enters the postal address as {int}")
	public void enters_the_postal_address_as(Integer int1) {
		home.setPostalAddress(int1);

	}

	@When("enters the personal address as {string}")
	public void enters_the_personal_address_as(String string) {
		home.setPersonalAddress(string);
	}

	@Then("click on radio button")
	public void click_on_radio_button() {
		home.clickOnRadioButton();
	}

}
