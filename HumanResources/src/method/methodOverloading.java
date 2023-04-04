package method;

public class methodOverloading {

	static double res;
	static public void square()
	{
		System.out.println("No Parameter Method Called");
	}
	static public void square(int number)
	{
		res=number*number;
		System.out.println("Method with Integer Argument Called:"+res);
	}
	static public void square(double number) 
	{
		res=number*number;
		System.out.println("Method with double Argument Called:"+res);
	}
	public static void main(String[] args) {
		methodOverloading.square(4.5);
		methodOverloading.square();
		methodOverloading.square(5);
	}
}


//5 jan