package com.training.tests;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.base.BaseTest;

public class SalesforceAccounts2 extends BaseTest {
	static WebDriver driver = new ChromeDriver();

	@Test
	public void createNewAccount() throws Exception {

		login();

		Thread.sleep(3000);

		WebElement accountLinkElement = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		waitforVisibilty(accountLinkElement, driver, 30, 5, "waiting time");
		moveandClickAction(accountLinkElement, "mouse hover account ");
		waitUntilPresenceofElementLocatedBy(By.xpath("//h1[contains(text(),'Accounts')]"), "header");

		WebElement accountLink = driver.findElement(By.xpath("//h1[contains(text(),'Accounts')]"));
		waitforVisibilty(accountLink, driver, 5, 2, "account Header text");
		String actualAccountHeader = getTextFromElement(accountLink, "account Header Text");

		String expectedAccountHeader = "Accounts";
		Assert.assertEquals(actualAccountHeader, expectedAccountHeader, "failed : account Header title no matching");

		WebElement newAccountElement = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		clickElementButton(newAccountElement, "new ");

		String expectedNewAccountHeader = "Account Edit";
		WebElement accountNewLink = driver.findElement(By.xpath("//h2[contains(text(),'Account Edit')]"));
		waitforVisibilty(accountNewLink, driver, 5, 2, "account Header text");
		String actualNewAccountHeader = getTextFromElement(accountNewLink, "account Header Text");
		Assert.assertEquals(actualNewAccountHeader, expectedNewAccountHeader,
				"failed : account Header title no matching");

		WebElement accountNameElement = driver.findElement(By.id("acc2"));
		waitforVisibilty(accountNameElement, driver, 5, "userName Text Box");
		enterText(accountNameElement, "Nans", "username textbox");

		WebElement accountTypeElement = driver.findElement(By.xpath("//select[@id='acc6']"));

		selectValueByData(accountTypeElement, "Technology Partner", "Type of account");

		WebElement customerPriority = driver.findElement(By.xpath("//select[@id='00NHr00000IHF9D']"));

		selectValueByData(customerPriority, "High", "set Customer Prority");

	}

	@Test
	public static void createNewView() throws InterruptedException {
		System.out.println(
				"************* Test case TC11 (Create an Account) automation Script started **********************");

		login();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//1i[@id='Account_Tab']"));
		WebElement accounLinkElement = driver.findElement(By.xpath("//a[text()='Accounts']"));
		waitforVisibilty(accounLinkElement, driver, 30, 5, "waiting time");
		moveandClickAction(accounLinkElement, "mouse hover account ");

		waitUntilPresenceofElementLocatedBy(By.xpath("//h1[contains(text(),'Accounts')]"), "header");

		// String expectedAccountHeader =
		// "https://tekarch95-dev-ed.develop.my.salesforce.com/001/o";
		String expectedAccountHeader = "Create New View";
		WebElement accountLink = driver.findElement(By.xpath("//h1[contains(text(),'Accounts')]"));
		waitforVisibilty(accountLink, driver, 5, 2, "account Header text");
		String actualAccountHeader = getTextFromElement(accountLink, "account Header Text");
		Assert.assertEquals(actualAccountHeader, expectedAccountHeader, "failed : account Header title no matching");

		String expected = "https://tekarch95-dev-ed.develop.my.salesforce.com/ui/list/FilterEditPage?ftype=a&retURL=%2F001&cancelURL=%2F001%2Fo";

		Thread.sleep(5000);

		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expected, " login Unsucessful");

		WebElement createNewView = driver.findElement(By.xpath("//a[text()='Create New View']"));
		waitforVisibilty(createNewView, driver, 5, "create new view link");
		createNewView.click();

		WebElement viewName = driver.findElement(By.id("fname"));
		waitforVisibilty(viewName, driver, 5, "view name text box");
		viewName.sendKeys("Sahana KH");

		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		waitforVisibilty(viewUniqueName, driver, 5, "view unique name text box");
		viewUniqueName.sendKeys("sana");

		WebElement saveButton = driver.findElement(By.xpath("//input[@className='btn primary']"));
		waitforVisibilty(saveButton, driver, 5, "save button");
		saveButton.click();
	}
}
