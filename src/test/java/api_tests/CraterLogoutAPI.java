package api_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.TestDataReader;

public class CraterLogoutAPI {
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
	public void logout_valid() {
		String endpoint = "/v1/auth/logout";
		
		response = RestAssured.given()
				.header("Content-type", "application/json")
				.header("Accept", "application/json")
				.header("company", "1")
				.header("Authorization", "Bearer " + token)
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(200).contentType("application/json");
		response.prettyPrint();
		Assert.assertTrue(response.path("success"));
	}
	
	@Test(dependsOnMethods = "user_login_valid")
	public void logout_invalid_auth() {
		String endpoint = "/v1/auth/logout";
		
		response = RestAssured.given()
				.header("Content-type", "application/json")
				.header("Accept", "application/json")
				.header("company", "1")
				.header("Authorization", "Bearer " + token + "invalid")
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(401).contentType("application/json");
		response.prettyPrint();
		Assert.assertTrue(response.path("message").toString().equals("Unauthenticated."));
		
	}
	
	@Test(dependsOnMethods = "user_login_valid")
	public void logout_invalid_endpoint() {
		String endpoint = "/v1/auth/logoutInvalid";
		
		response = RestAssured.given()
				.header("Content-type", "application/json")
				.header("Accept", "application/json")
				.header("company", "1")
				.header("Authorization", "Bearer " + token + "invalid")
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(404).contentType("application/json");
		response.prettyPrint();
		
		
	
	}

}
