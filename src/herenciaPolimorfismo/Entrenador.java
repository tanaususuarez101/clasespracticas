package herenciaPolimorfismo;

public class Entrenador extends Persona{
	
	private String apodo; 
	
	public Entrenador(String nombre, String apodo) {
		super(nombre);
		this.apodo = apodo;	
		
		
	}
	
	public String getNombre() {
		return "Entrenador "+ this.nombre + " tambien conocido como "+ this.apodo;
	}


}
