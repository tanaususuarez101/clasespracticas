package bloque_I;

import EjerciciosPropuestos.Array;

public class Test {
	
	public static void main(String [] String) {
		
		String [] lista = {"Pepe", "Juan", "Lucas"};
		String valor = "Ana";
		String valor1 = "Pepe";
		String valor2 = "Juan";
		String valor3 = "Lucas";
		
		//1) Crear un metodo que duevuelva true si el valor pasado por parametro esta en el array
		
		System.out.println("¿Se encuentra el valor en la lista?: " + BibliotecaArray.encontrarString(lista, valor));
		System.out.println("");
		
		//********************************************************************************************************************************************//
		
		//2) Crear un metodo pasando por parametro un array de tipo String y un elemento de tipo de String e insertamos el elemento dentro del Array por el principio
		
		//                  Clase             Metodo      param1  param2
		String [] lista2 = BibliotecaArray.anadirPrincipio(lista, valor);
		
		System.out.print("La nueva lista al añadir al principio es: " );
		imprimirArray(lista2);
		
		//********************************************************************************************************************************************//
		
		//3) Crear un metodo pasando por parametro un array de tipo String y un elemento de tipo de String e insertamos el elemento dentro del Array por el final
		
		//      Clase             Metodo      param1  param2
		String [] lista3 = BibliotecaArray.anadirFinal(lista, valor);

		System.out.print("La nueva lista al añadir al final es: " );
		imprimirArray(lista3);
		
		//********************************************************************************************************************************************//
		
		//4) Borra un elemento pasado por parametro dentro de un array (array, elemento)
		
		String [] lista4 = BibliotecaArray.eliminarElemento(lista, valor3);

		System.out.print("La nueva lista al eliminar un elemento es: " );
		imprimirArray(lista4);
		
		//********************************************************************************************************************************************//
		
		//5) Borrar primer elemento de la lista
		
		String [] lista5 = BibliotecaArray.eliminarPrimero(lista);

		System.out.print("La nueva lista al eliminar el primero es: " );
		imprimirArray(lista5);
		
		//********************************************************************************************************************************************//
		
		//6) Borrar ultimo elemento de la lista
		
		String [] lista6 = BibliotecaArray.eliminarUltimo(lista);

		System.out.print("La nueva lista al eliminar el ultimo es: " );
		imprimirArray(lista6);
		
		//********************************************************************************************************************************************//
		
		//7)Devolver la media de un array tipo entero (media = suma todo elemntos dividido por el numero de elementos) devuelve dato tipo double
		
		int [] precios = {21,13,5,30,62};
		
		System.out.println("La media es: " + BibliotecaArray.media(precios));
		System.out.println("");
		 
		//********************************************************************************************************************************************//
		
		//8) crea un método que elimine un elemento de una posición dada de un array
		
		int [] numeros = {2,4,6,7,1,9};
		int pos = 7;
		
		int [] array = BibliotecaArray.eliminarPos(numeros, pos);
		
		System.out.print("El array queda asi: ");
		imprimirArray1(array);
		
		//********************************************************************************************************************************************//
		
		//9) Crea un método que ordene los elemento de un array. Tendrá un parámetro boolean, si este es true, lo ordenará de mayor a menor, si es false de menor a mayor
		
		boolean param1=false;
		
		int [] arrayOrdenado = BibliotecaArray.ordenarElemento(numeros, param1);
		System.out.print("ARRAY ORDENADO ES: "  );
		imprimirArray1(arrayOrdenado);
		
		//********************************************************************************************************************************************//
		
		//10) crea un metodo que guarde dentro de un array un elemento en la posición que se le indica. Si la izquierda no hay valores se rellena con 0
		
		int [] listaNumeros = {2,4,6,7,1,9};
		int numero = 7;
		int pos1 = 8;
		
		int [] guardado = BibliotecaArray.gurdarDentro(listaNumeros, numero, pos1);
		
		System.out.print("El array guardado es: ");
		imprimirArray1(guardado);
		
		//********************************************************************************************************************************************//
		
		//11)Crea un método que devuelva las letras del DNI. Las letras del DNI  se obtiene como el resto de dividir el número del DNI entre 23
		
		String [] posLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		int dni = 20267079;
		int dni1 = 30526079;
		
		System.out.println("La letra es: " + BibliotecaArray.letras(posLetra, dni1));
		System.out.println("");
		
		//********************************************************************************************************************************************//
		
		//12) Crea un método que compare dos array y que devuelva true si son iguales o false si no lo son
		
		String [] fila1 = {"hola", "mundo"};
		String [] fila2 = {"hola", "mundo"};
		String [] fila3 = {"hola", "a", "todos"};
		String [] fila4 = {"hola"};
		String [] fila5 = {"hola", "juan"};
		String [] fila6 = {"mundo", "hola"};
		
		System.out.println("¿Son iguales?: " + BibliotecaArray.comparar(fila1, fila6));
		System.out.println(" ");
		
		//********************************************************************************************************************************************//
		
		/* 13) Crea un método que devuelva una sub-array de un array dado. El método recibirá además dos parámetros, que determine el principio y
		 * el fin de los valores que debe devolver el método */
		
		int [] arrayCom = {2, 3, 4, 5, 6, 8};
		int ini = 3;
		int fin = 5;
		
		int [] subArray = BibliotecaArray.arrayDado(arrayCom, ini, fin);
		System.out.println("ini = " + ini);
		System.out.println("fin = " + fin);
		System.out.print("El sub-array guardado es: ");
		imprimirArray1(subArray);
		
		
		
	}
	
	private static void imprimirArray(String [] array) {
		
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		System.out.println("");
	}
	
	private static void imprimirArray1(int [] array) {
		
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		System.out.println("");
	}
	
}
