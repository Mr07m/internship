package empPack;

import java.util.Scanner;

abstract class AbClass {
	int sal = 5000;

	abstract void calSal(int hra, int da, int pf);
}

class Employee extends AbClass {
	int id;
	int age;
	String name;

	void getinfo() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ID: ");
		id = s.nextInt();
		System.out.print("Enter Name: ");
		name = s.next();
		System.out.print("Enter Age: ");
		age = s.nextInt();
	}

	void setInfo() {
		System.out.println("\n******************* Empolyee Information **************************");
		System.out.println("\nID: " + id);
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}

	@Override
	void calSal(int hra, int da, int pf) {
		int t;
		t = sal + hra + da - pf;
		System.out.println("The Total salary is: " + t);

	}
}

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getinfo();
		e1.setInfo();
		e1.calSal(2000, 3000, 1000);
	}
}
