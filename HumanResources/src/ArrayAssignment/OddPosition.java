package ArrayAssignment;

public class OddPosition {

	public static void main(String[] args) {
		int[]arr=new int [] {2,3,4,5,6,7,8};
		System.out.println("Present on odd position:");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
