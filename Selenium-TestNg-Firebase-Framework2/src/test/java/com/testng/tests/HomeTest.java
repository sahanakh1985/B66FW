package com.testng.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;
import com.testng.utilities.CommonUtilities;

public class HomeTest extends BaseTest {
	WebDriver driver;
	LoginTest test = new LoginTest();

	LoginPage login = new LoginPage(driver);
	HomePage home = new HomePage(driver);
	String page;

	String username = "admin123@gmail.com";
	String password = "admin123";

	String fn = "Sahana KH";

//	public void openApplication() throws IOException, InterruptedException {
//		driver = getDriver();
//		driver.get("https://selenium-prd.firebaseapp.com/");
//
//	
//			login = new LoginPage(driver);
//		
//			home = new HomePage(driver);
//	
//
//		verifyenterIntoFirstName();
//	}
	@BeforeMethod

	public static void verifyLogin() throws IOException {
		login();
	}

	@Test
	public void verifyenterIntoFirstName() throws InterruptedException {

		Thread.sleep(3000);

		home.enterFirstName(fn);
	}

	@Test
	public void verifyOpenWindow() throws InterruptedException {

		home.openWindow();

	}

}
