package bloque_I;

public class ConceptosBasicos {
	
	public static void main(String[] a) {
		/*
		 *  Java es un lenguaje de programaci�n tipado, es por ello que para utilizar una variable es necesario
		 *  declararla para poder utilizarla.
		 *  
		 *  Las variables son elementos que sirve para almacenar alg�n tipo de dato, el tipo de dato que guardamos hay que definirlo
		 *  cuando declaramos la variable (por ejemplo int, double, Objecto, etc)
		 *  Ejemplo: 
		 */
		int estoEsUnEntero = 0;
		double estoEsDouble = 0.0;
		boolean estoEsUnBoolean = true;
		String estoEsUnaString = "esto es una string";
		char estoEsUnCaracter = 'A';
		
		/*
		 *	En el ejemplo anterior, la variable 'estoEsUnEntero' est� definida como 'int' (ser� un valor entero) aqu� podremos almacenar
		 *	valores del menos infinito hasta el m�s infinito, pero tiene una serie de incovenientes como el hecho de no poder guardar valores
		 *	l�gicos, como true, falso, o almacenar m�s de un valor.
		 *
		 *	La soluci�n m�s b�sica para almacenar m�s de un valor pasa por un tipo de datos que se le denominan 'array' y son declarados de forma
		 * 	muy similar al ejemplo anterior: 
		 *
		 **/
		int tamanio = 5;
		String[] valores = new String[tamanio];
		
		/*
		 * Para declarar un array necesitamos indicarle cuanto son los elementos que vamos a guardar en �l, en el ejemplo anterior, lo que almacena
		 * en la variable 'tama�o' y adem�s tambien tenemos que indicar el tipo de datos, como en este ejemplo es de String, (cadena de texto).
		 *  el resultado sera lo siguiente: {null, null ,..., null}, debido a que una String es un tipo llamado en java Objecto,
		 * */
		

	}
}
