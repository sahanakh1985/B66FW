package com.training.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public static void verifyLogin() throws IOException {
		login();
	}

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
