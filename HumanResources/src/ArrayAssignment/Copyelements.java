package ArrayAssignment;
import java.util.Arrays;
public class Copyelements {

	public static void main(String[] args) {
		char copy []= {'a','m','v','l','g','g'};
		char copyA []=Arrays.copyOf(copy, copy.length);
		System.out.println(copyA);
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]+" ");
			
		}

	}

}
