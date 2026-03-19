package p2;

import java.util.Scanner;

class Person{
	String name;
	

	void accept(Scanner sc) {
		System.out.println("Enter name of person");
		name=sc.next();
		
	}
	
	void display() {
		System.out.println("name of person is"+name);
	}
}
	
	
	class Student extends Person{
		int rollno;
		@Override
		void accept(Scanner sc) {
			super.accept(sc);
			System.out.println("enter roll no of student");
			rollno=sc.nextInt();
			
		}

		@Override
		void display() {
			super.display();
			System.out.println("roll no of student is");
			
		}
	}
	
	class Emp extends Person{
		int id;
		double salary;
		@Override
		void accept(Scanner sc) {
			super.accept(sc);
			System.out.println("Enter id of employee");
			id=sc.nextInt();
			System.out.println("Enter salary of employee");
			salary=sc.nextDouble();
		}

		@Override
		void display() {
			super.display();
			System.out.println("id of employee is"+id);
			System.out.println("salary of employee is"+salary);
		}
		
	}





public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p1;
//		p1=new Person();
		p1=new Emp();
		p1.accept(sc);
		p1.display();
	}

}
