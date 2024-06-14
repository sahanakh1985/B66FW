package com.training.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	static WebDriver driver;

	@BeforeMethod
	protected static WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();

	}

	public static void login() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium-prd.firebaseapp.com/");


		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login to Account']"));

	}
	@AfterMethod
	public static void closeDriver() {
		driver.close();
	}

}
