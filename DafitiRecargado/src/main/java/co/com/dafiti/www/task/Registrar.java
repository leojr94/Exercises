package co.com.dafiti.www.task;

import org.openqa.selenium.Keys;

import co.com.dafiti.www.userinterfaces.Inicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

public class Registrar implements Task {

	private String email;
	private String contrasena;
	private String nombre;
	private String apellidos;
	private String doc;
	private String diaNac;
	private String mesNac;

	public Registrar(String email, String contrasena, String nombre, String apellidos, String doc, String diaNac,
			String mesNac) {

		this.email = email;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.doc = doc;
		this.diaNac = diaNac;
		this.mesNac = mesNac;

	}

	public static Registrar registrar(String email, String contrasena, String nombre, String apellidos, String doc,
			String diaNac, String mesNac) {
		return Tasks.instrumented(Registrar.class, email, contrasena, nombre, apellidos, doc, diaNac, mesNac);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(Inicio.REGISTRARENTRAR), Enter.theValue(email).into(Inicio.EMAIL),
				Enter.theValue(contrasena).into(Inicio.CONTRASEÑA),
				Enter.theValue(contrasena).into(Inicio.CONFIRMARCONTRASEÑA), Enter.theValue(nombre).into(Inicio.NOMBRE),
				Enter.theValue(apellidos).into(Inicio.APELLIDOS), Enter.theValue(doc).into(Inicio.DOCUMENTO),
				Enter.theValue(diaNac).into(Inicio.DIANAC), Enter.theValue(mesNac).into(Inicio.MESNAC),
				Click.on(Inicio.AÑONACSEL), Hit.the(Keys.NUMPAD1).into(Inicio.AÑONACSEL),
				Hit.the(Keys.NUMPAD9).into(Inicio.AÑONACSEL), Hit.the(Keys.NUMPAD9).into(Inicio.AÑONACSEL),
				Hit.the(Keys.NUMPAD4).into(Inicio.AÑONACSEL), Hit.the(Keys.ENTER).into(Inicio.AÑONACSEL),
				Click.on(Inicio.SEXO), Hit.the(Keys.ARROW_DOWN).into(Inicio.SEXO),
				Hit.the(Keys.ARROW_DOWN).into(Inicio.SEXO), Hit.the(Keys.ENTER).into(Inicio.SEXO),
				Click.on(Inicio.ENVIAR)

		);

	}

}
