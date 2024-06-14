package com.training.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.base.BaseTest1;
import com.training.pages.LoginPage;
import com.training.utilities.CommonUtilities;

public class LoginTest extends BaseTest1 {

//	static WebDriver driver;
//
//	static String url;
//	String username;
//	String password;
//
	@Test
	public static void verifyLogin() throws IOException {
		login();
	}



	//		 LoginPage login=new LoginPage(driver);
//		CommonUtilities common = new CommonUtilities();
//		url=common.getApplicationProperty("url");
//		String un = common.getApplicationProperty("username");
//		String pw = common.getApplicationProperty("password");
//		enterUrl(url);
//		login.loginIntoApplication(un, pw);
//
//	}
//
	@Test
	public static void verifyOpenWindow() {
		login();
		openWindow();

	}

	@Test
	public static void verifyDoubleClick() {
		login();
		doubleClick();

	}

	@Test
	public static void verifyOpenTabs() {
		login();
		openTabs();

	}

	@Test
	public static void verifyToolTip() {
		login();
		toolTip();

	}

	@Test
	public static void verifyAlertPopup() {
		login();
		alertPopup();

	}

	@Test
	public static void verifyAutoComplete() {
		login();
		autoComplete();

	}

	@Test
	public static void verifyTable() {
		login();
		table();

	}

}
