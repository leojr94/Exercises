package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Confirmacionreserva {

	public static final Target PRECIO = Target.the("Precio del vuelo")
			.located(By.xpath("//*[@id=\"chk-total-price\"]/div[2]/money/div/span[3]"));

}
