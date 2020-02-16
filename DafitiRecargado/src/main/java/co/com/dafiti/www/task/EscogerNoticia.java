package co.com.dafiti.www.task;

import co.com.dafiti.www.userinterfaces.InicioElTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EscogerNoticia implements Task {
	

	
	public static EscogerNoticia escoger() {
		return Tasks.instrumented(EscogerNoticia.class);		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioElTiempo.ECONOMIA), Click.on(InicioElTiempo.NOTICIA));
		
		
	}
	

}
