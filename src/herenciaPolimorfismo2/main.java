package herenciaPolimorfismo2;

public class main {

	public static void main(String[] args) {
		System.out.println("Ejemplo 1:");
		Persona persona = new Futbolista("Juan", 2);
		System.out.println(persona.getNombre());
		
		Persona persona2 = new Entrenador("Pepe", "el flaco");
		System.out.println(persona2.getNombre()+"\n");
		
		/*****************************************************/
		System.out.println("Ejemplo 2:");
		if ( persona instanceof Futbolista ) {
			System.out.println("Persona es un fubolista");
		}
		if ( !(persona instanceof Entrenador) ) {
			System.out.println("Persona no es un fubolista");
		}
		
		/*****************************************************/
		System.out.println();
		System.out.println("Ejemplo 3:");
		System.out.println(persona);// al recibir una string, automáticamente llama al método toString
		
		/*****************************************************/
		System.out.println();
		System.out.println("Ejemplo 4:");
		Entrenador entrenador = new Entrenador("Pepe", "er chapa");
		System.out.println(entrenador.toString()); // ¿por que se está imprimiendo el toString de la clase padre? respuesta: polimorfismo, si no esta sobre escrito este método coge la clase padre
		
		Futbolista futbolista = new Futbolista("Jugador", 29);		
		System.out.println(futbolista.toString()); // en este caso sí ejecuta la clase hija, por que está sobreescrito el del padre.
		
		/*****************************************************/
		System.out.println();
		System.out.println("Ejemplo 5:");
		// Ejemplo de casteo  - Forma segura: de clase base a clase heredada, al reves puede producir error (aunque se permita)
		// Este apartado está en la página 12 del pdf 4.1
		//Persona personaCasteada = (Persona) entrenador;
		//System.out.println(personaCasteada);
		
		System.out.println();
		System.out.println("Ejemplo 6:");
		entrenador.cantar();
		
		Entrenador entrenador2 = new Entrenador("Pepe", "er chapa");
		
		System.out.println();
		System.out.println("Ejemplo 7:");
		if (entrenador.equals(entrenador2)) {
			System.out.println("El objecto entrenador es el mismo");
		} else {
			System.out.println("El objecto entrenador NO es el mismo");
		}
		
		try {
			Entrenador nuevo = entrenador2.clone();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		

	}

}
