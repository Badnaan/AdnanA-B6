package com.noorteck.java.hw20;

public class Hw8 {
	public static void main (String [] args)
	{
		char myResult = getCharacter("java training",2);
		System.out.println(myResult);
		
		char myResult2 = getCharacter("java training",5);
		System.out.println(myResult2);
		
		char myResult3 = getCharacter("java training",8);
		System.out.println(myResult3);
		
		char myResult4 = getCharacter("java training",22);
		System.out.println(myResult4);
	}
	
	public static char getCharacter (String strOne, int indexNum)
	{
		char result = ' ';
		
		int charLenth = strOne.length();
		
		if (indexNum >= charLenth)
		{
			System.out.println("?");
		}
		else 
		{
		result = strOne.charAt(indexNum);
		}
		return result;
	}

}
