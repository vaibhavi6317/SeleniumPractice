package switchcase;

public class switchcaseprogram
{

	public static void main(String[] args) 
	{
		int num1 = 20, num2 = 10, res;
		char op ='%';
		switch(op)
		{
		case'-':
			res =num1 - num2;
			System.out.println("num1-num2="+res);
			
		case'+':
		    res=num1+num2;
			System.out.println("num1+num2="+res);
			
		case'/':
			res=num1/num2;
			System.out.println("num1/num2="+res);
			
			default:
			System.out.println("unknown operation");			
		}
				
	}
	
}	
			
			
			
			
			

			
		
				
	
		
	
	

