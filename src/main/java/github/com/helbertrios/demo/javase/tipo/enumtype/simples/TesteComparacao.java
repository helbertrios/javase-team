package github.com.helbertrios.demo.javase.tipo.enumtype.simples;

public class TesteComparacao {

	public static void main(String[] args) {	
		Switch a = Switch.OFF;
		if (a.equals(Switch.OFF)) {
			System.out.println("OK");
		}
		
		if (a == Switch.OFF) {
			System.out.println("OK");
		}
		
		switch (a) {
		
			//case Switch.ON:		
			//break;
			case ON:
				break;
				
			case OFF:	
				System.out.println("OK");
				break;
			default:
				break;
		}
	}
	
	
}

enum Switch {	
	ON, OFF	
}