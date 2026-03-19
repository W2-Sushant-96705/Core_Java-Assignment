package com.sumbeam;

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
	
	void acceptStudents() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno of student");
		rollno=sc.nextInt();
		System.out.println("Enter name of student");
		name=sc.next();
		System.out.println("Enter marks of student");
		marks=sc.nextInt();
		
	}
	
	void displayStudents() {
		System.out.println("Student information is :"+rollno+":"+name+":"+marks);
	}
	
}


public class Student {

	public static void main(String[] args) {
		Students s1 =new Students();
		s1.acceptStudents();
		s1.displayStudents();
		Students s2 =new Students();
		s2.acceptStudents();
		s2.displayStudents();
		Students s3 =new Students();
		s3.acceptStudents();
		s3.displayStudents();
		
	}

}
