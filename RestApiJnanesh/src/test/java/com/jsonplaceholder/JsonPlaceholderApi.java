package com.jsonplaceholder;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonPlaceholderApi {

	String sHostUrl = "https://jsonplaceholder.typicode.com";
	String sEPUser = "/users";
	String sURI = "";

	@Test
	public void getUsers() throws IOException {

		// String filePath = System.getProperty("user.dir") + File.separator +
		// "jsonTestData" + File.separator
		// + "JsonInput.json";
		String filePath = System.getProperty("user.dir") + "./jsonTestData/JsonInput.json";
		String fileReadyToRead = readfileReturnString(filePath);
		Object expectedName = JsonPath.read(fileReadyToRead, "$[2].address.city");
		// "$.[0].name"

		sURI = sHostUrl + sEPUser;
		RestAssured.baseURI = sURI;
		Response response = RestAssured.given().when().contentType(ContentType.JSON).get();
		Object actualName = response.jsonPath().get("address[2].city");
		System.out.println("ExpectedName:" + expectedName);
		System.out.println("ActualName:" + actualName);

		System.out.println("Status code:" + response.getStatusCode());
		// System.out.println(response.asPrettyString());

	}

	private static String readfileReturnString(String filePath) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(filePath));
		return new String(encoded, StandardCharsets.UTF_8);
	}

}
