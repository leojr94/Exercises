package co.com.dafiti.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.dafiti.com.co")

public class Inicio extends PageObject {

	public static final Target REGISTRARENTRAR = Target.the("Opción para registrarse o entrar")
			.located(By.xpath("//*[@id='LoginInfoTag']/span"));
	public static final Target REGISTRAR = Target.the("Opción para registrarse o entrar")
			.located(By.xpath("//*[@id='LoginInfoTag']/span/span"));
	public static final Target EMAIL = Target.the("Campo para el correo")
			.located(By.xpath("//*[@id='RegistrationForm_email']"));
	public static final Target CONTRASEÑA = Target.the("Campo para contraseña")
			.located(By.xpath("//*[@id='RegistrationForm_password']"));
	public static final Target CONFIRMARCONTRASEÑA = Target.the("Campo confirmación contraseña")
			.located(By.xpath("//*[@id='RegistrationForm_password2']"));
	public static final Target NOMBRE = Target.the("Campo nombre")
			.located(By.xpath("//*[@id='RegistrationForm_first_name']"));
	public static final Target APELLIDOS = Target.the("Campo apellidos")
			.located(By.xpath("//*[@id='RegistrationForm_last_name']"));
	public static final Target DOCUMENTO = Target.the("Campo ID")
			.located(By.xpath("//*[@id='RegistrationForm_identification']"));
	public static final Target DIANAC = Target.the("Dia nacimiento")
			.located(By.xpath("//*[@id='RegistrationForm_day']"));
	public static final Target MESNAC = Target.the("Mes nacimiento")
			.located(By.xpath("//*[@id='RegistrationForm_month']"));
	public static final Target AÑONACSEL = Target.the("Año nacimiento")
			.located(By.xpath("//*[@id='RegistrationForm_year']"));
	public static final Target SEXO = Target.the("Campo sexo").located(By.xpath("//*[@id='RegistrationForm_gender']"));
	public static final Target ENVIAR = Target.the("Botón enviar los datos")
			.located(By.xpath("//*[@id='createAccountButton']"));
	public static final Target EMAILREGISTRADO = Target.the("Campo ingresar email registrado")
			.located(By.xpath("//*[@id='LoginForm_email']"));
	public static final Target CONTRASEÑAREGISTRADA = Target.the("Campo ingresar contraseña registrada")
			.located(By.xpath("//*[@id='LoginForm_password']"));
	public static final Target ENTRAR = Target.the("Botón para entrar").located(By.xpath("//*[@id='loginButton']"));
	public static final Target SALIR = Target.the("Salir de la cuenta")
			.located(By.xpath("//*[@id='hdMenuContainer']/ul/li[8]/a"));

}
