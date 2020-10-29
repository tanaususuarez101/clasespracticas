package bloque_I;

public class Test {
	
	public static void main(String [] String) {
		
		String [] lista = {"Pepe", "Juan", "Lucas", "Juan, Pepe"};
		String valor = "Ana";
		
		System.out.println("¿Se encuentra el valor en la lista?: " + BibliotecaArray.encontrarString(lista, valor));
		System.out.println("");
		
		//                  Clase             Metodo      param1  param2
		String [] lista2 = BibliotecaArray.añadirPrincipio(lista, valor);
		
		System.out.print("La nueva lista es: " );
		imprimirArray(lista2);
		
		
		//Era una prueba
		//System.out.println("¿Se encuentra el valor en la lista?: " + BibliotecaArray.encontrarString(lista2, valor));
		//System.out.println("");
		
		
		//      Clase             Metodo      param1  param2
		String [] lista3 = BibliotecaArray.añadirFinal(lista, valor);

		System.out.print("La nueva lista es: " );
		imprimirArray(lista3);
		
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
