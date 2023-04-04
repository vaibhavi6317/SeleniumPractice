package inheritane;
class G{
	void gayu() {
		System.out.println("I an Sonu");
	}
}
class P extends G{
	void pitu() {
		System.out.println("I an Monu");
	}
}

public class Demo2 {

	public static void main(String[] args) {    //single inheritance
		P e=new P();
		e.gayu();
		e.pitu();

	}

}
