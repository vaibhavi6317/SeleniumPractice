package ArrayAssignment;

public class LargestElement {

	public static void main(String[] args) {
		int[]arr=new int[] {2,67,5,98,44,77};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("largest element :"+max);

	}

}
