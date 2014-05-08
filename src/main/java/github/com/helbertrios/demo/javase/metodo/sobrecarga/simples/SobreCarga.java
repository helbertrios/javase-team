package github.com.helbertrios.demo.javase.metodo.sobrecarga.simples;

/**
 * Sobrecarga de Método
 * 
 * @author Helbert Rios
 * 
 */
public class SobreCarga {

	public static void main(String[] args) {
		SobreCarga simples = new SobreCarga();
		simples.imprime();
		simples.imprime(new Integer(1));
		simples.imprime(new Long(1));
	}

	void imprime() {
		System.out.println("executando void imprime()");
	}

	void imprime(Integer i) {
		System.out.println("executando void imprime(Integer i)");
	}

	void imprime(Long l) {
		System.out.println("executando void imprime(Long l)");
	}

}
