package com.basetest;

import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 {

	public static WebDriver driver;
	public static WebDriverWait wait;
	//private static WebElement homeTab;

	@BeforeMethod
	public static void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	}

	public static void inValidLogin() {
		driver.findElement(By.id("username")).sendKeys("Sahana@tek.com");
		driver.findElement(By.id("password")).sendKeys("Ammu@123");
		driver.findElement(By.id("Login")).click();
	}

	public static void validLogin() {
		driver.findElement(By.id("username")).sendKeys("Sahana@tek.com");
		driver.findElement(By.id("password")).sendKeys("Siri@123");
		driver.findElement(By.id("Login")).click();
	}

	public static void checkRememberMe() throws InterruptedException {

		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		checkBox.click();
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(5);
		String displayedUn = driver.findElement(By.id("username")).getText();

		System.out.println(displayedUn);
		String expectedUn = "Sahana@tek.com";
		System.out.println(expectedUn);
		if (expectedUn.equals(displayedUn)) {
			System.out.println("the UN is displayed in Un textbox after logout");

		} else {

			System.out.println("the UN is not displayed in Un textbox after logout");
		}
	}

	public static void forgotPassword() throws InterruptedException {
		driver.findElement(By.xpath("//a[.='Forgot Your Password?']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("un")).sendKeys("Sahana@tek.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	public static void errorMsg() {
		inValidLogin();
		String errorMsg = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(errorMsg);

	}

	public static void homeTab() throws InterruptedException {
		// TC-34

		WebElement homeTab = driver.findElement(By.xpath("//a[text()='Home']"));
		homeTab.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userProfile = driver.findElement(By.xpath("//span[@class='mruText' and text()='Sahana kh']"));
		userProfile.click();
		WebElement editIcon = driver.findElement(By.xpath("(//img[@title='Edit Profile' and @alt='Edit Profile' ])"));
		editIcon.click();

		WebElement aboutButton = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		aboutButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")).sendKeys("KH");
	}

	public static void tabCustomization() throws InterruptedException {
		// TC-35
		driver.findElement(By.xpath("//img[@title='All Tabs']")).click();
		driver.findElement(By.xpath("//input[@title='Customize My Tabs']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}

		WebElement tabList = driver.findElement(By.id("duel_select_1"));
		Select select = new Select(tabList);
		select.selectByValue("Chatter");
		driver.findElement(By.xpath("//img[@class='leftArrowIcon']")).click();

		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		Thread.sleep(3000);

	}

	public void salesforceLogout() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Sahana kh' and (@id='userNavLabel')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='userNavButton']"));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));

	}

	public static void calenderHandling() throws InterruptedException {
		WebElement homeTab = driver.findElement(By.xpath("//a[text()='Home']"));
		homeTab.click();
		driver.findElement(By.xpath("//a[.='Monday 25 March 2024']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}

		driver.findElement(By.xpath("//a[contains(text(),'8:00 pm')]")).click();
		driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")).click();
		// handling window popup
		String parentWindow = driver.getWindowHandle();

		Set<String> whs = driver.getWindowHandles();
		int count = whs.size();
		System.out.println("Number of windows:" + count);
		whs.remove(parentWindow);
		for (String wh : whs) {
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			String currentTitle = driver.getTitle();
			System.out.println("Child window title:" + currentTitle);
			driver.findElement(By.xpath("//a[@href='javascript:pickValue(4);']")).click();

		}

		driver.findElement(By.cssSelector("EndDateTime")).click();

	}

	public static void selectUserMenuDropDown() throws InterruptedException {
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

//	@AfterMethod
//	public static void logout() {
//		driver.quit();
//	}

}
