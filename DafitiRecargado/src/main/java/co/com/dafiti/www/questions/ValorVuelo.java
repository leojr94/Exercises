package co.com.dafiti.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValorVuelo implements Question<String> {

	private Target target;

	public ValorVuelo(Target target) {

		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub

		return Text.of(target).viewedBy(actor).asString();
	}

	public static ValorVuelo is(Target target) {
		return new ValorVuelo(target);
	}

}
