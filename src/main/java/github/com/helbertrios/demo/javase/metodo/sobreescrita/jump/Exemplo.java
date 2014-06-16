package github.com.helbertrios.demo.javase.metodo.sobreescrita.jump;

public class Exemplo {
	
	public static void main(String[] args) {
		A a = new C();
		System.out.println(a.i);
		System.out.println(a.m());
		B b = (B) a;
		System.out.println(b.i);
		System.out.println(b.m());		
	}

}


class A { int i = 10; int m() {return i;} }
class B extends A { int i = 20; int m() {return i;} }
class C extends B { int i = 30; int m() {return i;} }