package com.noorteck.java.hw24;

public class HwQ6 {
	public static void main(String[] args) {
		
		int[]c1 = {6,1,2,3};
		int[]c2 = {13,2,3,4,6,1,2,3};
		int[]c3 = {3,3,0,1,4,3,6};
		int[]c4 = {2,6,2};
		
		boolean anotherVariable = checkNum(c1);
		boolean anotherVariable2 = checkNum(c2);
		boolean anotherVariable3 = checkNum(c3);
		boolean anotherVariable4 = checkNum(c4);
		
		System.out.println(anotherVariable);
		System.out.println(anotherVariable2);
		System.out.println(anotherVariable3);
		System.out.println(anotherVariable4);
	}
	protected static boolean checkNum(int[] number)
	{
		boolean result = false;
		
		int count2 = 0;	//initialized count
		int count5 = 0;
		
		for(int i = 0; i < number.length; i++)//going though each element in array
		{
			if (number[i] == 2)// condition for number 2
			{
				count2++;		// add to element if 2 is found
			}
			if (number[i] == 5) 
			{
				count5++;
			}
		}
		if(count2 >= 2)		//condition to check count's count 2 or above
		{
			result = true;	// return true
		}
		if(count5 >= 5)
		{
			result = true;
		}
		return result;
	}
}
