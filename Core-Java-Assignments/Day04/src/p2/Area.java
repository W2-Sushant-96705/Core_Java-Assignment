package p2;

import java.util.Scanner;

interface Shape {
	void accept(Scanner sc);
	
	void display();
	
}

class Circle implements Shape{
	int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter radius ");
		radius=sc.nextInt();
		
	}

	@Override
	public void display() {
		System.out.println("Area of circle is : "+(3.14*radius*radius));
	}
	
}

class Rectangle implements Shape{
	int length;
	int breadth;
	@Override
	public void accept(Scanner sc) {
		System.out.println("enter length of rectangle");
		length=sc.nextInt();
		System.out.println("enter breadth of rectangle");
		breadth=sc.nextInt();
	}
	@Override
	public void display() {
		System.out.println("Area of rectangle is "+(length*breadth));
	}
	
	
}


public class Area {
	public static int menu(Scanner sc) {
		System.out.println("0 . Exit");
		System.out.println("1 . Area of circle");
		System.out.println("2 . Area of Rectangle");
		System.out.println("Enter the choice");
		return sc.nextInt();
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		Shape sh=null;
		
		while((choice=menu(sc))!=0) {
			switch(choice) {
			case 1:
				sh=new Circle();
				break;
			case 2:
				sh=new Rectangle();
				break;
			default :
				System.out.println("Wrong choice");
				break;
			}
			if(sh!=null) {
				sh.accept(sc);
				sh.display();
				sh=null;
			}
			
		}
		
		
	}

}
