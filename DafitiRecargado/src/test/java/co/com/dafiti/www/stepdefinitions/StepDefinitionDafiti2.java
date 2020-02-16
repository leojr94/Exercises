package co.com.dafiti.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;

import co.com.dafiti.www.questions.EstadoLog;
import co.com.dafiti.www.task.CerrarSesion;
import co.com.dafiti.www.task.Registrar;
import co.com.dafiti.www.userinterfaces.Inicio;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

public class StepDefinitionDafiti2 {

	private Inicio inicio;

	@Given("^Pagina dafiti$")
	public void direccionar() {
		theActorInTheSpotlight().attemptsTo(Open.browserOn(inicio));
	}

	@When("^Registro de un usuario$")
	public void registrar(List<Map<String, String>> listaDatos) {

		Map<String, String> mapaUsuario = listaDatos.get(0);
		theActorInTheSpotlight().attemptsTo(Registrar.registrar(mapaUsuario.get("email"), mapaUsuario.get("contra"),
				mapaUsuario.get("nombre"), mapaUsuario.get("apellido"), mapaUsuario.get("doc"),
				mapaUsuario.get("dianac"), mapaUsuario.get("mesnac")));

	}

	@And("^Validado el registro$")
	public void validarRegistro() {
		theActorInTheSpotlight().should(seeThat(EstadoLog.is(Inicio.REGISTRARENTRAR), equalTo("HOLA, JUNIOR")));
	}

	@Then("^Validar cierre sesion$")
	public void validarCierre() {
		theActorInTheSpotlight().attemptsTo(CerrarSesion.cerrar());
		theActorInTheSpotlight().should(seeThat(EstadoLog.is(Inicio.REGISTRAR), equalTo("Registrate")));

	}

}
