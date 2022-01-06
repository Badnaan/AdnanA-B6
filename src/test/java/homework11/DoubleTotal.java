package homework11;

public class DoubleTotal {
	public static void main (String []args)			//main Method
	{
		int myTotal = sumDouble(2,2);		// input 
		
		System.out.println(myTotal);		// output
	}
	public static int sumDouble (int valueOne, int valueTwo)	// secondary method
	{
		int result = 0;
		if (valueOne == valueTwo)								// condition for both numbers to be the same
		{
			result = (valueOne + valueTwo) * 2;		// it doubles the sum of two numbers
		}
		else													// if the numbers are not the same
		{
			result = valueOne + valueTwo;						// just add them
		}
		return result;
	}

}
