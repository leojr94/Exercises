package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.marca.com/")

public class MarcaInterfaz extends PageObject {

	public static final Target ACEPTAR_COOKIES = Target.the("Botón aaceptar cookies")
			.located(By.xpath("//*[@id=\"buttons\"]/button[2]"));
	public static final Target PORTADA = Target.the("Boton para cambiar de portada")
			.located(By.xpath("//*[@id=\"header-edition-selector\"]/button"));
	public static final Target ESPANA = Target.the("Opción España")
			.located(By.xpath("//*[@id=\"header-edition-selector__menu\"]/ul/li[1]"));
	public static final Target MOTOR = Target.the("Sección Motor")
			.located(By.xpath("/html/body/header/div[2]/div/nav/ul/li[3]"));
	public static final Target CALENDARIO = Target.the("Opción calendario Formula 1")
			.located(By.xpath("//*[@id=\"submenuMotor\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
	public static final Target SELECTOR = Target.the("Selector del gran premio")
			.located(By.xpath("//*[@id=\"selectweb\"]"));
	public static final Target G_P_GRAN_BRETANA = Target.the("Opción Gran Premio de Gran Bretañia")
			.located(By.xpath("//*[@id=\"selectweb\"]/option[11]"));
	public static final Target SILVER_STONE = Target.the("Titulo Silverstone")
			.located(By.xpath("//*[@id=\"gpgranbretana\"]/div[1]/h3"));
}
