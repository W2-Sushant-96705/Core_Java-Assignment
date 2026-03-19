package com.sumbeam;

class Dates {
	int day;
	int month;
	int year;
	
	
	public Dates() {

	}


	public Dates(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void acceptDates() {
		day=12;
		month=11;
		year=2000;
	}
	void displayDates() {
		System.out.println("entered date is "+day+"/"+month+"/"+year);
	}
	
}

public class Date {

	public static void main(String[] args) {
		Dates d1=new Dates();
		d1.acceptDates();
		d1.displayDates();
	}

}
