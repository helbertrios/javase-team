package github.com.helbertrios.demo.javase.thread.synchronizedmetodo;

public class Exemplo {
	
	public static void main(String[] args) {
		new T("Thread 1").start();
		new T("Thread 2").start();
	}

}

class A {
	
	public synchronized static void metodoSynchronized(String nome) {	
		System.out.printf("Executando a thread %s \n", nome);
		try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
		System.out.printf("finalizando a thread %s \n", nome);
	}
}


class T extends Thread {
	
	private String nome;
	
	T(String nome) {
		this.nome = nome;
	}
	
	public void run() {		
		A.metodoSynchronized(nome);		
	}
}