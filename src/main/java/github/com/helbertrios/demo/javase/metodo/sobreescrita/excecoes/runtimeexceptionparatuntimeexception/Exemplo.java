package github.com.helbertrios.demo.javase.metodo.sobreescrita.excecoes.runtimeexceptionparatuntimeexception;



class Pai {
	int getValor() throws  NullPointerException { return 1;}
}



class Filho  extends Pai{
	int getValor() throws IllegalArgumentException { return 1;}
}



class Pai1 {
	int getValor() throws  Exception { return 1;}
}



class Filho1  extends Pai1 {
	int getValor()  { return 1;}
}


interface I1 {
   int VALUE = 1;
   void m1();
}

interface I2 {
   int VALUE = 2;
   void m1();
}
	
class Exemplo implements I1, I2{
	
	public void m1() { System.out.println("Hello"); }
		   
	public static void main(String[] args) {
		long a = 10, b = 20;
		long c = b % a;
		System.out.println(c);		
	}
	
}