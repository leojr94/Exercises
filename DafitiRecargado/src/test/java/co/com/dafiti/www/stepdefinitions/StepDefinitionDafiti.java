package co.com.dafiti.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;
import co.com.dafiti.www.questions.ArticuloAgregadoCarrito;
import co.com.dafiti.www.questions.EstadoLog;
import co.com.dafiti.www.task.AgregarAlCarrito;
import co.com.dafiti.www.task.CerrarSesion;
import co.com.dafiti.www.task.IniciarSesion;
import co.com.dafiti.www.userinterfaces.Conectado;
import co.com.dafiti.www.userinterfaces.Inicio;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionDafiti {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Inicio inicio;

	@Before
	public void setUp() {

		web.manage().window().maximize();
		theActorInTheSpotlight().can(BrowseTheWeb.with(web));

	}

	@Given("^He ingresado a la pagina Dafiti$")
	public void irA() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn(inicio));

	}

	@Then("^Iniciar sesion un usuario (.*) y contrasena (.*)$")
	public void ingresar(String usuario, String contrasena) {

		theActorInTheSpotlight().attemptsTo(IniciarSesion.iniciar(usuario, contrasena));
		theActorInTheSpotlight().should(seeThat(EstadoLog.is(Inicio.REGISTRARENTRAR), equalTo("HOLA, LUIS")));

	}

	@Given("^He seleccionado articulo$")
	public void seleccionarArticulo() {

		theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.agregar());

	}

	@Then("^Verifico agregado al carrito$")
	public void verificarCarrito() {

		theActorInTheSpotlight()
				.should(seeThat(ArticuloAgregadoCarrito.is(Conectado.ARTICULOSAGREGADOS), equalTo("1")));

	}

	@Then("^Cerrar sesion$")
	public void cerrarSesion() {

		theActorInTheSpotlight().attemptsTo(CerrarSesion.cerrar());
		theActorInTheSpotlight().should(seeThat(EstadoLog.is(Inicio.REGISTRAR), equalTo("Registrate")));

	}

}
