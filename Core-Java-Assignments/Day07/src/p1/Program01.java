package p1;

import java.util.Date;

class Box<T> // type paramater
{
	private T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setData(10);
		Integer i1 = b1.getData();
		System.out.println(i1);
		Box<String> b2 = new Box<>();
		b2.setData("sunbeam");
		// Double d = b2.getData(); // NOT OK
		String s1 = b2.getData();
		System.out.println(s1);
		Box<Date> b3 = new Box<>();
		b3.setData(new Date());
		System.out.println(b3);
	}

}
