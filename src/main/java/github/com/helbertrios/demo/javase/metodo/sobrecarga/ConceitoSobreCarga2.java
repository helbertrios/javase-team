package github.com.helbertrios.demo.javase.metodo.sobrecarga;

/**
 * Provar o conceito da sobre carga.
 * 
 * A sobrecarga ocorre sempre quando existe dois metodos com o mesmo nome e
 * parametros diferentes.
 * 
 * 1 - Quando null � passado como par�metro o m�todo com par�metro mais especifico � executado.
 * 	   O erro "is ambiguous for the type":
 *				Ocorre quando � imposs�vel se definir qual o m�todo mais especifico:
 *                   1 -  Bifurca��o da cadeia de heran�a.  
 * 2 - Executa com par�metro de mesmo tipo ou com o pai mais pr�ximo.  
 * 
 * @author helbert
 * 
 */
public class ConceitoSobreCarga2 extends ConceitoSobreCargaPai {

	public static void main(String[] args) {
		ConceitoSobreCarga2 conceitoSobreCarga = new ConceitoSobreCarga2();
		conceitoSobreCarga.sobrecarga(null);
		conceitoSobreCarga.sobrecarga( new B11() );
		conceitoSobreCarga.sobrecarga( new B1111());
		conceitoSobreCarga.sobrecarga( new B1112() );
	}


	public int sobrecarga(B11 b11) {
		System.out.println("int sobrecarga(B11 b11)");
		return 0;
	}
	

	/*public int sobrecarga(B12 b12) {
		System.out.println("int sobrecarga(B12 b12)");
		return 0;
	}*/

}

class ConceitoSobreCargaPai {

	public int sobrecarga(B1 b1) {
		System.out.println("int sobrecarga(B1 b1)");
		return 0;
	}
	
	public int sobrecarga(B111 b111) {
		System.out.println("int sobrecarga(B111 b111)");
		return 0;
	}

	
}

