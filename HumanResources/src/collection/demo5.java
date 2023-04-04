package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class demo5 {

	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("Apple");
		set.add("mango");
		set.add("banana");
		set.add("orange");
		set.add("papaya");
		set.add("grapes");
		set.add("paineapple");
		set.add("chiku");
		int n=set.size();
		List<String>list=new ArrayList<String>(n);
		for(String x:set)
			list.add(x);
		System.out.println("ArrayList is:");
		for(String x:list)
			System.out.println(x);
	}

}
