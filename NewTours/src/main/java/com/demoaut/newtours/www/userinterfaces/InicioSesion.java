package com.demoaut.newtours.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesion {

	public static final Target SIGNON = Target.the("Campo SIGN-ON").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]"));

	public static final Target USERINICIO = Target.the("Campo usuario").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
	public static final Target PASSWORDINICIO = Target.the("Campo contraseña").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	public static final Target INICIARSESION = Target.the("Botón para iniciar sesion").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));

}
