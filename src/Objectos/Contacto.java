package Objectos;


public class Contacto {

	// Atributos de las clase siempre tiene que ser Objecto
    private String nombre;
    private String telefono;
    private Integer edad; // int
    

    public Contacto() {
        nombre = "";
        telefono = "";
    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // String inter, int
    public String getNombre() {
    	return nombre;
    }    
    public String getTelefono() {
    	return telefono;
    }
        
}

