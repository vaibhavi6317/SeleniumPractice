package wrapperclass;

public class BoxingOperation {

	public static void main(String[] args) {
		int age=22;
		System.out.println("Age"+age);
		Integer obj=43;
		System.out.println("Obj:"+obj);
		Integer intObj1=new Integer(age);
		System.out.println("intObj1:"+intObj1);
		System.out.println(age==intObj1);
		Integer intObj2=new Integer(45);
		System.out.println("intObj2:"+intObj2);
	}

}
