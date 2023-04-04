package stringclass;

public class Demo1 {

	public static void main(String[] args) {
		String e1="Vaibhavi patil";
		System.out.println(e1.charAt(4));
		System.out.println("*************");
		for(int i=0;i<e1.length();i++) {
			System.out.println(e1.charAt(i));
		}
		System.out.println("************");
		for(int i=e1.length()-1;i>=0;i--) {
		System.out.println(e1.charAt(i));
		}
       
	}

}
