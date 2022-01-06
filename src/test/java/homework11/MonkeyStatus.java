package homework11;

public class MonkeyStatus {
	public static void main (String [] args)
	{
		boolean areWeInTrouble = monkeyTrouble (false, false);	//if monkeys are smiling or not stores as boolean
		
		System.out.println(areWeInTrouble);						// printing stored value
	}
		
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)		// method monkeyTrouble with two boolean variables
	{
		boolean result = false;			// declaring and assigning result. Default is false
		
		if (aSmile == bSmile)			// setting up condition if both monkeys acting the same
		{
			result = true;				// if they act the same, we are in trouble
		}
		
		return result;
	}

}
