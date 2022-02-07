package com.noorteck.java.hw20;

public class Hw21 {
	public static void main(String[] args) {
		
		String myResult = repeatChar("Welcome");
		String myResult1 = repeatChar("Viorica");
		String myResult2 = repeatChar("Abdul");
		String myResult3 = repeatChar("Malek");
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	static String repeatChar(String str)
	{
		String result = "";
		String let ="";
		
		int len = str.length();	//gets length of the String
		
		for(int i = 0; i < len; i++)	//loop from 0 to length of String
		{
			for (int k = 0; k < 2; k++)	// second loop that runs twice
			{							// for each letter
			int j = i+1;			// stays one count ahead
			let = str.substring(i, j);	//grabs the letter
			
			result = result.concat(let);	//concats letters together
			}
		}
		return result;
	}
}
