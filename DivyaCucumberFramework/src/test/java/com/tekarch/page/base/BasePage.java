package com.tekarch.page.base;

import org.apache.logging.log4j.MarkerManager.Log4jMarker;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.core.logging.Logger;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
//	protected Log4JUtiltiy logObject=Log4JUtility.
//	 protected Logger log;

	public BasePage(WebDriver driver) {

		this.driver = driver;

		System.out.println("driver is in basepage :" + driver);
		PageFactory.initElements(driver, this);

	}

	public void enterText(WebElement element, String data, String objectName) throws InterruptedException {
		// waitFluentForVisibility(element, objectName);
		Thread.sleep(1000);
		if (element.isDisplayed()) {
			clearElement(element, objectName);
			element.sendKeys(data);
			System.out.println("Pass" + objectName + "  is entered into the " + objectName + " textbox");
		} else {
			System.out.println("Fail" + objectName + " is  not entered into the " + objectName + " textbox");
		}

	}

	private void clearElement(WebElement element, String objectName) {
		if (element.isDisplayed()) {
			element.clear();
			System.out.println("Pass" + objectName + "is cleared");
		} else {
			System.out.println("Fail" + objectName + "is  not displayed");
		}

	}

	private void waitFluentForVisibility(WebElement element, String objectName) {

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void clickElement(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.click();
			System.out.println("Pass " + objName + " is clicked");
		} else {
			System.out.println("Fail " + objName + " is  not clicked");

		}

	}

	public void getCurrentUrl() {
		String actUrl = driver.getCurrentUrl();
		String expectedUrl = "https://tekarch95-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";

		Assert.assertEquals(actUrl, expectedUrl);
		;
	}

	protected String getTextFromWebElement(WebElement element) {
		String actText = element.getText();
		String exptText = "Student Registration Form";

		Assert.assertEquals(actText, exptText);

		return actText;

	}

}
