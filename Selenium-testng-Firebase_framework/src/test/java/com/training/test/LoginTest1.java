package com.training.test;

import org.testng.annotations.Test;

import com.training.selenium_basic.BaseTest1;

public class LoginTest1 extends BaseTest1 {
	@Test
	public static void verifyLogin() {
		login();
		setEmail();
		setPassword();
		clickLogin();
	}

}
