package collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();	
		List l=new ArrayList();
		l.add(912);
		l.add("Lina");
		l.add(null);
		l.add(false);
		System.out.println(l);
		l.add(3, true);
		System.out.println("upadte:"+l);
		System.out.println("size:"+l.size());
		
	}

}
