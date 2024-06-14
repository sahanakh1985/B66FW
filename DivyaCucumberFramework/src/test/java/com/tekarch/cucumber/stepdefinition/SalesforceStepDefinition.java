//package com.tekarch.cucumber.stepdefinition;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.tekarch.page.home.HomePage;
//import com.tekarch.page.home.SalesforceHomePage;
//import com.tekarch.page.login.LoginPage;
//import com.tekarch.page.login.SalesforceLoginPage;
//import com.tekarch.utility.PropertiesUtility;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class SalesforceStepDefinition {
//
//	WebDriver driver = new ChromeDriver();
//	String un = "Sahana@tek.com";
//	String pwd = "Siri@123";
////	public void launchBrowser(String browser) {
////		switch (browser) {
////		case "firefox":
////			WebDriverManager.firefoxdriver().setup();
////			driver = new FirefoxDriver();
////			driver.manage().window().maximize();
////			break;
////		case "chrome":
////			WebDriverManager.chromedriver().setup();
////			driver = new ChromeDriver();
////			driver.manage().window().maximize();
////			break;
////		}
////		System.out.println(browser + "browser opened");
////
////	}
////
////	public void enterUrl(String url) {
////		driver.get(url);
////		System.out.println(url + "is entered");
////
////	}
////
////	public void closeBrowser() {
////		driver.close();
////		System.out.println("current browser is closed");
////	}
////
////	@Before
////	public void setBrowser() throws InterruptedException {
////		launchBrowser("firefox");
////		Thread.sleep(1000);
////	}
////
////	@After
////	public void tearDown() {
////		closeBrowser();
////	}
//
//	@Given("user open Salesforce application")
//	public void user_open_salesforce_application() throws InterruptedException, IOException {
////		PropertiesUtility prop = new PropertiesUtility();
////		String url = prop.getApplicationProperty("salesforceUrl");
////		enterUrl(url);
////		Thread.sleep(1000);
//		driver.get("https://login.salesforce.com/");
//
//	}
//
//
//
//	@When("user enters the username in unTextBox as {string}")
//	public void user_enters_the_username_in_un_text_box_as(String un) throws InterruptedException {
//		Thread.sleep(1000);
//
//		WebElement unTb = driver.findElement(By.id("username"));
//		unTb.sendKeys(un);
//
//	}
//
//	@When("user enters the password in pwdTextBox as {string}")
//	public void user_enters_the_password_in_pwd_text_box_as(String string) throws InterruptedException {
//		Thread.sleep(1000);
//
//		WebElement pwdTb = driver.findElement(By.id("password"));
//		pwdTb.sendKeys(pwd);
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() throws InterruptedException {
//		Thread.sleep(1000);
//		WebElement loginBtn = driver.findElement(By.id("Login"));
//		loginBtn.click();
//	}
//
//	String exptUrl = "https://tekarch95-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";
//
//	@Then("verify homepage with url as {string}")
//	public void verify_homepage_with_url_as(String string) throws InterruptedException {
//		Thread.sleep(3000);
//		String actuRl = driver.getCurrentUrl();
//		String exptUrl = "https://tekarch95-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";
//	
//	}
//
//}
