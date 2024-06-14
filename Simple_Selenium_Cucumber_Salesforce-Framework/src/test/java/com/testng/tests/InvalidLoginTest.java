package com.testng.tests;

import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.InvalidLoginPage;

public class InvalidLoginTest extends BaseTest {
	@Test
	public void verifyLogin() {
		InvalidLoginPage loginPage = new InvalidLoginPage(driver);
		loginPage.setUserName("Sana@tek.com");
		loginPage.setPassword("ani@123");
		loginPage.clickLogin();
	}

}
