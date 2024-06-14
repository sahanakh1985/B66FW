package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.BasePage;

public class LoginPage extends BasePage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='email_field']")
	WebElement usernameTb;

	@FindBy(xpath = "//input[@id='email_field']//following::input")
	WebElement passwordTb;

	@FindBy(xpath = "//button[text()='Login to Account']")
	WebElement loginButton;

//	public void loginIntoApplication(String un, String pw) {
//		usernameTb.sendKeys(un);
//		passwordTb.sendKeys(pw);
//		loginButton.click();
//
//	}

	public void enterIntoUsername(String un) {
		waitForElement(usernameTb);

		usernameTb.sendKeys(un);
	}

	public void enterIntoPassword(String pw) {
		waitForElement(passwordTb);
		passwordTb.sendKeys(pw);
	}

	public void clickOnLogin() {
		waitForElement(loginButton);
		loginButton.click();

	}

}
