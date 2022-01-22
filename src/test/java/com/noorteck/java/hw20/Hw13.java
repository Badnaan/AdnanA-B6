package com.noorteck.java.hw20;

public class Hw13 {
	public static void main(String[] args) {
		
		Hw13 obj = new Hw13();
		
		boolean myResult = obj.isStartWith ("java training", "ing");	//----- False
		boolean myResult1 = obj.isStartWith ("java training", "ja") ;	//----- TRUE
		boolean myResult2 = obj.isStartWith ("java training", "java") ;	//----- TRUE
		boolean myResult3 = obj.isStartWith ("java training", "train")	;//----- False
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	boolean isStartWith (String strOne, String strTwo)
	{
		boolean result = false;
		
		result = strOne.startsWith(strTwo);
		
		return result;
	}
}
