package com.testng.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserMenuDropDownPage {

	@FindBy(xpath = "//span[text()='Sahana kh']")
	WebElement userMenu;
	
	@FindBy(xpath = "//a[text()='My Settings']")
	WebElement settings;
	
	@FindBy(xpath = "//span[text()='Personal']")
	WebElement personal;
	@FindBy(id = "LoginHistory_font")
	WebElement loginHistoryFont;
	@FindBy(id = "DisplayAndLayout_font")
	WebElement displayAndLayoutFont;
	@FindBy(id = "CustomizeTabs_font")
	WebElement customizeTabsFont;
	@FindBy(id = "p4")
	WebElement customAppDropDown;
	@FindBy(id = "duel_select_0")
	WebElement availableTabs;
	@FindBy(id = "//img[@class='rightArrowIcon']")
	WebElement rightArrowIcon;
	@FindBy(id = "EmailSetup_font")
	WebElement emailLnk;
	@FindBy(id = "EmailSettings_fontt")
	WebElement emailSettins;
	@FindBy(id = "sender_name")
	WebElement emailName;
	@FindBy(id = "sender_email")
	WebElement emailAddress;
	@FindBy(id = "auto_bcc1")
	WebElement radioButton;
	@FindBy(xpath = "//input[@title='Save']")
	WebElement save;
	@FindBy(id = "CalendarAndReminders_font")
	WebElement calender;
	@FindBy(id = "Reminders_font")
	WebElement remainderFont;
	@FindBy(id = "testbtn")
	WebElement openTestRemainderBtn;

	public UserMenuDropDownPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void clickUserMenu() {
		userMenu.click();

	}

	public void clickSettings() {
		settings.click();

	}

	public void clickPersonal() {
		personal.click();

	}

	public void clickLoginHistory() {
		loginHistoryFont.click();

	}

	public void dispalyAndLayout() {
		displayAndLayoutFont.click();

	}

	public void selectDropDown(WebElement element) {
		Select select = new Select(customAppDropDown);

		select = new Select(customAppDropDown);
		select.selectByVisibleText("Salesforce Chatter");

	}

	public void selectAvailableTabs(WebElement element) {
		Select select = new Select(availableTabs);

		select = new Select(availableTabs);
		select.selectByValue("report");

	}

	public void clickOnRightArrowIcon() {
		rightArrowIcon.click();
	}

	public void clickEmailLink() {
		emailLnk.click();
	}

	public void clickOnEmailSettings() {
		emailSettins.click();
	}

	public void enterEmailName() {
		emailName.sendKeys("Sahana KH");
	}

	public void enterEmailAddress() {
		emailAddress.sendKeys("sahanakh1985@gmail.com");
	}

	public void clickOnRadioButton() {
		radioButton.click();
	}

//	public void scrollWebPage() {
//
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		for (int i = 0; i < 4; i++) {
//
//			j.executeScript("window.scrollBy(0,500)");
//		}
//		Thread.sleep(3000);
//	}

	public void clickOnSaveBtn() {
		save.click();
	}

	public void clickOnCalender() {
		calender.click();
	}

	public void clickOnRemainderFont() {
		remainderFont.click();
	}

	public void clickOnTestRemainderButton() {
		openTestRemainderBtn.click();
	}

}
