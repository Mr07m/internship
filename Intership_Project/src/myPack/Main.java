package myPack;

//abstract class Bank{
//	
//	abstract void getBalance(double sal);
//}
//class BankA extends Bank{
//	@Override
//	void getBalance(double sal) {
//		System.out.println("Class A: "+sal);
//		
//	}
//}
//
//class BankB extends Bank{
//	@Override
//	void getBalance(double sal) {
//		System.out.println("Class B:"+sal);
//		
//	}
//}
//
//class BankC extends Bank{
//	@Override
//	void getBalance(double sal) {
//		System.out.println("Class C: "+sal);
//		
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		BankA b1=new BankA();
//		BankB b2=new BankB();
//		BankC b3=new BankC();
//		b1.getBalance(2000);
//		b2.getBalance(1000);
//		b3.getBalance(2000);
//	}
//}

//abstract class Animal{
//	abstract void cat();
//	abstract void dog();
//}

//class Inherit extends Animal{
//	@Override
//	void cat() {
//		System.out.println("Meow Meow....");
//	}
//@Override
//	void dog() {
//		System.out.println("Bow Bow....");
//		
//	}	
//}
//
//public class Main{
//	public static void main(String[] args) {
//		Inherit inherit=new Inherit();
//		inherit.cat();
//		inherit.dog();
//	}
//}


//interface School{
//	void getSalary();
//	void getFees();
//}
//
//
//class Student implements School{
//	Scanner scanner=new Scanner(System.in);
//	@Override
//	public void getSalary() {
//		System.out.print("Enter Teacher Salary: ");
//		int sal=scanner.nextInt();
//		System.out.println("Teacher Salary is: "+sal);
//	}
//	@Override
//	public void getFees() {
//		getSalary();
//		System.out.print("Enter Student Fees: ");
//		int fees=scanner.nextInt();
//		System.out.println("Student Fees is: "+fees);
//	}
//}
//
//public class Main{
//	public static void main(String[] args) {
//		Student student=new Student();
//		student.getFees();
//	}
//}


abstract class Bank{
	abstract void getBalance(int dep);
}
class BA extends Bank{
	@Override
	void getBalance(int dep) {
		System.out.println(dep);
	}
}

class BB extends Bank{
	@Override
	void getBalance(int dep) {
		System.out.println(dep);
	}
}

class BC extends Bank{
	@Override
	void getBalance(int dep) {
		System.out.println(dep);
		
	}
}

public class Main{
	public static void main(String[] args) {
		BA b1=new BA();
		BB b2=new BB();
		BC b3=new BC();
		b1.getBalance(1000);
		b2.getBalance(2000);
		b3.getBalance(3000);
	}
}
