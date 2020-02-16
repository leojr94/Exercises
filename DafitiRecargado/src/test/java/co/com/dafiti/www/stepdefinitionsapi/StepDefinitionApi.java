package co.com.dafiti.www.stepdefinitionsapi;

import static co.com.dafiti.www.utilities.Constantes.BASE_URL;
import static co.com.dafiti.www.utilities.Constantes.SLASH;
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

public class StepDefinitionApi {
	@Before
	public void setUp() {

		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Semillero");

	}

	@Given("^El (\\d+) en una base datos$")
	public void idBase(int id) {

		theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
		theActorInTheSpotlight().attemptsTo(Consult.consultar(String.valueOf(id) + SLASH));

	}

	@Then("^Valido \"([^\"]*)\" y (\\d+)$")
	public void validoTituloEpisodio(String name, int id) {

		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("episode_id", equalTo(id))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("title", equalTo(name))));

	}

}
