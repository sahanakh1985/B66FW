package com.selenium.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {
	public static void main(String[] args) throws InterruptedException {
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		driver.get("https://online.actitime.com/skh/login.do");
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
		// Thread.sleep(1000);
		String expectedUrl = "enter";
		wait.until(ExpectedConditions.urlContains(expectedUrl));

		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);

		if (actualUrl.contains(expectedUrl)) {
			System.out.println("Pass:Homepage is displayed");
		} else {
			System.out.println("Fail:Homepage is not displayed");
		}

	}

}
