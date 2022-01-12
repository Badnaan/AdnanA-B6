package homework15;

public class StaticRecapOne {

	public static boolean isJavaFun;	//static variable
	String month;						// instance variable
	
	public static int totalAmount;		//static variable
	String iLikeJava;					//instance variable
	
	String country;						//instance variables
	int age;
	char gender;
	public static double temperature;	//static variable

	public void setCountry() {			

		country = "USA";//TODO call [country] variable and assign value = "USA";

		System.out.println(country);//TODO  print the value of variable [country]

	}

	public void getCountry() {

		setCountry();	// call method [setCountry()]

		gender = 'f';	// call variable [gender] and assign value 'f'

		System.out.println(gender);// print the [gender] variable

		age = 11;		// call variable[age] and assign value 11

		System.out.println(age);// print variable [age]
	}

	public static void addNum(int a, int b) {
		int result = a+b;	
		System.out.println(result);
		
		temperature = 55.55;//TODO call [temperature] variable and assign value = 55.55;
		
		System.out.println(temperature);//TODO  print the value of variable [temperature]
		 
	}

	public static void divNum(int a, int b) {

		addNum(1,2);//TODO  call method[addNum()]
		System.out.println(a / b);
	}
}
