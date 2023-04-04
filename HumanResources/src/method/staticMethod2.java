package method;

public class staticMethod2 {

	public static void main(String[] args) {
		addTwoNumber(22, 40);
		int res = staticMethod2.multiplyTwoNumbers(10, 20);
		System.out.println("Result:"+res);
		int finalValue = res+100;
		System.out.println("Updated final value is:"+finalValue);
	}
	static int multiplyTwoNumbers(int n1, int n2)
	{
		System.out.println("Number1:"+n1);
		System.out.println("Number2:"+n2);
		int res=n1*n2;
		return res;
	}
	static void addTwoNumber(int num1, int num2)
	{
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		int res=num1+num2;
		System.out.println("Result is:"+ res);
	}
}	


//4th jan