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
		metodoTest();
		// 2º Forma:
		Array.metodoTest();
		
		/*
		 * LOS EJERCICIOS QUE APARECE A CONTINUACIÓN ES PARA PRACTICAR CON ARRAY, EL CÓDIGO QUE ESCRIBAS MÉTELO
		 * DENTRO DE UN MÉTODO (COMO EL EJEMPLO ANTERIOR) Y REALIZA LAS LLAMADAS QUE CREAS CONVENIENTE DEBAJO DE CADA ENUNCIADO 
		 *
		 * */
				
		// 1) Crea un array con un tamaño de 5, asignale los valores numéricos manualmente (los que tu quieras) y muestralos por pantalla.
		
		
		// 2) Crea un método que genere un array de enteros que se rellenen de 0 hasta el valor pasado por parámetro y lo muestre por pantalla.
		int[] valorDevuelto = generarArray1(5);
		imprimirArray(valorDevuelto);
		
		
		
		// 3) Crea un método que genere un array de enteros que se rellenen del valor pasado por parámetro  hasta 0 y lo muestre por pantalla.
		
		
		// 4) Crea un método que pasándole como parámetro un array devuelva los valores multiplos de dos y lo muestre por pantalla.
		
		
		// 5) Crea un método que devuelva un array con las posiciones pares de un array pasado por parámetro y lo muestre por pantalla.
		

	
		// 6) Crea un método que devuelva un array que sera la combinación de otros dos pasado por parámetro y lo muestre por pantalla.
		
		
		// 7) Crea un método que pasándole un entero y un array devuelva otro array con valores superior al entero pasado y muestre por pantalla el resultado
		
		
		// 8) Crea un método que pasándole un array de enteros, me lo devuelva ordenado y muestre por pantalla el resultado. 



		
		/*
		 * FIN DEL BLOQUE
		 * */
		System.out.println("Final método main...");
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
