package ArrayAssignment;

import java.util.Arrays;

public class Sortelements {

	public static void main(String[] args) {
		char copy[]= {'a','m','g','g','l','v'};
		char copyM []=Arrays.copyOf(copy, copy.length);
		System.out.println(copy);
		for(int i=0; i<copy.length;i++)
			System.out.println(copy[i]+" ");

	}

}
