package HerenciaYPolimorfismo;

public class Agenda {
	
	private String nombre;
	private Contacto [] lista; //Lista de contacto 
	
	public Agenda(String nombre) { //Agenda vacia que se inicializa con un nombre
		this.nombre=nombre;
		this.lista=new Contacto[0];
	}
	
	public boolean añadirContacto(Contacto cont) {
		
		Contacto [] listaAux = new Contacto[lista.length+1];
		
		for(int i=0; i<lista.length;i++) {
			listaAux[i] = this.lista[i];
		}
		listaAux[listaAux.length-1]=cont;
		lista=listaAux;
		
		return false;
	}
	
	
	/*NombreAgenda
	 * 1. nombreCont: telefono
	 * 2. ""   ""
	 * 
	 * lista = [Cont, cont, ...]
	 */
	public String toString() {
		String representa = "";
		representa = this.nombre + "\n";
		
		for(int i=0; i<lista.length;i++) {
				representa += i+1 + ". " +lista[i].toString() + "\n";
		}
		
		return representa;
	}
	
	
	public boolean equals(Agenda lista) {
		
		
		
		return false;
	}

}
