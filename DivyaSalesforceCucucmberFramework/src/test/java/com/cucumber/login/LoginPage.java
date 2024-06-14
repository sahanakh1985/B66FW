package com.cucumber.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "username")
	WebElement unTb;

	@FindBy(id = "password")
	WebElement pwTb;

	@FindBy(id = "Login")
	WebElement loginBtn;

	public void setUn(String un) {
		unTb.sendKeys(un);
	}

	public void setpw(String pw) {
		pwTb.sendKeys(pw);
	}

	public WebDriver clickLogin() {
		loginBtn.click();
		return null;
	}

}
