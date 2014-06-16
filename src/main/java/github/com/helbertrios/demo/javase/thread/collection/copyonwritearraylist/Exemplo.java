package github.com.helbertrios.demo.javase.thread.collection.copyonwritearraylist;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exemplo {
	private static List<String> lista = new CopyOnWriteArrayList<String>();	
	public static void main(String[] args) {
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("E");
		new A().start();
		new B().start();
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		for (String s : lista) {
			System.out.println(s);
		}
		

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
			System.out.println("Thread B remove");
			lista.remove(3);
		}
		
	}

}
