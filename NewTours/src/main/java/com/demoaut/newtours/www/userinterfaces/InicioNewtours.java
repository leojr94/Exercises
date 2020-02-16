package com.demoaut.newtours.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class InicioNewtours extends PageObject {

	public static final Target REGISTER = Target.the("Selecciona la opción para registrarse")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]"));

	public static final Target SIGNONOFF = Target.the("Label conectado o desconectado")
			.located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));

}
