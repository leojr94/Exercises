package co.com.eltiempo.www.stepdefinitionstiempo;

import org.openqa.selenium.WebDriver;

import co.com.dafiti.www.task.EscogerNoticia;
import co.com.dafiti.www.userinterfaces.InicioElTiempo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionElTiempo {

	@Managed(driver = "chrome")
	private WebDriver web;
	private InicioElTiempo inicio;
	private Actor actor = Actor.named("Enrique");

	@Before
	public void setUp() {

		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));

	}

	@Given("^La pag de El Tiempo$")
	public void irAElTiempo() {
		actor.wasAbleTo(Open.browserOn(inicio));
	}

	@When("^Escojo una noticia$")
	public void escogerNoticia() {
		actor.attemptsTo(EscogerNoticia.escoger());
		;

	}

	@Then("^Generar doc texto plano$")
	public void generarDocTexto() {

	}

}
