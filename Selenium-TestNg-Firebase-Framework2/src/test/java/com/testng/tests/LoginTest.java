package com.testng.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;
import com.testng.utilities.CommonUtilities;

public class LoginTest extends BaseTest {

	static WebDriver driver;

	CommonUtilities common = new CommonUtilities();

	LoginPage login;
	HomePage home;

//	String username = "admin123@gmail.com";
//	String password = "admin123";
//
//	String fn = "Sahana KH";
//	String url;
//	String username;
//	String password;
	String fn;
//
//	@BeforeMethod
//	public void openApplication() throws IOException {
//		launchApp();

//		login = new LoginPage(driver);
//		home = new HomePage(driver);
//
//		url = common.getApplicationProperty("url");
//		username = common.getApplicationProperty("username");
//
//		password = common.getApplicationProperty("password");
//		fn = common.getApplicationProperty("firstName");

//	}

	@Test
	public void validateHomePage() throws InterruptedException, IOException {
		login();

//		home.enterFirstName(fn);
//		home.openWindow();

	}

	public void tearDown() {
		takesScreenShot(driver);
		driver.close();

	}

}
