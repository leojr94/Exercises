package co.com.dafiti.www.stepdefinitionscountries;

import static co.com.dafiti.www.utilities.Constantes.BASE_URL2;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import co.com.dafiti.www.task.Consult;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class StepDefinitionRestCountries {

	@Before
	public void setUp() {

		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Semillero");

	}

	@Given("^El \"([^\"]*)\" en una base datos$")
	public void codeBase(String code) {

		theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL2));
		theActorInTheSpotlight().attemptsTo(Consult.consultar(code));

	}

	@Then("^Valido \"([^\"]*)\" y \"([^\"]*)\"$")
	public void validoPaisCapital(String pais, String capital) {

		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("name", equalTo(pais))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("capital", equalTo(capital))));

	}

}
