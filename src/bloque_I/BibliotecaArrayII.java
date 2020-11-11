/**
 * La clase biblioteca Array II esta destinada a la explicación y realización de ejercicios con array bidimencionales
 */
package bloque_I;

import java.util.Scanner;

/**
 * @author Tanausú suárez
 *
 */
public class BibliotecaArrayII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int [] ejemplo;
		ejemplo = new int [5];
		//[0,0,0,0,0]
		
		int [] ejemplo1 = new int [5];
		ejemplo = {0,0,0....,0}
		
		int [][] ejemplo2  = new int [2][3];
		     0 1 2 = j
		  0 [0,0,0]
		  1 [0,0,0]
		  =
		  i		
		
		     0		1			valores.length-1
		[[0,0,0], [0,0,0], ..., [0,0,0,0]]
		[0, 1, 4, 2, 3] = 5
		[[],[],[]] = 3
		*/
		
		int [][] valores;
		valores = new int[2][2];
		
		valores[0][0] = 1;
		valores[0][1] = 2;
		valores[1][0] = 4;
		valores[1][1] = 5;
		
	    /* [1, 2]
		 * [4, 5]
		 * */
		
		int [][] matriz = {{1, 2, 2, 4}, {2, 3, 5, 2}, {1, 6, 0, 2}};

		/* [1, 2, 2, 4]
		 * [2, 3, 5, 2]
		 * [1, 6, 0, 2]
		 * */
		
		
		int [][] matriz7 = {{4, 3, 2, 1}, {3, 1, 2, 6}};
		
		/*
		  matriz = 
		 [4, 3, 2, 1]
		 [3, 1, 2, 6]
		 Resultado =
		 [4, 3]
		 [3, 1]
		 [2, 2]
		 [1, 6]
		 */
		 

		
		// EJERCICIO 1
		/*
		printlnArray(valores);
		System.out.println("");
		int [] result1 = sumaArrayFila(valores);
		printlnArray1(result1);
		System.out.println("");
		*/
		
		
		// EJERCICIO 2
		/*
		printlnArray(valores);
		System.out.println("");
		int [] result2 = sumaArrayColumna(valores);
		printlnArray1(result2);
		System.out.println("");
		*/
		
		
		// EJERCICIO 3
		/*
		printlnArray(matriz);
		System.out.println("");
		int [][] result3 = contarMatrix(matriz);
		printlnArray(result3);
		System.out.println("");
		*/
		
		// EJERCICIO 7
		printlnArray(matriz7);
		System.out.println("");
		int [][] result7a = columnasEnFilas(matriz7);
		printlnArray(result7a);
		System.out.println("");
		
		
		int [][] result7b = filasEnColumnas(matriz7);
		printlnArray(result7b);
		System.out.println("");
		
		
		// EJERCICIO 9
		/*
		printlnArray(matriz);
		System.out.println("");
		int [] result5 = matrizPares(matriz);
		printlnArray1(result5);
		System.out.println("");
		*/
		
		
		
		
		
		
		leerConsola();
		
	}
	
	
	private static void printlnArray(int[][] valor) {
		 
		for(int i = 0; i < valor.length; i++) {
			System.out.print("[");
			
			for(int j = 0; j < valor[i].length;j++) {
				System.out.print(valor[i][j] + ", ");
			}
			System.out.print("]\n");
		}
	}
	
	
	private static void printlnArray1(int [] array) {
		
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]\n");
	}
	
	
	/* EJERCICIO 1
	 * CREAR UN MÉTODO QUE HAGA LA SUMA POR FILA DE UNA MATRIZ 
	 * EJEMPLO:
	 * Argumento:
	 * 0 [1,2,3] 
	 * 1 [6,5,4]
	 * Resultado.
	 * [6, 15]
	 * 
	 *	  0 1 2 = j
	 * 0 [0,0,0]
	 * 1 [0,0,0]
	 * =
	 * i		
	 */
	
	private static int [] sumaArrayFila(int [][] valores) {
		
		int [] resultado = new int [valores.length];
		int sumatoria;
		
		for(int i = 0; i < valores.length; i++) {
			sumatoria = 0;
			for(int j = 0; j < valores[i].length; j++) {
				sumatoria = sumatoria + valores[i][j];
			}
			resultado[i] = sumatoria;
		}
		return resultado;
	}
	
	
	/* EJERCICIO 2
	 * CREAR UN MÉTODO QUE HAGA LA SUMA POR COLUMNAS DE UNA MATRIZ 
	 * EJEMPLO:
	 * Argumento:
	 * 0 [1,2,3] 
	 * 1 [6,2,5]
	 * Resultado.
	 * [7, 4, 8]
	 * */
	/*	  0 1 2 = j
	 * 0 [0,0,0]
	 * 1 [0,0,0]
	 * =
	 * i		
	 */
	
	private static int [] sumaArrayColumna(int [][] valores){
		
		if(valores.length == 0) return new int[0];
			
		int [] resultado = new int [valores[0].length];
		int sumatoria;
		
		for(int i = 0; i < valores[0].length; i++) {
			sumatoria = 0;
			for (int j = 0; j < valores.length; j++) {
				sumatoria = sumatoria + valores[j][i];
			}
			resultado[i] = sumatoria;
		}
		return resultado;
	}
	
	
	/* EJERCICIO 3
	 * Segun u na matrix contar el número de elemento que se repiten en esa posicioón
	 * ejempñlo:
	 * 
	 * Argumento
	 * [1, 2, 2, 4]
	 * [2, 3, 5, 2]
	 * [1, 6, 0, 2]
	 * 
	 * 
	 * resultado:
	 * [1, 4, 4, 0]
	 * [4, 0, 0, 4]
	 * [1, 0, 0, 4]
	 * 
	 * */
	
	private static int [][] contarMatrix(int [][] enteros) {
	
		if(enteros.length == 0) {
			return enteros;
		}
		
		int [][] result = new int [enteros.length][enteros[0].length];
		int valor;
		
		for(int i = 0; i < enteros.length; i++) {
			for(int j = 0; j < enteros[i].length; j++) {
				valor = auxContador(enteros, enteros[i][j]);
				if(valor > 0){
					result[i][j] = valor -1;
				}
			}
		}
		return result;	
	}
	
	
	private static int auxContador(int [][] matriz, int elemento) {
		
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == elemento){
					contador++;
				}
			}
		}
		return contador;
	}
	
	
	/* EJERCICIO 4
	 * Argumento: realizar la siguiente tabla 2
	 * [2 , 1, 2]
	 * [2 , 2, 4]
	 * [2, 3, 6]
	 * [2, 4, 8]
	 * ...
	 * [2 , 10, 20]
	 */
	
	private static int[][] tablaMultiplicar(int valor){
		// 
		int[][] tabla = new int[10][3];
		
		return new int[0][0];
	}
	
	
	
	/*
	   EJERCICIO 5
		Sea M una matriz de enteros de “n” filas por “m” columnas, ambas positivas y menores 
		que 10. Realice un programa en java que permita: 
		a)  Solicitar el ingreso de n y m, según las restricciones indicadas. 
		b)  Ingresar cada uno de los valores de la matriz. 
		c)  Mostrar, para cada fila, la suma de sus valores, y el menor valor almacenado. 
		d)  Mostrar, para cada columna, el promedio de sus valores y el mayor valor. 
		e)  El mayor valor almacenado en toda la Matriz, indicando en que fila y columna se 
		encuentra.
		
		
		
		Nota: los valores de 'n' y 'm' son pedido por consola.
		
		NOTA: para poder leer un valor desde consola utiliza la clase Scanner. Puedes utilizar la siguiente 
		documentación para saber como utilizar dicho objecto.
		URL: http://lineadecodigo.com/java/leer-numeros-teclado-java/
		
		
	 */
	
	public static void leerConsola(){
		Scanner reader = new Scanner(System.in);
		
		int numero;
		int i = 0;
		int[]valorLeidos = new int[4]; 
		/*
		do {			
			System.out.println("Introduce un valor: ");
			numero = reader.nextInt();
			valorLeidos[i] =numero;
			i++;
			
		} while (i < valorLeidos.length );
		*/
		
		
		for (int j = 0; j < valorLeidos.length; j++) {
			System.out.println("Introduce un valor: ");
			valorLeidos[j] = reader.nextInt();
		}
		for (int valor: valorLeidos) {
			System.out.print(valor + ", ");
		}
		
	}
	
	
	
	
	
	/*
	  EJERCICIO 6
	  Se sabe que una matriz cuadrada (nxn) es simétrica si A(i, j) = A(j, i) para todo i, j dentro 
	  de los límites de la matriz.
	 */
	
	
	
	/*
	 EJERCICIO 7
	 Escriba un programa que lea una matriz  mxn (ambos valores positivos menores de 10) y transoforme las columnas en filas, y las filas en columnas
	 por ejemplo, el usuario ingresó valores m=3 y n=5
	 
	 matriz = 
	 [4, 3, 2, 1]
	 [3, 1, 2, 6]
	 Resultado =
	 [4, 3]
	 [3, 1]
	 [2, 2]
	 [1, 6]
	 
	*/
	
	//Columnas en filas
	private static int [][] columnasEnFilas(int [][] matriz){
		
		int [][] result = new int [matriz[0].length][matriz.length];
		
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				result[i][j] = matriz[j][i];
			}
		}
		return result;
	}
	
	
	//filas en columnas 
	private static int [][] filasEnColumnas(int [][] matriz){
		
		int [][] result = new int [matriz[0].length][matriz.length];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				result[j][i] = matriz[i][j];
			}
		}
		return result;
	}


	/*
	 
	 EJERCICIO 8 
	 crea un programa que según una matriz M1 cree otra matriz M2. Las filas de M2[i] serán igual que la M1[i] siempre y cuando la suma de la fila 
	 de M1[i] sea un número par
	 ejemplo:
	 *	M1
	 * [3,2,1] = 6
	 * [3,1,3] = 7 
	 * M2
	 * [3,2,1]
	 * 
	 */
	
	
	/*
	 EJERCICIO 9
	 crea un método que devuelva la cuenta de los elementos pares de cada fila:
 	 * Argumento
	 * [1, 2, 2, 4]
	 * [2, 3, 5, 2]
	 * [1, 6, 0, 2]
	 * 
	 * resultado:
	 * [3, 2, 3]
	 */
	 
	private static int [] matrizPares(int [][] elementos){
		
		int [] result = new int [elementos.length];
		
		if(elementos.length == 0) {
			return result;
		}
		
		int valor;
		
		for(int i = 0; i < elementos.length; i++) {
			valor = 0;
			for(int j = 0; j < elementos[i].length; j++) {
				if(elementos[i][j]%2 == 0){
					valor++;
				}
			}
			result[i] = valor;
		}
	
		return result;	
	}
	

}
