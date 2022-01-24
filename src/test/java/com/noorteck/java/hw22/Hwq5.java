package com.noorteck.java.hw22;

public class Hwq5 {
	public static void main(String[] args) {
		
		String myResult = removeSpace (null);
		String myResult2 = removeSpace(" Java Training      ");
		String myResult3 = removeSpace("    I    Like   to  Practice");
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	public static String removeSpace(String strOne)
	{
		String result = "";
		
		if (strOne == null)
		{
			result = null;
		}
		else
		{
			result = strOne.trim();
		}
		
		return result;
	}

}
