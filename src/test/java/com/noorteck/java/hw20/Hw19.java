package com.noorteck.java.hw20;

public class Hw19 {
	
	public static void main(String[] args) {
		
		boolean myResult = isSame("educated");// first 2 = last 2 ?
		boolean myResult2 = isSame("modified memo");
		boolean myResult3 = isSame("I am studying");
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	public static boolean isSame(String strOne)
	{
		boolean result = false;
		
		String firstLetterOf2 = strOne.substring(0,2); //grabs first 2
		
		//int lastTwoIndex = strOne.length()-2;//grabs index of last 2
		//String lastTwo = strOne.substring(lastTwoIndex);
		//		returns last two index
		
		if (strOne.endsWith(firstLetterOf2))	// compares with ending
		{
			return true;
		}
		
		return result;
	}

}
