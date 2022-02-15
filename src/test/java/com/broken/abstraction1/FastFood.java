package com.broken.abstraction1;

public  class FastFood extends Restaurant {
	
	public FastFood() {
		super("Fresh Foods", 777, 5);
	}

	public void location() 
	{
		System.out.println("Reston VA");
	}
	
	@Override
	public void setOperationTime() {
		System.out.println("24/7");
	}
	
	@Override
	public void lunchMenu(String time) {
		System.out.println("Time: " + time);
	}
	
	@Override
	public void breakFastMenu() {
		System.out.println("Not serving...");
	}
	
	@Override 
	public void dinnerMenu() 
	{
		System.out.println("7PM-10PM");
	}
	
	public void display() {
		
		DISCOUNT = 30.00;
		
		luckyNumber = 22;
		
		waitTime = 0;
		
	//	System.out.println(rating());
	}
	
	
	public void getInfo(int info)	//removed abstract added para
	{
		System.out.println("This is info" + info);
	}
	public  void setInfo()	//removed abstract
	{
		
	}

	@Override
	public void specialMenu() {
		System.out.println("Specials for today...");
		
	}

	@Override
	public void rating() {
		System.out.println("4");
		
	}
}
