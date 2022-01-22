package com.noorteck.java.hw20;

public class Hw12 {
	public static void main(String[] args) {
		
		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");
	}
	
	public static void replaceStr(String strOne, String oldStr, String newStr)
	{
		String result = strOne.replace(oldStr, newStr);
		
		System.out.println(result);
	}

}
