
class Time{
	int hr;
	int min;
//	Throws checked exception Exception e
	public void setHr(int hr) throws Exception{
		if (hr<0 || hr>23)
			throw new Exception("hr should between 0 and 23");
		this.hr=hr;
	}
	
	public void setMin(int min ) throws Exception{
		if(min < 0 || min > 59)
			throw new Exception("min should between 0 and 59");
		this.min=min;
	}

	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}
	
}


public class Program2 {

	public static void main(String[] args) {
		Time t1=new Time();
		try {
			t1.setHr(22);
			t1.setMin(45);
			System.out.println("t1= "+t1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program finished");
		
	}

}
