package wrapperclass;

public class BoxingOperation2 {

	public static void main(String[] args) {
		char a1='A';
		Character charObj1=new Character(a1);
		System.out.println(a1==charObj1);
		Character charObj2=new Character('M');
		Character charObj3='G';
		System.out.println("a1:"+a1);
		System.out.println("charObj1:"+charObj1);
		System.out.println("charObj2:"+charObj2);
		System.out.println("charObj3:"+charObj3);
		boolean b=true;
		Boolean bObj=new Boolean(b);
		System.out.println(bObj==b);

	}

}
