/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: cupiHospital
 * Autor: Equipo Cupi2 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.cupiHospital.mundo;

import uniandes.cupi2.cupiHospital.mundo.Paciente.Motivo;
import uniandes.cupi2.cupiHospital.mundo.Unidad.Tipo;

/**
 * Clase que representa el hospital.
 */

public class Hospital {
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Cantidad de unidades del hospital.
	 */
	public final static int NUMERO_UNIDADES = 6;

	// -------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------

	/**
	 * Arreglo que contiente las unidades del hospital.
	 */
	// TODO Parte3 PuntoA: Declare el atributo unidades como contenedora de tamaño
	// fijo.
	
	private Unidad[] unidades; 
	

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye el hospital con las siguientes unidades en el arreglo: unidades[0]
	 * - nombre: Unidad A, Tipo: Cuidados intensivos. unidades[1] - nombre: Unidad
	 * B, Tipo: Cuidados intermedios. unidades[2] - nombre: Unidad C, Tipo:
	 * Pediatría. unidades[3] - nombre: Unidad D, Tipo: Maternidad. unidades[4] -
	 * nombre: Unidad E, Tipo: Geriatría. unidades[5] - nombre: Unidad F, Tipo:
	 * Observación.
	 */
	public Hospital() {
		// TODO Parte3 PuntoB: Inicialice el atributo unidades con tamaño
		// NUMERO_UNIDADES e inicialice cada una da las unidades.
		unidades=new Unidad [NUMERO_UNIDADES];
		unidades[0] = new Unidad("Unidad A", Tipo.CUIDADOS_INTENSIVOS);
		unidades[1] = new Unidad("Unidad B", Tipo.CUIDADOS_INTERMEDIOS);
		unidades[2] = new Unidad("Unidad C", Tipo.PEDIATRIA);
		unidades[3] = new Unidad("Unidad D", Tipo.MATERNIDAD);
		unidades[4] = new Unidad("Unidad E", Tipo.GERIATRIA);
		unidades[5] = new Unidad("Unidad F", Tipo.OBSERVACION);				
	}

	// -------------------------------------------------------------
	// Métodos
	// -------------------------------------------------------------

	/**
	 * Devuelve el arreglo con las unidades del hospital.
	 * 
	 * @return El arreglo de unidades.
	 */
	public Unidad[] darUnidades() {
		// TODO Parte3 PuntoC: Complete el método según la documentación dada.
		/*System.out.println("\nUnidades del hospital: \n" );
		for(int i=0; i<6; i++) {			
			System.out.println(unidades[i]+"\n");			
		}*/
		return unidades;	
	}

	/**
	 * Interna un nuevo paciente al hospital con los parámetros dados. No se permite
	 * internar un paciente si: - existe un paciente con el mismo número de
	 * identificación. - se desea internarlo en pediatría y tiene mas de 15 años
	 * (Unidad.EDAD_MAX_PEDIATRIA). - se desea internarlo en geriatría y tiene menos
	 * de 60 años (Unidad.EDAD_MIN_GERIATRIA).
	 * 
	 * @param pNombreUnidad         Nombre de la unidad a la que se ingresa el
	 *                              paciente.
	 * @param pNombrePaciente       Nombre del paciente. pNombrePaciente != null &&
	 *                              pNombrePaciente != "".
	 * @param pApellido             Apellido del paciente. pApellido != null
	 *                              &&pApellido != "".
	 * @param pNumeroIdentificacion ID del paciente. pNumeroidentificacion > 0.
	 * @param pEdad                 Edad del paciente. pEdad >= 0.
	 * @param pDiagnostico          Diagnóstico del paciente. pDiagnostico != null
	 *                              && pDiagnostico != "".
	 * @param pDiasHospitalizacion  Días de hospitalización del paciente.
	 *                              pDiasHospitalizacion >= 0.
	 * @param pMotivoIngreso        Motivo de ingreso del paciente en el hospital.
	 * @return true si logra ingresar el paciente, false en caso contrario.
	 */
	public boolean internarNuevoPaciente(String pNombreUnidad, String pNombrePaciente, String pApellido,
			int pNumeroIdentificacion, int pEdad, String pDiagnostico, int pDiasHospitalizacion,
			Motivo pMotivoIngreso) {
		// TODO Parte3 PuntoD: Complete el método según la documentación dada.
		int iden=0;
		switch(pNombreUnidad) {		
		case ("Unidad A"):
			iden=0;
		break;
		case ("Unidad B"):
			iden=1;
		break;
		case ("Unidad C"):
			iden=2;
		break;
		case ("Unidad D"):
			iden=3;
		break;
		case ("Unidad E"):
			iden=4;
		break;
		case ("Unidad F"):
			iden=5;
		break;
		
		default:			
			break;		
		}	
		
		Unidad unidad = new Unidad(unidades[iden].darNombre(), unidades[iden].darTipo());
		
		for(int i=0; i< unidad.darPacientes().size(); i++) {
			if(pNumeroIdentificacion==unidad.darPacientes().get(i).darNumeroIdentificacion()) {
				System.out.println("\n No se permite ingresar paciente; ya existe paciente con mismio ID \n");
				return false;
				
			}else if((iden == 2 && pEdad>15) || (iden==4 && pEdad<60) ) {//Condiciones de pediatria y geriatria con el iden 2 y 4 respectivamente
				System.out.println("\n No se permite ingresar paciente, viola las reglas de edad de la unidad \n");
				return false;
			}			
		}
		unidad.agregarPaciente(pNombrePaciente, pApellido, pNumeroIdentificacion, pEdad, pDiagnostico, pDiasHospitalizacion, pMotivoIngreso);
		return true; // No encuentra limitantes y returna true		
	}

	/**
	 * Devuelve un paciente dado su ID.
	 * 
	 * @param pNumeroIdentificacion ID del paciente. pNumeroIdentificacion > 0.
	 * @return El paciente que tiene el ID dado por parámetro, null en caso de no
	 *         encontrarlo.
	 */
	public Paciente buscarPaciente(int pNumeroIdentificacion) {
		// TODO Parte3 PuntoE: Complete el método según la documentación dada.
		Paciente paciente = null;
		if(pNumeroIdentificacion>0) {
			for(Unidad unidades : unidades) {
				paciente= unidades.buscarPaciente(pNumeroIdentificacion);
				if(paciente!= null) {
					return paciente;					
				}
			}		
		}
		return null;		
		/*Otra forma de hacerlo, pero debemos reutilizar
		for(int i=0; i<NUMERO_UNIDADES; i++) {			
			for(int j=0; j<unidades[i].darPacientes().size(); j++) {
				if(unidades[i].darPacientes().get(j).darNumeroIdentificacion()== pNumeroIdentificacion) {
					return unidades[i].darPacientes().get(j);
				}
			}			
		}
		return null;*/		
	}

	/**
	 * Determina si el paciente, dado su ID por parámetro, es dado de alta.
	 * 
	 * @param pNumeroIdentificacion ID del paciente.
	 * @return True si el paciente es dado de alta, false en caso de no encontrarlo.
	 */
	public boolean darDeAltaPaciente(int pNumeroIdentificacion) {
		// TODO Parte3 PuntoF: Complete el método según la documentación dada.
		Paciente paciente = null;
		if(pNumeroIdentificacion>0) {
			for(Unidad unidades : unidades) {
				paciente= unidades.buscarPaciente(pNumeroIdentificacion);
				if(paciente!= null) {
					return true;					
				}
			}		
		}
		return false;
		
		
	}

	/**
	 * Cambia de unidad a un paciente dado su ID por parámetro, si se cumplen las
	 * siguiente condiciones. - Si la unidad destino es de tipo PEDIATRIA y el
	 * paciente no supera la edad máxima. - Si la unidad destino es de tipo
	 * GERIATRIA y el paciente no está por debajo de la edad mínima. - Si la unidad
	 * de destino no es la misma en la que se encuentra actualmente el paciente.
	 * post:<br>
	 * Se retira de la unidad original solo si es posible reasignarlo en la unidad
	 * destino.
	 * 
	 * @param pNumeroIdentificacion ID del paciente.
	 * @param pNuevaUnidad          Unidad a la que será trasferido el paciente.
	 * @return True si pudo reubicar el paciente, false en caso contrario.
	 */
	
	public boolean reubicarPaciente(int pNumeroIdentificacion, String pNuevaUnidad) {
		// TODO Parte3 PuntoG: Complete el método según la documentación dada.
		Paciente paciente= buscarPaciente(pNumeroIdentificacion);
		//Se llama metodo ingresanuevopaciente el cual ya valida todas las restricciones que dice		
		return internarNuevoPaciente(pNuevaUnidad, paciente.darNombre(), paciente.darApellido(), paciente.darNumeroIdentificacion(), paciente.darEdad(), paciente.darDiagnostico(), paciente.darDiasHospitalizacion(), paciente.darMotivoIngreso());
			
	}

	/**
	 * Busca la unidad a la que pertenece un paciente.
	 * 
	 * @param pNumeroIdentificacion ID del paciente.
	 * @return La unidad a la que pertenece el paciente, null en caso de no
	 *         encontrar el paciente.
	 */
	public Unidad buscarUnidadPaciente(int pNumeroIdentificacion) {
		// TODO Parte3 PuntoH: Complete el método según la documentación dada.		
		for(int i=0; i<NUMERO_UNIDADES; i++) {			
			for(int j=0; j<unidades[i].darPacientes().size(); j++) {
				if(unidades[i].darPacientes().get(j).darNumeroIdentificacion()== pNumeroIdentificacion) {
					return unidades[i];
				}
			}			
		}
		return null;
	}	

	/**
	 * Busca una unidad dado su nombre.
	 * 
	 * @param pNombreUnidad Nombre de la unidad.
	 * @return La unidad cuyo nombre es dado por parámetro, null en caso de no
	 *         encontrarla.
	 */
	public Unidad buscarUnidad(String pNombreUnidad) {
		// TODO Parte3 PuntoI: Complete el método según la documentación dada.		
		for(int i=0; i<NUMERO_UNIDADES; i++) {				
			if(unidades[i].darNombre() == pNombreUnidad) {
				return unidades[i];
			}					
		}
		return null;	
	}

	/**
	 * Calcula la cantidad total de pacientes en el hospital.
	 * 
	 * @return Cantidad total de pacientes en el hospital.
	 */
	public int darCantidadTotalPacientes() {
		// TODO Parte3 PuntoJ: Complete el método según la documentación dada.
		int sum=0;
		for(int i=0; i<NUMERO_UNIDADES; i++) {			
			for(int j=0; j<unidades[i].darPacientes().size(); j++) {
				sum++;
			}			
		}
		return sum;
	}

	/**
	 * Retorna el paciente de mayor edad en el hospital. Si hay dos o más pacientes
	 * con la edad máxima, retorna cualquiera de los dos.
	 * 
	 * @return Paciente de mayor edad, null si no hay pacientes en el hospital.
	 */
	public Paciente darPacienteMayorEdad() {
		if(darCantidadTotalPacientes()>0) {
			int mayorEdad[]={};
			// TODO Parte3 PuntoK: Complete el método según la documentación dada.
			for(int i=0; i<NUMERO_UNIDADES; i++) {	
				Paciente paciente= unidades[i].darPacienteMayorEdad();
				mayorEdad[i]=paciente.darEdad();					
			}
			int mayor=mayorEdad[0];
			int indMayor=0;
			for(int i=1; i<NUMERO_UNIDADES; i++) {	
				if(mayor< mayorEdad[i] ) {//Busca 
					indMayor=i;
					mayor=mayorEdad[i];
									
				}else { 
					indMayor=i-1;
					mayor=mayorEdad[i-1];
				}
			}
			return unidades[indMayor].darPacienteMayorEdad();
		}
		return null;		
	}

	/**
	 * Asigna el encargado con los valores dados por parámetro a la unidad dada por
	 * parámetro, si la unidad ya tenía encargado no lo asigna.
	 * 
	 * @param pNombre           Nombre del encargado. pNombre != null && pNombre !=
	 *                          "".
	 * @param pAniosExperiencia Años de experiencia del encargado. pAniosExperiencia
	 *                          > 0.
	 * @param pUnidad           Nombre de la unidad para asignar enccargado. pUnidad
	 *                          != null && pUnidad != "".
	 * @return True si el encargado se pudo asignar, false si la unidad ya tenía
	 *         encargado o si no existe una unidad con el nombre dado.
	 */
	public boolean asignarEncargado(String pNombre, int pAniosExperiencia, String pUnidad) {
		// TODO Parte3 PuntoL: Complete el método según la documentación dada.
		// asignarEncargado asigna si no tiene encargado, si tiene no lo asigna, se comprueba las otras condiciones
		
		if((pNombre!= null && pNombre!="") && pAniosExperiencia >0 && (pUnidad!= null && pUnidad!="")) {
			if(buscarUnidad(pUnidad) == null){
				return false;
			}
			Unidad unidad = buscarUnidad(pUnidad);
			return unidad.asignarEncargado(pNombre, pAniosExperiencia);
		}
		return false;
		
	}

	// -----------------------------------------------------------------
	// Puntos de Extensión
	// -----------------------------------------------------------------

	/**
	 * Método para la extensión 1.
	 * 
	 * @return Respuesta1.
	 */
	
	
	public String metodo1() {
		return "Respuesta 1.";
	}

	/**
	 * Método para la extensión 2.
	 * 
	 * @return Respuesta2.
	 */
	public String metodo2() {
		return "Respuesta 2.";
	}

}