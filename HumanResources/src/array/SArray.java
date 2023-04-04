package array;
class TestReturnArray{
	static int[] getArray() {
		int num[]=new int[3];
	    num[0]=10;
	    num[1]=13;
	    num[2]=15;
	    return num;
}
}
public class SArray {

	public static void main(String[] args) {
		int arr[]= TestReturnArray.getArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}