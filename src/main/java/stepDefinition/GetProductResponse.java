package stepDefinition;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class GetProductResponse {

	
	@Given("^User hits the request with a given REST API end point$")
	public void Service_is_running() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
//	    throw new PendingException();
	}

	@Then("^Print the response Returned$")
	public void User_get_the_ok_response() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		 
		//print response body
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
//	    throw new PendingException();
	}

	
	@Then("^validate the respone code$")
	public void validate_respone_code() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		 
		//print status code and validate the respone
		int  statuscode = response.getStatusCode();
		System.out.println("Response Body is =>  " + statuscode);
		Assert.assertEquals(statuscode /*actual value*/, 200 /*expected value*/);
//	    throw new PendingException();
	}
	
	
	@Then("^validate Status code for invalid state$")
	public void validate_invalid_respone_code() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/erer");
		 
		//print status code and validate the respone
		int  statuscode = response.getStatusCode();
		
		System.out.println("Response Body is =>  " + statuscode);
		Assert.assertEquals(statuscode /*actual value*/, 400 /*expected value*/);
//	    throw new PendingException();
	}
	
	@Then("^get Post response \\\"([^\\\"]*)\\\" and type \\\"([^\\\"]*)\\\"$")
	public static void  Post(String Uri,String Json)
	{
		RequestSpecification requestspec=RestAssured.given().body(Json) ;
		
		requestspec.contentType(ContentType.JSON);
		Response responjson=requestspec.post("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
		System.out.println(responjson);
	}
	
	
}
