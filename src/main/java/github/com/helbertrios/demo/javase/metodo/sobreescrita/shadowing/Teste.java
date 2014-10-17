package github.com.helbertrios.demo.javase.metodo.sobreescrita.shadowing;

public class Teste {
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.m(2));
	
	}

}



class A {
	
	long k(long i) { return 23; };	
	long m(int i) { return k(2); };
	
}

class B extends A {
	long k(int i) { return 42; };	
}