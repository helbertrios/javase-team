package github.com.helbertrios.demo.javase.metodo.sobreescrita.excecoes.runtimeexceptionparaexception;


import java.io.IOException;

@SuppressWarnings("unused")
class Pai {
	int getValor() throws  NullPointerException { return 1;}
	
}



class Filho  extends Pai{
//	int getValor() throws IOException { return 1;}
}