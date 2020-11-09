/**
 * La clase biblioteca Array II esta destinada a la explicación y realización de ejercicios con array bidimencionales
 */
package bloque_I;

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
		int[] valores;
		valores = new int [5];
		//[0,0,0,0,0]
		int[] valores1 = new int[5];
		valores = {0,0,0....,0}
		*/
		int[][] valores;
		valores = new int[2][3];
		
		int[][] valores1  = new int[2][3];
		/*	  0 1 2 = j
		 * 0 [0,0,0]
		 * 1 [0,0,0]
		 * =
		 * i		
		 */
		//     0		1			valores.length-1
		// [[0,0,0], [0,0,0], ..., [0,0,0,0]]
		//[0, 1, 4, 2, 3] = 5
		//[[],[],[]] = 3
		
		
		valores[0][0] = 1;
		valores[0][1] = 2;
		valores[1][0] = 4;
		valores[1][1] = 5;

		
		
		int[]resultado = sumaArrayFila(valores);
		/*
		for (int j = 0; j < resultado.length;j++) {
			System.out.print(resultado[j] + ", ");
		}
		*/
		
		resultado = sumaArrayColumna(valores);
		for (int j = 0; j < resultado.length;j++) {
			System.out.print(resultado[j] + ", ");
		}


	}
	private static void printlnArray(int[][] valor){
		for (int i = 0; i < valor.length; i++){
			System.out.print("[");
			for (int j = 0; j < valor[i].length;j++) {
				System.out.print(valor[i][j] + ", ");
			}
			System.out.print("]\n");
		}
	}
	
	/*
	 * CREAR UN MÉTODO QUE HAGA LA SUMA POR FILA DE UNA MATRIZ 
	 * EJEMPLO:
	 * Argumento:
	 * 0 [1,2,3] 
	 * 1 [6,5,4]
	 * Resultado.
	 * [6, 15]
	 * */
	/*	  0 1 2 = j
	 * 0 [0,0,0]
	 * 1 [0,0,0]
	 * =
	 * i		
	 */
	private static int[] sumaArrayFila(int[][] valores){
		
		int[] resultado = new int[valores.length];
		int sumatoria;
		
		for (int i = 0; i < valores.length ;i++) {
			sumatoria = 0;
			for (int j = 0; j < valores[i].length ;j++) {
				sumatoria = sumatoria + valores[i][j];
			}
			resultado[i] = sumatoria;
		}
		
		return resultado;
	}
	/*
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
	
	private static int[] sumaArrayColumna(int[][] valores){
		
		if (valores.length == 0) return new int[0];
			
		int[] resultado = new int[valores[0].length];
		int sumatoria;
		
		for (int i = 0; i < valores[0].length ;i++) {
			sumatoria = 0;
			for (int j = 0; j < valores.length ;j++) {
				sumatoria = sumatoria + valores[j][i];
			}
			resultado[i] = sumatoria;
		}
		
		
		return resultado;
		
	}
	
	/*
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

	
	/*
	 * Argumento: realizar la siguiente tabla 7
	 * [2 , 1, 2]
	 * [2 , 2, 4]
	 * [2, 3, 6]
	 * [2, 4, 8]
	 * 
	 */
	
	
	
	/*
	   EJERCICIO 1
		Sea M una matriz de enteros de “n” filas por “m” columnas, ambas positivas y menores 
		que 10. Realice un programa en C++ que permita: 
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
	
	
	
	
	/*
	  EJERCICIO 2
	  Se sabe que una matriz cuadrada (nxn) es simétrica si A(i, j) = A(j, i) para todo i, j dentro 
	  de los límites de la matriz.
	 */
	
	
	
	/*
	 EJERCICIO 3
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
	
	
	/*
	 EJERCICIO 4
	 crea un programa que según una matriz M1 cree otra matriz M2. Las filas de M2[i] serán igual que la M1[i] siempre y cuando la suma de la fila 
	 de M1[i] sea un número par
	 */
	 
}
