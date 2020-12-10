package herenciaPolimorfismo;

public class main {

	public static void main(String[] args) {
		
		Persona persona = new Futbolista("Juan", 2);
		System.out.println(persona.getNombre());
		
		Persona persona2 = new Entrenador("Pepe", "el flaco");
		System.out.println(persona2.getNombre()+"\n");
		
		
		if ( persona instanceof Futbolista ) {
			System.out.println("Persona es un fubolista");
		}
		if ( !(persona instanceof Entrenador) ) {
			System.out.println("Persona no es un fubolista");
		}
		

	}

}
