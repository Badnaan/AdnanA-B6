package com.noorteck.java.hw24;

public class HwQ5 {
	/**Write a method that takes an array of int parameter and 
	 * return a new array with double the size/length, where its 
	 * last element value is the same as the original array last
		element, and all the other element values are 0.
	 */
	public static void main(String[] args) {
		
		HwQ5 obj = new HwQ5();
		
		int[]c1 = {6,1,2,3};
		int[]c2 = {13,3};
		int[]c3 = {0,1,4};
		int[]c4 = {6};
		
		int[] anotherVariable = obj.getDouble(c1);
		int[] anotherVariable2 = obj.getDouble(c2);
		int[] anotherVariable3 = obj.getDouble(c3);
		int[] anotherVariable4 = obj.getDouble(c4);
		
		for(int i = 0; i < anotherVariable.length; i ++)
		{
		System.out.print(anotherVariable[i]+",");
		}
		System.out.println();
		
		for(int i = 0; i < anotherVariable2.length; i ++)
		{
		System.out.print(anotherVariable2[i]+",");
		}
		System.out.println();
		
		for(int i = 0; i < anotherVariable3.length; i ++)
		{
		System.out.print(anotherVariable3[i]+",");
		}
		System.out.println();
		
		for(int i = 0; i < anotherVariable4.length; i ++)
		{
		System.out.print(anotherVariable4[i]+",");
		}
	}
	private int []getDouble (int[] number)
	{
		int [] result = new int [(number.length)*2];// doubles the elements in Array
		
		int last = number[(number.length)-1];//grabs last array element in number[]
		
		//System.out.println(last);
		result [(result.length) - 1] = last;//sets last element in number = result[]
		
		return result;
	}
}
