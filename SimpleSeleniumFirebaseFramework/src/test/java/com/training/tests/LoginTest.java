package com.training.tests;

import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;

public class LoginTest extends BaseTest {



	@Test
	public void verifyLogin() {
		
		login();

	}

}
