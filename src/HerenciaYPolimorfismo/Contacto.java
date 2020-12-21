package HerenciaYPolimorfismo;

public class Contacto {
	
	private String nombre; //Al ser una extension, no hace falta
	private Long telefono;
	
	
	public Contacto(String nombre, Long telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Long getTelefono() {
		return this.telefono;
	}
	
	public String toString() {
		return this.nombre + ": " + this.telefono; //Añadi los 2 puntos para que fuera igual que como pedian
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setTelefono(Long telefono) {
		this.telefono=telefono;
	}
	
	public boolean equals(Contacto cont) {
		
		if(this.nombre.equals(cont.getNombre())){ // && this.telefono.equals(cont.getTelefono())) {
			return true;
		}
		return false;
	}
	
	/*
	 * Si la referencia > parametro > 0 return 1
	 * 
	 * Si la ref = param; return 0
	 * 
	 * si ref < param;  return < 0 return -1
	 */
	
	public int compareTo(Contacto cont) {
		//int valor = (this.nombre.compareTo(cont.getNombre());
		if(this.nombre.compareTo(cont.getNombre()) > 0) {
			return 1;
		} else if(this.nombre.compareTo(cont.getNombre()) < 0){
			return -1;
		}
		return 0;
	}
	
	
	
}
