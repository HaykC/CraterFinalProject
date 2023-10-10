package api_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.TestDataReader;

public class CraterLoginAPI {
	String baseUrl = TestDataReader.getProperty("appUrl") + "/api";
	Response response;
	String type = "Bearer";
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
		response.prettyPrint();
		
		Assert.assertEquals(response.path("type").toString(), type);
		Assert.assertNotEquals(response.path("token"), 1);
		token = response.path("token").toString();
		System.out.println(token);
	}
	
	@Test
	public void invalid_endpoint() {
		String endpoint = "v1/auth/loginIncorrectEndpoint";
		String body = "{\"username\": \"" + TestDataReader.getProperty("email") + "\",\r\n"
				+ "\"password\": \"" + TestDataReader.getProperty("password") + "\",\r\n"
				+ "\"device_name\":\"mobile_app\"}";
		
		response = RestAssured.given()
				.contentType("application/json")
				.headers("Company", "1").body(body)
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(404);
		response.prettyPrint();	
		
	}
	
	@Test
	public void invalid_body() {
		String endpoint = "/v1/auth/login";
		String body = "{\"username\": \"" + TestDataReader.getProperty("email") + "\",\r\n"
				+ "\"password\": \"" + TestDataReader.getProperty("password") + "\",\r\n"
				+ "\"device_name\":\"mobile_app\"}"
				+ "alsdhblasi";
		
		response = RestAssured.given()
				.contentType("application/json")
				.headers("Company", "1").body(body)
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(422);
		response.prettyPrint();

	}
	
	@Test
	public void invalid_credentials() {
		String endpoint = "/v1/auth/login";
		String body = "{\"username\": \"" + TestDataReader.getProperty("email") + "some random text" + "\",\r\n"
				+ "\"password\": \"" + TestDataReader.getProperty("password")  + "some random text" + "\",\r\n"
				+ "\"device_name\":\"mobile_app\"}";
		
		response = RestAssured.given()
				.contentType("application/json")
				.headers("Company", "1").body(body)
				.when().post(baseUrl + endpoint);
		
		response.then().statusCode(405);
		response.prettyPrint();
		
	}

}	
	
