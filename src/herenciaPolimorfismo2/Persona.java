package herenciaPolimorfismo2;
/**
 * EJEMPLO DE CLASE ABSTRACTA
 * DEL MOMENTO QUE EXISTA UNA CLASE QUE NO SE IMPLEMENTA, YA DEBE SER ABSTRACTA 
 * */
public abstract class Persona {
	
	protected String nombre;
	

	
	public Persona(String nombre) {
		this.nombre = nombre;
		
	}
	
	
	public abstract String getNombre(); // <- método sin implementar, por tanto hay que indicar que es abstracto, y por consiguiente la clase a la que pertenece este método
	
	public String toString() {
		return "Esta es la clase padre";
	}
	
}
