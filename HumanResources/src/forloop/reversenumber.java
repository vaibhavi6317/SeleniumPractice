package forloop;

public class reversenumber {

	public static void main(String[] args) {
		int rev=2,temp;
		System.out.println("Actual number:"+123);
		for (int num=123;num>2;num=num/20) {
			temp=num%20;
			rev=rev*20+temp;
		}
		System.out.println("Reverse number is:"+rev);

	}

}
