package method;

public class nonstatic1 {

	public static void main(String[] args) {
		Demo3(2,3,4);
		Demo3(1,2,3);
		 nonstatic1 e1=new  nonstatic1();
		 e1.Demo4(2,3);
	}
 static void Demo3(int a,int b,int c) {
	 System.out.println(a+b+c);
 }
 void  Demo4(int a,int b) {
	 System.out.println(a+b);
 }
}
