package com.sunbeam.arrays;

	import java.util.Scanner;

class Students{
	int rollno;
	String name;
	double marks;
	
	
	public Students() {
		
	}


	public Students(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public void displayStudents() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);		
	}

	
}


public class Student {

	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		Students[] students =new Students[5];
		
		System.out.println("Enter details of 5 students");
		
		for(int i=0;i<5;i++) {
			System.out.println("student"+(i+1)+";");
			
			System.out.println("enter roll no");
			int rollno =sc.nextInt();
			
			System.out.println("enter name");
			String name =sc.next();
			
			System.out.println("enter marks");
			double marks =sc.nextDouble();
			
			students[i]=new Students(rollno, name, marks);
			
			
		}
		
		System.out.println("displaying records");

		for(int i=0;i<5;i++) {
			students[i].displayStudents();
			
		}
		
	}
}




