package com.files;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteWebElementToExcel {
	public static void main(String[] args) throws InterruptedException {
	//	String path="D:/WebTableElement.xlsx";
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		Thread.sleep(5);
		 List<WebElement> webTbElms = driver.findElements(By.id("leftcontainer"));

		int count = webTbElms.size();
		System.out.println(count);

		for (WebElement webElm : webTbElms) {
			String text = webElm.getText();
			System.out.println(text);

		}

		
	}

}
