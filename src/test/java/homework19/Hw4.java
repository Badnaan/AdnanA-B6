package homework19;

public class Hw4 {
	public static void main(String[] args) {
		
		Hw4 obj = new Hw4();
		
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper("Java training"));
		
	}
	String toUpper(String strOne)	// returns uppercase string
	{
		String result = "";
		
		result = strOne.toUpperCase();
		
		return result;
	}

}
