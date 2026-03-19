package p2;



import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	
	
	
	void accept(Scanner sc) {
		System.out.println("enter id of employee");
		id=sc.nextInt();
		System.out.println("enter name of employee");
		name=sc.next();
		System.out.println("enter salary of employee");
		salary=sc.nextDouble();
	}
	
	void display() {
		System.out.println("id of employee is : "+ id);
		System.out.println("Name of employee is : "+ name);
		System.out.println("Salary of employee is : "+ salary);
	}
}

class Manager extends Employee{
	double bonus;
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter bonus - ");
		bonus = sc.nextDouble();
	}
	@Override
		void display() {
		super.display();
		System.out.println("bonus of employee is : "+ bonus);
		
	}
	
}

class Salesman extends Employee{
	int noOfSales;
	double comm;
	@Override
	void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter number of sales");
		noOfSales=sc.nextInt();
		System.out.println("enter commission");
		comm=sc.nextDouble();
		
	}

	@Override
	void display() {
		super.display();
		System.out.println("number od product sold is "+noOfSales);
		System.out.println("commission per product "+comm);
	}
	
}
public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e2;
		
//		e2=new Employee();
//		e2=new Manager();
		
		e2=new Salesman();
		e2.accept(sc);
		e2.display();
		
//		
	}

}
