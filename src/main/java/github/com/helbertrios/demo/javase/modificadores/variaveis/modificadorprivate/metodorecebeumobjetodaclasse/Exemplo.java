package github.com.helbertrios.demo.javase.modificadores.variaveis.modificadorprivate.metodorecebeumobjetodaclasse;

public class Exemplo {
	
	private int i;
	public void teste(Exemplo e1) {
		System.out.println(e1.i);
		
	}
	
	class Exemplo3 {
		public void teste(Exemplo e1) {
			System.out.println(e1.i);
			
		}
	}

}

class Exemplo2 {
	public void teste(Exemplo e1) {
		//System.out.println(e1.i);
		
	}
}