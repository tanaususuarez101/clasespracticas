package bloque_I;

public class BibliotecaArray {
	
	//Crear un metodo que duevuelva true si el valor pasado por parametro esta en el array
	
	public static boolean encontrarString(String [] lista, String valor) {
		
		for(int i = 0; i < lista.length; i++) {
			if(valor == lista[i]) {
				return true;
			}
		}
		return false;
	}
	
	//********************************************************************************************************************************************//
	
	//Crear un metodo pasando por parametro un array de tipo String y un elemento de tipo de String e insertamos el elemento dentro del Array por el principio
	
	//lista = {pepe, juan, lucas} tamaño 3
	//elemento = ana
	//listaResult = {null, null, null, null}
	
	public static String [] añadirPrincipio(String [] lista, String elemento) {
		
		String [] listaResult = new String [lista.length +1];
	
		for(int i = 0; i < lista.length; i++) {
			listaResult[i+1] = lista[i];	
		}
		listaResult[0] = elemento;
		
		return listaResult;
	}
	
	//********************************************************************************************************************************************//
	
	//lista = {pepe, juan, lucas} tamaño 3
	//elemento = ana
	//listaResult = {null, null, null, null}
	
	public static String [] añadirFinal(String [] lista, String elemento) {
		
		String [] listaResult = new String [lista.length +1];
		
		for(int i = 0; i < lista.length; i++){
			listaResult[i] = lista[i];
		}
		listaResult[listaResult.length -1] = elemento;
		
		return listaResult;
	}
	
	//********************************************************************************************************************************************//
	
	//Borra un elemento pasado por parametro dentro de un array (array, elemento)
	
	//Borrar primer elemento de la lista
	//          0     1     2
	//lista = {pepe, juan, lucas} tamaño 3
	//elemento = juan
	//si esta
	//                0     1
	//listaResult = {null, null, } tamaño 2
	//si no esta
	//elemento = ana
	//listaResult = {null, null, null } tamaño 3
	
	
	
	public static String [] eliminarElemento(String [] lista, String elemento) {
		/*
		int tamaño = 0;
		
		for(int i = 0; i < lista.length; i++) {
			if(elemento != lista[i]) {
				tamaño ++;
				
			} else if(elemento == lista[i]) {
				tamaño ++;
			}
			
		}
		*/
		//                                  tamaño
		String [] listaResult = new String [lista.length];
		
		for(int i = 0; i < lista.length; i++) {
			if(elemento != lista[i]) {
				listaResult[i]=lista[i];
				
			} else if(elemento == lista[i]) {
				listaResult[i+1]=lista[i];
			}
			
		}
		
		return listaResult;
		
	}
	
	//********************************************************************************************************************************************//
	
	//Borrar primer elemento de la lista
	//          0     1     2
	//lista = {pepe, juan, lucas} tamaño 3
	//                0     1
	//listaResult = {null, null, } tamaño 2
	
	public static String [] eliminarPrimero(String [] lista) {
		
		String [] listaResult = new String [lista.length -1];
		
		for(int i = 1; i < lista.length; i++) {
			listaResult[i-1] = lista[i];
		}
		return listaResult;
	}
	
	//********************************************************************************************************************************************//
	
	//Borrar ultimo elemento de la lista
	
	public static String [] eliminarUltimo(String [] lista) {
		
		String [] listaResult = new String [lista.length -1];
		
		for(int i = 0; i < lista.length-1; i++) {
			listaResult[i] = lista[i];
		}
		return listaResult;
	}
	
	//********************************************************************************************************************************************//
	
	//Devolver la media de un array tipo entero (media = suma todo elemntos dividido por el numero de elementos) devuelve dato tipo double
	
	public static double media(int [] precios) {
		
		double total = 0;
		
		for(int i = 0; i < precios.length; i++) {
			total += precios[i];
		}
	
		total = total/ precios.length;
		return total;
	}
	
	/*EJERCICIOS PROPUESTO*/
	
	/*
	 * crea un método que elimine un elemento de una posición dada de un array
	 * */
	
	/*
	 * Crea un método que ordene los elemento de un array. Tendrá un parámetro boolean, si este es true, lo ordenará de mayor a menor, si es falso
	 * de menor a mayor
	 * */
	
	/*
	 * crea un metodo que guarde dentro de un array un elemento en la posición que se le indica. Si la izquierda no hay valores se rellena con 0
	 * */
	
	/*
	 * Crea un método que devuelva las letras del DNI. Las letras del DNI  se obtiene como el resto de dividir el número del DNI entre 23,
	 * Por ejemplo, si introducimos el  DNI 20267079, el resto de dividirlo por 23 sería 8, luego la letra sería la P  
	 * 
	 * Posición     0   1   2   3	4	5   6	7	8	9	10	11  12	13  14  15  16  17  18  19  20  21  22
	 * Letra        T   R  	W 	A	G	M	Y	F	P	D	X	B	N   J    Z   S   Q   V   H   L   C   K   E
	 * */
	
	/*
	 * Crea un método que compare dos array y que devuelva true si son iguales o false si no lo son
	 * */
	
	/*
	 * Crea un método que devuelva una sub-array de un array dado. El método recibirá además dos parámetros, que determine el principio y el fin de los valores que
	 * debe devolver el método
	 * Por ejemplo:
	 *   array = [2, 3, 4, 5, 6, 8] ini = 1, fin = 3
	 *   array resultado = [3, 4, 5]
	 */
	 
	
}



