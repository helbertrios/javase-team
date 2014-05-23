package github.com.helbertrios.demo.javase.nested.nestedclass.nestedclassnonstatic;

public class ExemploVariavelHeranca {
	public static void main(String args[]) {
		B.C obj = new B().new C();
	}
}

class A {
	char c;

	A(char c) {
		this.c = c;
	}
}

class B extends A {
	char c = 'a';

	B() {
		super('b');
		System.out.println(c);
		A a = this;
		System.out.println(a.c);
	}

	class C extends A {
		char c = 'c';

		C() {
			super('d');
			System.out.println(B.this.c);
			System.out.println(C.this.c);
			System.out.println(super.c);
		}
	}
}
