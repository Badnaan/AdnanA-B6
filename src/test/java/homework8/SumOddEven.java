package homework8;

public class SumOddEven {
	public static void main(String[] args) {
		
		int remainder = 0;			// this is going to hold the remainder (either 1 or 0)
		int odd = 0;				// this is going to hold all the odd numbers
		int even = 0;				//this is going to hold all the even numbers
		
		for (int i = 1; i <= 20; i++) 
		{
			 remainder = i % 2;		// calculating and grabbing the remainder
			// System.out.println(odd);
			 if (remainder == 1)	// calculate odd numbers here
			 {
				// System.out.println(odd);
				 odd = i+odd;		// adding all the odd numbers here
			 }
			 else					// the left over numbers should be even
			 {
				 even = i+even;		// adding all the even numbers here
			 }
		}
		System.out.println("sum of odd numbers b/w 1 and 20: " + odd);			//display odd
		System.out.println("sum of even numbers b/w 1 and 20: " + even);		//display even
		
		System.out.println("********while loop****************");
		
		remainder = 0;
		odd = 0;
		even = 0;
		int j = 1;
		
		while (j <= 20)
		{
			remainder = j % 2;
			// System.out.println(odd);
			 if (remainder == 1)
			 {
				// System.out.println(odd);
				 odd = j + odd;
			 }
			 else
			 {
				 even = j + even;
			 }
			 j++;
		}
		System.out.println("sum of odd numbers b/w 1 and 20: " + odd);
		System.out.println("sum of even numbers b/w 1 and 20: " + even);
		
System.out.println("********do-while loop****************");
		
		remainder = 0;
		odd = 0;
		even = 0;
		int k = 1;
		
		do
		{
			remainder = k % 2;
			// System.out.println(odd);
			 if (remainder == 1)
			 {
				// System.out.println(odd);
				 odd = k + odd;
			 }
			 else
			 {
				 even = k + even;
			 }
			 k++;
		}while (k <= 20);
		
		System.out.println("sum of odd numbers b/w 1 and 20: " + odd);
		System.out.println("sum of even numbers b/w 1 and 20: " + even);
	}

}
