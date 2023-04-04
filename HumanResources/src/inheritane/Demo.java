package inheritane;
class parent{   //parent class
	void show1() {
		System.out.println(" I am mother");
	}
}
class object extends parent{
	void show1() {    //child class
		System.out.println(" I am son");
	}
}

public class Demo {

	public static void main(String[] args) {
		parent e1=new parent();
		e1.show1();
	

	}

}
