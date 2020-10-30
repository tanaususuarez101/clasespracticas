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
	
}



