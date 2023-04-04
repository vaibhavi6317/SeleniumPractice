package forloop;

public class factorsNegativenumber {

	public static void main(String[] args) {
		int num=-80;
		System.out.println("Factors of " + num + " are ");
		for(int i=1; i<=num; ++i) {
		
			if(num%i ==0) 
				System.out.println(i+" ");
		}
	
   }
 
}
