package method;

public class staticandnonstatic {

	public static void main(String[] args) {
		staticandnonstatic n1=new staticandnonstatic ();
		n1.swapTwoNumbers(17,22);
		System.out.println("ASCII value of 'f':"+n1.getAsciivalue('F'));
		//quotient and remainder
		n1.getQuotientAndRemainder(22,5);
	}
	void getQuotientAndRemainder(int num1, int num2)
	{
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		int quotient=num1/num2;
		int remainder=num1%num2;
		System.out.println("Quotient is "+quotient);
		System.out.println("Remainder is "+remainder);
	}
	int getAsciivalue(char c)
	{
		return c;
	}
	void swapTwoNumbers(int num1, int num2)
		{
			System.out.println("Before swap num1:"+num1);
			System.out.println("Before swap num2:"+num2);
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
         System.out.println("After swap num1:"+num1);
         System.out.println("After swap num2:"+num2);
		}
}


//5jan