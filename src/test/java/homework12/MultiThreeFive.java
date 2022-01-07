package homework12;

public class MultiThreeFive {
	public static void main(String[] args) //main method
	{
		int myResult1 = sumOf (15);			// different values passed onto the sumOf Method below
		int myResult2 = sumOf (10);
		int myResult3 = sumOf (3);
		int myResult4 = sumOf (5);
		int myResult5 = sumOf (8);
		
		System.out.println(myResult1);		// Printing all the values calculated
		System.out.println(myResult2);
		System.out.println(myResult3);
		System.out.println(myResult4);
		System.out.println(myResult5);
	}
	public static int sumOf (int numValue)	// Secondary non Void method using parameters passed from main method
	{
		int result = 0;						// initializing result
		
		for (int i = 3; i <= numValue; i++)	// loop starting with 3, keeping the limit at parameter passed from main method
		{
			if ((i % 3 == 0) || (i % 5 ==0))// filtering for condition; multiples of 3 and 5
			{
				result = result + i;		// adding up all the multiples
			}
		}
		return result;						// returning the sum back to the main method
	}

}
