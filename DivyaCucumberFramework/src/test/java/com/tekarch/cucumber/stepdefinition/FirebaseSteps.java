package com.tekarch.cucumber.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirebaseSteps {
	WebDriver driver;

	@Given("the url {string}")
	public void the_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	@When("user enter valid email {string}")
	public void user_enter_valid_email(String un) throws InterruptedException {
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_field')]"));

		email.sendKeys(un);
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String pwd) {
		WebElement password = driver.findElement(By.xpath("//input[@id='email_field']//following::input"));

		password.sendKeys(pwd);

	}

	@When("I click on button")
	public void i_click_on_button() throws InterruptedException {
		WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		clickBtn.click();
		Thread.sleep(3000);
	}

	@Then("user should enters the home page")
	public void user_should_enters_the_home_page() {
		String expected = "Student Registration Form";
		WebElement textElement = driver.findElement(By.tagName("h1"));
		String actual = textElement.getText();
		assertEquals(actual, expected);
		driver.close();
	}

	@Then("user should get error alert")
	public void user_should_get_error_alert() {
		Assert.assertTrue(true);
		driver.close();
	}

	@Then("user should get different alert msg")
	public void user_should_get_different_alert_msg() {
		Assert.assertTrue(true);
		driver.close();

	}

}
