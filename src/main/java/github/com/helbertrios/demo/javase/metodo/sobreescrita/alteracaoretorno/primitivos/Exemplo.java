package github.com.helbertrios.demo.javase.metodo.sobreescrita.alteracaoretorno.primitivos;


class Pai {
	int getValor() { return 1;}
}



class Filho  extends Pai{
	//long getValor() { return 1;}
	
	long getValorx() { return 1;}
}