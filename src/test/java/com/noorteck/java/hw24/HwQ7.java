package com.noorteck.java.hw24;

public class HwQ7 {
	public static void main(String[] args) {
		
		int[]c1 = {88,2,6,1,2,3,88,22,44,33};
		int[]c2 = {1,2,3,22,44,33};
		int[]c3 = {88,22,6,1,8,0};
		int[]c4 = {2,3,88,22,44};
		
		int anotherVariable = getIndexNumber(c1,3);
		int anotherVariable2 = getIndexNumber(c2,12);
		int anotherVariable3 = getIndexNumber(c3,22);
		int anotherVariable4 = getIndexNumber(c4,44);
		
		System.out.println(anotherVariable);
		System.out.println(anotherVariable2);
		System.out.println(anotherVariable3);
		System.out.println(anotherVariable4);
		
	}
	public static int getIndexNumber(int[] number, int elementValue)
	{
		int result = 0;
		
		for(int i = 0; i < number.length; i++)
		{
			if(number[i] == elementValue)//condition for element = elementValue
			{
				result = i;	//sets the index to result to return back
			}
		}
		if(result == 0)	// condition for no index in array element
		{
			result =-1;// returns 0
		}
		//System.out.println(getIndex);
		
		return result;
	}

}
