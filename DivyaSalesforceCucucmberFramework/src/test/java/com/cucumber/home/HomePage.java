package com.cucumber.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(tagName = "h2")
	WebElement verifyYourId;

	@FindBy(xpath = "//span[text()='Sahana kh' and @id='userNavLabel']")
	WebElement userMenu;

//	public void getText() {
//		String text = verifyYourId.getText();
//		System.out.println(text);

	public void verifyUserMenu() throws InterruptedException {
		Thread.sleep(5000);
		if (userMenu.isDisplayed()) {
			userMenu.click();
			System.out.println("Menu button found and clicked");
		} else {
			System.out.println("Menu button not found");
		}

	}

}
