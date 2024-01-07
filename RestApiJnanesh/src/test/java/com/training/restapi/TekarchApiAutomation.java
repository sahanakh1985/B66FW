package com.training.restapi;

import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TekarchApiAutomation {
	String sHostUrl = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	String sEPLogin = "/login";
	String sURI = "";
	String sToken;
	// String sEPGetData;

	@Test
	public void validateLogin() {
		sURI = sHostUrl + sEPLogin;
		RestAssured.baseURI = sURI;

		Response response = RestAssured.given().body("{\r\n" + "	  \"username\": \"sahankh1985@gmail.com\",\r\n"
				+ "   \"password\": \"Tekarch@123\"r\n" + "}").when().contentType("application/json").post();
		/*
		 * 
		 * /*TekarchLoginPojo tLogin = new TekarchLoginPojo("sahanakh1985@gmail.com",
		 * "Tekarch@123"); Response response =
		 * RestAssured.given().contentType("application/json").body(tLogin).when().post(
		 * );
		 */
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		response.prettyPrint();

		sToken = response.jsonPath().get("token[0]");
		System.out.println(sToken);

		/*
		 * sURI = sHostUrl + sEPGetData; RestAssured.baseURI = sURI; HashMap<String,
		 * String> headData = new HashMap<String, String>(); headData.put("token",
		 * sToken); response = RestAssured.given().when().get(); List<String> listId =
		 * response.jsonPath().getList("id"); System.out.println(listId.size());
		 * 
		 * for (String s : listId) { if (s.equals(" ")) {
		 * System.out.println("Id is present" + s);
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
