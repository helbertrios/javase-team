package github.com.helbertrios.demo.javase.thread.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {
	
	private static List<String> lista = new ArrayList<String>(4);	
	public static void main(String[] args) {
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("E");
		new A().start();
		new B().start();
	}
	
	static class A extends Thread {
		
		public void run() {
			for (String s : lista) {
				System.out.printf("Thread A %s \n", s);
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		}
		
	}

	static class B extends Thread {
		public void run() {
			System.out.println("Thread B");
			lista.remove(3);
		}
		
	}
}

