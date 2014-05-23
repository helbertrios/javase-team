package github.com.helbertrios.demo.javase.nested.nestedclass.inicializacao;

public class Exemplo {
	
	class A { }
	static class B {}
	
	
	public static void main(String[] args) {
		A a = new Exemplo().new A();
		Exemplo.A az = new Exemplo().new A();
		Exemplo e = new Exemplo();
		Exemplo.A ax = new to.A();
		
		Exemplo e = new Exemplo();
		A a1 = e.new A();
	}

}
