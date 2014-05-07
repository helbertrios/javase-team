package github.com.helbertrios.demo.javase.sobrecarga;


/**
 * Sobrecarga de Método
 *  
 * @author Helbert Rios
 *
 */
public class ExemploSimplesSobreCarga  {
	
	
	public static void main(String[] args) {
		ExemploSimplesSobreCarga simple = new ExemploSimplesSobreCarga();
		simple.sobrecarga();
		simple.sobrecarga(new Integer(1));
		simple.sobrecarga(new Long(1));			
	}
	
	
	void sobrecarga() {	
		System.out.println("executando void sobreCarga()");
	}

	void sobrecarga(Integer i) {
		System.out.println("executando void sobreCarga(Integer i)");
	}
	
	void sobrecarga(Long l) {		
		System.out.println("executando void sobreCarga(Long l)");	
	}

}



