package homework12;

public class HWQuestion1 {
	public static void main(String[] args) 		//Main Method
	{
		boolean myResult1 = posNeg(1,-1,false);	// passing value to posNeg Method
		boolean myResult2 = posNeg(-1,1,false);	// and storing it in myResult Variable
		boolean myResult3 = posNeg(-4,-5,true);
		
		System.out.println(myResult1);			// Printing myResult
		System.out.println(myResult2);
		System.out.println(myResult3);
	}
	public static boolean posNeg (int num1, int num2, boolean itsASimpleYesOrNoQuestion)	// Secondary method
	{
		boolean result = false;
		
		if (((num1 > 0 && num2 < 0) || (num1 < 0 && num2 > 0)) && itsASimpleYesOrNoQuestion == false)	// 1st condition
		{																		// as described in the question
			result = true;
		}
		if ((num1 < 0 && num2 < 0) && itsASimpleYesOrNoQuestion == true)	// condition when both num are negative 
		{																	// and boolean is true		
			result = true;
		}
		return result;
	}

}
