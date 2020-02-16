package com.demoaut.newtours.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class EstadoLog implements Question<String> {

	private Target target;

	public EstadoLog(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

	public static EstadoLog is(Target target) {
		return new EstadoLog(target);

	}

}
