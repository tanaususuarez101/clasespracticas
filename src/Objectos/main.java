package Objectos;

public class main {
    public static void main(String[] args) {
        Contacto primero = new Contacto("Manu", "1231421312");
        System.out.println("M�TODO MAIN");
        //System.out.println(primero.getNombre());
        //System.out.println(primero.getTelefono());

        
        //int array[] = new int[2]; = [0, 0 ]
        
        // 
        // Crear array tal que as: [ null, null, null, null, null ]
        String[] nombre = new String[5];
        
        // for (inicializacion; condicion de parada; ejecuci�n)
        // 0  1  2  3  4  5
        // [1, 2, 3, 4, 5, 6]        
        /*
        for(int i = 0; i < nombre.length; i++) {
        	nombre[i] = "Posici�n " + i;
        }
        
        // 
        for (String var: nombre) {
        	System.out.println(var);
        }
        
        System.out.println(nombre[4]);
        nombre = new String [6];
        
        */
        

        
        pruebaAgenda();
        
    }
    
    private static void pruebaAgenda() {
    	System.out.println("METODO PRUEBA AGENDA");
    	
    	//Declaramos el objeto agenda
    	Agenda a1 = new Agenda(4, "Mi Agenda");
    	System.out.println("Nombre de mi agenda es: " + a1.nombre);
    	
    	// Declaramos los objectos contactos
    	Contacto c1 = new Contacto("Juan", "123456");
		Contacto c2 = new Contacto("pepe", "625485");
		
		a1.a�adirContacto(c1);
		a1.a�adirContacto(c2);
		
    	System.out.println( a1.toString() );
    	
    	System.out.println( );
    	System.out.println(  );
    	
    	System.out.println("�ESTA EL CONTACTO: " + c1.getNombre() + "?");
    	boolean respuesta = a1.buscarContacto(c1);
    	System.out.println("La respuesta es: " + respuesta);
    	System.out.println( );
    	
    	System.out.println( "�EST� CONTACTO: " + c2.getNombre() + "?" );
    	boolean respuesta2 = a1.buscarContacto(c2);
    	System.out.println( "La respuesta es: " +respuesta2);
    	System.out.println( );
    	
    	Contacto c3 = new Contacto("lucas", "1257585");
    	System.out.println( "�EST� CONTACTO: " + c3.getNombre() + "?" );
    	boolean respuesta3 = a1.buscarContacto(c3);
    	System.out.println( "La respuesta es: " +respuesta3);
    	
    	a1.a�adirContacto(c3);
    	
    	System.out.println( "�EST� CONTACTO: " + c3.getNombre() + "?" );
    	boolean respuesta4 = a1.buscarContacto(c3);
    	System.out.println( "La respuesta es: " +respuesta4);
    	
    	System.out.println( );
    	System.out.println( a1.toString() );
    	
    	System.out.println( "Elimina a : " + c3.getNombre());
    	respuesta4 = a1.eliminarContacto(2);
    	System.out.println( "Mensaje de eliminar contacto es: " + respuesta4);
    	
    	
    	System.out.println( a1.toString() );
    	
    	System.out.println();
    	System.out.println("Lista de contacto");
    	
    	for (Contacto contacto: a1.getLista()) {
    		if (contacto != null){
    			System.out.println(contacto.getNombre() + ", ");
    		}    		
    	}
    		
    	
    }
    
}
