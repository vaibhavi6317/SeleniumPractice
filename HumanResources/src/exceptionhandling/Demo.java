package exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		System.out.println("program start");
		try {
			int a=10/0;   //10/2;
			//System.out.println(data);
			System.out.println("inside try block");
		}
		catch(ArithmeticException b) {
		//catch(Throwable b) 
			System.out.println("exception handle");
		}
		finally {
			System.out.println("inside fonally block");
		}
		System.out.println("program ends");

	}

}
