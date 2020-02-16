package co.com.dafiti.www.task;

import org.openqa.selenium.Keys;

import co.com.dafiti.www.userinterfaces.Conectado;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

public class AgregarAlCarrito implements Task {

	public static AgregarAlCarrito agregar() {
		return Tasks.instrumented(AgregarAlCarrito.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("Audifonos Baseus D02 Bluetooth Plegables Inalambricos Microfono")
						.into(Conectado.BUSCAR),
				Hit.the(Keys.ENTER).into(Conectado.BUSCAR), Click.on(Conectado.ARTICULO),
				Click.on(Conectado.AGREGARCARRITO));
		WebElementFacade span = Conectado.ARTICULOSAGREGADOS.resolveFor(actor);
		if (span.isCurrentlyVisible())
			actor.attemptsTo(Click.on(Conectado.CARRITO));
	}

}
