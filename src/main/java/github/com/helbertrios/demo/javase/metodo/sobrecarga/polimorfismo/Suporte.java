package github.com.helbertrios.demo.javase.metodo.sobrecarga.polimorfismo;

class Quadrado {	
	public double lado;
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}	
}

class Triangulo {		
	public double  base;
	public double  altura;
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}	
	
}

class Retangulo {
	public double  base;
	public double  altura;
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}		
}

class Trapezio {
	public double  baseMaior;
	public double  baseMenor;
	public double  altura;
	public Trapezio(double baseMaior, double baseMenor, double altura) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}	
}


class Circulo {
	public double  raio;
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
}
