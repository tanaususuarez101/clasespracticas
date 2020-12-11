package EjerciciosPropuestos;

/**
 * Descripci�n:
 * En la clase Array se van a desarrollar m�todos para hacer ejercicios con array
 * 
 */
 
public class Array {
	public static void main (String[] args){
		System.out.println("Inicio m�todo main...");
		
		/*
		 *  ESCRIBA EL C�DIGO DENTRO DE ESTE BLOQUE QUE QUEIRA PROBAR
		 * */
		
		
		// Ejemplo de llamada a un m�todo est�tico:
		// 1� Forma:
		//metodoTest();
		// 2� Forma:
		//Array.metodoTest();
		
		/*
		 * LOS EJERCICIOS QUE APARECE A CONTINUACI�N ES PARA PRACTICAR CON ARRAY, EL C�DIGO QUE ESCRIBAS M�TELO
		 * DENTRO DE UN M�TODO (COMO EL EJEMPLO ANTERIOR) Y REALIZA LAS LLAMADAS QUE CREAS CONVENIENTE DEBAJO DE CADA ENUNCIADO 
		 *
		 * */
				
		// 1) Crea un array con un tama�o de 5, asignale los valores num�ricos manualmente (los que tu quieras) y muestralos por pantalla.
		
		int [] valorDevuelto1 = {2,6,0,1,3};
		imprimirArray1(valorDevuelto1);
		
		// 2) Crea un m�todo que genere un array de enteros que se rellenen de 0 hasta el valor pasado por par�metro y lo muestre por pantalla.
		
		int[] valorDevuelto2 = generarArray2(5);
		imprimirArray1(valorDevuelto2);
		
		// 3) Crea un m�todo que genere un array de enteros que se rellenen del valor pasado por par�metro  hasta 0 y lo muestre por pantalla.
		
		int[] valorDevuelto3 = generarArray3(5);
		imprimirArray1(valorDevuelto3);
	
		// 4) Crea un m�todo que pas�ndole como par�metro un array devuelva los valores multiplos de dos y lo muestre por pantalla.
		// x/y = cociente
		// x%y = resto
		// x%y == 0 (Y multiplo de x)
		// x%2 == 0 (X multiplo de 2)
		
		System.out.print("MULTIPLOS DE 2: "  );
		imprimirArray8(generarArray4(new int [] {2, 5, 8, 2, 1, 4, 0}));
		
		// 5) Crea un m�todo que devuelva un array con las posiciones pares de un array pasado por par�metro y lo muestre por pantalla.
		
		System.out.print("POSICIONES PARES: "  );
		imprimirArray8(generarArray5(new int [] {1, 5, 4, 6, 3, 0, 8}));
	
		// 6) Crea un m�todo que devuelva un array que sera la combinaci�n de otros dos pasado por par�metro y lo muestre por pantalla.
		
		String [] nombre = {"Juan", "Pedro", "Pepe", "Luis"};
		String [] apellido = {"Suarez", "Hernandez", "Monzon", "Aguiar"};
		
		imprimirArray2(generarArray6(nombre, apellido));
		
		// 7) Crea un m�todo que pas�ndole un entero y un array devuelva otro array con valores superior al entero pasado y muestre por pantalla el resultado
		
		int entero = 4;
		int [] array = {8, 4, 3, 1, 5, 5};
		
		System.out.print("LOS VALORES SUPERIORES SON: ");
		imprimirArray8(generarArray7(entero, array));
		
		
		// 8) Crea un m�todo que pas�ndole un array de enteros, me lo devuelva ordenado y muestre por pantalla el resultado. 
		
		System.out.print("ARRAY ORDENADO ES: "  );
		imprimirArray8(generarArray8(new int [] {2, 5, 8, 4, 0}));

		// 9) Crear un m�todo que pas�ndole como par�metro un array y un valor del mismo tipo me devuelva si est� o no (si est� devolver� true, en caso contrario false)
		
		String [] a1 = {"valor","perro", "gato", "pepe", "jose, manue", "alberto"};
		//String a2 = "fato";
		//String a3 = "gato";
		String a4 = "";
				
		//System.out.println("Tama�o del array: " + a1.length);
		System.out.println("RESULTADO DE CONTAIN ARRAY ES: " + Array.containArray(a1, a4));
		System.out.println("");
		
		//10) Crear un metodo que duevuelva la sumatoria de los valores de un array (tipo double) pasado por parametros 
		
		double [] param1 = {2.2, 5.1, 8.5, 4.7, 0.9};
		
		System.out.println("LA SUMATORIA ES: " + generarArray10(param1));
		System.out.println("");

		
		
		/*
		 * FIN DEL BLOQUE
		 * */
		System.out.println("Final m�todo main...");
	}
	
	
	public static void metodoTest() {
		System.out.println("Has llamado al m�todo test");
	}
	
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 1: Crea un array con un tama�o de 5, asignale los valores num�ricos manualmente (los que tu quieras) y muestralos por pantalla.
	
	private static void imprimirArray1(int [] array) {
		
		System.out.print("LOS ELEMENTOS DEL ARRAY SON LOS SIGUIENTES: ");
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		System.out.println("");
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 2: Crea un m�todo que genere un array de enteros que se rellenen de 0 hasta el valor pasado por par�metro y lo muestre por pantalla.
	
	private static int [] generarArray2(int size) {
		
		int[] resultado = new int[size];
		for (int i = 0; i < size; i++) {
			resultado[i] = i;
		}
		return resultado;
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 3: Crea un m�todo que genere un array de enteros que se rellenen del valor pasado por par�metro  hasta 0 y lo muestre por pantalla.
	
	//{0, 0, 0, 0, 0}
	//{0, 0, 0, 0, 4} 1 Iteracion
	//{0, 0, 0, 3, 4} 2 Iteracion
	//{0, 0, 2, 3, 4} 3 Iteracion
	//{0, 1, 2, 3, 4} 4 Iteracion
	//{0, 1, 2, 3, 4} 5 Iteracion
	
	//5 size-1=4
	//{0,0,0,0,0} i=0
	//{4,0,0,0,0} i=1
	//{4,3,0,0,0} i=2
	//{4,3,2,0,0} i=3
	//{4,3,2,1,0} i=4
	//{4,3,2,1,0} i=5
	
	public static int [] generarArray3(int size) {
		
		int[] resultado = new int[size];
		//Diferentes maneras de recorrer un array
		//for (int i =0 ; i<=size-1 ; i++) {
		//for (int i =0 ; i< resultado.length ; i++) {
		for (int i =0 ; i<=resultado.length-1 ; i++) {
			//resultado[i] = size-1 - i;
			resultado[i] = resultado.length -1 - i;
		}
		return resultado;
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 4: Crea un m�todo que pas�ndole como par�metro un array devuelva los valores multiplos de dos y lo muestre por pantalla.
	
	//int [] {2, 5, 8, 2, 1, 4, 0} =7
	//multiplo = {0, 0, 0, 0, 0} =5
	
	public static int [] generarArray4(int [] array){
		
		int contador = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				contador ++; 
			}
		}
		
		int [] multiplo = new int [contador];
		
		int j = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				multiplo[j] = array[i];
				j ++; //Incremento la POSICION 
			}
		}
		return multiplo;
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercico 5: Crea un m�todo que devuelva un array con las posiciones pares de un array pasado por par�metro y lo muestre por pantalla.
	
	//Pos  0  1  2  3  4  5  6  
	//    {1, 5, 4, 6, 3, 0, 8, } tama�o = 7
	
	
	
	public static int [] generarArray5(int [] array) {
		
		int tamanoArray= 0;
		
		if(array.length%2 ==0) {
			tamanoArray = array.length/2 ;
		} else {
			tamanoArray = (array.length/2) +1;
		}
		
		int [] pospares = new int [tamanoArray];
		int j = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(i%2 == 0){
				pospares[j] = array[i];
				j++;
			}
		}
		return pospares;
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 6: Crea un m�todo que devuelva un array que sera la combinaci�n de otros dos pasado por par�metro y lo muestre por pantalla.
	
	//nombre = {"Juan", "Pedro", }
	//apellido = {"Suarez", "Monzon",}
	//combinacion = {null, null, null, null} Comienza vacio
	//combinacion = {juan, pedro, null, null} Se ha a�adido nombre dentro de vacio
	//combinacion = {juan, pedro, null, null} Comenzara a copiar apellido dentro de combinacion a partir de haber copiado nombre
	
	public static String [] generarArray6(String [] nombre, String [] apellido){
		
		String [] combinacion = new String [nombre.length + apellido.length];
		int i = 0; //Esta variable de tipo entero la creamos para ahorrarnos crearla 2 veces en el for
		
		for(i = 0; i < nombre.length; i++) {
			combinacion[i] = nombre[i];
		}
		
		for(i = 0; i < apellido.length; i++) {
			combinacion[apellido.length + i] = apellido[i];
		}
		return combinacion;
			
	}   
	
	
	private static void imprimirArray2(Object [] array) {
		
		System.out.print("LA COMBINACION ES: ");
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		System.out.println("");
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 7: Crea un m�todo que pas�ndole un entero y un array devuelva otro array con valores superior al entero pasado y muestre por pantalla el resultado
	
	//entero = 4
	//array = [8, 4, 3, 1, 5, 5]
	//superior =[8, 5, 5]
	
	public static int [] generarArray7(int entero, int [] array) {
		 
		int tamanoArray = 0;
		for(int i = 0; i < array.length; i++) {
			if(entero < array[i]) {
				tamanoArray ++;
			}
		}
		
		
		int [] superior = new int [tamanoArray];
		int j = 0;
		for(int i = 0; i < array.length; i++) {
			if(entero < array[i]) {
				superior[j]=array[i];
				j++;
			}
		}
		return superior;
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 8: Crea un m�todo que pas�ndole un array de enteros, me lo devuelva ordenado y muestre por pantalla el resultado.
	
	// i = 1
	// j = 0
	// array = {2, 5, 8, 4, 0}
	// 1� ite = {0, 5, 8, 4, 2}
	// 2� ite_1 = {0, 4, 8, 5, 2}
	// 2� ite_2 = {0, 2, 8, 5, 4}
	// 3� ite_1 = {0, 2, 5, 8, 4}
	// 3� ite_2 = {0, 2, 4, 8, 5}
	// 3� ite_3 = {0, 2, 4, 5, 8}
	
	private static int [] generarArray8(int [] array){
		
		// si array es de tama�o 0, devuelvo un array sin contenido, tama�o 0
		int temp = 0;
		
		for (int i = 0; i < array.length-1; i++){
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[i] > array[j]) {					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	
	private static void imprimirArray8(int [] array) {
		
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		System.out.println("");
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 9: Crear un m�todo que pas�ndole como par�metro un array y un valor del mismo tipo me devuelva si est� o no (si est� devolver� true, en caso contrario false)
	
	// siendo n el tama�o
	//             0         1        2    ...,   n-1
	// param1 = {'valor', 'perro', 'gato', ..., 'juan'}
	// param2 = 'pajaro'
	
	public static boolean containArray(String [] param1, String param2){
		
		//Comprobamos de izquierda a derecha,es decir, desde el tama�o final del array hasta las posicion 0
		for (int i = param1.length-1; i >= 0; i--){
			if (param1[i] == param2){
				return true;
			}
		}
		/*
		//Comprobamos de derecha a izquierda,es decir, desde la posicion 0 hasta el tama�o final del array
		for (int i = 0 ; i < param1.length; i = i+1) {
			if (param1[i] == param2){
				return true;
			}
		}
		 */
		return false;		
	}
	
	//*******************************************************************************************************************************//
	
	
	//*******************************************************************************************************************************//
	
	//Ejercicio 10: Crear un metodo que duevuelva la sumatoria de los valores de un array (tipo double) pasado por parametros 
	
	//param1 = {2.2, 5.1, 8.5, 4.7, 0.9};
	
	public static double generarArray10(double [] param1) {
		
		double sumatoria = 0;
		
		for(int i = 0; i < param1.length; i++) {
			sumatoria += param1[i]; //sumatoria = param1[i] + sumatoria
		}
		return sumatoria;
	}
	
	//*******************************************************************************************************************************//
	
}

