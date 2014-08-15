package github.com.helbertrios.demo.javase.passagemparametro;

public class PassagemParametroValor {

	public static void main(String[] args) {
		int i = 1;
		changePrimitivo(i);
		System.out.println(i); // 1
		
		Integer I = 1;
		changePrimitivo(I);
		System.out.println(I); // 2
				
		int j = 1;
		changePrimitivo(j);
		System.out.println(j); // 3
		
		Integer J = 1;
		changePrimitivo(J);
		System.out.println(J); // 4
		
		int a = j + new Integer(j);
		System.out.println(a);
	}
	
	
	
	static void changePrimitivo(int a) {
		a = 2;
	}
	
	static void changeWrapper(Integer a) {
			a = 2;
	}
}
