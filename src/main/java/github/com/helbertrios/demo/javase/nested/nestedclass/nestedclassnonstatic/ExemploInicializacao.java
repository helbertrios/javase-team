package github.com.helbertrios.demo.javase.nested.nestedclass.nestedclassnonstatic;

public class ExemploInicializacao {

	class Anonstatic {
	}

	public Anonstatic create() {

		Anonstatic resultado = new Anonstatic();		
		resultado = new Anonstatic();
		resultado = new ExemploInicializacao().new Anonstatic();		
		resultado = new ExemploInicializacao.Anonstatic();
		return resultado;
	}

	public static void main(String[] args) {
		ExemploInicializacao to = new ExemploInicializacao();
		Anonstatic anonstatic = to.new Anonstatic();
	}

}
