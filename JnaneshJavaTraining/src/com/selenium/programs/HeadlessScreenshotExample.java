package com.selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

public class HeadlessScreenshotExample {

	public static void main(String[] args) {
		// program for taking the screenshot in headless mode
		// Create ChromeOptions and enable headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		// Create a new instance of the ChromeDriver with headless mode enabled
		WebDriver driver = new ChromeDriver(options);

		// Navigate to the desired website
		driver.get("https://www.example.com");

		// Take a screenshot and save it to a file
		try {
			File sourceImageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destinationImageFile = new File("./image/screenshot.png");
			FileUtils.copyFile(sourceImageFile, destinationImageFile);
			System.out.println("Screenshot taken successfully.");
		} catch (Exception e) {
			System.err.println("Error while taking screenshot: " + e.getMessage());
		} finally {
			// Close the WebDriver
			driver.quit();
		}
	}
}