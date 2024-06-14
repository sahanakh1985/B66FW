package com.training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.base.BaseTest;

public class SalesforceOppportunityTest extends BaseTest {

	WebDriver driver = new ChromeDriver();

	@Test
	public void opportunityDropDown() throws InterruptedException {

		login();

		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, " login Unsucessful");

		WebElement oppurtunityLinkElement = driver
				.findElement(By.xpath("//*[@id='Opportunity_Tab']/a[text()='Opportunities']"));
		waitforVisibilty(oppurtunityLinkElement, driver, 30, 5, "waiting time");
		moveandClickAction(oppurtunityLinkElement, "mouse hover account ");

		Thread.sleep(3000);

		WebElement oppurtunityLinkElement1 = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/a[1]"));
		clickElement(oppurtunityLinkElement1, "oppurtunity");

		switchtoWindowHandle(driver.getWindowHandle(), driver);

		WebElement oppurtunityListElement = driver.findElement(By.id("fcf"));

		validateDropDownwithSelectClass(oppurtunityListElement, oppurtunityDropDownList(),
				"drop down list oppurtunity");

	}

	private Object[] oppurtunityDropDownList() {
		// TODO Auto-generated method stub
		return null;
	}

}
