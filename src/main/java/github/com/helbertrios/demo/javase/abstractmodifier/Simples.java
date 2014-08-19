package github.com.helbertrios.demo.javase.abstractmodifier;

public class Simples {

	
}

abstract class A1 { abstract public void m(); }

abstract class A2 extends A1 {}

class A3 extends A1 { public void m() {} }

interface B1 { 
	public void m();
}

abstract class B2 implements B1 {}