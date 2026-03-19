package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

class Student{
	int rollno;
	String name;
	double marks;
	
	
	public Student() {
		super();
	}


	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks=marks;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}
	
}

public class Program02 {

	public static void main(String[] args) {
		Collection<Student> stu=new ArrayList<>();
		stu.add(new Student(3,"Rohan",198));
		stu.add(new Student(2,"Alok",188));
		stu.add(new Student(5,"Sujit",172));
		stu.add(new Student(4,"Pratik",147));
		stu.add(new Student(1,"Pritam",199));
		
 		System.out.println("size of list is "+stu.size());
		Student s1=new Student();
		s1.rollno=3;
		System.out.println("student with rollno 3 present-"+stu.contains(s1));
		
		Student s2=new Student();
		s2.rollno=7;
		System.out.println("Student with rollno 7 present-"+stu.contains(s2));
		
		
		System.out.println("Student with rollno 3 remove-"+stu.remove(s1));
		System.out.println("Student with rollno 7 remove-"+stu.remove(s2));
		
		
 		System.out.println("size of list is "+stu.size());

		
		
		
		for(Student s:stu)
			System.out.println("Elements are "+s);
	}

}
