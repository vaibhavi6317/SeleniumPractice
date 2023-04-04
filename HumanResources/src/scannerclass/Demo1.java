package scannerclass;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner e=new Scanner(System.in);
       System.out.println("Entr your name");
       String name =e.next();
       System.out.println("Entr your age");
       int age=e.nextInt();
       System.out.println("Entr your salary");
       double salary=e.nextDouble();
       System.out.println("ends");
	}

}
