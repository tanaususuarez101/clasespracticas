package HerenciaYPolimorfismo;

public class Agenda implements Cloneable {
	
	private String nombre;
	private Contacto [] lista; //Lista de contacto 
	
	public Agenda(String nombre) { //Agenda vacia que se inicializa con un nombre
		this.nombre=nombre;
		this.lista=new Contacto[0];
	}

	public Agenda clone() {
		
		Agenda ag = new Agenda (this.nombre);
		
		for(int i=0; i<lista.length;i++) {
			ag.añadirContacto(lista[i]);
		}
		
		return ag;
		
	}
	
	public boolean añadirContacto(Contacto cont) {
		
		if(lista.length == 0) {
			this.lista = new Contacto[1];
			lista[0] = cont;
			return true;
		}
		
		if(this.contain(cont)) return false;
		
		Contacto [] listaAux = new Contacto[lista.length+1];
		
		if(lista[0].compareTo(cont) < 0) {
			for(int i=0; i<lista.length;i++) {
				listaAux[i] = this.lista[i];
			}
			listaAux[listaAux.length-1]=cont;
			
			lista=listaAux;
			return true;
			
		} else if(lista[0].compareTo(cont) > 0) {
			for(int i=1; i<lista.length+1;i++) {
				listaAux[i] = this.lista[i-1];
			}
			listaAux[0]=cont;
			
			lista=listaAux;
			return true;
		}
		return false;
	}
	
	public boolean borrarContacto(Contacto cont) {
		
		if(lista.length == 0) return false; //La accion de borrar no se esta realizando por lo que devuelve false
		
		
		if(this.contain(cont)) {
			Contacto [] listaAux = new Contacto[lista.length-1];
			int j=0;
			
			for(int i=0; i<lista.length;i++) {
				if(!lista[i].equals(cont)) {
					listaAux[j] = this.lista[i];			
					j++;
				}
			}
			lista=listaAux;
			return true;
		
		}
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
	
	public boolean contain(Contacto cont) {
			
		for(int i=0; i<lista.length;i++) {
			if(lista[i].equals(cont)) {
				return true;
			}
		}
			
		return false;
	}
	
}
