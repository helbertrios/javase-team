package github.com.helbertrios.demo.javase.metodo.sobrecarga.polimorfismo;

public class CalculadoraArea {
	
	public static void main(String[] args) {
		CalculadoraArea calculadoraArea = new CalculadoraArea();
		
		double resultado = calculadoraArea.calcula(new Quadrado(2));
		System.out.printf("햞ea do quadrado...:  %f \n", resultado);
		
		resultado = calculadoraArea.calcula(new Triangulo(2,3));
		System.out.printf("햞ea do triangulo..:  %f \n", resultado);	
		
		resultado = calculadoraArea.calcula(new Retangulo(3,3));
		System.out.printf("햞ea do retangulo..:  %f \n", resultado);
		
		resultado = calculadoraArea.calcula(new Trapezio(3,2,2));
		System.out.printf("햞ea do trapezio...:  %f \n", resultado);

		resultado = calculadoraArea.calcula(new Circulo(1.5));
		System.out.printf("햞ea do circulo....:  %f \n", resultado);	
	}
	
	public double calcula(Quadrado quadrado) {
		return quadrado.lado * quadrado.lado;
	}

	
	public double calcula(Triangulo triangulo) {
		return triangulo.base * triangulo.altura / 2;
	}
	
	
	public double calcula(Retangulo retangulo) {
		return retangulo.base * retangulo.altura;
	}
	
	
	public double calcula(Trapezio trapezio) {
		return ((trapezio.baseMaior + trapezio.baseMenor)  / 2) * trapezio.altura;
	}
	
	
	public double calcula(Circulo circulo) {
		return Math.PI * Math.pow(circulo.raio, 2);
	}

}
