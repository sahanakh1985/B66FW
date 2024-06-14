package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDOMExample {

	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
	//	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Create ChromeOptions to enable experimental Web Platform features
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--enable-experimental-web-platform-features");

		// Initialize the WebDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options);

		// Navigate to a sample page with Shadow DOM
		driver.get("https://example.com"); // Replace with your URL

		// Find the shadow host element
		WebElement shadowHost = driver.findElement(By.tagName("your-shadow-host-tag"));
		// Replace with your actual tag name

		// Use JavaScript to access the shadow DOM
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement shadowRoot = (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);

		// Find an element inside the shadow DOM
		WebElement elementInsideShadowDOM = shadowRoot.findElement(By.cssSelector("your-shadow-dom-element-selector"));
		// Replace with your actual css Selector

		// Perform actions on the element inside the shadow DOM
		elementInsideShadowDOM.click();

		// Close the browser
		driver.quit();
	}
}