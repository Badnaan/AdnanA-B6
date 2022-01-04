package homework10;

public class HW2getGender {
	public static void main(String[] args) 
	{
		getGender('d');
	}
	
	public static void getGender(char gender)
	{
		switch (gender)
		{
		case'm':
		case'M':
			System.out.println("Male");
			break;
		case'f':
		case'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Printing an error message: Invalid gender Character: " + gender);
			break;
		}
	}
}
