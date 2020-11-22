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
	
}
