package com.noorteck.java.hw20;

public class Hw20 {
	public static void main(String[] args) {
		String myResult = removeT("Test Data");
		String myResult2 = removeT("Testcricket");
		String myResult3 = removeT("I am studying");
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	public static String removeT(String strOne)
	{
		String result = "";
		
		if(strOne.startsWith("T") || strOne.startsWith("t"));
		{
			strOne = strOne.substring(1);//omits the first character
		}
		
		if(strOne.endsWith("t"))
		{
			int lastIndex = strOne.length()-1;
				// grabs count of all but last char in strOne
			strOne = strOne.substring(0, lastIndex);
		}							//grabs string minus last index
		
		result = strOne;
		return result;
	}

}
