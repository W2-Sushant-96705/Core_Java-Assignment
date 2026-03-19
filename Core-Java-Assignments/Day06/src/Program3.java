
class Date{
	int day;
	int month;
	
	public void setDay(int day){
		if(day<0 || day>31)
		throw new RuntimeException("enter valid day");
		this.day=day;
		
	}
	
	public void setMonth(int month) {
		if(month<0 || month>12)
			throw new RuntimeException("month should between 1 to 12");
			this.month=month;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + "]";
	}
	
	
}



public class Program3 {

	public static void main(String[] args) {
		Date d1=new Date();
		
			d1.setDay(43);
			d1.setMonth(13);
			System.out.println("d1 is "+d1);
			System.out.println("program finished");
			
		}
	}


