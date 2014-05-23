package github.com.helbertrios.demo.javase.nested.nestedclass.nestedclassnonstatic.simples;

public class ExemploAcessoVariaveis {

	static String s1 = "teste";
	String s2 = "teste";
	
	
	
	class innerclassnonStatic {
		
		//static void f() {}   //nao é possivel ter metodo statico,
		
	    void x() {
	    	System.out.println(s1);
	    	System.out.println(s2);
	    	
	    }
	}
	
	
	
	static class innerclassStatic {
		
		static void f() {
	    	System.out.println(s1);
	    	//System.out.println(s2);
		}
		
	    void x() {
	    	System.out.println(s1);
	    	//System.out.println(s2);
	    	
	    }
	}
}
