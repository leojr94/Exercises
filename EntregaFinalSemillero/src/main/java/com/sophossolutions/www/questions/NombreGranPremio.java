package com.sophossolutions.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class NombreGranPremio implements Question<String> {
	private Target target;

	public NombreGranPremio(Target target) {

		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(target).viewedBy(actor).asString();
	}

	public static NombreGranPremio is(Target target) {

		return new NombreGranPremio(target);

	}

}
