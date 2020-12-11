package herenciaPolimorfismo;

public class Futbolista extends Persona {
	
	private int dorsal; 
	
	public Futbolista(String nombre, int dorsal) {
		super(nombre);
		this.dorsal = dorsal;
		
	}
	
	public String getNombre() {
		return "Futbolista "+ this.nombre +" con dorsal " + this.dorsal;
	}
	
	public String toString() {
		return "Esta es la clase Hija";
	}

}
