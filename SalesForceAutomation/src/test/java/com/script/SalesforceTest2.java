package com.script;

import org.testng.annotations.Test;

import com.basetest.BaseTest2;

public class SalesforceTest2 extends BaseTest2 {
	@Test
	public void verifyUserMenuDropDown() throws InterruptedException {
		validLogin();
		selectUserMenuDropDown();

	}

	@Test
	public void verifyAccountsTab() {
		validLogin();
		accountsTab();

	}

	@Test
	public void verifyOpportunityLink() {
		validLogin();
		opportunityLink();

	}

	@Test
	public void verifyContactsTab() {
		validLogin();
		contactsTab();

	}

	@Test
	public void verifyMyProfile() throws InterruptedException {
		validLogin();
		userProfileDropDownMyProfile();
		;

	}

}
