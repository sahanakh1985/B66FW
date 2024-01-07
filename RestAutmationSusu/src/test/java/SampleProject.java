import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import com.jayway.restassured.path.json.JsonPath;

public class SampleProject {
	@Test
	public void sampleMethod() {
		given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200).extract().response()
				.prettyPrint();
	}

}
