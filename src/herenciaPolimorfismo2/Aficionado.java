package herenciaPolimorfismo2;

public interface Aficionado {
	

	/* 
	 * Una interfaz (nótese que no es una class) NO lleva atributos y No implementa ningún método.
	 * Las clases que implementa esta interfaz, son los encargados de implementar TODOS los métodos.
	 * */

	// En el caso de una interfaz, sí se permite que otra clase implemente una o varias interfaces
	
	public void cantar();
	public void aplaudir() throws Exception;

}
