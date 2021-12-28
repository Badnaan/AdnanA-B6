package homework8;

public class CozaLozaWoza 
{
	public static void main(String[] args) //new class for each question . skip 5. submit through github, grab screenshot, send wtsp
	{		//using for loops, while loop, do-while loop
		
		
		for(int i = 1; i <=36; i++)
		{
			int coza = (i % 3);
			int loza = (i % 5);
			int woza = (i % 7);
			
			if (coza == 0 && loza == 0)
				System.out.print("CozaLoza, ");
			else if (coza == 0)
				System.out.print("Coza, " );
			else if (loza == 0)
				System.out.print("Loza, " );
			else if (woza == 0)
				System.out.print("Woza, ");
			else
				System.out.print(i+ ", ");
		}
		System.out.println();
		System.out.println("*Using while********************************************************");
			
		int j = 1;		//declare and assign variable
			
		while ( j <= 36)
		{
			int coza1 = (j % 3);
			int loza1 = (j % 5);
			int woza1 = (j % 7);
				
			if (coza1 == 0 && loza1 == 0)
					System.out.print("CozaLoza, ");
			else if (coza1 == 0)
					System.out.print("Coza, " );
			else if (loza1 == 0)
					System.out.print("Loza, " );
			else if (woza1 == 0)
					System.out.print("Woza, ");
			else
					System.out.print(j+ ", ");
			j++;
		}
			System.out.println();
			System.out.println("*Using do-while************************************************");
		j=1;
		do
		{
			int coza1 = (j % 3);
			int loza1 = (j % 5);
			int woza1 = (j % 7);
				
			if (coza1 == 0 && loza1 == 0)
					System.out.print("CozaLoza, ");
			else if (coza1 == 0)
					System.out.print("Coza, " );
			else if (loza1 == 0)
					System.out.print("Loza, " );
			else if (woza1 == 0)
					System.out.print("Woza, ");
			else
					System.out.print(j+ ", ");
			j++;
		}while (j <= 36);
	}

}
