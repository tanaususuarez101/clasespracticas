package HerenciaYPolimorfismo;


public class Main {

	public static void main(String[]arg) {
		/*
		Persona per1 = new Persona();
		per1.setNombre("Pepe");
		System.out.println("Nombre: " + per1.getNombre());
		per1.setTelefono(679819023L);
		System.out.println("Telefono: " + per1.getTelefono());
		
		Persona per2 = new Persona("Juan", 656728394L);
		System.out.println("Nombre y Telefono: " + per2.toString());
		
		System.out.println("¿Son iguales? " + per1.equals(per2));
		*/
		
		Contacto cont1 = new Contacto("Manu", 636645241L);
		Contacto cont2 = new Contacto("Tana", 722897361L);
		Contacto cont3 = new Contacto("Ana", 622897361L);
		Contacto cont4 = new Contacto("Panu", 736645241L);
		Agenda a1 = new Agenda("Agenda");
		
		a1.añadirContacto(cont2);
		a1.añadirContacto(cont1);
		a1.añadirContacto(cont3);
		a1.añadirContacto(cont1);
		System.out.println(a1.toString());
		
		//a1.borrarContacto(cont4);
		//System.out.println(a1.toString());
		a1.borrarContacto(cont1);
		System.out.println(a1.toString());
		
		Agenda a3 = a1.clone();
		System.out.println(a3.toString());
		
		a1.añadirContacto(cont4);
		System.out.println(a1.toString());
		System.out.println(a3.toString());
	}
	
	
	
}
