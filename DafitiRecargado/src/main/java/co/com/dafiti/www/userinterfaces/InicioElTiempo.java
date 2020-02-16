package co.com.dafiti.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.eltiempo.com")

public class InicioElTiempo extends PageObject {
	public static final Target ECONOMIA = Target.the("Botón para acceder a la categoria de tecnología")
			.located(By.xpath("//*[@id=\"main-container\"]/div[3]/header/nav/div/ul/li[7]"));
	public static final Target NOTICIA = Target.the("Noticia a seleccionar").located(By.xpath("//*[@id=\"p18611-m7241-7240-7242\"]"));

}
