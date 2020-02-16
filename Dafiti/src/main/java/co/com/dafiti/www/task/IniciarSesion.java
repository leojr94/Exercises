package co.com.dafiti.www.task;

import co.com.dafiti.www.userinterfaces.Inicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

	private String usuario;
	private String contrasena;

	public IniciarSesion(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public static IniciarSesion iniciar(String usuario, String contrasena) {
		return Tasks.instrumented(IniciarSesion.class, usuario, contrasena);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(Inicio.REGISTRARENTRAR), Enter.theValue(usuario).into(Inicio.EMAILREGISTRADO),
				Enter.theValue(contrasena).into(Inicio.CONTRASEÑAREGISTRADA), Click.on(Inicio.ENTRAR));

	}

}
