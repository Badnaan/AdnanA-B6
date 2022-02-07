package com.noorteck.java.hw20;

public class Hw17 {
	public static void main(String[] args) {
		
		Hw17 obj = new Hw17();
		
		boolean myResult = obj.endsWithNG("I like to practice");
		boolean myResult2 = obj.endsWithNG("Everyone is practicing");
		boolean myResult3 = obj.endsWithNG("I am studying");
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	
	public boolean endsWithNG(String strOne)
	{
		boolean result = false;
		
		if(strOne.endsWith("ng"))
		{
			return true;
		}
		
		return result;
	}

}
