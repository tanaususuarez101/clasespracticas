package bloque_I;

import java.util.Scanner;

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
		/*
		holaMundo = holaMundo.trim();
		String[] cadenas = holaMundo.split(" ");
		
		System.out.println(cadenas.length);
		*/
		/*
		for (String elemento: cadenas) {
			System.out.println(elemento);
		}
		*/
		
		
		// ["", "", "", ""]
		
		
		//System.out.println(holaMundo.charAt(0));
		
		
		//reverse("Hola mundo");
		//eliminarCaracter("Hola mundo", 'o');
		
		//printArray2(new int[]{1,2,3,4});
		
		
		
		//EJERCICIOS
		//leerConsola1();
		//leerConsola2();
		//leerConsola3();
		//leerConsola4();
		//leerConsola5();
		//leerConsola6();
		//leerConsola8();
		//leerConsola9();
		leerConsola10();
		
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
	
	
	private static String reverse2 (String cadena) {
		
		//String(char[] value)
		
		char[] resultado = new char[cadena.length()];
		
		//System.out.println(cadena);
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			resultado[(cadena.length()-1)-i] = cadena.charAt(i);				
		}
		String value = new String(resultado);
		
		return value;
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
	
	
	// EJERCICIOOOOOO         Ordenar un array de tipo String(compareto)
	
	// git reset --hard
	
	
	private static boolean contenida (String s1, String s2) {
		
		return false;
	}
	
	
	/*
	 * hola
	 * H
	 * O
	 * L
	 * a
	 */
	
	
	/*
	Ejercicio 1
	Escribir por pantalla cada carácter de una cadena introducida por teclado.
	*/
	public static void leerConsola1() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una caracter: ");
		String s1 = reader.nextLine();
		s1 = s1.trim();
		String [] cadenas = s1.split(" ");
	}
	/*
	Ejercicio 2
	Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.
	*/
	public static void leerConsola2() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s2 = reader.nextLine();
		String s21 = reader.nextLine();
		boolean sub = dentroPrin(s2,s21);
		
		System.out.println("�La cadena contiene al principio la subcadena?: " + sub);
	}
	/* 0123456789
	 * esternocleidomastoideo
	 * 01234
	 * ester
	 */
	private static boolean dentroPrin(String s1, String s2) {
		
		boolean contador = false;
		
		for(int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) == s1.charAt(i)) {
				contador = true;	
			}else {
				return false;
			}
		}
		return contador;
	}
	
	/*
	Ejercicio 3
	Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.
	*/
	public static void leerConsola3() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s3 = reader.nextLine();
		System.out.println("Introduce una caracter: ");
		char c3 = reader.nextLine().charAt(0);
		int valor = repeticion(s3,c3);
		System.out.println("El caracter se repite " + valor + " veces en la cadena.");
	}
	
	private static int repeticion(String s3, char c3) {
		
		int result = 0;
		
		for(int i = 0; i < s3.length(); i++) {
			if (c3 == s3.charAt(i)) {
				result ++;
			}
		}
		return result;
	}
	
	
	/*
	Ejercicio 4
	Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
	*/
	
	public static void leerConsola4() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s4 = reader.nextLine();
		s4 = s4.trim();
		String [] cadena = s4.split(" ");
		System.out.println("La cadena tiene " + cadena.length + " palabras.");
		
	}
	
	
	/*
	Ejercicio 5
	Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.
	*/
	
	public static void leerConsola5() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce nombre y apellidos: ");
		String s5 = reader.nextLine();
		String ini = iniciales(s5);
		System.out.println("Las iniciales son: " + ini);
		
	
	}	
	
	/*"Pepe Juan lopez vazquez"
	 * separacion = {"Pepe" "Juan" "lopez" "vazquez"} 
	* "PJLV"
	*
	**/
	private static String iniciales(String s5) {
		
		String result = "";
		s5 = s5.trim();
		String [] separacion = s5.split(" ");

		
		for(int i = 0; i < separacion.length; i++) {
			if(separacion[i].length() > 0) {
				result += separacion[i].trim().charAt(0);
			}
		}
		
		return result.toUpperCase();
	}
	//Hola mundo
	//aloH odnum
	
	/*
	Ejercicio 6
	Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena resultado de invertir la primera.
	*/
	public static void leerConsola6() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s6 = reader.nextLine();
		
		reverse(s6);
	}
	
	//Reutilizamos el metodo reverse creado al principio
	
	/*
	Ejercicio 7
	Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.
	*/
	// juan pepe p c juan cece
	
	
	/*
	Ejercicio 8
	Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
	*/
	public static void leerConsola8() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s8 = reader.nextLine();
		String result = conversion(s8);

		System.out.println("La cadena resultante es: " + result );
		
	
	}	
	/*
	*Pepe
	*PEPE
	*pEPE
	*/
	
	private static String conversion(String s8){
		
		String result = "";
		String [] separacion = s8.split(" ");
		
		for(int i = 0; i < separacion.length; i++) {
			if(separacion[i] == s8.toUpperCase()) {
				separacion[i].toLowerCase();
			} else {
				separacion[i].toUpperCase();
			}
			result += separacion[i];
		}
		
		return result;
	}
	//pepejuan o pepe juan 
	/*
	Ejercicio 9
	Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
	*/
	public static void leerConsola9() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s9 = reader.nextLine();
		String s91 = reader.nextLine();
		boolean sub = dentro(s9,s91);
		
		System.out.println("�La cadena contiene la subcadena?: " + sub);
	}
	/* 0123456789
	 * esternocleidomastoideo
	 * 01234
	 * nocle
	 */
	private static boolean dentro(String s1, String s2) {
		
		if(s1.isEmpty() || s2.isEmpty()) return false;
		
		int cuento = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				if(i+j < s1.length() && s1.charAt(i+j) == s2.charAt(j)) {	
					cuento = cuento +1;	
				} else {
					cuento = 0;
					break;
				}
			}
			if(cuento == s2.length()) {
				return true;
			}
		}
		return false;
	}
	
	/*
	Ejercicio 10
	Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.
	
	palindromo = ana
	 */
	public static void leerConsola10() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s10 = reader.nextLine();
		boolean p1= s10.equals(reverse2(s10));
		System.out.println(p1);
	}
	
	
}

