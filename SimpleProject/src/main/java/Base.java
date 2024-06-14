import java.util.Set;

import javax.lang.model.element.Element;
import javax.management.ObjectName;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	static WebDriver driver = new ChromeDriver();

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("browser is opened");
	}

	public static void enterIntoTextBox(WebElement element, String data, String objectName) {
		if (element.isDisplayed()) {
			clearElement(element, objectName);
			element.sendKeys(data);
			System.out.println(objectName + " data is entered");
		} else {
			System.out.println(objectName + "  is not displayed");
		}

	}

	protected static void clearElement(WebElement givenWebElement, String objectName) {
		if (givenWebElement.isDisplayed()) {
			givenWebElement.clear();
			System.out.println(objectName + " is cleared");
		} else {
			System.out.println(objectName + " is not displayed");
		}

	}

	public static void clickOnCheckbox(WebElement givenWebElement, String objectName) throws InterruptedException {
		if (givenWebElement.isDisplayed()) {
			clearElement(givenWebElement, objectName);
			Thread.sleep(3000);
			givenWebElement.click();
			System.out.println(objectName + " is clicked");
		} else {
			System.out.println(objectName + " element is not displayed");
		}

	}

	public static void click(WebElement element, String objectName) {

		if (element.isEnabled() || element.isDisplayed()) {
			element.click();
			System.out.println(objectName + "  is clicked");
		} else {
			System.out.println(objectName + "  is not enabled");
		}

	}

	public static void selectElementByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectElementByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectElementByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void moveAndClickActionOnElement(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

	public static void switchToWindowOpened(String mainWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!mainWindowHandle.equalsIgnoreCase(handle)) {
				driver.switchTo().window(handle);
			}
		}

		System.out.println(" switch to new Window");
	}

	protected static void logout() throws Exception {
		WebElement userNavBtn = driver.findElement(By.xpath("//div[@id='userNavButton']"));

		click(userNavBtn, "userNavButton");

		WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));

		click(logoutBtn, "logoutBtn");
		Thread.sleep(2000);

	}

	public static void scrollWebPage() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

			j.executeScript("window.scrollBy(0,500)");
		}
	}

	protected static String getTextFromElement(WebElement element, String data) {
		data = element.getText();

		return data;
	}

	public static void switchToFrameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchToFrameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToFrameId(String id) {
		driver.switchTo().frame(id);
	}

	protected static void switchToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();

	}

	protected static Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	protected static Alert acceptAlert(Alert alert) {
		alert.accept();
		return alert;

	}

	protected static String getAlertString(Alert alert) {
		String text = alert.getText();
		System.out.println(text);
		return text;

	}

	public static void closeBrowser() throws Exception {

		driver.close();
		System.out.println("browser closed");
	}

}
