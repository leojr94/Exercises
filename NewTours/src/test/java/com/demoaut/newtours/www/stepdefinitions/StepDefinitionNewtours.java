package com.demoaut.newtours.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.www.questions.EstadoLog;
import com.demoaut.newtours.www.task.CerrarSesion;
import com.demoaut.newtours.www.task.IniciarSesion;
import com.demoaut.newtours.www.task.NavegarA;
import com.demoaut.newtours.www.task.Registrar;
import com.demoaut.newtours.www.userinterfaces.InicioNewtours;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionNewtours {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Luis");

	private InicioNewtours inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Necesito entrar a pagina con credenciales$")
	public void necesitoLogear() {

		actor.wasAbleTo(NavegarA.on(inicio));

	}

	@When("^Campos (.*) (.*) (.*) (.*) (.*) y (.*)$")
	public void camposUserPass(String name, String lastname, String phone, String mail, String user, String password) {

		actor.attemptsTo(Registrar.registrarUsuario(name, lastname, phone, mail, user, password),
				IniciarSesion.inicio(user, password));
		actor.should(seeThat(EstadoLog.is(InicioNewtours.SIGNONOFF), equalTo("SIGN-OFF")));

	}

	@Then("^Cerrar sesion$")
	public void cerrarSesion() {

		actor.attemptsTo(CerrarSesion.cerrar());
		actor.should(seeThat(EstadoLog.is(InicioNewtours.SIGNONOFF), equalTo("SIGN-ON")));

	}

}
