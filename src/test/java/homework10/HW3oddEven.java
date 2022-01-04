package homework10;

public class HW3oddEven {
	public static void main(String[] args) 
	{
		oddEven(1018);
		
	}
	public static void oddEven(int number)
	{
		int result = (number % 2);
		
		if (result == 0)
			System.out.println("The number is an even number");
		else
			System.out.println("The number is an odd number");
	}
}
