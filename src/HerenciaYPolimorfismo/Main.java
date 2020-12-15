package HerenciaYPolimorfismo;


public class Main {

	public static void main(String[]arg) {
		
		Persona cont1 = new Persona();
		cont1.setNombre("Pepe");
		System.out.println("Nombre: " + cont1.getNombre());
		cont1.setTelefono(679819023L);
		System.out.println("Telefono: " + cont1.getTelefono());
		
		Persona cont2 = new Persona("Juan", 656728394L);
		System.out.println("Nombre y Telefono: " + cont2.toString());
		
		System.out.println("¿Son iguales? " + cont1.equals(cont2));
		
	}
	
	
}
