package inheritane;
class V{                     //X
	void vebhu() {
		System.out.println("I am vaibhavi");
	}
}
class L extends V{        //Y
	void linu() {
		System.out.println("I am Lina");
	}
}
class  M extends L{     //Z
	void milu() {
	System.out.println("I am milind ");

	}
}

public class Demo3 {

	public static void main(String[] args) {   //Multilevel inheritance
		M s=new M();
		s.vebhu();
		s.linu();
		s.milu();
		
		

	}

}
