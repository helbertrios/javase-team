package github.com.helbertrios.demo.javase.imports.statico;

import static github.com.helbertrios.demo.javase.imports.statico.Suporte.metodoStatico;
import static github.com.helbertrios.demo.javase.imports.statico.Suporte.variavelStatica;;

public class ImportandoEspecifico {
	
	public static void main(String[] args) {
		metodoStatico();
		System.out.println(variavelStatica);
	}

}
