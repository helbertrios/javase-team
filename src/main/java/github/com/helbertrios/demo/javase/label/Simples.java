package github.com.helbertrios.demo.javase.label;

public class Simples {
	
	public static void main(String[] args) {
		
		
		I: {	
			if (true) {	
				System.out.println("label 1");
				 break I;
			}	
			System.out.println("never print");
		}
		System.out.println("end I");
	
		II:
		if (true) {
			//continue II;
		}
		
		
		III:for (int i = 0; i < 10; i++) {
			continue III;
		}
		
		IV: {
			for (int i = 0; i < 10; i++) {
				System.out.println("label IV");
				break IV;
			}
			System.out.println("nerver print"); 
		}
		System.out.println("end IV");
		
		
		V: {
			try {
				System.out.println("label V");
				break V;	
			} finally {
				System.out.println("finally V");
			}
		
			//System.out.println("nerver be print"); 
		}
		System.out.println("end V"); 
	}

}
