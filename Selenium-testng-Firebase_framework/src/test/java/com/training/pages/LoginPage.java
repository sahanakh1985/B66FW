package com.training.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;

public class LoginPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "email_field")
	WebElement usernameTb;

	@FindBy(id = "password_field")
	WebElement passwordTb;

	@FindBy(xpath = "//button[text()='Login to Account']")
	WebElement loginButton;

	public void loginIntoApplication(String un, String pw) {
		usernameTb.sendKeys(un);
		passwordTb.sendKeys(pw);
		loginButton.click();

	}

	public void enterIntoUsername(String un) {
		wait.until(ExpectedConditions.visibilityOf(usernameTb));
		usernameTb.sendKeys(un);
	}

	public void enterIntoPassword(String pw) {
		wait.until(ExpectedConditions.visibilityOf(passwordTb));

		passwordTb.sendKeys(pw);
	}

	public void clickOnLogin() {
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();

	}

}
