package com.training.selenium_basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class TableData {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		displayData(tableElements);

	}

	public static void displayData(List<WebElement> elementList) {
		Iterator<WebElement> itr = elementList.iterator();
		while (itr.hasNext()) {
			WebElement webElement = itr.next();
			System.out.println(webElement.getText());

		}
	}
}
