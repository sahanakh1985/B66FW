package com.testng.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	static WebDriver driver;
	static Actions actions;
	static WebDriverWait wait;

	static CommonUtilities common = new CommonUtilities();

	protected static WebDriver getDriver(String browserName) {
		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			if (browserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		return driver;

	}

	public static void launchApp() throws IOException {
//		String browser = common.getApplicationProperty("browserName");
//		driver = getDriver(browser);
//		String url = common.getApplicationProperty("url");

		driver.get("https://selenium-prd.firebaseapp.com");

	}

	public static WebDriver login() throws IOException {
//		driver = new ChromeDriver();
//		driver.get("https://selenium-prd.firebaseapp.com");
		launchApp();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
		return driver;

	}

	protected void takesScreenShot(WebDriver driver) {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);

		Date currentDate = new Date();
		String timeStamp = new SimpleDateFormat("yy-mm-dd HH-mm-ss").format(currentDate);
		String fileSeparator = System.getProperty(File.separator);
		String reportFilePath = System.getenv("user.dir") + fileSeparator + "ScreenShot";
		String reportFileName = "ScreenShot" + timeStamp + ".png";
		String filePath = reportFilePath + fileSeparator + reportFileName;

		File dstFile = new File(filePath);
		try {
			FileUtils.copyFile(srcFile, dstFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
