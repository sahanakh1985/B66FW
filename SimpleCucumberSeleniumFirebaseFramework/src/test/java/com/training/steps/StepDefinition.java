package com.training.steps;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.training.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	Actions actions;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Before
	public void setUpEachScenario() {
		openBrowser();

	}

	@After
	public void tearDownEachScenario() {
		driver.close();

	}

	@Given("user enter the url")
	public void user_enter_the_url() {
		driver.get("https://selenium-prd.firebaseapp.com/");

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));
		password.sendKeys("admin123");

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginButton.click();

	}

	@Then("user see the homepage")
	public void user_see_the_homepage() {
		String exptTitle = "Selenium";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, exptTitle);
	}

	@When("user mouse-over on {string}")
	public void user_mouse_over_on(String string) {
		actions = new Actions(driver);
		WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));

		wait.until(ExpectedConditions.visibilityOf(switchTo));
		actions.moveToElement(switchTo).perform();

		WebElement intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(intractions));
		actions.moveToElement(intractions).build().perform();

		WebElement switchTo1 = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(switchTo1));
		actions.moveToElement(switchTo1).perform();

		WebElement switchTo2 = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(switchTo2));
		actions.moveToElement(switchTo2).perform();

		WebElement widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(widget));
		actions.moveToElement(widget).perform();

		WebElement widget1 = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(widget1));
		actions.moveToElement(widget1).perform();

	}

	@When("user clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		// wait.until(ExpectedConditions.visibilityOf(window));
		WebElement window = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		window.click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")).click();
		WebElement alertElement = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		alertElement.click();
		driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]")).click();

		WebElement autoComplete = driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
		autoComplete.click();

	}

	@Then("user click on {string} button")
	public void user_click_on_button(String string) {
		WebElement newWindow = driver.findElement(By.xpath("//button[@class='bootbutton']"));
		newWindow.click();

	}

	@Then("user counts the number of {string}")
	public void user_counts_the_number_of(String string) {
		List<WebElement> listOfTab = driver.findElements(By.xpath("//a/div[@class='tab']"));
		int count = listOfTab.size();
		System.out.println(count);

		for (WebElement tab : listOfTab) {
			String text = tab.getText();
			System.out.println(text);

		}
		String xp = "//div[@id='myInputautocomplete-list']/div";
		List<WebElement> countryList = driver.findElements(By.xpath(xp));

		int count1 = countryList.size();
		System.out.println(count1);

		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td"));
		wait.until(ExpectedConditions.visibilityOfAllElements(tableData));
		int count2 = tableData.size();
		System.out.println(count2);
		displayData(tableData);

	}

	public static void displayData(List<WebElement> elementsList) {
		Iterator<WebElement> itr = elementsList.iterator();
		while (itr.hasNext()) {
			WebElement webElement = itr.next();
			System.out.println(webElement.getText());

		}
	}

	@When("user  mouse-over on {string}")
	public void user_mouse_over_on1(String string) {
		WebElement toolTiRigt = driver.findElement(By.className("tooltipr"));
		wait.until(ExpectedConditions.visibilityOf(toolTiRigt));
		actions.moveToElement(toolTiRigt).build().perform();

	}

	@Then("get text of element {string}")
	public void get_text_of_element(String string) {
		WebElement rightText = driver.findElement(By.className("tooltiptextr"));
		String actualText = rightText.getText();
		System.out.println("ActualText=" + actualText);
		String expectedText = "Right";
		System.out.println("ExpectedText=" + expectedText);

		Assert.assertEquals(actualText, expectedText);

	}

	@Then("user switch to {string}")
	public void user_switch_to(String string) {
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Alert alert1 = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("sahana");
		alert1.accept();

	}

	@When("user click on  {string} button")
	public void user_click_on_button1(String string) {
		WebElement table = driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		table.click();

	}

	@When("user enter country name")
	public void user_enter_country_name() {
		WebElement country = driver.findElement(By.xpath("//input[@id='myInput']"));
		country.sendKeys("I");

	}

}
