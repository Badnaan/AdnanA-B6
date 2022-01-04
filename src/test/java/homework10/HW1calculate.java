package homework10;

public class HW1calculate {
	public static void main(String[] args) 
	{
		calculate(8,3,'+');
	}
	public static void calculate (double numOne, double numTwo, char mathOperationSign)
	{
		double result = 0;
		if(mathOperationSign == '+')
			result = (numOne + numTwo);
		else if(mathOperationSign == '-')
			result = (numOne - numTwo);
		else if (mathOperationSign == '/')
			result = (numOne / numTwo);
		else if (mathOperationSign == '*')
			result = (numOne * numTwo);
		else if(mathOperationSign == '%')
			result = (numOne % numTwo);
		else
			System.out.println("Printing an error message. Invalid math operation sign: " + mathOperationSign);
		
		switch (mathOperationSign)
		{
		case'+':
		case'-':
		case'/':
		case'*':
		case'%':	
			System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
			break;
		}
		// ('+'  '-' || '/' || '*')	
	}
}
