package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;

	@BeforeMethod
	public static String launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		System.out.println(browser + " browser is opened");
		return browser;
	}

	public static void enterUrl(String url) throws IOException {
//		CommonUtilities common = new CommonUtilities();
//		url = common.getApplicationProperty("url");
		driver.get(url);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}

}
