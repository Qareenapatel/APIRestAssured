package RestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeletePet {

	@Test
	public void DeletePet() {
		
		
		
		given().delete("https://petstore.swagger.io/v2/pet/64").
		
		then().statusCode(404);
		
		
	}
	
	
	
}
