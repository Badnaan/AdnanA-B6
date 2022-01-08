package homework12;

public class HWQ2 {
	public static void main(String[] args) {//Main Method
		
		boolean myResult1 = multipleOf (3);	//passing value to multipleOf Method
		boolean myResult2 = multipleOf (10);
		boolean myResult3 = multipleOf (8);	//and storing it in myResult Variable
		
		System.out.println(myResult1);		// Printing myResult
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	public static boolean multipleOf (int num)	// Secondary method
	{
		boolean result = false;					// initialize result
		
		if (num % 3 == 0 || num % 5 == 0)		//condition to filter for multiples of 3 and 5
			result = true;						// multiples will return true
		
		return result;
	}

}
