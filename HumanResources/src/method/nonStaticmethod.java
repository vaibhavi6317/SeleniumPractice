package method;

public class nonStaticmethod {

	public static void main(String[] args) {
		nonStaticmethod n1=new  nonStaticmethod ();
		n1.addTwoNumber(22, 40);
		int res = n1.multiplyTwoNumbers(10, 20);
		System.out.println("Result:"+res);
		int finalValue = res+100;
		System.out.println("Updated final value is:"+finalValue);
	}
	 int multiplyTwoNumbers(int n1, int n2)
	{
		System.out.println("Number1:"+n1);
		System.out.println("Number2:"+n2);
		int res=n1*n2;
		return res;
	}
    void addTwoNumber(int num1, int num2)
    {
    	System.out.println("Number1:"+num1);
    	System.out.println("Number2:"+num2);
    	int res=num1+num2;
    	System.out.println("Result is:"+res);
	}

}
