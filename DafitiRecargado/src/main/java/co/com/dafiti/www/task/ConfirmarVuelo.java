package co.com.dafiti.www.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.dafiti.www.userinterfaces.VueloDisponible;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarVuelo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// POPUP NO VISIBLE POR LO TANTO NO SE REALIZA ESTA INTERACCION
		WebElementFacade button = VueloDisponible.SINEQUIPAJE.resolveFor(actor);
		actor.attemptsTo(Click.on(VueloDisponible.SELECCIONAR));
		if (button.isCurrentlyVisible())
			actor.attemptsTo(Click.on(VueloDisponible.SINEQUIPAJE));

	}

	public static ConfirmarVuelo with() {
		return instrumented(ConfirmarVuelo.class);
	}

}
