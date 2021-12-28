package homework8;

public class AverageNumber {
	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		for (int i = 20; i <=30; i++)
		{
			num =num + i;					//adds each number as loop goes on
			//System.out.print(num + " ");
			count++;						// keeps count of how many times loop ran
		}
		//System.out.println();
		System.out.println("Average number is: " + num/count);		// divides total of all numbers with the times loop ran
		
		System.out.println("********while loop********");
		
		int j = 20;
		count = 0;
		num = 0;
		
		while (j <= 30)
		{
			num = num + j;
			count++;
			j++;
		}
		System.out.println("Average number is: " + num/count);
		
		System.out.println("********do-while loop*****");
		
		int k = 20;
		count = 0;
		num = 0;
		
		do
		{
			num = num + k;
			count++;
			k++;
		}while (k <= 30);
		System.out.println("Average number is: " + num/count);
	}

}
