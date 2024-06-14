package com.tekarch.cucumber.stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionStepDefinition {

	int A, B, C, res;

	@Given("the values for A and B")
	public void the_values_for_a_and_b() {
		System.out.println("Inside 'Given' initialise A and B");
		A = 10;
		B = 20;
	}

	@When("I add A and B")
	public void i_add_a_and_b() {
		System.out.println("Inside 'When' perform addition of A and B");
		res = A + B;

	}

	@Then("results should be sum of two numbers")
	public void results_should_be_sum_of_two_numbers() {
		System.out.println("Inside 'Then' doing validation");
		Assert.assertEquals(res, 30);
	}

	@Given("the values for A,B and C")
	public void the_values_for_a_b_and_c() {
		A = 11;
		B = 22;
		C = 33;

	}

	@When("I add A,B and C")
	public void i_add_a_b_and_c() {
		res = A + B + C;
	}

	@Then("results should be sum of three numbers")
	public void results_should_be_sum_of_three_numbers() {
		System.out.println("inside then method validation");
		Assert.assertEquals(res, 66);

	}

	@Given("the values for int  A,B and  String valueC")
	public void the_values_for_int_a_b_and_string_value_c() {
		A = 33;
		B = 76;
		// C="32";
	}

	@Then("results should be error")
	public void results_should_be_error() {
		System.out.println("Assertion failed");
		Assert.assertTrue(true);
	}

}
