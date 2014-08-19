package github.com.helbertrios.demo.javase.tipo.enumtype.simples;

interface I { }  
enum EnumA implements I { A, AA, AAA}; //1

class TestClass extends Object {
	
	 public enum EnumB { B, BB, BBB; 
	 	public Object clone(Object o){ return B; } //2 
	 	
	 	//public Object clone() {return B;}
	 }  
	 public static enum EnumC{ C, CC, CCC };  
	 
	 //public static enum EnumD extends EnumC{ DDD }; //3
	 
	// public TestClass() { System.out.println(EnumC.CC.index()); //4    
	 //}
	 
	 
	 public static void main(String[] args) {
		 System.out.println(EnumC.valueOf("ccc")); //5        
		 System.out.println(EnumC.CCC.name()); //6
	 }
}
