package github.com.helbertrios.demo.javase.tipo.enumtype.simples;


public class Estacao {
	
	public static void main(String[] args) {
		Estacao2 i = Estacao2.INVERNO;
		Estacao2 e =Estacao2.valueOf("INVERN");
		System.out.println(e);
		System.out.println(Estacao2.INVERNO.name());
		System.out.println(Estacao2.INVERNO);

	}
	
	public static enum  Estacao5 {		 	
		 	PRIMAVERA, VERAO;
		 	public Object clone(Object o){ return VERAO; }
	}
}

 enum Estacao1 {
	
	PRIMAVERA, VERAO;
	
	public void m() {}

}

 
 enum Estacao2 {
		
	PRIMAVERA, VERAO, OUTONO,
	INVERNO { public String getName() { return "Invernoss";}  };
	
	public void m() {}

}
 
 interface Ix {}
 enum Estacao3 implements Ix {
 	
 	PRIMAVERA, VERAO


 }
 

