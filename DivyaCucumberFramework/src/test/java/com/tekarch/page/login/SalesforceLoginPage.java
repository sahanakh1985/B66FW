package com.tekarch.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tekarch.page.base.BasePage;

public class SalesforceLoginPage extends BasePage {

	@FindBy(id = "username")
	WebElement unTb;
	@FindBy(id = "password")
	WebElement pwdTb;
	@FindBy(id = "Login")
	WebElement loginBTN;

	public SalesforceLoginPage(WebDriver driver) {
		super(driver);

	}

	BasePage bp = new BasePage(driver);

	public void setUn(String un) throws InterruptedException {
		bp.enterText(unTb, un, "un field");

	}

	public void setPwd(String pwd) throws InterruptedException {
		bp.enterText(pwdTb, pwd, "pwd field");
	}

	public void clickLogin() {
		bp.clickElement(loginBTN, "login button");

	}

}
