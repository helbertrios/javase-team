package github.com.helbertrios.demo.javase.metodo.sobreescrita.excecoes.runtimeexceptionparatuntimeexception;



class Pai {
	int getValor() throws  NullPointerException { return 1;}
}



class Filho  extends Pai{
	int getValor() throws IllegalArgumentException { return 1;}
}