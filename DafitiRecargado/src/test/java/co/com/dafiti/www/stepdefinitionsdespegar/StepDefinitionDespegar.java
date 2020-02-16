package co.com.dafiti.www.stepdefinitionsdespegar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.dafiti.www.questions.ValorVuelo;
import co.com.dafiti.www.task.BuscarVuelo;
import co.com.dafiti.www.task.ConfirmarVuelo;
import co.com.dafiti.www.userinterfaces.Confirmacionreserva;
import co.com.dafiti.www.userinterfaces.InicioDespegar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

public class StepDefinitionDespegar {

	private InicioDespegar inicio;

	@Given("^Necesisto comprar un vuelo$")
	public void comprarvuelo() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn(inicio));
	}

	@When("^Vuelo entre (.*) y (.*)$")
	public void entreCiudades(String origen, String destino) {
		theActorInTheSpotlight().attemptsTo(BuscarVuelo.seleccionarVuelo(origen, destino, "2/2/2020", "7/2/2020"),
				ConfirmarVuelo.with());

	}

	@Then("^Valido el valor del vuelo$")
	public void validarValorVuelo() {

		theActorInTheSpotlight().should(seeThat(ValorVuelo.is(Confirmacionreserva.PRECIO), equalTo("179.729")));

	}

}
