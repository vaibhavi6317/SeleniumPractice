package objectclass;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}

public class Example extends TestSample {
	static int last_roll=100;
	int roll_no;
	Example()
	{
		roll_no=last_roll;
		last_roll++;
	}
	public int hashCode() {
		return 505;
	}
	public String toString()
	{
		return"BasicCoreJava";
	}

	public static void main(String[] args) {
		Example s=new Example();
		System.out.println(s.hashCode());
		System.out.println(s);
		TestSample t1=new TestSample();
		System.out.println(t1);
       System.out.println(t1.hashCode());
	}

}
