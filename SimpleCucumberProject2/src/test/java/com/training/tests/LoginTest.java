package com.training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.training.base.BaseTest;

public class LoginTest extends BaseTest {

	public void launchApplication() {
		driver.get("https://tekarch95-dev-ed.develop.my.salesforce.com/");
		driver.manage().window().maximize();
		WebElement unTb = driver.findElement(By.id("username"));
		unTb.sendKeys("Sahana@tek.com");
		WebElement pwTb = driver.findElement(By.id("password"));
		pwTb.sendKeys("Sahana@tek.com");
		WebElement loginBtn = driver.findElement(By.id("Login"));
		loginBtn.click();
	}

	public static void main(String[] args) {

	}
}
