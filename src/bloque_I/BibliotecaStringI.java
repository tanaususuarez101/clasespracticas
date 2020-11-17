package bloque_I;

public class BibliotecaStringI {
	public static void main(String[] args) {
		
		String holaMundo = "                   Hola mundo como estas";
		
		System.out.println(holaMundo);
		
		String result = holaMundo.toUpperCase();
		System.out.println(result);
		
		System.out.println(result.trim());
		
		// Mala forma
		if (holaMundo == "Hola mundo") {
			
		}
		
		// Buena forma:
		if (holaMundo.compareTo("Hola mundo") == 0) {
			
		}
		// Buena forma 2
		if (holaMundo.equals("Hola mundo")) {
			
		}
		
		//holaMundo.charAt(index) -> string
		// array[index] -> array
		
		// holaMundo.length() -> string
		// array.length -> array
		holaMundo = holaMundo.trim();
		String[] cadenas = holaMundo.split(" ");
		
		System.out.println(cadenas.length);
		for (String elemento: cadenas) {
			System.out.println(elemento);
		}
		// ["", "", "", ""]
		
		
		System.out.println(holaMundo.charAt(0));
	}
}
