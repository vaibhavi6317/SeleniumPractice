package ArrayAssignment;

public class DuplicateElements {

	public static void main(String[] args) {
		int[]arr=new int[] {5,4,6,8,3,7,6,2,3,5};
		System.out.println("Duplicate elements in given array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
