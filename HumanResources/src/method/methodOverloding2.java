package method;

public class methodOverloding2 {
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number) {
		int square=number*number;
		System.out.println("Method with Integer Argument Called:"+ square);
	}
	public void square(float number)
	{
		float square = number*number;
		System.out.println("Method with float Argument Called:"+square);
	}

	public static void main(String[] args) {
		methodOverloding2 obj=new methodOverloding2();
		obj.square(3.5f);
		obj.square();
		obj.square(5);

	}

}


//5 jan