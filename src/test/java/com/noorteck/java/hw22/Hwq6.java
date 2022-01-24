package com.noorteck.java.hw22;

public class Hwq6 {
	
	public static void main(String[] args) 
	{
		Hwq6 obj = new Hwq6();
		
		boolean myResult = obj.endsWithNG(null);
		boolean myResult2 = obj.endsWithNG("I like to practice");
		boolean myResult3 = obj.endsWithNG("Everyone is practicing");
		boolean myResult4 = obj.endsWithNG("I am studying");
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
		System.out.println(myResult4);
	}
	public boolean endsWithNG(String strOne)
	{
		boolean result = false;
		
		if(strOne == null)
		{
			result = false;
		}
		else
		{
			result = strOne.endsWith("ng");
		}
		
		return result;
	}
}
