package co.com.dafiti.www.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class Consult implements Task {
	private String id;

	public Consult(String id) {

		this.id = id;
	}

	public static Consult consultar(String id) {
		return Tasks.instrumented(Consult.class, id);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Get.resource(id));

	}

}
