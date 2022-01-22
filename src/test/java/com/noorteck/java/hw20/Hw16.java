package com.noorteck.java.hw20;

public class Hw16 {
	public static void main(String[] args) {
		
	Hw16 obj = new Hw16();
	
	String myResult = obj.concatString("Java", "awesome");
	System.out.println(myResult);
	
	String myResult2 = obj.concatString("food", "door");
	System.out.println(myResult2);
	
	String myResult3 = obj.concatString("Java", "training");
	System.out.println(myResult3);
	
	String myResult4 = obj.concatString("Pro", "ogress");
	System.out.println(myResult4);
	
	}
	String concatString (String strOne, String strTwo)
	{
		String result = "";
		
		String firstLetterOf2 = strTwo.substring(0,1);// grabs string at index
													//0 upto 1 (1st letter)
		if (strOne.endsWith(firstLetterOf2))// returns boolean
		{
			strTwo = strTwo.substring(1);//starts string at index 1
			System.out.println(strOne + strTwo);
		}
		else
		{
			System.out.println(strOne + strTwo);
		}
	
		return result;
	}

}
