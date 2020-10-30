package bloque_I;

public class Test {
	
	public static void main(String [] String) {
		
		String [] lista = {"Pepe", "Juan", "Lucas"};
		String valor = "Ana";
		String valor2 = "Juan";
		
		
		System.out.println("¿Se encuentra el valor en la lista?: " + BibliotecaArray.encontrarString(lista, valor));
		System.out.println("");
		
		//                  Clase             Metodo      param1  param2
		String [] lista2 = BibliotecaArray.añadirPrincipio(lista, valor);
		
		System.out.print("La nueva lista al añadir al principio es: " );
		imprimirArray(lista2);
		

		
		//      Clase             Metodo      param1  param2
		String [] lista3 = BibliotecaArray.añadirFinal(lista, valor);

		System.out.print("La nueva lista al añadir al final es: " );
		imprimirArray(lista3);
		
		
		//
		String [] lista4 = BibliotecaArray.eliminarElemento(lista, valor2);

		System.out.print("La nueva lista al eliminar un elemento es: " );
		imprimirArray(lista4);
		
		
		//
		String [] lista5 = BibliotecaArray.eliminarPrimero(lista);

		System.out.print("La nueva lista al eliminar el primero es: " );
		imprimirArray(lista5);
		
		
		//
		String [] lista6 = BibliotecaArray.eliminarUltimo(lista);

		System.out.print("La nueva lista al eliminar el ultimo es: " );
		imprimirArray(lista6);
		
		//
		int [] precios = {21,13,5,30,62};
		
		System.out.println("La media es: " + BibliotecaArray.media(precios));
		System.out.println("");
		
		
	}
	
	private static void imprimirArray(String [] array) {
		
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		System.out.println("");
	}
	
}
