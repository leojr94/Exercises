
public class Messi {
	private Barcelona barcelona;
	
	public Messi() {
		
	}
	
	
	public Messi(Barcelona barcelona) {
		
		this.barcelona = barcelona;
	}

	
	public void setBarcelona(Barcelona barca) {
		this.barcelona = barca;
	}



	public void mostrarEquipo() {
		barcelona.mostrar();
	}

}
