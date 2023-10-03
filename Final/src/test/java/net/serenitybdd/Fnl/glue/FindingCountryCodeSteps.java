package net.serenitybdd.Fnl.glue;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.Fnl.pagebase.TestBase;

public class FindingCountryCodeSteps extends TestBase{

	public static Response response;
	
	RequestSpecification httpRequest;
	
	@Steps
	StepLibrary lib;
	
	
	@Given("^Find country using ([^\\”]*)$")
	public void accessUrl(String code) {
		httpRequest = RestAssured.given();
		response = httpRequest.get("/alpha/"+code);	
	}
	
	@When("^Validation the (\\d+)$")
	public void Verifythestaus(int code) {
		boolean exp= lib.checkStatusCode(response,code);
		Assert.assertEquals(true,exp);
	}
	
	@Then("^valideting the responseBody ([^\\”]*)$")
	public void VerifyCountry(String country) {
		JsonPath jsonPathEvaluator = response.jsonPath();
		String countryname= jsonPathEvaluator.get("common");
		Assert.assertEquals(countryname, country);
	}
	
}
