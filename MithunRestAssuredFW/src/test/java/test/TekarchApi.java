package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TekarchApi {
	@Test
	public void validateLogin() {
		RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login";
		Response res = RestAssured.given().headers("Contene-Type", "application/json").when()
				.body("{\"username\": \"sahankh1985@gmail.com\",\"password\": \"Tekarch@123\"}").post();
		System.out.println(res.asPrettyString());

	}

}
