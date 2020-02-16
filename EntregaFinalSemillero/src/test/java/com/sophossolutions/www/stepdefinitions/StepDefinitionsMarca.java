package com.sophossolutions.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.questions.NombreGranPremio;
import com.sophossolutions.www.task.BuscarGranPremio;
import com.sophossolutions.www.userinterfaces.MarcaInterfaz;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsMarca {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Luis");
	private MarcaInterfaz inicio;

	@Before
	public void setUp() {

		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Pagina web Marca$")
	public void paginaWebMarca() {
		actor.wasAbleTo(Open.browserOn(inicio));

	}

	@When("^Se busca Gran Premio de Gran Bretana$")
	public void seBuscaGranPremioDeGranBretana() {
		actor.attemptsTo(BuscarGranPremio.buscar());

	}

	@Then("^Validar nombre circuito sea \"([^\"]*)\"$")
	public void validarNombreCircuitoSea(String silverStone) {
		actor.should(seeThat(NombreGranPremio.is(MarcaInterfaz.SILVER_STONE), equalTo("SILVERSTONE")));

	}

}
