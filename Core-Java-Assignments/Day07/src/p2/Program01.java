package p2;

public class Program01 {
	
	public static <T> void displayArrays(T arr[]) {
		for(T e : arr)

	System.out.println("Elements - " +e);
	}
	
	public static void main(String[] args) {
		
		Integer[] arr1 = {10,20,30,40,50};
		Double[] arr2 = {11.22,22.33,33.55,40.00,55.66};
		String[] arr3 = {"Anil", "Mukesh", "Ramesh", "Suresh"};
	
	displayArrays(arr1);
	displayArrays(arr2);
	displayArrays(arr3);
	}

}
