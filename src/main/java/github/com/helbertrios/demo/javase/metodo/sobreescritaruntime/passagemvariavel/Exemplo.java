package github.com.helbertrios.demo.javase.metodo.sobreescritaruntime.passagemvariavel;

public class Exemplo {
	
	private static final String s1 = "teste";
	private final String s2 = "teste";
	
	@SuppressWarnings("unused")
	private String a = "teste"; // Tem que ser final.
	
	public static void main(String[] args) {
		Exemplo e = new Exemplo();
		e.x();
	}
	
	
	public void x() {
		
		final String s3 = "teste";
		A a = new A() {
			public void m() {
				System.out.println("Em Exemplo "+s1);
				System.out.println("Em Exemplo "+s2);
				System.out.println("Em Exemplo "+s3);
				//System.out.println("Em Exemplo "+a);
			}
		};
		
		a.m();
		
	}

}



class A {
	public void m() {
		System.out.println("Em A ");
	}
}