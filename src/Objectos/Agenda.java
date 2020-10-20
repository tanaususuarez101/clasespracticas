package Objectos;

public class Agenda {
	
	// atributos
	Contacto[] contacto;
	String nombre;
	
	// Constructores
	/* 
	 * Los constructores sirve para inicializar los atributos el objecto
	 * */
	public Agenda() {
		contacto = new Contacto[10];
		nombre = "Agenda Desconocida";

	}

	public Agenda(int tama�o) {
		// Se inicializa: [null, null, null ...]
		contacto = new Contacto[tama�o];
		nombre = "Agenda Desconocida";
	}
	

	public Agenda(int tama�o, String nombreAgenda) {
		contacto = new Contacto[tama�o];
		nombre = nombreAgenda;
	}

	
	// FIN DE LOS CONSTRUCTORES
	
	
	// FUNCIONALIDADES:
	// "[nombre, telefono], [nombre, telefono]" 
	// Contacto[4]
	public String toString() {
		String listaContacto = "";
		for (int i = 0; i < contacto.length;i++) {
			if (contacto[i] != null){
				listaContacto += "[" + contacto[i].getNombre() + ", " + contacto[i].getTelefono() + "], ";	
			}		
		}
		return listaContacto;
	}
	
	
	/*
	 * Comandos especiales para tratamiento de bucle;
	 * continue;
	 * break;
	 * */
	
	
	public boolean a�adirContacto(Contacto nuevo) {
		for (int i = 0; i< contacto.length; i++) {
			if (contacto[i] == null) {
				contacto[i] = nuevo;
				return true;
			}
		}		   	
    	return false;
	}
	
	/**
	 * Crear un m�todo que busque un contacto
	 * true: si lo ha encontrado
	 * false: si no lo ha encontrado
	 */
	//
	// [Contacto, Contacto, Contacto, ..., ]
	// contacto (nombre, telefono)
	public boolean buscarContacto(Contacto reciente) {
		
		if (reciente == null ) return false;
		
		
		for (int i = 0; i < contacto.length; i++) {
									
			if (contacto[i] != null && reciente.getNombre() == contacto[i].getNombre()) {
				return true;
			}	
		}
		
		return false;
	}
	
	/***
	 * Eliminar un contacto de la Agenda, seg�n una posici�n dada
	 * pista: Sustituir el contacto que queiro eliminar por null
	 */
	// [contacto, contacto, contacto, ..., null]
	public boolean eliminarContacto(int posicion){
		
		if (contacto[posicion] != null) {
			contacto[posicion] = null;
			return true;
		}
		return false;
	}
	
	/**
	 * Crear un m�todo que devuelva la lista de contacto
	 */
	
	public Contacto[] getLista() {
		return contacto;
	}
	
	
	/**
	 * Crear un atributo a la clase agenda que la identifique
	 */
	

}
