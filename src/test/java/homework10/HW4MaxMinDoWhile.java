package homework10;

public class HW4MaxMinDoWhile {
	public static void main(String[] args) 
	{
		getDoWhileLoopResult(5,60);
	}
	public static void getDoWhileLoopResult(int minNum, int maxNum)
	{
		do
		{
			if(minNum <= maxNum) 
			{
				System.out.println(minNum);
				minNum++;
			}
			else
				System.out.println("minNum is more than maxNum");
			
		}while (minNum <= maxNum);
	}
}
