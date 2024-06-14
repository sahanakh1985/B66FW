import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Test extends Base {

	static WebDriver driver = new ChromeDriver();

	public static void login() throws InterruptedException {

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Thread.sleep(3000);
		WebElement unTb = driver.findElement(By.id("username"));
		WebElement pwTb = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("Login"));
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		enterIntoTextBox(unTb, "Sahana@tek.com", "unTb");
		enterIntoTextBox(pwTb, "Siri@123", "pwTb");
		// clickOnCheckbox(checkBox, "RadioBtn");
		Thread.sleep(1000);
		click(loginBtn, "loginBtn");

	}

	public static void userMenuDrpDownMyProfile() throws Exception {

		login();

		WebElement UserMenuBtn = driver.findElement(By.xpath("//span[text()='Sahana kh']"));
		click(UserMenuBtn, "userMenuBtn");

		WebElement myProfile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		click(myProfile, "MyProfile");
		WebElement editIcon = driver.findElement(By.xpath("(//img[@title='Edit Profile' and @alt='Edit Profile' ])"));
		editIcon.click();

//		Thread.sleep(1000);
//		WebElement AboutTabElement = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]|//a[contains(text(),'About']"));
//		click(AboutTabElement, "AboutTab");
//		driver.switchTo().frame(AboutTabElement);
////		WebElement aboutTab = driver.findElement(By.xpath("//a[contains(text(),'About']"));
////		clickOnElement(aboutTab);
		WebElement saveAllElement = driver
				.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"));
		click(saveAllElement, "Sava button");

	}

	public static void userMenuDropDownMySettings() throws Exception {

		login();

		WebElement UserMenuBtn = driver.findElement(By.xpath("//span[text()='Sahana kh']"));
		click(UserMenuBtn, "userMenuBtn");

		WebElement mySetings = driver.findElement(By.xpath("//a[text()='My Settings']"));
		click(mySetings, "MySettings");
		WebElement personal = driver.findElement(By.xpath("//span[text()='Personal']"));
		click(personal, "personal");
		WebElement loginHistory = driver.findElement(By.id("LoginHistory_font"));
		click(loginHistory, "loginHistory");
		WebElement displayAndLayoutFont = driver.findElement(By.id("DisplayAndLayout_font"));
		click(displayAndLayoutFont, "displayAndLayoutFont");
		WebElement customizeTabFonts = driver.findElement(By.id("CustomizeTabs_font"));
		click(customizeTabFonts, "customizeTabFont");
		WebElement customAppdropDown = driver.findElement(By.id("p4"));
		selectElementByVisibleText(customAppdropDown, "Salesforce Chatter");
//		WebElement availableTabs = driver.findElement(By.id("duel_select_0"));
//		scrollWebPage();
//		selectElementByValue(availableTabs, "reports");
		WebElement rightArrowIcon = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		click(rightArrowIcon, "rightArrowIcon");
		WebElement emaiLink = driver.findElement(By.id("EmailSetup_font"));
		click(emaiLink, "emailLink");
		WebElement emailSettingsFont = driver.findElement(By.id("EmailSettings_font"));
		click(emailSettingsFont, "emailSettingsFont");
		WebElement emailName = driver.findElement(By.id("sender_name"));
		enterIntoTextBox(emailName, "Sahana KH", "emailNameTb");

		WebElement emailAddress = driver.findElement(By.id("sender_email"));
		enterIntoTextBox(emailAddress, "sahanakh1985@gmail.com", "emailAddressTb");
		WebElement radioButton = driver.findElement(By.id("auto_bcc1"));
		click(radioButton, "radioBtn");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

			j.executeScript("window.scrollBy(0,500)");
		}
		Thread.sleep(3000);
		WebElement save = driver.findElement(By.cssSelector("input[title='Save']"));
		click(save, "Save button");

		WebElement calenderAndReminderElement = driver.findElement(By.id("CalendarAndReminders_font"));
		click(calenderAndReminderElement, "calenderElement");
		WebElement activityRemainders = driver.findElement(By.id("Reminders_font"));
		click(activityRemainders, "activity remainders");
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

			j1.executeScript("window.scrollBy(0,500)");
		}
		WebElement testBtn = driver.findElement(By.id("testbtn"));
		click(testBtn, "testBtn");

		closeBrowser();

	}

	public static Object[] userMenuDropDown() {

		Object[] userDropDownData = new Object[5];
		userDropDownData[0] = ("My Profile");
		userDropDownData[1] = ("My Settings");
		userDropDownData[2] = ("Developer Console");
		userDropDownData[3] = ("Switch to Lightning Experience");
		userDropDownData[4] = ("Logout");

		return userDropDownData;
	}

	public static void userMenuDeveloperConsole() throws InterruptedException {
		login();

		WebElement UserMenuBtn = driver.findElement(By.xpath("//span[text()='Sahana kh']"));
		click(UserMenuBtn, "userMenuBtn");

		WebElement developerConsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		click(developerConsole, "developerConsole");

		String parentWindow = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		whs.remove(parentWindow);
		for (String wh : whs) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println("The title of child window :" + title);
			driver.close();
			System.out.println("child window is closed");

		}

	}

	protected static void logout() throws Exception {
		login();
		WebElement userNavBtn = driver.findElement(By.xpath("//div[@id='userNavButton']"));

		click(userNavBtn, "userNavBtn");

		WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));

		click(logoutBtn, "logoutBtn");
		Thread.sleep(2000);

		closeBrowser();

	}

	public static void createAccount() throws InterruptedException {
		System.out.println(
				"************* Test case TC10 (Create an Account) automation Script started **********************");
		login();
		WebElement AccountLinkElement = driver.findElement(By.xpath("//1i[@id='Account_Tab']"));
		moveAndClickActionOnElement(AccountLinkElement);

		//switchToFrameWebElement(AccountLinkElement);

		// waitUntilPresenceofElementLocatedBy(By.xpath("//h1[contains(text(),'Accounts')]"),
		// "header");

		WebElement accountTab = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		switchToFrameWebElement(accountTab);
		click(accountTab, "Accoun tab element");

		WebElement newAccountElement = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		click(newAccountElement, "new account element");
	}

//		String expectedNewAccountHeader = "Account Edit";
//		WebElement accountNewLink = driver.findElement(By.xpath("//h2[contains(text(),'Account Edit')]"));
//		
//		String actualNewAccountHeader = getTextFromElement(accountNewLink, "account Header Text");
//
//		WebElement accountNameElement = driver.findElement(By.id("acc2"));
//		
//		enterIntoTextBox(accountNameElement, "Nans", "username textbox");
//
//		WebElement accountTypeElement = driver.findElement(By.xpath("//select[@id='acc6']"));
//		selectElementByValue(accountTypeElement, actualNewAccountHeader);
//		
//		
//		WebElement customerPriority = driver.findElement(By.xpath("//select[@id='00NHr00000IHF9D']"));
//
//	
//
//		selectElementByValue(customerPriority, actualNewAccountHeader);
//	}
//
//	private static void moveandClickAction(WebElement accountLinkElement, String string) {
//		// TODO Auto-generated method stub
//		
//	}

	private static String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
