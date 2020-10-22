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
		metodoTest();
		// 2� Forma:
		Array.metodoTest();
		
		/*
		 * LOS EJERCICIOS QUE APARECE A CONTINUACI�N ES PARA PRACTICAR CON ARRAY, EL C�DIGO QUE ESCRIBAS M�TELO
		 * DENTRO DE UN M�TODO (COMO EL EJEMPLO ANTERIOR) Y REALIZA LAS LLAMADAS QUE CREAS CONVENIENTE DEBAJO DE CADA ENUNCIADO 
		 *
		 * */
				
		// 1) Crea un array con un tama�o de 5, asignale los valores num�ricos manualmente (los que tu quieras) y muestralos por pantalla.
		
		
		// 2) Crea un m�todo que genere un array de enteros que se rellenen de 0 hasta el valor pasado por par�metro y lo muestre por pantalla.
		int[] valorDevuelto = generarArray1(5);
		imprimirArray(valorDevuelto);
		
		
		
		// 3) Crea un m�todo que genere un array de enteros que se rellenen del valor pasado por par�metro  hasta 0 y lo muestre por pantalla.
		
		
		// 4) Crea un m�todo que pas�ndole como par�metro un array devuelva los valores multiplos de dos y lo muestre por pantalla.
		
		
		// 5) Crea un m�todo que devuelva un array con las posiciones pares de un array pasado por par�metro y lo muestre por pantalla.
		

	
		// 6) Crea un m�todo que devuelva un array que sera la combinaci�n de otros dos pasado por par�metro y lo muestre por pantalla.
		
		
		// 7) Crea un m�todo que pas�ndole un entero y un array devuelva otro array con valores superior al entero pasado y muestre por pantalla el resultado
		
		
		// 8) Crea un m�todo que pas�ndole un array de enteros, me lo devuelva ordenado y muestre por pantalla el resultado. 



		
		/*
		 * FIN DEL BLOQUE
		 * */
		System.out.println("Final m�todo main...");
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
