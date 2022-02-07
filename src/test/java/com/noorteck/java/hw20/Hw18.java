package com.noorteck.java.hw20;

public class Hw18 {
	public static void main(String[] args) {
		
		Hw18 obj = new Hw18();
		
		String myResult = obj.getNewStr("Welcome", "home");
		String myResult2 = obj.getNewStr("Java", "door");
		String myResult3 = obj.getNewStr("cooking", "pasta");
		String myResult4= obj.getNewStr("Pro", "gress");
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
		System.out.println(myResult4);
	}
	public String getNewStr (String strOne, String strTwo)
	{
		String result = "";
		
		int length1 = strOne.length();// grabs length of first
		int length2 = strTwo.length();// grabs length of second
		
		if (length1 < length2)		// if length 2 is bigger
		{
			int diff = length2 - length1;	//grabs the difference in length
			strTwo = strTwo.substring(diff);//cuts it from the start
			//System.out.println(cut);
		}
		
		if (length1 > length2) 	//if length of 1st is bigger
		{
			int diff = length1 - length2;//grabs the difference
			strOne = strOne.substring(diff);//cuts it from the start
			//System.out.println(cut);
		}
		
		result = strOne.concat(strTwo);
		
		return result;
	}
	
}