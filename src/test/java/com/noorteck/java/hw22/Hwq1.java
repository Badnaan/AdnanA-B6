package com.noorteck.java.hw22;

public class Hwq1 {
	public static void main(String[] args) {
		
		Hwq1 obj = new Hwq1();
		
		String myResult = obj.toUpper("Pro");
		String myResult2 = obj.toUpper("java");
		String myResult3 = obj.toUpper(null);
		
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	String toUpper(String strOne)
	{
		String result = "";
		
		if(strOne != null)
		{
			result = strOne.toUpperCase();
		}
		else
		{
			result = null;
		}
		
		return result;
	}

}
