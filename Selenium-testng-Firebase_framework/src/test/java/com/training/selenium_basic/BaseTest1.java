package com.training.selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseTest1 {
	// performing "mouse-hover" action on "switch To" tab
	// we need to use "Actions" class of selenium
	static WebDriver driver;
	static Actions actions;

	public static void login() {
		driver = new ChromeDriver();

		driver.get("https://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void setEmail() {
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys("admin123@gmail.com");
	}

	public static void setPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));
		password.sendKeys("admin123");
	}

	public static void clickLogin() {
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();

	}

	public static void openWindow() {
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		actions = new Actions(driver);
		actions.moveToElement(switchTo).perform();

		// select "windows" option under mouse hover
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
	}

//		// handle alert popup of "switch To" mouse hover
//		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert']"));
//		alert.click();

}
