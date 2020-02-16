package com.sophossolutions.www.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class Consult implements Task {

	private String code;

	public Consult(String code) {

		this.code = code;
	}

	public static Consult consultar(String code) {
		return Tasks.instrumented(Consult.class, code);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Get.resource(code));

	}

}
