package com.selenium.programs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/Table.html.html");
		List<WebElement> listOfRows = driver.findElements(By.xpath("//table/tbody/tr"));
		int count = listOfRows.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement row = listOfRows.get(i);
			if (row.findElement(By.tagName("th")).getText().equalsIgnoreCase("Financial Center")) {
				List<WebElement> colos = row.findElements(By.tagName("td"));
				for (int j = 0; j < colos.size(); j++) {
					if (colos.get(j).getText().equalsIgnoreCase("details")) {
						colos.get(j).click();

					}

				}

			}

		}
	}

}
