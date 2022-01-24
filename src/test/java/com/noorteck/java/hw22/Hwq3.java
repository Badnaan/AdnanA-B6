package com.noorteck.java.hw22;

public class Hwq3 {
	public static void main(String[] args) {
		
		Hwq3 obj = new Hwq3();
		
		String myResult = obj.threeEqual(null, 'P', 'B');
		String myResult2 = obj.threeEqual("Java Pro", 'P', 'B');
		String myResult3 = obj.threeEqual("Lazy mode", 'm', 'C');
		String myResult4 = obj.threeEqual("Training", 'T', ' ');
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
		System.out.println(myResult4);
	}
	protected String threeEqual (String str, char oldChar, char newChar)
	{
		String result = "";
		
		if ( str == null)
		{
		result = null;
		}
		else
		{
			result = str.replace(oldChar, newChar);
		}
		return result;
	}
}
