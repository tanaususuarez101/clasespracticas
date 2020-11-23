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
		contacto = new Contacto[0];
		nombre = "Agenda Desconocida";

	}
	
	public Agenda(int tamaño) {
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
	
	
	
	// 5
	// [null, null, null, null, null]
	// []
	// [Contacto, Contacto]
	// Contacto = { }
	// contacto = [ object,  objecto]
	//          0         1       2        3        4
	// aux = [object,  objecto, objecto, objecto, nuevo] tama�o = 5
	//
	public boolean a�adirContactoSinLimite(Contacto nuevo) {
		Contacto aux[] = new Contacto[this.contacto.length + 1];
		
		for (int i = 0; i < contacto.length; i++) {
			aux[i] = contacto[i];
		}
		
		aux[this.contacto.length] = nuevo;
		contacto = aux;
		return true;
	}
	// m�todo que devuelva el tama�o de nuestra agenda
	public int getTama�o(){
		// el m�todo length devuelve el tama�o de un array
		return this.contacto.length;
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
	
	
	public boolean eliminarContactoSinLimite(){
		
		Contacto aux[] = new Contacto[this.contacto.length - 1];
		
		for (int i = 0; i < contacto.length-1; i++) {
			aux[i] = contacto[i];
		}
		
		contacto = aux;
		return true;
	}
	
	
	
	public boolean eliminarContactoSinLimite(int posicion){
		
		if (posicion > this.contacto.length || posicion < 0) return false;
		
		Contacto aux[] = new Contacto[this.contacto.length - 1];
		
		Boolean hasSidoCopiada = false;
		
		for (int i = 0; i < aux.length; i++) {
			if (posicion != i && !hasSidoCopiada) {
				aux[i] = contacto[i];				
			} else {
				aux[i] = contacto[i+1];
				hasSidoCopiada = true;
			}			
			
		}
		this.contacto = aux;
		return true;
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
