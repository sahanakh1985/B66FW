package com.selenium.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesHtml {
	public static WebDriver driver;
	static String burj = "//table/tbody/tr[th[.='Burj Khalifa']]/td/a[.='details']";
	static String clock = "//table/tbody/tr[th[.='Clock Tower Hotel']]/td/a[.='details']";
	static String taipei = "//table/tbody/tr[th[.='Taipei 101']]/td/a[.='details']";
	static String financial = "//table/tbody/tr[th[.='Financial Center']]/td/a[.='details']";

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("file:///C:/Users/dell/Downloads/Table.html.html");
		clickOnRowData(burj);
		driver.navigate().back();
		clickOnRowData(clock);
		driver.navigate().back();
		clickOnRowData(taipei);
		driver.navigate().back();
		clickOnRowData(financial);
	}

	public static void clickOnRowData(String name) {

		driver.findElement(By.xpath(name)).click();

	}

}
