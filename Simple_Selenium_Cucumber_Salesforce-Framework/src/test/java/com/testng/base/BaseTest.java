package com.testng.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver;
	// static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	@BeforeMethod
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	}

	public static void selectUserMenuDropDown() throws InterruptedException {
		// 7th testcase in salesforce
		driver.findElement(By.xpath("//span[text()='Sahana kh']")).click();
		driver.findElement(By.xpath("//a[text()='My Settings']")).click();
		driver.findElement(By.xpath("//span[text()='Personal']")).click();
		driver.findElement(By.id("LoginHistory_font")).click();
		driver.findElement(By.id("DisplayAndLayout_font")).click();
		driver.findElement(By.id("CustomizeTabs_font")).click();
		WebElement customAppdropDown = driver.findElement(By.id("p4"));
		Select select = new Select(customAppdropDown);
		select.selectByVisibleText("Salesforce Chatter");
		WebElement availableTabs = driver.findElement(By.id("duel_select_0"));
		select = new Select(availableTabs);
		select.selectByValue("report");
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		WebElement emaiLink = driver.findElement(By.id("EmailSetup_font"));
		emaiLink.click();
		driver.findElement(By.id("EmailSettings_font")).click();
		WebElement emailName = driver.findElement(By.id("sender_name"));
		emailName.sendKeys("Sahana kh");

		WebElement emailAddress = driver.findElement(By.id("sender_email"));
		emailAddress.sendKeys("sahanakh1985@gmail.com");
		WebElement radioButton = driver.findElement(By.id("auto_bcc1"));
		radioButton.click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 4; i++) {

			j.executeScript("window.scrollBy(0,500)");
		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[title='Save']")).click();

		WebElement calender = driver.findElement(By.id("CalendarAndReminders_font"));
		calender.click();
		driver.findElement(By.id("Reminders_font")).click();
		for (int i = 0; i < 4; i++) {

			j.executeScript("window.scrollBy(0,500)");
		}
		driver.findElement(By.id("testbtn")).click();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
