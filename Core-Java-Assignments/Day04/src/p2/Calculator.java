package p2;

import java.util.Scanner;

interface numbers{
	void accept(Scanner sc);
	
	void calculate();
}
	
	class Add implements numbers{
		float a;
		float b;
		@Override
		public void accept(Scanner sc) {
			System.out.println("Enter number");
			a=sc.nextInt();
			System.out.println("Enter number");
			b=sc.nextInt();
			
		}
		@Override
		public void calculate() {
			System.out.println("Addiction of two numbers is : "+(a+b));
			
		}
		
	}
	
	class sub implements numbers{
		float a;
		float b;
		@Override
		public void accept(Scanner sc) {
			System.out.println("Enter number");
			a=sc.nextInt();
			System.out.println("Enter number");
			b=sc.nextInt();
		}
		@Override
		public void calculate() {
			System.out.println("Substraction of two numbers is : "+(a-b));
			
		}
		
	}
	
	class mult implements numbers{
		float a;
		float b;
		@Override
		public void accept(Scanner sc) {
			System.out.println("Enter number");
			a=sc.nextInt();
			System.out.println("Enter number");
			b=sc.nextInt();			
		}
		@Override
		public void calculate() {
			System.out.println("Multiplication of two numbers is : "+(a*b));
			
		}
		
	}
	
	class div implements numbers{
		float a;
		float b;
		@Override
		public void accept(Scanner sc) {
			System.out.println("Enter number");
			a=sc.nextInt();
			System.out.println("Enter number");
			b=sc.nextInt();			
		}
		@Override
		public void calculate() {
			System.out.println("Division of two numbers is : "+(a/b));
			
		}
	}

public class Calculator {
	public static int menu(Scanner sc) {
			System.out.println("0 : EXIT");
			System.out.println("1 : Addiction");
			System.out.println("2 : Substraction");
			System.out.println("3 : Multiplication");
			System.out.println("4 : Division");
			System.out.println("Enter choice");
			return sc.nextInt();
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		numbers num=null;
		
		while((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				num=new Add();
				break;
			case 2:
				num=new sub();
				break;
			case 3:
				num=new mult();
				break;
			case 4:
				num=new div();
				break;

			default:
				System.out.println("enter valid choice");
				break;
			}
			if(num!=null) {
				num.accept(sc);
				num.calculate();
				num=null;
			}
		}
		
	}

}

