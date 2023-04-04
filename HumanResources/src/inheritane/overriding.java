package inheritane;
class dog{
	void Demo(){
		System.out.println("dog");
	}
}
class poppy extends dog{
	void Demo() {
		System.out.println("poppy");
	}
}

public class overriding {

	public static void main(String[] args) {
		poppy e1=new poppy();
		e1.Demo();
        e1.Demo();
	}

}
