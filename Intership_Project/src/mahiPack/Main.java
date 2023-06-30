/*
package mahiPack;

class A{
	void meth1(int a) {
		System.out.println(a);
	}
	void meth1(int a,int b) {
		System.out.println(a+b);
	}
}

class B extends A{
	@Override
	void meth1(int a) {
		System.out.println(a);
	}
}

abstract class AbsractClass{
	void meth2() {
		System.out.println("This is non-static method");
	}
	static void meth3() {
		System.out.println("This is static method");
	}
	abstract void meth4();
}

interface InterfaceClass{
	public static final int a=10;
	void meth5();
}

class ProvidingBody extends AbsractClass implements InterfaceClass{
	@Override
	void meth4() {
		System.out.println("This is AbstarctClass Abstract Method");
		
		
	}
	@Override
	public void meth5() {
		System.out.println("This is inside Interface abstarct method");
		System.out.println(a);
	}
	
}


public class Main {
	public static void main(String[] args) {
		B b1=new B();
		b1.meth1(4);
		b1.meth1(4, 6);
		ProvidingBody p1=new ProvidingBody();
		p1.meth2();
		ProvidingBody.meth3();
		p1.meth4();
		p1.meth5();
		
	}
}

*/

/*Output of above program

4
10
This is non-static method
This is static method
This is AbstarctClass Abstract Method
This is inside Interface abstract method
10
*/ 
