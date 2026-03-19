package com.sumbeam;

import java.util.Scanner;

class Person{
		int id;
		String name;
		int mobno;
		
		public Person(){
			
		}
		public Person(int id,String name,int mobno) {
			this.id=id;
			this.name=name;
			this.mobno=mobno;
		}
		void acceptPerson() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the id - ");
			id = sc.nextInt();
			System.out.print("Enter the name - ");
			name = sc.next();
			System.out.print("Enter the mobile number - ");
			mobno = sc.nextInt();
		}

		void displayPerson() {
			System.out.println("id is - " + id);
			System.out.println("Name - " + name);
			System.out.println("Mobile number is - " + mobno);		}


		
	}

public class Employee {
	
	public static void main(String[] args) {
		Person e1=new Person();
		e1.acceptPerson();
		e1.displayPerson();
		
	}

}
