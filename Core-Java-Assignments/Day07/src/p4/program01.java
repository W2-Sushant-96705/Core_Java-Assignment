package p4;
import java.util.*;

import java.util.Arrays;
 class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compareTo(Employee emp) {
//		return this.id - emp.id;
//	}

//	@Override
//	public int compareTo(Employee emp) {
//		return this.name.compareTo(emp.name);
//	}

	

//	@Override
//	public int compareTo(Employee emp) {
//		// price in asce order
//		return Double.compare(this.salary,emp.salary);
//	}



}

public class program01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Employee[]arr=new Employee[5];
		int count =0;
		int choice;
		 
		do {
			System.out.println("------ MENU ------");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Display Employees by ID (Ascending)");
            System.out.println("4. Display Employees by Name (Descending)");
            System.out.println("5. Display Employees by Salary (Descending)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            choice =sc.nextInt();
            
            switch (choice) {
			case 1:
				if(count < arr.length) {
					System.out.println("enter id");
					int id=sc.nextInt();
					
					System.out.println("enter name");
					String name=sc.next();
					
					System.out.println("enter salary");
					double salary=sc.nextDouble();
					
					arr[count++]=new Employee(id,name,salary);
					
					
				}else {
					System.out.println("employee list is full");
				}
				break;
				
				
			case 2:
				System.out.println("Employee list");
				for(int i=0;i<count;i++) {
					System.out.println(arr[i]);
				}
					break;
					
			case 3:
                Arrays.sort(arr, 0, count);
                System.out.println("Sorted by ID Ascending:");
                for (int i = 0; i < count; i++) {
                    System.out.println(arr[i]);
                }
                break;

            case 4:
                Arrays.sort(arr, 0, count, new Comparator<Employee>() {
                    public int compare(Employee e1, Employee e2) {
                        return e2.name.compareTo(e1.name);
                    }
                });

                System.out.println("Sorted by Name Descending:");
                for (int i = 0; i < count; i++) {
                    System.out.println(arr[i]);
                }
                break;

            case 5:
                Arrays.sort(arr, 0, count, new Comparator<Employee>() {
                    public int compare(Employee e1, Employee e2) {
                        return Double.compare(e2.salary, e1.salary);
                    }
                });

                System.out.println("Sorted by Salary Descending:");
                for (int i = 0; i < count; i++) {
                    System.out.println(arr[i]);
                }
                break;

            case 0:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
