package homework19;

public class Hw5 {
	public static void main(String[] args) 
	{
		Hw5 obj = new Hw5();
		System.out.println(obj.toLower("espn"));
		System.out.println(obj.toLower("SOCCER"));
		System.out.println(obj.toLower("STRING CLASS"));
	}
	protected String toLower(String strOne)
	{
		String result = "";
		
		result = strOne.toLowerCase();
		
		return result;
	}

}
