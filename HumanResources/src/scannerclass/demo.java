package scannerclass;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		String e1="Jalgaon";
		System.out.println(e1.charAt(2));
		System.out.println("*************");
		for(int i=0;i<e1.length();i++) {
	    System.out.println(e1.charAt(i));
		}
		System.out.println("************");
		for(int i=e1.length()-1;i>=0;i--) {
		System.out.println(e1.charAt(i));
		}
       System.out.println("original string: "+e1);
       System.out.println("Reverse:"+e1);
       System.out.println("Jalgaon");
       String e2="Kohlapur";
       System.out.println("Reverse:"+e2);
       for(int i=e2.length()-1;i>=0;i--) {
     System.out.print(e2.charAt(i));
       }
       
	}

}
