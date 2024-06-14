package com.script;

import org.testng.annotations.Test;

import com.basetest.BaseTest1;

public class LoginTest extends BaseTest1 {

	@Test
	public void verifyInvalidLogin() {
		inValidLogin();
	}

	@Test
	public void verifyValidLogin() {
		validLogin();
	}

	@Test
	public void verifyCheckRememberMe() throws InterruptedException {
		validLogin();
		checkRememberMe();
	}

	@Test
	public void verifyForgotPasssword() throws InterruptedException {
		inValidLogin();
		forgotPassword();
	}

	@Test
	public void verifyErrorMsg() {

		errorMsg();

	}

	@Test
	public void verifyHomeTab() throws InterruptedException {
		validLogin();
		homeTab();

	}

	@Test
	public void verifyTabCustomization() throws InterruptedException {
		validLogin();
		tabCustomization();

	}

	@Test
	public void verifyCalenderHandling() throws InterruptedException {
		validLogin();
		calenderHandling();

	}

}
