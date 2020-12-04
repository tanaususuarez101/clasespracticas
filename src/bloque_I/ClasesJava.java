package bloque_I;

public class ClasesJava {
	
	public static void main(String [] args) {
		
		System.out.println("Hola mundo");
		// String, int, double, char
		String cadena = "";
		String cadena1 = new String();
		
		cadena.trim();
		
		
		
		// DECLARACION DE OBJECTO
		//Rectangulo r1 = new Rectangulo();
		//Rectangulo r2 = new Rectangulo(1.5, 5.0);
		
		// UTILIZAR EL OBJETO
		//System.out.println(r2.getAltura());
		//System.out.println(r2.area());
		//r2.setAltura(40);
		//System.out.println(r2.area());
		//System.out.println(r2.getAltura());
		
		// REFERENCIAS AL OBJECTO
		
		int a = 2;
		int b = 4;
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println();
		
		a=b;
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println();
		
		b = 5;
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println();
		
		
		
		Rectangulo r1 = new Rectangulo(1.5, 5.0);
		Rectangulo r2 = new Rectangulo(1.5, 5.0);
		
		System.out.println("r1: " +r1.getAltura());
		System.out.println("r2: " + r2.getAltura());
		System.out.println();
		
		// Creas una referencia de r1 y r2
		 r1 = r2;
		
		System.out.println("r1: " +r1.getAltura());
		System.out.println("r2: " + r2.getAltura());
		System.out.println();
		
		//r1.setAltura(20);
		
		System.out.println("r1: " +r1.getAltura());
		System.out.println("r2: " + r2.getAltura());
		/*****************************************************************/
		
		Ortoedro ob = new Ortoedro();
		System.out.println(ob.getAltura());
		System.out.println(ob.getBase());
		
		// CLASES PREDEFINIDAS DE LA CLASE OBJECT
		System.out.println(ob.toString());		
		System.out.println(r1.equals(r2));
		// getClass
		r1.getClass();
		System.out.println(r2.hashCode());
		
		
		// Copias el objecto
		Rectangulo r3 = r1.clone();
		
		r1.setAltura(20);
		
		
	}	
}



class Rectangulo {
	
	double base;
	double altura;
	

	// contructor: Inicilizar el objecto 
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo() {
		this.base = 0;
		this.altura = 0;
	}

	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}
	
	public boolean equals(Rectangulo obj) {
		return this.altura == obj.altura && this.base == obj.base;
	}
	
	public Rectangulo clone(){
		return new Rectangulo(this.altura, this.base);
	}
	
}


class Ortoedro extends Rectangulo {
	
	double grosor;
	
	public Ortoedro (double base, double altura, double grosor) {
		super(base, altura);
		this.grosor = grosor;
	}
	public Ortoedro () {
		this.base = 0;
		this.altura = 0;
		this.grosor = 0;
	}

}

class Cuadrado extends Rectangulo {
	public Cuadrado (double base) {
		super(base, base);
	}
}


