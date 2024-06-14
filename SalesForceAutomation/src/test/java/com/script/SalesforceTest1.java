package com.script;

import org.testng.annotations.Test;

import com.basetest.BaseTest1;

public class SalesforceTest1 extends BaseTest1 {
	@Test
	public void verifyHomeTab() throws InterruptedException {
		validLogin();
		homeTab();

	}

	@Test
	public void verifyTabCustomization() throws InterruptedException {
		validLogin();
		tabCustomization();
		salesforceLogout();

	}

	@Test
	public void verifyCalenderHandling() throws InterruptedException {
		validLogin();
		calenderHandling();

	}

}
