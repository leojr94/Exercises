package com.demoaut.newtours.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Registro {

	public static final Target NAME = Target.the("Campo First name").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));

	public static final Target LASTNAME = Target.the("Campo Last name").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));

	public static final Target PHONE = Target.the("Campo First name").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));

	public static final Target EMAIL = Target.the("Campo First name").located(By.xpath("//*[@id=\"userName\"]"));

	public static final Target USER = Target.the("Campo usuario").located(By.xpath("//*[@id='email']"));

	public static final Target PASSWORD = Target.the("Campo contraseña").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));

	public static final Target CONPASSWORD = Target.the("Campo confirmar contraseña").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
	public static final Target SUBMIT = Target.the("Boton registrar").located(By.xpath(
			"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));

}
