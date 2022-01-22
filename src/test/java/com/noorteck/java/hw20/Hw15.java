package com.noorteck.java.hw20;

public class Hw15 {
	public static void main(String[] args) {
		
		String myResult = removeSpace(" Java Training   ");
		String myResult2 = removeSpace("    I   like    to practice   ");
		
		System.out.println(myResult);
		System.out.println(myResult2);
	}
	public static String removeSpace(String strOne)
	{
		String result = "";
		
		result = strOne.trim();
		
		return result;
	}

}
