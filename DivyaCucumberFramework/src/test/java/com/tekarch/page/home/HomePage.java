package com.tekarch.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tekarch.page.base.BasePage;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutElement;
	@FindBy(xpath = "//a[text()='Home']")
	WebElement homeTab;
	@FindBy(xpath = "//h1[normalize-space()='Student Registration Form']")
	WebElement studentRegistration;
	@FindBy(id = "name")
	WebElement yourName;
	@FindBy(id = "lname")
	WebElement fatherName;
	@FindBy(id = "postaladdress")
	WebElement postalAddress;
	@FindBy(id = "personaladdress")
	WebElement personalAddress;
	@FindBy(id = "radiobut")
	WebElement radioBtn;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public String getUrl() {
		getCurrentUrl();
		return null;
	}

	public void clickOnHomeTab() {
		homeTab.click();
	}

	public String getStudentRegistrationText() {

		String text = getTextFromWebElement(studentRegistration);
		return text;

	}

	public void setName(String name) {
		yourName.sendKeys(name);
	}

	public void setFatherName(String fName) {
		fatherName.sendKeys(fName);
	}

	public void setPostalAddress(int num) {
		postalAddress.sendKeys("num");
	}

	public void setPersonalAddress(String personalAdrs) {
		personalAddress.sendKeys(personalAdrs);
	}

	public void clickOnRadioButton() {
		radioBtn.click();
	}

}
