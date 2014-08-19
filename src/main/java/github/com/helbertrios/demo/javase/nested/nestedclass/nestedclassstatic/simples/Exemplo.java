package github.com.helbertrios.demo.javase.nested.nestedclass.nestedclassstatic.simples;

public class Exemplo {
	
	static class staticclass {}
	
	public static void main(String[] args) {
		class C {};		
		C c = new C();
		System.out.println(c.getClass().getName());
		
		class D { public int i = 10; };
		D d = new D();
		System.out.println(d.getClass().getName());
		Exemplo$2D o = (Exemplo$2D) getD();
		System.out.println(o.getClass().getName());
		Exemplo$2D e = new Exemplo$2D();
		System.out.println(e.getClass().getName());
		System.out.println(e.i);		
	}
	

	
	public static Object getD() {
		class D { public int i = 11; };	
		D d = new D();
		System.out.println(d.getClass().getName());
		return d;
	}
}


class Exemplo$2D {
		public int i = 12;		
}