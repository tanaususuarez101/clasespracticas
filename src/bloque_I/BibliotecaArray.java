package bloque_I;

public class BibliotecaArray {
	
	//1) Crear un metodo que duevuelva true si el valor pasado por parametro esta en el array
	
	public static boolean encontrarString(String [] lista, String valor) {
		
		for(int i = 0; i < lista.length; i++) {
			if(valor == lista[i]) {
				return true;
			}
		}
		return false;
	}
	
	//********************************************************************************************************************************************//
	
	//2) Crear un metodo pasando por parametro un array de tipo String y un elemento de tipo de String e insertamos el elemento dentro del Array por el principio
	
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
	
	//3) Crear un metodo pasando por parametro un array de tipo String y un elemento de tipo de String e insertamos el elemento dentro del Array por el final
	
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
	
	//4) Borra un elemento pasado por parametro dentro de un array (array, elemento)
	
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
		
		String [] listaNueva = new String [lista.length];
		int j = 0;
		int element = 0;
		
		for(int i = 0; i < lista.length; i++) {
			if(elemento != lista[i]) {
				listaNueva[j] = lista[i];
				j++;
				element++;
				
			}
			
		}
		if(element == lista.length) return lista;
		
		String [] listaResult = new String [listaNueva.length -1];
		
		for(int i = 0; i < listaNueva.length -1; i++) {
			listaResult[i] = listaNueva[i];
		}
		
		return listaResult;
	}
		
	//********************************************************************************************************************************************//
	
	//5) Borrar primer elemento de la lista
	
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
	
	//6) Borrar ultimo elemento de la lista
	
	public static String [] eliminarUltimo(String [] lista) {
		
		String [] listaResult = new String [lista.length -1];
		
		for(int i = 0; i < lista.length-1; i++) {
			listaResult[i] = lista[i];
		}
		return listaResult;
	}
	
	//********************************************************************************************************************************************//
	
	//7)Devolver la media de un array tipo entero (media = suma todo elemntos dividido por el numero de elementos) devuelve dato tipo double
	
	public static double media(int [] precios) {
		
		double total = 0;
		
		for(int i = 0; i < precios.length; i++) {
			total += precios[i];
		}
	
		total = total / precios.length;
		return total;
	}
	
	/*EJERCICIOS PROPUESTO*/
	
	/*
	 * 8) crea un método que elimine un elemento de una posición dada de un array
	 * */
	// 0,1,2,3,4,5
	//{2,4,6,7,1,9} tam 6
	//pos 3
	//{2,4,6,0,1,9}
	//{2,4,6,1,9,0}
	//{2,4,6,1,9}
	
	public static int [] eliminarPos (int [] array, int pos) {
		
		int [] arrayPrimero = new int [array.length];
		int j = 0;
		
		for(int i = 0; i < array.length; i++) {	
			if(pos != i) {
				arrayPrimero[j] = array[i];
				j++;
			}		
		}
		
		int [] arraySegundo = new int [arrayPrimero.length-1];
		
		for(int i = 0; i < arrayPrimero.length -1; i++) {
			arraySegundo[i] = arrayPrimero[i];
		}
		if(pos>array.length) return array;
		return arraySegundo;
	}
	
	/*
	 * 9) Crea un método que ordene los elemento de un array. Tendrá un parámetro boolean, si este es true, lo ordenará de mayor a menor, si es falso
	 * de menor a mayor
	 * */
	
	public static int [] ordenarElemento(int [] array, boolean param1) {
		
		if(param1) {
			return generar1(array);
		}
		return generar2(array) ;
	}
	
	private static int [] generar1(int [] array) {
		
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
	
	private static int [] generar2(int [] array) {
		
		int temp = 0;
		
		for (int i = 0; i < array.length-1; i++){
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[i] < array[j]) {					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	/*
	 * 10) crea un metodo que guarde dentro de un array un elemento en la posición que se le indica. Si la izquierda no hay valores se rellena con 0
	 * */
	
	//array = { , , , , }
	//pos = 2 guarde numero
	//numero = 7
	//array = { , ,7, , }
	//array = {0,0,7}
	
	public static int [] gurdarDentro(int [] guardado, int numero,  int pos) {
		
		if(pos < guardado.length) {
			guardado[pos] = numero;
			
			return guardado;
		}	
		
		int [] guardadoNuevo = new int[pos+1];
		guardadoNuevo[pos] = numero;
		
		for(int i = 0; i < guardado.length; i++) {
			guardadoNuevo[i] = guardado[i];
		}
		
		return guardadoNuevo;
	}
	
	/*
	 * 11)Crea un método que devuelva las letras del DNI. Las letras del DNI  se obtiene como el resto de dividir el número del DNI entre 23,
	 * Por ejemplo, si introducimos el  DNI 20267079, el resto de dividirlo por 23 sería 8, luego la letra sería la P  
	 * 
	 * Posición     0   1   2   3	4	5   6	7	8	9	10	11  12	13  14  15  16  17  18  19  20  21  22
	 * Letra        T   R  	W 	A	G	M	Y	F	P	D	X	B	N   J    Z   S   Q   V   H   L   C   K   E
	 * */
	
	public static String letras(String [] posLetra, int dni) {
		
		String devuelve = "";
		int resto = dni%23;
		
		devuelve = posLetra[resto];
		
		return devuelve;
	}
	
	/*
	 * 12) Crea un método que compare dos array y que devuelva true si son iguales o false si no lo son
	 * */
	
	//{"hola", "mundo"};
	//{"hola", "mundo"}
	//{"hola", "juan"}
	//{"mundo", "hola",};
	//{"hola", "a", "todos"};
	//{"hola"};
	
	public static boolean comparar(String [] param1, String [] param2) {
		
		if(param1.length != param2.length) return false;
		
		for(int i = 0; i < param1.length; i++) {
			if(param1[i] != param2[i]) {
				return false;
			}
		}
		return true;
		
	}
	
	/*
	 * 13) Crea un método que devuelva una sub-array de un array dado. El método recibirá además dos parámetros, que determine el principio y 
	 * el fin de los valores que debe devolver el método
	 * Por ejemplo:
	 *   array = [2, 3, 4, 5, 6, 8] tam = 6     ini = 1, fin = 3
	 *   array resultado = [3, 4, 5]
	 */
	 
	public static int [] arrayDado(int [] array, int ini, int fin) {
		
		//Si array =0  devoolver vacio
		if(array.length == 0) {
			return new int [0];
		}
		//ini > array devolver vacio
		if(ini >= array.length) {
			return new int [0];
		}
		//fin< array devolver vacio
		if(fin < 0) {
			return new int [0];
		}
		//ini > fin devolver vacio
		if(ini > fin) {
			return new int [0];
		}
		//ini dentro del array pero fin fuera de el nos devuleve desde ini hasta el final del array
		//Si ini = fin 
		if(ini == fin) {
			int [] arrayTam = new int [1];
			arrayTam[0] =array[ini];
			return arrayTam;
		}
		
		
		//Contador para saber el tamaño de lo que extraeremos en el subArray
		int contador = 0;
		//ini=2 fin=4
		//ite 1 i = 2; cont = 0
		//ite 2 i = 3; cont = 1
		//ite 3 i = 4; cont = 2 
		
		
		for(int i = ini; i < fin+1; i++) {
			contador ++;
		}
		
		//arrayCom = {2, 3, 4, 5, 6, 8};
		//ini = 1;
		//fin = 3;
		//suArray ={ , , }
		
		if(ini < array.length && ini >= 0) {
			int [] suArray = new int [contador];
			int j = 0;
			
			for(int i = ini; i < suArray.length && i < array.length; i++) {
				suArray[j] = array[i];
				j++;
			}
			return suArray;
		}
		return array;
		/*
		
		int [] arrayVacio = new int[0];	
		Si inicia fuera de una posicion que no tiene el array, devuelve un array vacio del tamaño entre ini y fin
		Ej: array = {2,4,6}| ini=5 y fin=6 | Devuelve subArray = {0,0}
		Pero si ini=0 y fin=3 deberia de devolver subArray = {2,4,6,0}
		
		for(int i = 0; i < array.length; i++) {
			if(ini > array[i] && fin > array[i]) { //A la hora de hacer la condicion confundi || y &&
				return arrayVacio;	
			}
		}
		int [] subArray = new int[contador];
		
		//Si empieza en 0
		if(param1 == 0){
			for(int i = param1; i < param2+1; i++) {
				subArray[i]=array[i];
			}
			return subArray;
		}
		
		//Si empieza en 1
		if(param1 == 1){
			for(int i = param1; i < param2+1; i++) {
				subArray[i-1]=array[i];
			}
			return subArray;
		}
		
		//Si empieza en 2
		if(param1 == 2){
			for(int i = param1; i < param2+1; i++) {
				subArray[i-2]=array[i];
			}
			return subArray;
		}
		return subArray;
		*/
		
	}
}

		//arrayCom = {2, 3, 4, 5, 6, 8};
		//ini = 1;
		//fin = 5;
