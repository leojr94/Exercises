package co.com.dafiti.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Conectado {
	public static final Target BUSCAR = Target.the("Campo para buscar un artículo")
			.located(By.xpath("//*[@id=\"searchInput\"]"));
	public static final Target ARTICULO = Target.the("El mejor artículo")
			.located(By.xpath("//*[@id=\"1:BA459HO63HZSCO\"]/div/img"));
	public static final Target AGREGARCARRITO = Target.the("Botón para agregar al carrito")
			.located(By.xpath("//*[@id='AddToCart']"));
	public static final Target ARTICULOSAGREGADOS = Target.the("Span número de articulos agregados al carrito")
			.located(By.xpath("//*[@id='cart-head']/span[2]"));
	public static final Target CARRITO = Target.the("Span del carrito ")
			.located(By.xpath("//*[@id='cart-head']/span[1]"));
	public static final Target SALIR = Target.the("Opción para salir de la cuenta")
			.located(By.xpath("//*[@id='hdMenuContainer']/ul/li[8]/a"));

}
