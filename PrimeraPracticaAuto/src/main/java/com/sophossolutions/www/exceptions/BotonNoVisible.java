package com.sophossolutions.www.exceptions;

public class BotonNoVisible extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = -25789098;
	
	public BotonNoVisible(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
	
	
	public static String noVisible() {
	    return "Botón no visible --- Causa desconocida";
	}

}
