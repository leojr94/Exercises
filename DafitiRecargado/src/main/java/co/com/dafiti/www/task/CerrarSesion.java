package co.com.dafiti.www.task;

import co.com.dafiti.www.userinterfaces.Inicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;

public class CerrarSesion implements Task {

	public static CerrarSesion cerrar() {
		return Tasks.instrumented(CerrarSesion.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Hover.over(Inicio.REGISTRARENTRAR), Click.on(Inicio.SALIR));

	}

}
