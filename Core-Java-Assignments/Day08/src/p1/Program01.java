package p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Program01 {
	
	public static void main(String[] args) {
//		Collection<Integer> c2 = new LinkedList<>();
//		Collection<Integer> c3 = new LinkedHashSet<>();

		Collection<Integer> c1 =new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		
		//c1.clear();
		System.out.println("size of array "+c1.size());
		System.out.println(c1.remove(30));
//		System.out.println("is array empty "+c1.isEmpty());
//		System.out.println("given value avalable- "+c1.contains(20));
		
		
		System.out.println();
		for(Integer e: c1)
		System.out.println("Elements are "+ e);
	}

}
