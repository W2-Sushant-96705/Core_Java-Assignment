import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void division(int n,int d) {
		System.out.println("Division - "+(n/d));
		
	}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numerator- ");
			int n=sc.nextInt();
			System.out.println("enter denominator- ");
			int d=sc.nextInt();
			division(n,d);
			
		} catch (ArithmeticException e) {
			System.out.println("Division by 0 is not possible");
		}catch (InputMismatchException e) {
			System.out.println("input value is not integer");
		}
		
		System.out.println("program finished");
	}

}
