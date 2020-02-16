package com.demoaut.newtours.www.task;

import com.demoaut.newtours.www.userinterfaces.InicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

	private String user;
	private String password;

	public IniciarSesion(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public static IniciarSesion inicio(String user, String password) {
		return Tasks.instrumented(IniciarSesion.class, user, password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(InicioSesion.SIGNON), Enter.theValue(user).into(InicioSesion.USERINICIO),
				Enter.theValue(password).into(InicioSesion.PASSWORDINICIO), Click.on(InicioSesion.INICIARSESION));

	}

}
