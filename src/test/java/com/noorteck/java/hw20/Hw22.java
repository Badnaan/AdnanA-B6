package com.noorteck.java.hw20;

public class Hw22 {
	public static void main(String[] args) {
		

		int myResult = occurenceCount("java training", 'a');
		int myResult2 = occurenceCount("java training", 'i');
		int myResult3 = occurenceCount("I love programming", 'm');
		int myResult4 = occurenceCount("Sunday", 'f');
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
		System.out.println(myResult4);
	}
	
	public static int occurenceCount(String str, char c)
	{
		int result = 0;
		
		int len = str.length();	// gets the total length of string
		
		for(int i = 0; i < len; i++)	// loop 
		{
			if(str.charAt(i) == c)	// checks each char in string
			{						// for char in variable c
				result++;	// counts if found
			}
		}
		return result;
	}
}
