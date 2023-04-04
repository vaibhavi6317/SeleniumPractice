package scannerclass;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s1.nextLine();
		System.out.println(name);
		System.out.println("Enter your age");
		int age=s1.nextInt();
		System.out.println("age"+age);
		System.out.println("Enter your salary");
		double salary=s1.nextDouble();
		System.out.println(salary);
		
	}

}
