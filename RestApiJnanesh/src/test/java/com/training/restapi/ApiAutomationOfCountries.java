package com.training.restapi;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiAutomationOfCountries {
	String sHostUrl = "https://restcountries.com/v3.1/";
	String sEndPoint = "all";
	String sURI = " ";

	@Test
	public void getCountries() {
		sURI = sHostUrl + sEndPoint;

		RestAssured.baseURI = sHostUrl + sEndPoint;
		Response response = RestAssured.given().when().get();
		// System.out.println(response.asString());
		// System.out.println(response.statusCode());
		response.prettyPrint();
		List<Object> countryName = response.jsonPath().getList("name.common");
		System.out.println(countryName);

	}

}
