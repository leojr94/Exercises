package com.sophossolutions.www.task;

import static com.sophossolutions.www.userinterfaces.MarcaInterfaz.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.conditions.Check;

public class BuscarGranPremio implements Task {

	public static BuscarGranPremio buscar() {
		return Tasks.instrumented(BuscarGranPremio.class);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Check.whether(ACEPTAR_COOKIES.resolveFor(actor).isVisible()).andIfSo(Click.on(ACEPTAR_COOKIES)),
				Click.on(PORTADA), Click.on(ESPANA),
				Check.whether(ACEPTAR_COOKIES.resolveFor(actor).isVisible()).andIfSo(Click.on(ACEPTAR_COOKIES)),
				Hover.over(MOTOR), Click.on(CALENDARIO), Click.on(SELECTOR), Click.on(G_P_GRAN_BRETANA));

	}

}
