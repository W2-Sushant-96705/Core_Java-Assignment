package com.app.geometry;

import java.util.*;
import com.app.geometry.Point2D;

public class test {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values for x1 and y1 : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter values for x2 and y2 : ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		Point2D point1 = new Point2D(x1, y1);
		Point2D point2 = new Point2D(x2, y2);
		
		System.out.println(" Point 1 : " + point1.getDetails());
		System.out.println(" Point 2 : " + point2.getDetails());
		
		if (point1.isEqual(point2)) {
			System.out.println("Both points lies on same position..!");
		} else {
			System.out.println("Both points on different position..!");
			
			double distance = point1.calculateDistance(point2);
			System.out.println("Distance between point1 and point2 is : " + distance);
		}
		
		
		
	}
}