package com.noorteck.java.hw22;

public class Hwq4 {
	public static void main(String[] args) {
		
		String myResult = getSubStr(null, 2, 6);
		String myResult1 = getSubStr("Java training", 2,6);
		String myResult2 = getSubStr("Software Development Engineer in TEST", 11, 23);
		String myResult3 = getSubStr("Software Development Engineer in TEST", 21, 29);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	public static String getSubStr(String str, int startingIndex, int EndingIndex)
	{
		String result = "";
		
		if (str == null)
		{
			result = null;
		}
		else
		{
			result = str.substring(startingIndex, EndingIndex);
		}
		
		return result;
	}

}
