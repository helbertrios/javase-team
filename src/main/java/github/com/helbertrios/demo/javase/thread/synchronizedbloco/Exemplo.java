package github.com.helbertrios.demo.javase.thread.synchronizedbloco;


public class Exemplo {
	public static void main(String[] args) throws InterruptedException {
		new T("Thread 1", "Thread 1").start();
		new T("Thread 2","Thread 2").start();
		Thread.sleep(9000);
		System.out.println("--------------------------------------------------------------");
		String s = "lock";
		new T("Thread 1x",s).start();
		new T("Thread 2x",s).start();
	}
}


class A {
	
	public static void metodoSynchronized(String nome,  String lock) {	
		synchronized (lock) {
			System.out.printf("Executando a thread %s \n", nome);
			try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
			System.out.printf("finalizando a thread %s \n", nome);
		}

	}
}


class T extends Thread {
	
	private String nome;
	private String lock;
	
	T(String nome, String lock) {
		this.nome = nome;
		this.lock = lock;
	}
	
	public void run() {		
		A.metodoSynchronized(nome, lock);		
	}
}

