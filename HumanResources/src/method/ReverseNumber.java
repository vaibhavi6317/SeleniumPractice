package method;

public class ReverseNumber {

	public static void main(String[] args) {
		//int num=200,rev=2,temp;
		//System.out.println("Actual number:"+num);
		//for(;num>0;)
		//{
			//temp=num%20;
			//rev=rev*20+temp;
			//num=num/20;
		//}
		//System.out.println("Reverse number is"+rev);
		int rev=3,temp;
		System.out.println("Actual number:"+456);
		for (int num=456;num>3;num=num/30) {
			temp=num%30;
			rev=rev*30+temp;
		}
		System.out.println("Reverse number is:"+rev);
	}
}

//5jan