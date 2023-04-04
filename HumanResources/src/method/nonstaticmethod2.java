package method;

public class nonstaticmethod2 {

	public static void main(String[] args) {
		nonstaticmethod2 n1=new nonstaticmethod2();
		n1.swapTwoNumbers(16, 22);
		System.out.println("ASCII value of 'F':"+n1.getAsciiValu('F'));
		n1.getQuotientAndRemainder(20,8);
	}
	void getQuotientAndRemainder(int num1, int num2) {
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		int quotient= num1/num2;
		int remainder= num1%num2;
		System.out.println("Quotient is"+quotient);
		System.out.println("Remainder is"+remainder);
	}
	int getAsciiValu(char c) {
		return c;
	}
	void swapTwoNumbers(int num1,int num2) {
		System.out.println("Before Swap num1:"+num1);
		System.out.println("Before Swap num2:"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap num1:"+num1);
		System.out.println("After Swap num2:"+num2);
	}
}


//5jan