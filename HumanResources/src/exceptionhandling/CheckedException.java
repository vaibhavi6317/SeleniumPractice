package exceptionhandling;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("Program starts from here");
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends here");

	}

}
