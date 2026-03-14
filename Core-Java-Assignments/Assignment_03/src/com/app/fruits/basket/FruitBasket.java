package com.app.fruits.basket;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of basket = ");
		int size = sc.nextInt();
		
		Fruit basket[] = new Fruit[size];
		
		
		int count=0;
		int choice;
		
		do {
			System.out.println("\n\n1. Add Apple");
			System.out.println("2. Add Mango");
			System.out.println("3. Add Orange");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("0. EXIT");
			
			choice = sc.nextInt();
			switch (choice){
			
			case 1 :
				if( count < size ) {
					basket[count++] = new Apple("Apple","Red",1.5);
				}
				else {
					System.out.println("\n\nBasket is Full..!");
				}
				break;
				
			case 2 :
				if( count < size ) {
					basket[count++] = new Mango("Mango","Yellow",2.5);
				}
				break;
				
			case 3 :
				if( count < size ) {
					basket[count++] = new Orange("Orange","Orange",3.5);
				}
				break;
				
			case 4 :
				for(Fruit f : basket) {
					if(f != null)
						System.out.println("\n");
						System.out.println(f.case4());
				}
				break;
				
			case 5 :
				for(Fruit f : basket) {
					if(f != null && f.isFresh()) 
						System.out.println("\n");
						System.out.println(f.case5() + " Taste = " + f.taste());
				}
				break;
				
			case 6 :
				for (Fruit f : basket) {
					if (f != null && !f.isFresh())
						System.out.println(f.taste());
				}
				break;
				
			case 7 :
				System.out.println("Enter Index : ");
				int index =sc.nextInt();
				
				if( index >=0 && index < count) {
					basket[index].setFresh(false);
				}
				else {
					System.out.println("Invalid Index");
				}
				break;
				
			}
			
		}while (choice !=0);
		
		sc.close();
		
	}
}
