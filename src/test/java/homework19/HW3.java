package homework19;

public class HW3 {
	public static void main(String[] args) {
		
		isEqualLength ("hii", "bYe");
	}
	
	public static void isEqualLength(String strOne, String strTwo)
	{
		//void method == no return value
		if(strOne.length() == strTwo.length())
		{
			System.out.print(strOne.concat(strTwo));
			System.out.println(" " + (strOne.length()+ strTwo.length()));
		}
		if (strOne.length() > strTwo.length())
		{
			System.out.print(strOne.toUpperCase()+ " ");
			System.out.println(strOne.length());
		}
		if (strOne.length() < strTwo.length())
		{
			System.out.print(strTwo.toLowerCase()+ " ");
			System.out.println(strTwo.length());
		}
	}
}
