//Q2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

package com.sunbeam.assignment01.q2;

import java.util.Scanner;

public class Project02 {
	
	
	

	public static void main(String[] args) {
		 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st Number : ");
			if(!(sc.hasNextDouble()&&sc.hasNextInt())) {
				double a=sc.nextDouble();
				
				System.out.println("Enter 2nd Number : ");
				if(!(sc.hasNextDouble()&&sc.hasNextInt())) {
					double b=sc.nextDouble();
					
					double average=(a+b)/2.0;
					System.out.println("Average of a+b is "+average);
				}else {
					System.out.println("Enter valid number");
				}
				
			}else {
				System.out.println("Enter valid number");
			}
			
			
			
			
		}

	}
//output

/*
 
Enter 1st Number : 
12.5
Enter 2nd Number : 
12.6
Average of a+b is 12.55

 */ 


/*
Enter 1st Number : 
12
Enter valid number

 */
