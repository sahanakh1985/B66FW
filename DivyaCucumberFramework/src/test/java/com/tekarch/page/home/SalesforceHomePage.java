package com.tekarch.page.home;

import org.openqa.selenium.WebDriver;

import com.tekarch.page.base.BasePage;

public class SalesforceHomePage extends BasePage{

	public SalesforceHomePage(WebDriver driver) {
		super(driver);
	
	}
	BasePage bp=new BasePage(driver);
	public void verifyUrl() {
		bp.getCurrentUrl();
	}
	
	

}
