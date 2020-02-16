package com.demoaut.newtours.www.task;

import com.demoaut.newtours.www.userinterfaces.InicioNewtours;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CerrarSesion implements Task {

	public static CerrarSesion cerrar() {
		return Tasks.instrumented(CerrarSesion.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(InicioNewtours.SIGNONOFF));

	}

}
