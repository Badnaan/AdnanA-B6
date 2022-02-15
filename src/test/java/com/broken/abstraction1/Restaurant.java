package com.broken.abstraction1;

public abstract class Restaurant {
	public double DISCOUNT = 20.00; //removed final
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime)
	{
		this.name = name;
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	
	public abstract void location();	//removed static
	
	public  void setOperationTime() {	//removed static
		System.out.println("Monday-Friday");
	}
	
	public  abstract void specialMenu();//removed final, add abstract
	
	
	public abstract void rating();	//added public
	
	public  void breakFastMenu() //removed abstract
	{
		System.out.println("9AM-11AM");
	}
	
	public abstract void lunchMenu(String time);

	public abstract void dinnerMenu();
}