package com.training.restapi;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiAutomationPlaceHolder {

	String sHostUrl = "https://jsonplaceholder.typicode.com";
	String sEPUser = "/users";
	String sURI;
	String sToken;
	String sEPGetData;

	@Test
	public void validateUser() {
		sURI = sHostUrl + sEPUser;
		RestAssured.baseURI = sURI;
		Response response = RestAssured.given().when().get();
		System.out.println(response.asString());
		// System.out.println(response.asPrettyString());
		// response.prettyPrint();

		System.out.println(response.getStatusCode());
		Object cityName = response.jsonPath().get("address[2].city");
		System.out.println(cityName);
		Object address = response.jsonPath().get("[1].address");
		System.out.println(address);
		List<Object> addressList = response.jsonPath().getList("address");
		System.out.print(addressList);
	}

}
