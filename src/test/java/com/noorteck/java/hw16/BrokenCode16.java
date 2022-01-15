package com.noorteck.java.hw16;

public class BrokenCode16 {
	public static void main(String[] args) //main spelled wrong
	{
		double addResult = addTwoNumbers(2.0, 4.0); //3.0. 
		//We just need two numbers
		
		System.out.println(addResult);
				
		for(int i = 0; i < 10; i++)	// fixed errors with semicolons
		{							// replaced = with <
			System.out.println("Count" + i);	// replaced = with +
		}
		
		whoseFavNumber(23);//,1, true);		removed extra numbers
		whoseFavNumber(3);//, true);		can only carry 1 number
		whoseFavNumber(1);
	
		//String greeting = 
				myName ("John Cena");	// void method. not returning value
	}		// missing braces
	public static void myName (String name) 
	{
			System.out.println("My name is " + name);
	}// removed one braces
	public static double addTwoNumbers(double  numOne, double numTwo)
	{	// removed 'Void' , added double, added double variables instead of int
		
		double result = (numOne + numTwo);	// double, not int

		System.out.println(numOne + " + " + numTwo + " = " + result);
		
		return result;
	}
	public static String whoseFavNumber(int i )	// not assigning value here
	{
		String result = "";	//String, not double
		
		if ( i == 1) // no ;
		{
			result = "Brook";	// in quotes with ; at the end
		}
		else if (i == 2 || i == 4 && i == 4) 
		{
			result = "Dannia";		// result in lower case. Need double quotes
		} 
		else if (i == 3)			// =, not is. no ;
		{
			result = "Helen";
		}  
		else			// need {
		{
			result = "my favorite number";	// double quotes
		}
		return result;		// this was missing. needed for no void methods
	}
}
