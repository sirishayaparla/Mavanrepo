package jira;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.Scanner;

public class jira {
	public static void main(String[] args) {
		SessionFilter session= new SessionFilter();
		System.out.println("Create issues");
		RestAssured.baseURI="http://localhost:8080";
		// loging perpose
	String log=	given().header("Content-Type","application/json")
		.body(palyload.login()).filter(session).log().all(). when()
		.post("/rest/auth/1/session").then().extract().response().asString();
	System.out.println(log);
	
		// creating issue
		//ring response =given().log().all().header("Content-Type","application/json")
	//body(palyload.createissues()).filter(session).when().post("/rest/api/2/issue").then().log().all().assertThat()
	//statusCode(201).extract().response().asString();
	//ystem.out.println(response);
		
	  //adding comments
     String addcomment=given().log().all().pathParam("id","10206")
	.header("Content-Type","application/json").body(palyload.addcomment())
		.filter(session).when().post("rest/api/2/issue/{id}/comment").then().log().all().
	assertThat().statusCode(201).extract().response().asString();
     System.out.println(addcomment);
     JsonPath js= new JsonPath(addcomment);
     String comment_Id= js.getString("id");
     
	
/*	//updating the comments
      given().log().all().pathParam("key","10206").pathParam("id", "10201")
    .header("Content-Type","application/json").
	body(palyload.updatecomments()).filter(session).when().
	put("/rest/api/2/issue/{key}/comment/{id}").then().log().all().assertThat().statusCode(200).extract().response().asString(); */
	
		//geting issue
String recivecomments=given().log().all().pathParam("key", "10206").queryParam("fields", "comment").
	filter(session).when().get("/rest/api/2/issue/{key}").
	then().log().all().statusCode(200).extract().response().asString(); 
	JsonPath filed= new JsonPath(recivecomments);
	int filedsize=filed.get("fields.comment.comments.size()");
	System.out.println(filedsize);
	for(int  i=0;i<filedsize;i++) {
	//	int fieldcount=filed.getInt("fields.comment.comments"+[i]+")
	}
	
	//add attachment
	//given().log().all().filter(session).header("X-Atlassian-Token","no-check").header("Content-Type","multipart/form-data")
	//.pathParam("key","10206").multiPart("file",new File("jira.txt")).when().
	//post("/rest/api/2/issue/{key}/attachments").then().log().all().assertThat()
	//.statusCode(200).extract().response().asString();
	
	
	}

}
