package com.sophossolutions.www.stepdefinitionsapi;

import static com.sophossolutions.www.utilities.Constants.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class StepDefinitionsRestCountries {

	@Before
	public void setUp() {

		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Semillero");

	}

	@Given("^El (\\d+) de una BD$")
	public void callingCode(int code) {
		theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
		theActorInTheSpotlight().attemptsTo(com.sophossolutions.www.task.Consult.consultar(String.valueOf(code)));
	}

	@Then("^Valido \"([^\"]*)\"$")
	public void valido(String capital) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("capital[0]", equalTo(capital))));

	}

	@Then("^Valido (\\d+)$")
	public void valido(int callingCode) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(404)));

	}

}
