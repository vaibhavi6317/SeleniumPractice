package method;

public class methodOverloading5 {
	void disp(int a, double b) {
		System.out.println("Method A");
	}
	void disp(int a,double b, double c)
	{
		System.out.println("Method B");
	}
	void disp(int a,float b) {
		System.out.println("Method C");
	}

	public static void main(String[] args) {
		methodOverloading5 obj=new methodOverloading5();
        obj.disp(100, 20.67);
	}

}


//5 jan