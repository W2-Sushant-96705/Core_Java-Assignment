package p3;

	
class Student implements Comparable<Student>{
	String name;
	int marks;
	
	public Student() {
		
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
// compares on basis of marks
//	public int compareTo(Student o) {
//		if(this.marks > o.marks)
//			return 5;
//		else if(this.marks < o.marks)
//		return -8;
//		
//	return 0;
//	}
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);

	}
}

	public class program01 {

		public static void main(String[] args) {
			Student s1 = new Student("Anil", 50);
			Student s2 = new Student("Mukesh", 40);

			if (s1.compareTo(s2) > 0)
				System.out.println("Student s1 is greater than s2");
			else if (s1.compareTo(s2) < 0)
				System.out.println("Student s2 is greater than s1");
			else
				System.out.println("Both Students are having same marks");

		}

	}

