package homework19;

public class HW1 {
	public static void main(String[] args) {
		
		boolean myResult = isEqual ("sdet", "SDET");
		
		System.out.println(myResult);
		
		System.out.println(isEqual("testing", "testing"));
		System.out.println(isEqual("java", "java"));
		System.out.println(isEqual("java", "java Programming"));
	}
	static boolean isEqual (String strOne, String strTwo)
	{
		boolean result = false;
		
		if (strOne.equals(strTwo))	//condition to check String
		{
			return true;
		}
		
		return result;
	}

}
