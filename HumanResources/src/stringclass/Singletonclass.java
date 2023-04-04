package stringclass;
class Demo123{
	private Demo123() {
		System.out.println("I am zero-param");
	}
	private static Demo123 d1=new Demo123();
	String name="Pune";
	static Demo123 getInstance() {
		return d1;
	}
	 void print() {
		 System.out.println("I am print() of Singleton class Demo123 ");
	 }
}

public class Singletonclass {

	public static void main(String[] args) {
Demo123 xyz=Demo123.getInstance();//d1--->new Demo123();
xyz.print();
System.out.println(xyz.name);//Pune
xyz.name="Bangalore";
System.out.println("d1 ref: "+xyz.name);//Bangalore
Demo123 d2=Demo123.getInstance();
System.out.println("d2 ref: "+d2.name);//Bangalore

	}

}
