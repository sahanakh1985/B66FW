package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLoginPage {

	@FindBy(id = "username")
	private WebElement unTb;

	@FindBy(id = "password")
	private WebElement pwTb;

	@FindBy(id = "Login")
	private WebElement loginBtn;

	public ValidLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setUserName(String un) {
		unTb.sendKeys(un);
	}

	public void setPassword(String pw) {
		unTb.sendKeys(pw);
	}

	public void clickLogin() {
		loginBtn.click();
		;
	}

}
