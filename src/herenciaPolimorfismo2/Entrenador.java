package herenciaPolimorfismo2;

public class Entrenador extends Persona implements Aficionado, Cloneable{ // se pued combinar abstracto con interface, recuerda: se puede implementar todas las interfa que se quiera, separandola con una coma.
	
	private String apodo; 
	
	public Entrenador(String nombre, String apodo) {
		super(nombre);
		this.apodo = apodo;	
		
		
	}
	
	public String getNombre() {
		return "Entrenador "+ this.nombre + " tambien conocido como "+ this.apodo;
	}

	
	public boolean equals(Entrenador entrenador) {
		
		return  this.apodo.equals(entrenador.getApodo());
		
	}
	
	public Entrenador clone() throws CloneNotSupportedException {
		Entrenador entrenador = new Entrenador (this.nombre, this.apodo);
		return entrenador;
	}
	
	public String getApodo () {
		return this.apodo;
	}
	public void cantar() {
		System.out.println("ESTOY CANTANDO");
	}
	public void aplaudir() {
		System.out.println("ESTOY APLAUDIENDO");
	}

	
}
