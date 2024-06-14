package com.training.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentRegistrationForm {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys("admin123@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));

		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.findElement(By.cssSelector("#name")).sendKeys("Sahana");
		driver.findElement(By.id("lname")).sendKeys("KR Hemaraju");
		driver.findElement(By.xpath("//input[@id='postaladdress']")).sendKeys("Aralakuppe post");
		driver.findElement(By.cssSelector("#personaladdress")).sendKeys("Katteri");
		driver.findElement(By.xpath("//input[@value='female']")).click();

		WebElement citylistbox = driver.findElement(By.id("city"));
		Select city = new Select(citylistbox);
		 city.selectByVisibleText("GOA");
		//city.selectByIndex(3);
		// city.selectByValue("newdelhi");

	}
}
