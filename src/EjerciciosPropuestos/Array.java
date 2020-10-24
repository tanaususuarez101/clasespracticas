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
		
		
		// 2) Crea un m�todo que genere un array de enteros que se rellenen de 0 hasta el valor pasado por par�metro y lo muestre por pantalla.
		int[] valorDevuelto = generarArray1(5);
		//imprimirArray(valorDevuelto);
		
		
		
		// 3) Crea un m�todo que genere un array de enteros que se rellenen del valor pasado por par�metro  hasta 0 y lo muestre por pantalla.
		
		
		// 4) Crea un m�todo que pas�ndole como par�metro un array devuelva los valores multiplos de dos y lo muestre por pantalla.
		
		
		// 5) Crea un m�todo que devuelva un array con las posiciones pares de un array pasado por par�metro y lo muestre por pantalla.

		
		// 6) Crea un m�todo que devuelva un array que sera la combinaci�n de otros dos pasado por par�metro y lo muestre por pantalla.
		
		
		// 7) Crea un m�todo que pas�ndole un entero y un array devuelva otro array con valores superior al entero pasado y muestre por pantalla el resultado
		
		
		// 8) Crea un m�todo que pas�ndole un array de enteros, me lo devuelva ordenado y muestre por pantalla el resultado. 



		// 9) Crear un m�todo que pas�ndole como par�metro un array y un valor del mismo tipo me devuelva si est� o no (si est� devolver� true, en caso contrario false)
		String[] a1 = {"valor","perro", "gato", "pepe", "jose, manue", "alberto"};
		String a2 = "fato";
		String a3 = "gato";
		String a4 = "";
		
		System.out.println("Tama�o del array: " + a1.length);
		
		System.out.print("ARRAY ORDENADO ES: "  );
		imprimirArray(generarArray8(new int[]{2, 5, 8, 4, 0}));
		
		
		//System.out.println("Resultado de contain array es: " + Array.containArray(a1, a4));
		/*
		 * FIN DEL BLOQUE
		 * */
		System.out.println("Final m�todo main...");
	}
	
	// i = 1
	// j = 0
	// array = {2, 5, 8, 4, 0}
	// 1� ite = {0, 5, 8, 4, 2}
	// 2� ite_1 = {0, 4, 8, 5, 2}
	// 2� ite_2 = {0, 2, 8, 5, 4}
	// 3� ite_1 = {0, 2, 5, 8, 4}
	// 3� ite_2 = {0, 2, 4, 8, 5}
	// 3� ite_3 = {0, 2, 4, 5, 8}

	private static int[] generarArray8(int[]array){
		
		
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
	

	
	
	// siendo n el tama�o
	//             0         1        2    ...,   n-1
	// param1 = {'valor', 'perro', 'gato', ..., 'juan'}
	// param2 = 'pajaro'
	public static boolean containArray(String[] param1, String param2){
		
		// 5
		for (int i = param1.length-1; i >= 0; i--){
			if (param1[i] == param2){
				return true;
			}
		}
		
		/*
		for (int i = 0 ; i < param1.length; i = i+1) {
			if (param1[i] == param2){
				return true;
			}
		}
		*/
		
		
		return false;		
	}
	
	public static void metodoTest() {
		System.out.println("Has llamado al m�todo test");
	}
	
	private static int[] generarArray1(int size) {
		
		int[] resultado = new int[size];
		for (int i = 0; i < size; i++) {
			resultado[i] = i;
		}
		return resultado;
	}
	
	private static void imprimirArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++ ){
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
	}

}
