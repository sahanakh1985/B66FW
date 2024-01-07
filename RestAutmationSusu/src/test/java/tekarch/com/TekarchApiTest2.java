package tekarch.com;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TekarchApiTest2 {
	String sHostUrl = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	String sEPLogin = "/login";
	String sURI = "";
	String sToken;
	String sEPGetData;

	@Test
	public void validateLogin() {
		sURI = sHostUrl + sEPLogin;
		RestAssured.baseURI = sURI;
		/*
		 * Response response = RestAssured.given().body( "{\r\n" +
		 * "	  \"username\": \"sahankh1985@gmail.com\",\r\n" +
		 * "   \"password\": \"Tekarch@123\"r\n" + "}")
		 * .when().contentType("application/json").post();
		 * System.out.println(response.getStatusCode()); /*
		 */
		TekarchLoginPojo tLogin = new TekarchLoginPojo("sahanakh1985@gmail.com", "Tekarch@123");
		Response response = RestAssured.given().body(tLogin).when().contentType("application/json").post();
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		response.prettyPrint();

		sToken = response.jsonPath().get("token[0]");
		System.out.println(sToken);

		sURI = sHostUrl + sEPGetData;
		RestAssured.baseURI = sURI;
		HashMap<String, String> headData = new HashMap<String, String>();
		headData.put("token", sToken);
		response = RestAssured.given().when().get();
		List<String> listId = response.jsonPath().getList("id");
		System.out.println(listId.size());

		for (String s : listId) {
			if (s.equals(" ")) {
				System.out.println("Id is present" + s);

			}

		}

	}

}
