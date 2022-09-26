package RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;


public class GetStatus {

	
	@Test
	public static void getAllStatus() {
		given().headers("content-Type","application/json").get("https://petstore.swagger.io/v2/swagger.json").
		then().statusCode(200).body("tags.name[0]", equalTo("pet")).log().all();
		
			
		
		
		
	}
}
