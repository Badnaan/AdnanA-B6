package homework11;

public class SleepStatus {
	
	public static void main (String [] args)			//main method
	{
		boolean amIsleeping = sleepIn(false, false);		// isWeekday is true if its a weekday, false if it is not a weekday
															// isVacation is true if we are on vacation, false if we are not
		System.out.println(amIsleeping);				//output
	}														// we sleep in if we are on vacation or not on a weekday. find if we sleep longer
	
	public static boolean sleepIn(boolean isWeekday, boolean isVacation)		//secondary method with two boolean variables
	{
		boolean result = false;
		
		if ( (isWeekday == false) || (isVacation == true) )	//if it is not a weekday 	OR	 if we are on Vacation
		{
			result = true;				// return true which means we are sleeping-in.
		}
		//if (isVacation == true)			
		//{
		//	result = true;				
		//}
		return result;
	}

}
