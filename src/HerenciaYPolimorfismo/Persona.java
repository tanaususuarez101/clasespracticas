package HerenciaYPolimorfismo;

public class Persona extends Contacto{
	private String nombre;
	private Long telefono;
	
	public Persona() {
		nombre = "";
		telefono = 0L;
	}
	
	public Persona(String nombre, Long telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Long getTelefono() {
		return this.telefono;
	}
	
	public String toString() {
		return this.nombre + " " + this.telefono;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setTelefono(Long telefono) {
		this.telefono=telefono;
	}
	
	public boolean equals(Persona persona) {
		
		if(this.nombre.equals(persona.getNombre()) && this.telefono.equals(persona.getTelefono())) {
			return true;
		}
		return false;
	}
	
	
}
