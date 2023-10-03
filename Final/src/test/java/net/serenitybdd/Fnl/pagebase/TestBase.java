package net.serenitybdd.Fnl.pagebase;

import io.restassured.RestAssured;

public class TestBase {

	public static void init() {
		RestAssured.baseURI="https://restcountries.com/v3.1";
	}
}
