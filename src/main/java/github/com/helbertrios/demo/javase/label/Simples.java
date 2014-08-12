package github.com.helbertrios.demo.javase.label;

public class Simples {
	
	public static void main(String[] args) {
		
		
		I:
		if (true) {
			
		}
    	//continue I;
	
		II:
		if (true) {
			//continue II;
		}
		
		
		III:for (int i = 0; i < args.length; i++) {
			continue III;
		}
		
		//continue III;
	}

}
