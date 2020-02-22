package com.cristiano.www.task;

import com.cristiano.www.interfaces.IEquipo;

public class Cristiano {
	
	private IEquipo equipo;

	public Cristiano(IEquipo equipo) {
		
		this.equipo = equipo;
	}
	
	public void mostrarEquipo() {
		equipo.mostrar();
	}
	

}
