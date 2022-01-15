package com.noorteck.java.hw16;

public class BrokenCode16 {
	public static void mian(String[] args) 
	{
		double addResult = addTwoNumbers(2.0, 4.0); //3.0
		
		System.out.println(addResult);
				
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Count" + i);
		}
		whoseFavNumber(23);//,1, true);
		whoseFavNumber(3);//, true);	
		whoseFavNumber(1);
	
		//String greeting = 
				myName ("John Cena");
	}
	public static void myName (String name) 
	{
			System.out.println("My name is " + name);
	}
	public static double addTwoNumbers(double  numOne, double numTwo)
	{
		double result = (numOne + numTwo);

		System.out.println(numOne + " + " + numTwo + " = " + result);
		
		return result;
	}
	public static String whoseFavNumber(int i )
	{
		String result ="";
		
		if ( i == 1) 
		{
			result = "Brook";
		}
		else if (i == 2 || i == 4 && i == 4) 
		{
			result = "Dannia";
		} 
		else if (i == 3)
		{
			result = "Helen";
		}  
		else
		{
			result = "my favorite number";
		}
		return result;
	}
}
