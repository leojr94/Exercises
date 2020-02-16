package com.demoaut.newtours.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Conectado {

	public static final Target SIGNOFF = Target.the("Campo SIGN-OFF")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]"));

}
