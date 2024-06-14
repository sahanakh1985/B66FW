package com.training.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeMethod

	public void openBrowser() {
		getBrowser("chrome");
		
	}
	public  void getBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		
		
		
	}

	public void launchApplication() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement unTb = driver.findElement(By.id("username"));
		unTb.sendKeys("Sahana@tek.com");
		WebElement pwTb = driver.findElement(By.id("password"));
		pwTb.sendKeys("Siri@123");
		// wait.until(ExpectedConditions.visibilityOf("loginBtn"));
		WebElement loginBtn = driver.findElement(By.id("Login"));
		loginBtn.click();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
