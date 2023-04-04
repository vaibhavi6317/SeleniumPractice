package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		System.out.println("stsrts");
		//abnormal statements
		int i=10;
		int j=i/0;
		System.out.println("res: "+j);
		int[]empIds=new int[2];
		empIds[2]=200;
		String str=null;
		System.out.println(str.length());
		String s="abc";
		int num=Integer.parseInt(s);
		System.out.println("num:"+num);
		System.out.println("ends");
	}

}
