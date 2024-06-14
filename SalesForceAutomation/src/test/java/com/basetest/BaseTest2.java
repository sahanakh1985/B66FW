package com.basetest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeMethod
	public static void launchApplication() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	}

	public static void validLogin() {
		driver.findElement(By.id("username")).sendKeys("Sahana@tek.com");
		driver.findElement(By.id("password")).sendKeys("Siri@123");
		driver.findElement(By.id("Login")).click();
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

	

	public void accountsTab() {
		// 12th testcase in salesforce
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	}

	public void opportunityLink() {
		// 19th testcase
		driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//h3[text()='Quarterly Summary']"));

		WebElement intervalDropDown = driver.findElement(By.id("quarter_q"));
		intervalDropDown.click();
		Select select = new Select(intervalDropDown);
		select.selectByVisibleText("Current and Next FQ");
		WebElement includeDropDown = driver.findElement(By.id("open"));
		select = new Select(includeDropDown);
		select.selectByValue("open");

		driver.findElement(By.cssSelector("input[title='Run Report']")).click();

	}

	public void contactsTab() {
		// 26th testcase
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create New View']")).click();
		driver.findElement(By.id("fname")).sendKeys("lose");
		driver.findElement(By.id("devname")).sendKeys("lose");
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();

	}

	public static void userProfileDropDownMyProfile() throws InterruptedException {

		WebElement homeTab = driver.findElement(By.xpath("//a[text()='Home']"));
		homeTab.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userProfile = driver.findElement(By.xpath("//span[@class='mruText' and text()='Sahana kh']"));
		userProfile.click();
		WebElement editIcon = driver.findElement(By.xpath("(//img[@title='Edit Profile' and @alt='Edit Profile' ])"));
		editIcon.click();

//	WebElement frameElement = driver.findElement(By.id("contactInfoContentId"));
//	driver.switchTo().frame(frameElement);
		WebElement aboutButton = driver
				.findElement(By.xpath("(//li[@id='aboutTab'] |//a[contains(text(),'About')])[1]"));
		aboutButton.click();
//		driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")).sendKeys("KH");
//		// driver.findElement(By.xpath("//input[@value='Save All' and
//		// type='button']")).click();
	}

	@AfterMethod
	public static void logout() {
		driver.quit();
	}

}
