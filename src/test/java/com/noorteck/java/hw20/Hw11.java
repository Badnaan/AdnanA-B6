package com.noorteck.java.hw20;

public class Hw11 {
	
	public static void main (String [] args)
	{
		Hw11 obj = new Hw11();
		
		String myResult = obj.threeEqual("Java Pro", 'P', 'B');
		System.out.println(myResult);
		
		String myResult2 = obj.threeEqual("Lazy mode", 'm', 'C');
		System.out.println(myResult2);
		
		String myResult3 = obj.threeEqual("Training", 'T', ' ');
		System.out.println(myResult3);
	}

	protected String threeEqual (String str, char oldChar, char newChar)
	{
		String result = "";
		
		result = str.replace(oldChar, newChar);
		
		return result;
	}
}
