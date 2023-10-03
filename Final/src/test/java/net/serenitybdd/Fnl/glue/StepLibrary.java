package net.serenitybdd.Fnl.glue;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class StepLibrary {

	@Step
	public boolean checkStatusCode(Response res,int code) {
		int acode= res.getStatusCode();
		if(acode==code) {
			return true;
		}
		else {
			return false;
		}
	}
}
