package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> N=new ArrayList<Integer>();
       N.add(1);
       N.add(2);
       N.add(1);
       N.add(4);
       N.add(2);
       List<Integer> UN=N.stream().distinct().collect(Collectors.toList());														
       System.out.println("Unique values of ArrayList");
       for(int i=0; i<UN.size(); ++i) {
    	   System.out.println(UN.get(i));
       }
	}

}
