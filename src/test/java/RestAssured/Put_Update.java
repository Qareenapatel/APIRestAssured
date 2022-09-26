package RestAssured;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class Put_Update {

	@Test
	public void UpdatePet() {
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "store");
		map.put("description", "It is my pet");
		
		System.out.println(map);

		Gson gson = new Gson();
		String requestdata = gson.toJson(map);
		System.out.println(requestdata);
		
	
		given().body(requestdata).put("https://petstore.swagger.io/v2/pet").
		
		then().statusCode(200);
		
		
	}
	
	
	
}
