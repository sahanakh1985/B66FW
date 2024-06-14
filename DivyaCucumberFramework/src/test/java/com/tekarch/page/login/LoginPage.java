package com.tekarch.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tekarch.page.base.BasePage;

public class LoginPage extends BasePage {

	@FindBy(id = "email_field")
	WebElement userNameElement;

	@FindBy(id = "password_field")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login to Account']")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public void enterUserName(String un) throws InterruptedException {
		enterText(userNameElement, un, "username field");
	}

	public void enterPassword(String pwd) throws InterruptedException {
		enterText(password, pwd, "username field");
	}

	public WebDriver clickLoginBtn() {
		clickElement(loginButton, "login button");
		return driver;
	}

	public String getTitleOfThePage() {
		return getPageTitle();
	}

	private String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
