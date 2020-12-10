package bloque_I;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class excepciones {
	
	public static void main(String[] args) {
		//ejemplo1();
		//ejemplo2();
		ejemplo3();
	}
	
	
	/*
	 * EJEMPLO DE EXCEPCIÓN 1
	 * */
	
	public static void ejemplo1() {
		System.out.println("Ejemplo de control de excepción:");
		ejemplo1Control();
		
		//System.out.println("Ejemplo de no control de excepción");
		//ejemplo1SinControl();
	}
	
	public static void ejemplo1Control(){
		try {
			int valor = 20 / 0;
		} catch(ArithmeticException error) {
			System.out.println(error.getMessage());
		}
		
		System.out.println("Mensaje final");
	}
	
	public static void ejemplo1SinControl(){
	
		int valor = 20 / 0;
		
		System.out.println("Mensaje final");
	}
	
	
	
	/*
	 * EJEMPLO DE EXCEPCIÓN 2
	 * */
	public static void ejemplo2() {
		ejemplo2Control();
		//ejemplo2SinControl();
		
	}
	
	public static void ejemplo2SinControl() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce un valor entero: ");
		int valorEntero = reader.nextInt();
		
		System.out.print("el valor introducido es: " + valorEntero);
		
	}
	
	public static void ejemplo2Control() {
		Scanner reader = new Scanner(System.in);
		int valorEntero = 0;
		
		System.out.println("Introduce un valor entero: ");
		try {
			valorEntero = reader.nextInt();
		} catch (Exception e) {
			System.out.println("Valor no permitido, se indica por defecto");
		}
		
		
		System.out.print("el valor introducido es: " + valorEntero);
		
	}
	
	public static void ejemplo3(){
		Persona persona = new Persona("Juan");
		
		try {
			persona.setTelefono(-25489352);
		} catch(Exception e) {
			System.out.print(e);
		}
		
	}
	
	
}

class Persona {
	
	private String nombre;
	private int telefono;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTelefono(int tlf) throws Exception {
		if (tlf < 0) throw new Exception("No estan permitidos valores negativos"); 
		this.telefono = tlf;
	}
	
	
}