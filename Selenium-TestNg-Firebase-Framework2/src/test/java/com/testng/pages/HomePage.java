package com.testng.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testng.base.BasePage;

public class HomePage extends BasePage {

	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	Actions actions = new Actions(driver);

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "name")
	WebElement firstName;

	@FindBy(xpath = "//button[contains(text(),'Switch To')]")
	WebElement switchTo;
	@FindBy(xpath = "//a[contains(text(),'Windows')]')]")
	WebElement openWindow;
	@FindBy(xpath = "//button[contains(text(),'Intractions')]")
	WebElement intractions;
	@FindBy(xpath = "//a[text()='Double Click']")
	WebElement doubleClick;
	@FindBy(xpath = "//div[@class='tab']")
	List<WebElement> listOfTabs;
	@FindBy(xpath = "//button[contains(text(),'Intractions')]")
	WebElement toolTipIntractions;
	@FindBy(xpath = "//a[text()='Tool Tip']")
	WebElement toolTipDoubleClick;
	@FindBy(className = "tooltipr")
	WebElement toolTiRict;
	@FindBy(className = "tooltiptextr")
	WebElement toolText;
	@FindBy(className = "//button[contains(text(),'Switch To')]")
	WebElement alertSwitchTo;

	@FindBy(className = "//a[contains(text(),'Alert')]")
	WebElement alert;
	@FindBy(className = "//button[contains(text(),'Window Alert')]")
	WebElement windowAlert;
	@FindBy(className = "//button[contains(text(),'Promt Alert')]")
	WebElement promptAlert;
	@FindBy(className = "//button[contains(text(),'Widget')]")
	WebElement widget;
	@FindBy(className = "//a[contains(text(),'AutoComplete')]")
	WebElement autoComplete;
	@FindBy(className = "//input[@id='myInput']")
	WebElement country;
	@FindBy(className = "//div[@id='myInputautocomplete-list']/div")
	List<WebElement> countryList;
	@FindBy(className = "//a[contains(text(),'Table')]")
	WebElement table;
	@FindBy(className = "//th")
	List<WebElement> tableHeader;
	@FindBy(className = "//tbody/tr/td")
	List<WebElement> tableData;

	public void enterFirstName(String fn) {
		waitForElement(firstName);

		firstName.sendKeys(fn);
	}

	public void openWindow() {
		// wait.until(ExpectedConditions.visibilityOf(switchTo));
		actions.moveToElement(switchTo).build().perform();

		// wait.until(ExpectedConditions.visibilityOf(openWindow));
		openWindow.click();

	}

	public void openTab() {
		actions.moveToElement(intractions).build().perform();
		doubleClick.click();
		int count = listOfTabs.size();
		System.out.println(count);

		for (WebElement tab : listOfTabs) {
			String text = tab.getText();
			System.out.println(text);

		}

	}

	public void toolTip() {
		wait.until(ExpectedConditions.visibilityOf(toolTipIntractions));
		actions.moveToElement(toolTipIntractions).build().perform();
		toolTipDoubleClick.click();

		actions.moveToElement(toolTiRict).build().perform();
		String actualText = toolText.getText();
		System.out.println(actualText);
		String expectedText = "Right";
		System.out.println("ExpectedText=" + expectedText);

		Assert.assertEquals(actualText, expectedText);

	}

	public void alertPopUp() {

		wait.until(ExpectedConditions.visibilityOf(alertSwitchTo));
		actions.moveToElement(alertSwitchTo).perform();
		alert.click();
		windowAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		promptAlert.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

	}

	public void autocompleteInWidget() {
		wait.until(ExpectedConditions.visibilityOf(widget));
		actions.moveToElement(widget).perform();

		autoComplete.click();
		country.sendKeys("I");
		int count = countryList.size();
		System.out.println("Number of countries:" + count);

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

	public void table() {
		wait.until(ExpectedConditions.visibilityOf(widget));
		actions.moveToElement(widget).perform();
		table.click();
		displayData(tableHeader);

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
