package github.com.helbertrios.demo.javase.metodo.sobreescrita.interfaceoverride;

public class Exemplo {

}

interface Ihello {
	
	public int hello(int x, int y);
	public long hello(long x, long y);
}

abstract class hello implements Ihello {
	
}

abstract class XHello {
	

	abstract public int hello(int x, int y);
	public abstract long hello(long x, long y);
}


abstract class XHellox implements Ihello {
	
}