package api_tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.TestDataReader;

	public class CraterValidateTokenAPI {
	String baseUrl = TestDataReader.getProperty("appUrl") + "/api";
	Response response;
	String token;
	
	@Test
	public void user_login_valid() {
		String endpoint = "/v1/auth/login";
		String body = "{\"username\": \"" + TestDataReader.getProperty("email") + "\",\r\n"
				+ "\"password\": \"" + TestDataReader.getProperty("password") + "\",\r\n"
				+ "\"device_name\":\"mobile_app\"}";
		
		response = RestAssured.given()
				.contentType("application/json")
				.headers("Company", "1").body(body)
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(200);
		token = response.path("token").toString();
	}
	
	@Test(dependsOnMethods = "user_login_valid")
	public void validate_token() {
		String endpoint = "/v1/auth/check";
		
		response = RestAssured.given()
				.header("Authorization", "Bearer " + token)
				.when().get(baseUrl + endpoint);
		response.then().statusCode(200);
		response.prettyPrint();
	}
	
	@Test(dependsOnMethods = "user_login_valid")
	public void validate_token_invalidToken() {
		String endpoint = "/v1/auth/check";
		
		response = RestAssured.given()
				.header("Authorization", "Bearer " + token + "invalid")
				.when().get(baseUrl + endpoint);
		response.then().statusCode(401);
		response.prettyPrint();
	}
	
	@Test(dependsOnMethods = "user_login_valid")
	public void validate_token_invalidEndpoint() {
		String endpoint = "/v1/auth/check";
		
		response = RestAssured.given()
				.header("Authorization", "Bearer " + token)
				.when().get(baseUrl + endpoint + "invalid");
		response.then().statusCode(404);
		response.prettyPrint();
		
	}
	
	

}
