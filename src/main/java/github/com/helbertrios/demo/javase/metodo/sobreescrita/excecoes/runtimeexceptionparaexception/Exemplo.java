package github.com.helbertrios.demo.javase.metodo.sobreescrita.excecoes.runtimeexceptionparaexception;


import java.io.IOException;

@SuppressWarnings("unused")
class Pai {
	public static void main(String[] args) {
	  A a = new A();
	  System.out.println(a.x);
	//  System.out.println(A.x);
	  
	}
	
	int getValor() throws  NullPointerException { return 1;}
	static class A {
		public int x;
	}
}



class Filho  extends Pai{
//	int getValor() throws IOException { return 1;}
}