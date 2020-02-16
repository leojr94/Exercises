package co.com.dafiti.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ArticuloAgregadoCarrito implements Question<String> {

	private Target target;

	public ArticuloAgregadoCarrito(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(target).viewedBy(actor).asString();
	}

	public static ArticuloAgregadoCarrito is(Target target) {
		return new ArticuloAgregadoCarrito(target);
	}

}
