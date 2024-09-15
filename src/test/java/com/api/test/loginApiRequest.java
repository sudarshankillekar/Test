package com.api.test;

import com.api.pojo.LoginPojo;

import com.qa.util.TestUtility;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginApiRequest {

	public static void main(String[] args) {
		
//	RestAssured.baseURI = "http://139.59.91.96:9000/v1";
	Header Myheader = new Header("Content-Type", "application/json");
	LoginPojo loginPojo = new LoginPojo("iamfd", "password");
	String jsonBody = TestUtility.convertPOJOToJSON(loginPojo);
	
	RequestSpecification request  = RestAssured.given();
	request.header(Myheader);
	request.body(jsonBody);
	Response response = request.post("/login");
	System.out.println(response.asPrettyString()); 
	System.out.println(response.getStatusCode());
	System.out.println(response.time());
	     
		
	}
	
}
