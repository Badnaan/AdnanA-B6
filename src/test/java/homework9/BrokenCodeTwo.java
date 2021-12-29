package homework9;

public class BrokenCodeTwo {
	
	public  static void  main(String[] args) {		//void after static. String with capital S
	        double tempOne=84.7;					// use double instead of int
	         int tempTwo =66;
	        
	        boolean result;							// result should be boolean and not String
	        
	        if (tempOne <= 0 && tempTwo >= 100) 	//No space b/w <=. use '&&'. no quotes for 100. = comes after < or >
	        {	
	            result = true;						
	        }  
	        else if (tempOne >= 100 && tempTwo <= 0) 	// else if, not if else. No ;
	        {		
	            result = true;
	        } 
	        else 
	        {
	            result= false;
	        }
	        System.out.println(result);					// should be result, not results
	        
	        String season = "Monday";

	        switch(season) 					// just season inside parentheses 
	        {
	        case "fall":					// no ; use : 
	            System.out.println("Recovering from hot weather");
	            break;						
	        case "winter":
	            System.out.println("Toooo cold");            
	             
	        case "s":						// no ; use : . s should be in double quotes
	            System.out.println("Recovering from cold weather");            
	            break;
	        case "summer":					// no ; use :
	            System.out.println("Toooo hot");            
	             
	        default:						// no ; use :
	            System.out.println("Season does not exist!");    
	        }
	        for(int i = 0; i <10; i++)			// for needs to be all lowercase. int lowercase. i needs variable assignment.
	        									//; after 10. no ; after )
	        {			
	        	if (i == 5) 					// no space b/w == . no ; . only one closed )
	            	{							// use { instead of (
	                System.out.println("I equals to 5");		// needs ; at the end
	            } else {										// no () needed
	                System.out.println("i not equals");			// use double quotes instead of single
	            }
	        }
	        
	}

	}
