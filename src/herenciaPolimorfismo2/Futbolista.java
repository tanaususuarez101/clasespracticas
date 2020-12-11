package herenciaPolimorfismo2;

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
	
	public int getDorsal() {
		return dorsal;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Futbolista) {
			Futbolista fub = (Futbolista) obj;
			//return fub.getDorsal() == this.dorsal;
			//return fub.nombre.equals(this.nombre);
			return fub.nombre.equals(this.nombre) && fub.getDorsal() == this.dorsal;
			
		} else {
			return false;
		}
	}
	

	
	public Futbolista clone() {
		Futbolista futbolista = new Futbolista (this.nombre, this.dorsal);
		return futbolista;
	}
}
