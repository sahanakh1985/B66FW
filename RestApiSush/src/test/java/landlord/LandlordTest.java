package landlord;

import org.testng.annotations.Test;

public class LandlordTest {
	@Test
	public void getLandlord() {
		given()
		.when().get()
		.then().statuscode(200)
		.body(" ",isEmpty())
		.extract().response().prettyPrint();
		
	}

}
