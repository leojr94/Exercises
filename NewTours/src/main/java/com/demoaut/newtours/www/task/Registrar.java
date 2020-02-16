package com.demoaut.newtours.www.task;

import com.demoaut.newtours.www.userinterfaces.InicioNewtours;
import com.demoaut.newtours.www.userinterfaces.Registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrar implements Task {

	private String name;
	private String lastname;
	private String phone;
	private String email;
	private String user;
	private String password;

	public Registrar(String name, String lastname, String phone, String email, String user, String password) {

		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.user = user;
		this.password = password;
	}

	public static Registrar registrarUsuario(String name, String lastname, String phone, String email, String user,
			String password) {
		return Tasks.instrumented(Registrar.class, name, lastname, phone, email, user, password);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioNewtours.REGISTER), Enter.theValue(name).into(Registro.NAME),
				Enter.theValue(lastname).into(Registro.LASTNAME), Enter.theValue(phone).into(Registro.PHONE),
				Enter.theValue(email).into(Registro.EMAIL), Enter.theValue(user).into(Registro.USER),
				Enter.theValue(password).into(Registro.PASSWORD), Enter.theValue(password).into(Registro.CONPASSWORD),
				Click.on(Registro.SUBMIT));
	}

}
