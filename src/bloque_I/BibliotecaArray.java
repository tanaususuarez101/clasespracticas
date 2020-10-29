package bloque_I;

public class BibliotecaArray {
	
	//Crear un metodo que duevuelva true si el valor pasado por parametro 
	public static boolean encontrarString(String [] lista, String valor) {
		
		for(int i = 0; i < lista.length; i++) {
			if(valor == lista[i]) {
				return true;
			}
		}
		return false;
	}
	
	//Crear un metodo pasando por parametro un array de tipo String y un elemento de tipo de String  e insertamos el elemento dentro del Array por el principio
	
	//lista = {juan, pepe, lucas}
	//elemento = ana
	//listaResult = {null, null, null, null}
	
	
	
	public static String [] añadirPrincipio(String [] lista, String elemento) {
		
		String [] listaResult = new String [lista.length +1];
	
		for(int i = 0; i < lista.length; i++) {
			listaResult [i+1] = lista[i];	
		}
		
		listaResult [0] = elemento;
		
		return listaResult;
	}
	
	//lista = {juan, pepe, lucas}
	//elemento = ana
	//listaResult = {null, null, null, null}
	
	public static String [] añadirFinal(String [] lista, String elemento) {
		
		String [] listaResult = new String[lista.length+1];
		
		for(int i = 0; i < lista.length; i++){
			listaResult [i] = lista [i];
		}
		listaResult[listaResult.length-1] = elemento;
		
		return listaResult;
	}
	
	
	//Borra un elemento pasado por parametro dentro de un array (array, elemento)
	
	
	//Borrar primer elemento de la lista
	
	//Borrar ultimo elemento de la lista
	
	
	//Devolver la media de un array tipo entero (media = suma todo elemntos dividido por el numero de elementos) devuelve dato tipo double
	
}



