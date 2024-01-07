package tekarch.com;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;

public class TekarchApiTest {
	String str;
	String token;

	@Test
	public void validateLogin() {
		str = given().contentType(ContentType.JSON)
				.body("	getdata	getdata	getdata	\r\n" + "19 requests\r\n" + "1.9 kB transferred\r\n"
						+ "{username: \"sahanakh1985@gmail.com\", password: \"Tekarch@123\"}")
				.when().post("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login\r\n").then()
				.statusCode(201).extract().response().prettyPrint();
		JsonPath path = new JsonPath(str);
		token = path.getString(str);
		System.out.println(token);
		String id = path.getString("id");
		System.out.println(id);

	}

	public void getData() {
		HashMap<String, String> headData = new HashMap<String, String>();
		headData.put("Token", token);

		given().contentType(ContentType.JSON).headers(headData).when()
				.get("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata").then().statusCode(200)
				.extract().response().prettyPrint();

	}

	public void addData() {
		HashMap<String, String> headData = new HashMap<String, String>();
		headData.put("Token", token);
		TekarchPojo tk = new TekarchPojo("TA-1109765", 4, 70000, 123456);
		given().contentType(ContentType.JSON).headers(headData).body(tk).when()
				.post("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/addData").then().statusCode(201)
				.extract().response().prettyPrint();

		given().contentType(ContentType.JSON).headers(headData).when()
				.get("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata").then().statusCode(200)
				.extract().response().prettyPrint();

	}

	public void updateData() {
		HashMap<String, String> headData = new HashMap<String, String>();
		headData.put("Token", token);
		TekarchPojo tk = new TekarchPojo("TA-1109765", 4, 80000, 123456);
		given().contentType(ContentType.JSON).headers(headData).body(tk).when()
				.put("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/updateData").then().statusCode(201)
				.extract().response().prettyPrint();

		given().contentType(ContentType.JSON).headers(headData).when()
				.get("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata").then().statusCode(200)
				.extract().response().prettyPrint();

	}

	public void deleteData() {

		HashMap<String, String> headData = new HashMap<String, String>();
		headData.put("Token", token);
		TekarchPojo tk = new TekarchPojo("TA-1109765", 4, 80000, 123456);
		given().contentType(ContentType.JSON).headers(headData).body(tk).when()
				.delete("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/deleteData").then()
				.statusCode(201).extract().response().prettyPrint();
		JsonPath path = new JsonPath(str);
		String id = path.getString("id");
		System.out.println(id);
		String userid = path.getString("userid");
		System.out.println(userid);

		given().contentType(ContentType.JSON).headers(headData).pathParameters("id", id, "userid", userid).when()
				.get("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata/{id}/{userid}").then()
				.statusCode(200).extract().response().prettyPrint();

	}

}
