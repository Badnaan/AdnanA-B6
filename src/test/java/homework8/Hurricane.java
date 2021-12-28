package homework8;

public class Hurricane {
	public static void main(String[] args) {
		
		for (int x = 20; x <=200; x++)
		{
			if (x >= 74 && x <= 95)
				System.out.println("Category 1 Hurricane with wind speed of " + x);
			else if (x >= 105 && x <= 110)
				System.out.println("Category 2 Hurricane with wind speed of " + x);
			else if (x >= 120 && x <= 130)
				System.out.println("Category 3 Hurricane with wind speed of " + x);
			else if (x >= 140 && x <= 155)
				System.out.println("Category 4 Hurricane with wind speed of " + x);
			else if (x >= 165 && x <= 194)
				System.out.println("Category 5 Hurricane with wind speed of " + x);
		}
		System.out.println("************While Loop**********************************");
		
		int y = 20;
		while (y <=200)
		{
			if (y >= 74 && y <= 95)
				System.out.println("Category 1 Hurricane with wind speed of " + y);
			else if (y >= 105 && y <= 110)
				System.out.println("Category 2 Hurricane with wind speed of " + y);
			else if (y >= 120 && y <= 130)
				System.out.println("Category 3 Hurricane with wind speed of " + y);
			else if (y >= 140 && y <= 155)
				System.out.println("Category 4 Hurricane with wind speed of " + y);
			else if (y >= 165 && y <= 194)
				System.out.println("Category 5 Hurricane with wind speed of " + y);
			y++;
		}
		System.out.println("************Do-While Loop********************************");
		
		int z = 20;
		do
		{
			if (z >= 74 && z <= 95)
				System.out.println("Category 1 Hurricane with wind speed of " + z);
			else if (z >= 105 && z <= 110)
				System.out.println("Category 2 Hurricane with wind speed of " + z);
			else if (z >= 120 && z <= 130)
				System.out.println("Category 3 Hurricane with wind speed of " + z);
			else if (z >= 140 && z <= 155)
				System.out.println("Category 4 Hurricane with wind speed of " + z);
			else if (z >= 165 && z <= 194)
				System.out.println("Category 5 Hurricane with wind speed of " + z);
			z++;
		}while (z <=200);
		
		/*int windSpeed = 190;				//input for calculations
		
		for(int i = 20; i <= 200; i++)
		{
			if (i == windSpeed && i >= 74)
			{
					System.out.println("Wind Speed: " + windSpeed);
					System.out.println("Hurricane");
			}
		}
			if (windSpeed > 201)
				System.out.println("Not Wind Speed");
			else if (windSpeed >= 165)
				System.out.println("Category 5");
			else if (windSpeed >= 140)
				System.out.println("Category 4");
			else if (windSpeed >= 120)
				System.out.println("Category 3");
			else if (windSpeed >= 105)
				System.out.println("Category 2");
			else if (windSpeed >= 74)
				System.out.println("Category 1");
			else if (windSpeed >= 20)
				System.out.println("Does not qualify as a Hurricane");
			else
				System.out.println("Bruh!. Thats just breeze Bruh");
			
			System.out.println("**************While Loop******************************");
			
			int i = 20;
			while ( i <= 200)
			{
				if (i == windSpeed && i >= 74)
				{
						System.out.println("Wind Speed: " + windSpeed);
						System.out.println("Hurricane");
				}
				if (i == windSpeed && windSpeed > 201)
					System.out.println("Not Wind Speed");
				
				else if (i == windSpeed && windSpeed >= 165)
					System.out.println("Category 5");
				
				else if (i == windSpeed && windSpeed >= 140)
					System.out.println("Category 4");
				
				else if (i == windSpeed && windSpeed >= 120)
					System.out.println("Category 3");
				
				else if (i == windSpeed && windSpeed >= 105)
					System.out.println("Category 2");
				
				else if (i == windSpeed && windSpeed >= 74)
					System.out.println("Category 1");
				
				else if (i == windSpeed && windSpeed >= 20)
					System.out.println("Does not qualify as a Hurricane");
				//else
				//	System.out.println("Bruh!. Thats just breeze Bruh");
				i++;
			}
			System.out.println("**************Do-While Loop******************************");
			
			i = 20;
			do
			{
				if (i == windSpeed && i >= 74)
				{
						System.out.println("Wind Speed: " + windSpeed);
						System.out.println("Hurricane");
				}
				if (i == windSpeed && windSpeed > 201)
					System.out.println("Not Wind Speed");
				
				else if (i == windSpeed && windSpeed >= 165)
					System.out.println("Category 5");
				
				else if (i == windSpeed && windSpeed >= 140)
					System.out.println("Category 4");
				
				else if (i == windSpeed && windSpeed >= 120)
					System.out.println("Category 3");
				
				else if (i == windSpeed && windSpeed >= 105)
					System.out.println("Category 2");
				
				else if (i == windSpeed && windSpeed >= 74)
					System.out.println("Category 1");
				
				else if (i == windSpeed && windSpeed >= 20)
					System.out.println("Does not qualify as a Hurricane");
				
				i++;
			}while ( i <= 200);
			*/
	}

}
