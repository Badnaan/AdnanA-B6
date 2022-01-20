package homework19;

public class Hw9 {
	public static void main(String[] args)
	{
		Hw9 obj = new Hw9();	// non static method requires object
		
		System.out.println(obj.isThere("java training", "ini"));
		System.out.println(obj.isThere("java training", "ava"));
		System.out.println(obj.isThere("java training", "AVA"));
		System.out.println(obj.isThere("java training", "Java"));
	}
	private boolean isThere (String strOne, String value)
	{
		boolean result = false;
		
		if (strOne.contains(value))
			result = true;
		
		return result;
	}
}
