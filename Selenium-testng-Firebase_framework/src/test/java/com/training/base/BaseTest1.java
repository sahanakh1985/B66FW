package com.training.base;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseTest1 {
	static WebDriver driver;
	static Actions actions;
	static WebDriverWait wait;

	public static void login() {
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();

	}

	public static void openWindow() {
		actions = new Actions(driver);
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(switchTo));
		actions.moveToElement(switchTo).perform();

		// select "windows" option under mouse hover
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
	}

	public static void doubleClick() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Selenium1";
		Assert.assertEquals(actualTitle, expectedTitle);

		actions = new Actions(driver);
		WebElement intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(intractions));
		actions.moveToElement(intractions).build().perform();
		// click on Doubleclick
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();

	}

	public static void openTabs() {
		actions = new Actions(driver);
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(switchTo));
		actions.moveToElement(switchTo).perform();

		// select "windows" option under mouse hover
		driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")).click();

		// finding multiple webElemnt
		List<WebElement> listOfTab = driver.findElements(By.xpath("//div[@class='tab']"));
		int count = listOfTab.size();
		System.out.println(count);

		for (WebElement tab : listOfTab) {
			String text = tab.getText();
			System.out.println(text);

		}

	}

	public static void toolTip() {
		actions = new Actions(driver);
		WebElement intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(intractions));
		actions.moveToElement(intractions).build().perform();
		// click on Doubleclick
		driver.findElement(By.xpath("//a[text()='Tool Tip']")).click();

		WebElement toolTiRigt = driver.findElement(By.className("tooltipr"));
		wait.until(ExpectedConditions.visibilityOf(toolTiRigt));
		actions.moveToElement(toolTiRigt).build().perform();

		WebElement rightText = driver.findElement(By.className("tooltiptextr"));
		String actualText = rightText.getText();
		System.out.println("ActualText=" + actualText);
		String expectedText = "Right";
		System.out.println("ExpectedText=" + expectedText);

		Assert.assertEquals(actualText, expectedText);

	}

	public static void alertPopup() {
		actions = new Actions(driver);
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(switchTo));
		actions.moveToElement(switchTo).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]")).click();
		Alert alert1 = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("sahana");
		alert1.accept();
		// alert1.dismiss();
	}

	public static void autoComplete() {
		actions = new Actions(driver);
		WebElement widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(widget));
		actions.moveToElement(widget).perform();

		driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("I");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String xp = "//div[@id='myInputautocomplete-list']/div";
		List<WebElement> countryList = driver.findElements(By.xpath(xp));

		int count = countryList.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = countryList.get(i).getText();
			System.out.println(text);
			String expected = "India";
			if (text.equalsIgnoreCase(expected)) {
				countryList.get(i).click();
				break;

			}
		}

	}

	public static void table() {
		actions = new Actions(driver);
		WebElement widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(widget));
		actions.moveToElement(widget).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
		List<WebElement> tableHeader = driver.findElements(By.xpath("//th"));
		displayData(tableHeader);

		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td"));
		wait.until(ExpectedConditions.visibilityOfAllElements(tableData));
		int count = tableData.size();
		System.out.println(count);
		displayData(tableData);

	}

	public static void displayData(List<WebElement> elementsList) {
		Iterator<WebElement> itr = elementsList.iterator();
		while (itr.hasNext()) {
			WebElement webElement = itr.next();
			System.out.println(webElement.getText());

		}
	}
}
