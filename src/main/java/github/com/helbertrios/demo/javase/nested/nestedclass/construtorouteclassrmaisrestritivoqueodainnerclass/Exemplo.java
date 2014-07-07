package github.com.helbertrios.demo.javase.nested.nestedclass.construtorouteclassrmaisrestritivoqueodainnerclass;

class Exemplo {
	
	protected class InnerClass {}
	
	public static void main(String[] args) {
		Exemplo o = new Exemplo();
		Exemplo.InnerClass i = o.new InnerClass();
	}

}
