package homework11;

public class Subtraction {
	public static void main (String [] args)		// main method
	{
		int diffTotal = difference (30);		// input
		
		System.out.println(diffTotal);			// output
	}
	public static int difference (int number)	//secondary method
	{
		int result = 0;
		result = (number - 21);		// doing basic math, return the difference between variable number and 21
		if (number > 21)			//return double the difference if n is over 21.
			result = result * result;	//difference doubled
		
		return result;
	}

}
