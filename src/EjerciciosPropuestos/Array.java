package EjerciciosPropuestos;

/**
 * Descripción:
 * En la clase Array se van a desarrollar métodos para hacer ejercicios con array
 * 
 */
 
public class Array {
	public static void main (String[] args){
		System.out.println("Inicio método main...");
		
		/*
		 *  ESCRIBA EL CÓDIGO DENTRO DE ESTE BLOQUE QUE QUEIRA PROBAR
		 * */
		
		
		// Ejemplo de llamada a un método estático:
		// 1º Forma:
		//metodoTest();
		// 2º Forma:
		//Array.metodoTest();
		
		/*
		 * LOS EJERCICIOS QUE APARECE A CONTINUACIÓN ES PARA PRACTICAR CON ARRAY, EL CÓDIGO QUE ESCRIBAS MÉTELO
		 * DENTRO DE UN MÉTODO (COMO EL EJEMPLO ANTERIOR) Y REALIZA LAS LLAMADAS QUE CREAS CONVENIENTE DEBAJO DE CADA ENUNCIADO 
		 *
		 * */
				
		// 1) Crea un array con un tamaño de 5, asignale los valores numéricos manualmente (los que tu quieras) y muestralos por pantalla.
		
		
		// 2) Crea un método que genere un array de enteros que se rellenen de 0 hasta el valor pasado por parámetro y lo muestre por pantalla.
		int[] valorDevuelto = generarArray1(5);
		//imprimirArray(valorDevuelto);
		
		
		
		// 3) Crea un método que genere un array de enteros que se rellenen del valor pasado por parámetro  hasta 0 y lo muestre por pantalla.
		
		
		// 4) Crea un método que pasándole como parámetro un array devuelva los valores multiplos de dos y lo muestre por pantalla.
		
		
		// 5) Crea un método que devuelva un array con las posiciones pares de un array pasado por parámetro y lo muestre por pantalla.

		
		// 6) Crea un método que devuelva un array que sera la combinación de otros dos pasado por parámetro y lo muestre por pantalla.
		
		
		// 7) Crea un método que pasándole un entero y un array devuelva otro array con valores superior al entero pasado y muestre por pantalla el resultado
		
		
		// 8) Crea un método que pasándole un array de enteros, me lo devuelva ordenado y muestre por pantalla el resultado. 



		// 9) Crear un método que pasándole como parámetro un array y un valor del mismo tipo me devuelva si está o no (si está devolverá true, en caso contrario false)
		String[] a1 = {"valor","perro", "gato", "pepe", "jose, manue", "alberto"};
		String a2 = "fato";
		String a3 = "gato";
		String a4 = "";
		
		System.out.println("Tamaño del array: " + a1.length);
		
		System.out.print("ARRAY ORDENADO ES: "  );
		imprimirArray(generarArray8(new int[]{2, 5, 8, 4, 0}));
		
		
		//System.out.println("Resultado de contain array es: " + Array.containArray(a1, a4));
		/*
		 * FIN DEL BLOQUE
		 * */
		System.out.println("Final método main...");
	}
	
	// i = 1
	// j = 0
	// array = {2, 5, 8, 4, 0}
	// 1º ite = {0, 5, 8, 4, 2}
	// 2º ite_1 = {0, 4, 8, 5, 2}
	// 2º ite_2 = {0, 2, 8, 5, 4}
	// 3º ite_1 = {0, 2, 5, 8, 4}
	// 3º ite_2 = {0, 2, 4, 8, 5}
	// 3º ite_3 = {0, 2, 4, 5, 8}

	private static int[] generarArray8(int[]array){
		
		
		// si array es de tamaño 0, devuelvo un array sin contenido, tamaño 0
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
	

	
	
	// siendo n el tamaño
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
		System.out.println("Has llamado al método test");
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
