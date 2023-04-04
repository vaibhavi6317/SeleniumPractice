package collection;

import java.util.Arrays;
import java.util.Collections;

public class demoD3 {

	public static void main(String[] args) {
		int[]arr= {5,2,6,1,9};
		Arrays.sort(arr,Collections.reverseOrder());
		for(int values :arr) {
			System.out.println(values+" ");
		}

	}

}
