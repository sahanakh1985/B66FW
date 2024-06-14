package com.testng.tests;

import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.ValidLoginPage;

public class ValidLoginTest extends BaseTest {

	@Test
	public void verifyLogin() {
		ValidLoginPage loginPage = new ValidLoginPage(driver);
		loginPage.setUserName("Sahana@tek.com");
		loginPage.setPassword("Siri@123");
		loginPage.clickLogin();
	}
	public void verifySelectUserMenuDrop() {
		
	}

}
