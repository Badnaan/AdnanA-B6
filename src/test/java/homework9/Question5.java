package homework9;

public class Question5 {
	public static void main(String[] args) {
		
		System.out.print("a) Even Number 2-5:  ");
		
		for (int i = 1; i <= 32; i ++)				//Starting a loop 1 - 32 
		{
			if (i % 2 == 0 && i >= 2 && i <= 5)		// condition for even numbers b/w 2 and 5
			{
				System.out.print(i + " ");
			}
			if(i==6)								// printing the statement once
			{
				System.out.println("");
				System.out.print("b) Even Number 6-20: ");
			}
			if (i % 2 == 0 && i >= 5 && i <= 20)	//condition for even numbers b/w 5-20
			{
				System.out.print(i + " ");
			}
			if (i==20)								// once all the even numbers are printed, going to execute third line
			{
				System.out.println("");
				System.out.print("c) Odd Number 15-20: ");	// printing this statement once
				for (int j = 15; j <= 20; j++)				// making a  loop for odd numbers 15-20 
				{
					if (j % 2 == 1 && j >= 15 && j <= 20)	// setting up condition for odd numbers 15-20
					{
						System.out.print(j + " ");
					}
				}
			}
		}
		System.out.println("");
		System.out.println("*************WHILE LOOP*****************");		// I am doing this one different from the first
				
		int i = 1;										//initialization and assign
		i++;											//increment by 1 to get it accepted into first if statement
		while (i <= 32)									//starting while loop and limiting it to 32
		{
			if (i % 2 == 0 && i >= 2 && i <= 5)			//condition for even numbers 2-5. 2 gets accepted here. 6 does not
			{
				System.out.println("a) Even Number 2-5: " + i);
				i = i+2;								// increment by two to get it accepted again until it hits 6
				continue;
			}
			
			if(i % 2 == 0 && i >= 5 && i <= 20)			//condition for even numbers b/w 5-20. 6 gets accepted here. 22 does not
			{
				System.out.println("b) Even Number 5-20: " + i);
				i= i+2;									// increment by two to get it accepted again until it hits 22
				continue;
			}
			
			if(i == 22)									// condition for 22, gets accepted here
				i = 15;									// reassigning i to 15 to get it ready for acceptance in next if statement
			
			if(i % 2 == 1 && i >= 15 && i <= 20)		//condition for odd numbers 15-20. 15 gets accepted. 21 does not
			{
				System.out.println("c) Odd Number 15-20: " + i);
				i = i+2;								//increment by two to keep it getting accepted until it hits 21
				continue;
			}
			break;										// to prevent silent infinite loop
		}
		System.out.println("**********DO-WHILE LOOP*****************");
		
		i=2;											//reassign i to 2 to get it accepted into first if statement
		do
		{
			if (i % 2 == 0 && i >= 2 && i <= 5)			//condition for even numbers 2-5. 2 gets accepted here. 6 does not
			{
				System.out.println("a) Even Number 2-5 : " + i);
				i = i+2;								// increment by two to get it accepted again until it hits 6
				continue;
			}
			
			if(i % 2 == 0 && i >= 5 && i <= 20)			//condition for even numbers b/w 5-20. 6 gets accepted here. 22 does not
			{
				System.out.println("b) Even Number 5-20 : " + i);
				i= i+2;									// increment by two to get it accepted again until it hits 22
				continue;
			}
			
			if(i == 22)									// condition for 22, gets accepted here
				i = 15;									// reassigning i to 15 to get it ready for acceptance in next if statement
			
			if(i % 2 == 1 && i >= 15 && i <= 20)		//condition for odd numbers 15-20. 15 gets accepted. 21 does not
			{
				System.out.println("c) Odd Number 15-20 : " + i);
				i = i+2;								//increment by two to keep it getting accepted until it hits 21
				continue;
			}
			break;										// to prevent silent infinite loop
		}while (i <= 32);									//wait what. it loops but how? There is a break before it.
	}
}
/*


*/