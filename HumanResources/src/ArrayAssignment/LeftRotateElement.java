package ArrayAssignment;

public class LeftRotateElement {

	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,5};
		int n=5;
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		
		System.out.println();
		System.out.println("Array after left rotation:");
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]+"");
        }
	}

}
