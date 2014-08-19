package github.com.helbertrios.demo.javase.nested.nestedclass.inicializacao;


public class Exemplo {
	
	class A { }
	static class B {}
	
	
	public static void main(String[] args) {
		A a1 = new Exemplo().new A();
		Exemplo.A a2 = new Exemplo().new A();
		
		Exemplo ex = new Exemplo();
		A a3 = ex.new A();						
		Exemplo.A a4 = ex.new A();	
		
		B b1 = new B();
		Exemplo.B b2 = new Exemplo.B();
		//Exemplo.A a5 = new ex.A();
		/*
		Object c = new Object() {
			Object(String a) {
				
			}
		};
		*/					
		 
		 
	}

}

class X {
	//B b1 = new B();
	Exemplo.B b2 = new Exemplo.B();
	Exemplo ex = new Exemplo();
	Exemplo.A a = ex.new A();
//	A a = ex.new A();
}