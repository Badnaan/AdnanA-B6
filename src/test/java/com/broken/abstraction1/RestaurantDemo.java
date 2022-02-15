package com.broken.abstraction1;

public class RestaurantDemo {
	
	public static void main(String[] args) 
	{
		
		Restaurant obj1 = new FastFood();
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		
		FastFood obj2 = new FastFood(); // pulled out Restaurant
		obj2.getInfo(2);	
		obj2.setInfo();
		
		//FastFood obj3 = new FastFood("John Cena", 12);
		
		obj1.DISCOUNT = 44.44;
		
		obj1.dinnerMenu();//removed system.out.println
		obj1.lunchMenu("Rice");//added rice
		
		
	}
 

}
