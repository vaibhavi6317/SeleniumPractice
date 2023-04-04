package array;

public class Demo3 {

	public static void main(String[] args) {
		int a[]= {5,6,7};
		int sum=0;
		int avg;
		for(int b:a) {
		 sum=sum+b;
		}
		System.out.println(sum);
		System.out.println(a.length);
		avg=sum/a.length;
		System.out.println(avg);

	}

}
