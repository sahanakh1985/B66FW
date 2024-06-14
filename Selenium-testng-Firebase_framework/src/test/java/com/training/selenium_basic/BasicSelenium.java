package com.training.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSelenium {
	public static void main(String[] args) {

		// WebDriver driver = new ChromeDriver();

		ChromeOptions myOptions = new ChromeOptions();
		myOptions.setBinary("C:\\Users\\dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver = new ChromeDriver(myOptions);

		driver.get("https:login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Sahana@tek.com");
		driver.findElement(By.name("pw")).sendKeys("Siri@123");
		driver.findElement(By.name("rememberUn")).click();
		driver.findElement(By.id("Login")).click();

	}

}
