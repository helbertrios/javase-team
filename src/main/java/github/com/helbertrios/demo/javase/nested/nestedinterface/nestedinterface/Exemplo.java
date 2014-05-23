package github.com.helbertrios.demo.javase.nested.nestedinterface.nestedinterface;


interface Exemplo {
	
	interface nonstaticinterface {}		
	class nonstaticclass1 implements nonstaticinterface {}				
	static class nonstaticclass2 implements nonstaticinterface {}
	
	
	static interface staticinterface {}			
	class nonstaticclass3 implements staticinterface {}				
	static class nonstaticclass4 implements staticinterface {}

	
}
