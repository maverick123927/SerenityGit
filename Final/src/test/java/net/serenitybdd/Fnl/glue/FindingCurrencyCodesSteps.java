package net.serenitybdd.Fnl.glue;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.Fnl.pagebase.TestBase;
import net.thucydides.core.annotations.Steps;

public class FindingCurrencyCodesSteps extends TestBase {

	public static Response response;
	
	RequestSpecification httpRequest;
	
	@Steps
	StepLibrary lib;
	
	@Given("^Sent endpoint using ([^\\”]*)$")
	public void sentEndPoint(String cuCode) {
		httpRequest = RestAssured.given();
		response= httpRequest.get("/currency/"+cuCode);
	}
	
	@When("^Validation the (\\d+)$")
	public void VerifyStatus(int code) {
		boolean exp= lib.checkStatusCode(response,code);
		Assert.assertEquals(true,exp);
	}
	
	@Then("^valideting the responseBody ([^\\”]*)$")
	public void verifytheCuntryName(String country) {
		JsonPath jsonPathEvaluator= response.jsonPath();
		String countryname= jsonPathEvaluator.get("common");
		Assert.assertEquals(countryname, country);
	}
	
	
}
