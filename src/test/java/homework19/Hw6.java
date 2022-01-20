package homework19;

public class Hw6 {
	public static void main(String[] args) 
	{
		System.out.println(combineStr ("day", "ONE", "work", "HOURS"));
		System.out.println(combineStr ("week", "weekend", "monday","Tuesday"));
		System.out.println(combineStr ("restoN", "vA", "baltiMORE", "MD"));
		System.out.println(combineStr ("day", "ONE", "work", "HOURS"));
	}
protected static String combineStr (String strOne, String strTwo, String strThree, String strFour )
	{
	String result = "";
	
	strOne = strOne.toUpperCase();// converts strOne into uppercase
	strThree = strThree.toUpperCase();	//converts strThree to lowercase
	
	strTwo = strTwo.toLowerCase();
	strFour = strFour.toLowerCase();
	
	String a = strOne.concat(strTwo);	//concat 1st two variables
	String b = strThree.concat(strFour);	//concat last two variables
	
	result = a.concat(b);	// concat 1st and last
		
	return result;
	}
}
