package bloque_I;

public class ConceptosBasicos {
	
	public static void main(String[] a) {
		/*
		 *  Java es un lenguaje de programación tipado, es por ello que para utilizar una variable es necesario
		 *  declararla para poder utilizarla.
		 *  
		 *  Las variables son elementos que sirve para almacenar algún tipo de dato, el tipo de dato que guardamos hay que definirlo
		 *  cuando declaramos la variable (por ejemplo int, double, Objecto, etc)
		 *  Ejemplo: 
		 */
		int estoEsUnEntero = 0;
		double estoEsDouble = 0.0;
		boolean estoEsUnBoolean = true;
		String estoEsUnaString = "esto es una string";
		char estoEsUnCaracter = 'A';
		
		/*
		 *	En el ejemplo anterior, la variable 'estoEsUnEntero' está definida como 'int' (será un valor entero) aquí podremos almacenar
		 *	valores del menos infinito hasta el más infinito, pero tiene una serie de incovenientes como el hecho de no poder guardar valores
		 *	lógicos, como true, falso, o almacenar más de un valor.
		 *
		 *	La solución más básica para almacenar más de un valor pasa por un tipo de datos que se le denominan 'array' y son declarados de forma
		 * 	muy similar al ejemplo anterior: 
		 *
		 **/
		int tamaño = 5;
		String[] valores = new String[tamaño];
		
		/*
		 * Para declarar un array necesitamos indicarle cuanto son los elementos que vamos a guardar en él, en el ejemplo anterior, lo que almacena
		 * en la variable 'tamaño' y además tambien tenemos que indicar el tipo de datos, como en este ejemplo es de String, (cadena de texto).
		 *  el resultado sera lo siguiente: {null, null ,..., null}, debido a que una String es un tipo llamado en java Objecto,
		 * */
		

	}
}
