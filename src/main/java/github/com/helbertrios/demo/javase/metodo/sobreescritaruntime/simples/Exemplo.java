package github.com.helbertrios.demo.javase.metodo.sobreescritaruntime.simples;

public class Exemplo {
	
	public static void main(String[] args) {
		A a = new A() {
			public void m() {
				System.out.println("Em Exemplo");
			}
		};
		
		a.m();
		
	}

}



class A {
	public void m() {
		System.out.println("Em A");
	}
}