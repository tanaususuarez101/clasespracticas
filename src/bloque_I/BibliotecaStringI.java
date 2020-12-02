package bloque_I;

import java.util.Scanner;

public class BibliotecaStringI {
	public static void main(String[] args) {
		
		
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		// git reset --hard
		
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
		
		//MENU
		
		Scanner sn = new Scanner(System.in);
		
		boolean salir = false;
		int opcion;
		
		while(!salir) { //!=no, mientras que yo no haya dicho que salga, seguimos en el
			
			
			System.out.println("1. Caracteres de una cadena");
			System.out.println("2. Comienzo por subcadena");
			System.out.println("3. Repeticion del caracter");
			System.out.println("4. Contador de palabras");
			System.out.println("5. Iniciales en mayusculas");
			System.out.println("6. Reverse");
			System.out.println("7. Sustitucion de caracter");
			System.out.println("8. Conversion de mayus y min");
			System.out.println("9. Subcadena contenida");
			System.out.println("10. Palindromo");
			System.out.println("11. salir");
			
			
			
			System.out.println("Introduce un numero: ");
			opcion = sn.nextInt();
			
			switch(opcion) {
				case 1:
					leerConsola1();
					break;
				
				case 2:
					leerConsola2();
					break;	
					
				case 3:
					leerConsola3();
					break;
					
				case 4:
					leerConsola4();
					break;	
				
				case 5:
					leerConsola5();
					break;
				
				case 6:
					leerConsola6();
					break;
			
				case 7:
					leerConsola7();
					break;
			
				case 8:
					leerConsola8();
					break;
					
				case 9:
					leerConsola9();
					break;
					
				case 10:
					leerConsola10();
					break;
			
				case 11:
					salir = true;
					break;
					
				default: //Controla que se vaya fuera de rango (Del 1 al 11)
					System.out.println("Las opciones son entre 1 y 11");
					
			}			
		}
		
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
	
	
	
	
	
	/*
	Ejercicio 1
	Escribir por pantalla cada caracter de una cadena introducida por teclado.
    hola
    h
	o
	l
	a
    */
	
	public static void leerConsola1() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s1 = reader.nextLine();
		System.out.println("La cadena esta compuesta por los siguientes caracteres: ");
		for(int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
	}
	
	/*
	Ejercicio 2
	Realizar un programa que comprueba si una cadena leida por teclado comienza por una subcadena introducida por teclado.
	*/
	public static void leerConsola2() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s2 = reader.nextLine();
		System.out.println("Introduce una subcadena: ");
		String s21 = reader.nextLine();
		boolean sub = dentroPrin(s2,s21);
		
		System.out.println("¿La cadena contiene al principio la subcadena?: " + sub);
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
	Pide una cadena y un caracter por teclado (valida que sea un caracter) y muestra cuantas veces aparece el caracter en la cadena.
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
	Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayusculas.
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
	Pide una cadena y dos caracteres por teclado (valida que sea un caracter), sustituye la aparicion del primer caracter en la cadena por el segundo caracter.
	*/
	// juan pepe p c juan cece
	
	public static void leerConsola7() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s7 = reader.nextLine();
		System.out.println("Introduce un caracter: ");
		char c70 = reader.nextLine().charAt(0);
		System.out.println("Introduce otro caracter: ");
		char c71 = reader.nextLine().charAt(0);
		String susti = aparicion(s7,c70,c71);

		System.out.println("La cadena resultante es: " + susti );
		
	}	
	
	private static String aparicion(String s7, char primero, char segundo) {
		
		String result = "";
		
		for(int i = 0; i < s7.length(); i++) {
			if(s7.charAt(i) == primero) {
				result += segundo;
			} else {
				result += s7.charAt(i);
			}
		}		
		return result;
	}
	
	
	/*
	Ejercicio 8
	Realizar un programa que lea una cadena por teclado y convierta las mayusculas a minusculas y viceversa.
	*/
	public static void leerConsola8() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s8 = reader.nextLine();
		String result = conversion(s8);

		System.out.println("La cadena resultante es: " + result );
	}	
	/*
	*s8 = PePe
	*result = PEPE
	* result2= pEpE
	*/
	private static String conversion(String s8) {
		
		if(s8.isEmpty()) return "";
		String result = s8.toUpperCase();
		String result2 = "";
		String aux;
		
		for(int i = 0; i < s8.length(); i++) {
			aux = "";
			
			if(s8.charAt(i) == result.charAt(i)) {
				aux += result.charAt(i);
				aux = aux.toLowerCase();
				result2 += aux;	
			} else {
				result2 += result.charAt(i);		
			}	
		}
		return result2;
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
		System.out.println("Introduce una subcadena: ");
		String s91 = reader.nextLine();
		boolean sub = dentro(s9,s91);
		
		System.out.println("¿La cadena contiene la subcadena? " + sub);
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
	Introducir una cadena de caracteres e indicar si es un palindromo. Una palabra palindroma es aquella que se lee igual adelante que atras.
	
	palindromo = ana
	 */
	public static void leerConsola10() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String s10 = reader.nextLine();
		boolean p1= s10.equals(reverse2(s10));
		System.out.println("¿Es un palindromo? " + p1);
	}
	
	
}

