package github.com.helbertrios.demo.javase.sobrecarga;

/**
 * Provar o conceito da sobre carga.
 * 
 * A sobrecarga ocorre sempre quando existe dois metodos com o mesmo nome e
 * parametros diferentes.
 * 
 * Pode haver uma sobrecarga
 * 
 * @author helbert
 * 
 */
public class ConceitoSobreCarga extends ConceitoSobreCargaPai {

	public static void main(String[] args) {
		ConceitoSobreCarga conceitoSobreCarga = new ConceitoSobreCarga();
		conceitoSobreCarga.sobrecarga(null);
		conceitoSobreCarga.sobrecarga( new B11() );
		conceitoSobreCarga.sobrecarga( new B12() );
	}


	public int sobrecarga(B12 b12) {
		System.out.println("int sobrecarga(B12 b12)");
		return 0;
	}

}

class ConceitoSobreCargaPai {

	public int sobrecarga(B1 b1) {
		System.out.println("int sobrecarga(B1 b1)");
		return 0;
	}

}

