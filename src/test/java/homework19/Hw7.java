package homework19;

public class Hw7 {
	public static void main(String[] args) 
	{
		Hw7 obj = new Hw7();	//non static method requires object
		
		System.out.println(obj.helloTo ("Denis"));
		System.out.println(obj.helloTo ("Malek"));
		System.out.println(obj.helloTo ("Sara"));
	}
	String helloTo (String strOne)	// method adds hello
	{
		String result = "";
		
		String hello = "Hello ";
		result = hello.concat(strOne);
		
		return result;
	}
}
