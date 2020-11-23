package bloque_I;

public class BibliotecaStringI {
	public static void main(String[] args) {
		
		
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		
		String holaMundo = "                   Hola mundo como estas";
		
		//System.out.println(holaMundo);
		
		String result = holaMundo.toUpperCase();
		//System.out.println(result);
		
		//System.out.println(result.trim());
		
		// Mala forma
		if (holaMundo == " ") {
			
		}
		
		String objetovacio = " ";
		if (holaMundo.isEmpty())
		
		
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
		
		/*holaMundo = holaMundo.trim();
		String[] cadenas = holaMundo.split(" ");
		
		System.out.println(cadenas.length);
		/*
		for (String elemento: cadenas) {
			System.out.println(elemento);
		}
		*/
		
		
		// ["", "", "", ""]
		
		
		//System.out.println(holaMundo.charAt(0));
		
		
		//reverse("Hola mundo");
		//eliminarCaracter("Hola mundo", 'o');
		
		printArray2(new int[]{1,2,3,4});
		
	}
	//	0  1 
	// [1, 2,3, 5, 3]
	
	// 0123456789
	// Hola mundo
	// char[] = ["H", "o", "l", "a", ....]
	
	
	// odnum aloH
	
	private static void reverse(String cadena) {
		
		//String(char[] value)
		
		char[] resultado = new char[cadena.length()];
		
		System.out.println(cadena);
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			resultado[(cadena.length()-1)-i] = cadena.charAt(i);			
			
		}
		
		String value = new String(resultado);
		
		System.out.println(value);
		
	}
	// Hola mundo
	// Hla mund
	private static void eliminarCaracter(String cadena, char caracter) {
		String resultado = "";
		System.out.println(cadena);
		
		
		for(int i = 0; i < cadena.length(); i++) {
			if (caracter == cadena.charAt(i)) {
				resultado += " ";
			} else {
				resultado += cadena.charAt(i);
			}
			
		}
		
		cadena = resultado;
		System.out.println(cadena);
		
	}
	// [1,2,3,4,]
	
	private static void printArray(int[] array){
		String stringArray = "[";
		
		for(int i = 0; i < array.length; i++) {
			if (i == array.length-1) {
				stringArray += array[i];
			} else {
				stringArray += array[i] + ", ";
			}
						
		}
		stringArray +="]"; 
		
		
		
		
		System.out.print(stringArray);	
	}
	// "HOLA MUNDO COMO ESTAS"
	private static void printArray2(int[] array){
		String stringArray = "[";
		
		for(int i = 0; i < array.length; i++) {
			
			stringArray += array[i] + ", ";
			
						
		}
		
		stringArray = stringArray.substring(0, stringArray.length()-2);
		stringArray +="]"; 
		
		
		
		
		System.out.print(stringArray);	
	}
	
	// Ejercicio 1. Comprobar que la string s1 esta contenida dentro de s2.
	
	// git reset --hard
	
	
	private static boolean contenida (String s1, String s2) {
		
		return false;
	}
	
	
	/*
	 Ejercicio 1
	Escribir por pantalla cada carácter de una cadena introducida por teclado.
	
	Ejercicio 2
	Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.
	
	Ejercicio 3
	Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.
	
	Ejercicio 4
	Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
	
	Ejercicio 5
	Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.
	
	Ejercicio 6
	Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena resultado de invertir la primera.
	
	Ejercicio 7
	Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.
	
	Ejercicio 8
	Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
	
	Ejercicio 9
	Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
	
	Ejercicio 10
	Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.
	 */
}
