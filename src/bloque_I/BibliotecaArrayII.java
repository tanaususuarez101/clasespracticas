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
		/*
		resultado = sumaArrayColumna(valores);
		for (int j = 0; j < resultado.length;j++) {
			System.out.print(resultado[j] + ", ");
		}*/
		
		
		int [][] matri = {{1, 2, 2, 4}, {2, 3, 5, 2}, {1, 6, 0, 2}};
		
		
		printlnArray(matri);
		System.out.println("");
		int [][] resul = contarMatrix(matri);
		printlnArray(resul);
		
		
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
	
	
	private static int [][] contarMatrix(int [][] enteros){
	
		if(enteros.length == 0) {
			return enteros;
		}
		
		int [][] result = new int [enteros.length][enteros[0].length];
		int valor;
		
		for(int i = 0; i < enteros.length; i++) {
			for(int j = 0; j < enteros[i].length;j++) {
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
			for(int j = 0; j < matriz[i].length;j++) {
				if(matriz[i][j] == elemento){
					contador++;
				}
				
			}
		}
		return contador;
	}
	
	/*
	
	
	
	
	
	
	
	
	
	
	/*
	 * Argumento: realizar la siguiente tabla 7
	 * [2 , 1, 2]
	 * [2 , 2, 4]
	 * [2, 3, 6]
	 * [2, 4, 8]
	 * 
	 */
	
	
	 
}
