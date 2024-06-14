package com.testng.tests;

import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.UserMenuDropDownPage;
import com.testng.pages.ValidLoginPage;

public class UserMenuDropDownTest extends BaseTest {

	UserMenuDropDownPage page = new UserMenuDropDownPage(driver);

	@Test
	public void verifyLogin() {
		ValidLoginPage loginPage = new ValidLoginPage(driver);
		loginPage.setUserName("Sahana@tek.com");
		loginPage.setPassword("Siri@123");
		loginPage.clickLogin();

	}

	@Test
	public void verifyclickUserMenu() {
		verifyLogin();
		page.clickUserMenu();

	}

}
