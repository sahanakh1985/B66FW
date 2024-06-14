package com.selenium.programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
