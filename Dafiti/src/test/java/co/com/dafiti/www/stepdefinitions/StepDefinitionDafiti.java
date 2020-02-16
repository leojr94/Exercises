package co.com.dafiti.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import co.com.dafiti.www.questions.ArticuloAgregadoCarrito;
import co.com.dafiti.www.questions.EstadoLog;
import co.com.dafiti.www.task.AgregarAlCarrito;
import co.com.dafiti.www.task.CerrarSesion;
import co.com.dafiti.www.task.IniciarSesion;
import co.com.dafiti.www.task.NavegarA;
import co.com.dafiti.www.task.Registrar;
import co.com.dafiti.www.userinterfaces.Conectado;
import co.com.dafiti.www.userinterfaces.Inicio;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionDafiti {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Luis");

	private Inicio inicio;

	@Before
	public void setUp() {

		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^He ingresado a la pagina Dafiti$")
	public void irA() {

		actor.wasAbleTo(NavegarA.on(inicio));
	}

	@Then("^Iniciar sesion un usuario (.*) y contrasena (.*)$")
	public void ingresar(String usuario, String contrasena) {

		actor.attemptsTo(IniciarSesion.iniciar(usuario, contrasena));
		actor.should(seeThat(EstadoLog.is(Inicio.REGISTRARENTRAR), equalTo("HOLA, LUIS")));

	}

	@Given("^He seleccionado articulo$")
	public void seleccionarArticulo() {

		actor.attemptsTo(AgregarAlCarrito.agregar());

	}

	@Then("^Verifico agregado al carrito$")
	public void verificarCarrito() {

		actor.should(seeThat(ArticuloAgregadoCarrito.is(Conectado.ARTICULOSAGREGADOS), equalTo("1")));

	}

	@Then("^Cerrar sesion$")
	public void cerrarSesion() {

		actor.attemptsTo(CerrarSesion.cerrar());
		actor.should(seeThat(EstadoLog.is(Inicio.REGISTRAR), equalTo("Registrate")));

	}

	@Given("^Registro de un usuario$")
	public void registrar(List<Map<String, String>> listaDatos) {

		Map<String, String> mapaUsuario = listaDatos.get(0);
		actor.attemptsTo(Registrar.registrar(mapaUsuario.get("email"), mapaUsuario.get("contra"),
				mapaUsuario.get("nombre"), mapaUsuario.get("apellido"), mapaUsuario.get("doc"),
				mapaUsuario.get("dianac"), mapaUsuario.get("mesnac")));

	}

	@And("^Validado el registro$")
	public void validarRegistro() {
		actor.should(seeThat(EstadoLog.is(Inicio.REGISTRARENTRAR), equalTo("HOLA, JUNIOR")));
	}

	@Then("^Validar cierre sesion$")
	public void validarCierre() {
		actor.attemptsTo(CerrarSesion.cerrar());
		actor.should(seeThat(EstadoLog.is(Inicio.REGISTRAR), equalTo("Registrate")));

	}

}
