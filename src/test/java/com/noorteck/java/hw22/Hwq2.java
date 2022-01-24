package com.noorteck.java.hw22;

public class Hwq2 {
	public static void main(String[] args) {
		
		Hwq2 obj = new Hwq2();
		
		boolean myResult = obj.isEndWIth("java training", "ing");
		boolean myResult2 = obj.isEndWIth("java training", "ng");
		boolean myResult3 = obj.isEndWIth("java training", "java");
		boolean myResult4 = obj.isEndWIth("java training", "train");
		boolean myResult5 = obj.isEndWIth(null, "java");//ends with
		boolean myResult6 = obj.isEndWIth(null, null);
		boolean myResult7 = obj.isEndWIth("aaabc", "abc");
		boolean myResult8 = obj.isEndWIth("abc",null);
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
		System.out.println(myResult4);
		System.out.println(myResult5);
		System.out.println(myResult6);
		System.out.println(myResult7);
		System.out.println(myResult8);
	}
	
	boolean isEndWIth(String strOne, String strTwo)
	{
		boolean result = false;
		
		
		if(strOne == null || strTwo == null) 
		{
		result = false;
		}
		else
		{
			if (strOne.endsWith(strTwo) && strOne != null)
			{
			result =true;
			}
		}
		return result;
	}

}
