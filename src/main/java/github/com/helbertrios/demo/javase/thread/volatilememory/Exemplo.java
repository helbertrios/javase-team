package github.com.helbertrios.demo.javase.thread.volatilememory;

public class Exemplo {
	
	private static volatile int I = 0;
	//private static int I = 0;

	
	public static void main(String[] args) throws InterruptedException {
		new Obsevador().start();
		Thread.sleep(5000);
		new MudaValor().start();			

	}
	
	
	static class Obsevador extends Thread {
		
		public void run() {
			int local = I;
			while (I < 5) {
				if (local != I) {
					System.out.printf("O valor de I foi alterado para %d \n", I);
				    local = I;
				}			
			}
			System.out.printf("EXIT: O valor de I foi alterado para %d \n", I);
		}
		
	}
	
	
	
	static class MudaValor extends Thread {
		
		public void run() {
			int local = I;
			while (I < 5) {
				System.out.printf("Incrementado o valor de I para %d \n", (I+1));
				I = ++local;
				try { Thread.sleep(500); } catch (InterruptedException e) {	}
			}
		}
		
	}
	


}

