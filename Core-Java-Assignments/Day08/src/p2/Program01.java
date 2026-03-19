package p2;

import java.util.ArrayList;
//import java.util.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	double marks;
	double totalmarks=200;
	
	
	
	public Student()  {
		super();
	}
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	void acceptStudent(Scanner sc) {
		System.out.println("Enter rollno of Student");
		rollno=sc.nextInt();
		
		System.out.println("Enter name of Student");
		name=sc.next();
		
		System.out.println("Enter marks of Student");
		marks=sc.nextDouble();
		
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				|| Objects.equals(name, other.name) || rollno == other.rollno;
	}
	public static int indexOf(Student s3) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}
	
	public double getPercent() {
		return((double)marks/totalmarks)*100;
	}
}


public class Program01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> stu=new ArrayList<>();
		
		int count=0;
		int choice;
		
		do {
			System.out.println("***************************************************************");
			System.out.println("0: Exit");
			System.out.println("1:Add student");
			System.out.println("2:Display Student");
			System.out.println("3:Find student on roll no");
			System.out.println("4:Delete student by given number");
			System.out.println("5: display all students sorted on roll no in asc order");
			System.out.println("6: display all students sorted on name in asc order"+"");		
			System.out.println("7:display all students sorted on marks in desc order");
			System.out.println("8:display student marks and their percentange");
			System.out.println("***************************************************************");
			System.out.println("Enter choice");
		
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			Student s1=new Student();
			s1.acceptStudent(sc);
			stu.add(s1);
			break;
			
		case 2:
			for(Student s2:stu)
				System.out.println(s2);
			break;
			
		case 3:{
			System.out.println("Enter roll no to find");
			Student s3=new Student();
			s3.rollno=sc.nextInt();
			int index=stu.indexOf(s3);
			
			if(index!=-1)
			System.out.println(stu.get(index));
			break;
		}
		case 4:
			Student s4 =new Student();
			System.out.println("Enter roll no to remove");
			s4.rollno=sc.nextInt();
			stu.remove(s4);
			break;
			
		case 5:
		 class StudentrollComparator implements Comparator<Student> {
	
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.rollno-o2.rollno;
			}
			 
			}
			Collections.sort(stu);
			for(Student s : stu )
				System.out.println(s);
				System.out.println();
				break;
				
		case 6:
				class StudentnameComparator implements Comparator<Student>{
	
				@Override
				public int compare(Student o1, Student o2) {
					return o1.name.compareTo(o2.name);
					}
				}
				
				Collections.sort(stu,new StudentnameComparator());
					for(Student s : stu)
						System.out.println(s);
				break;
				
		case 7:
			 class StudentmarksComparator implements Comparator<Student> {

				 @Override
				public int compare(Student o1, Student o2) {
					return Double.compare(o2.marks, o1.marks);
				}
					
			}
				//Collections.sort(stu);
				for(Student StudentmarkComparator : stu ) {
					System.out.println(StudentmarkComparator);
				}
					
				break;

		case 8:
			Student s6=new Student();
				s6.getPercent();
				for(Student s: stu)
				System.out.println("roll no-"+s.rollno+" name-"+s.name+" marks-"+s.marks+" prercent-"+s.getPercent());
			break;
		default:
			System.out.println("invalid choice");
			break;
			
			}
		
		}while(choice!=0);
		
	}

}
