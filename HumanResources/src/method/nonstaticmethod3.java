package method;

public class nonstaticmethod3 {

	public static void main(String[] args) {
		nonstaticmethod3 e1=new nonstaticmethod3();
		e1.displayMyPersonalInfo("Nimu","Mumbai");
		e1.displayMyPersonalInfo("Tinu","Pune");
		e1.displayMyPersonalInfo("Minu","Nashik");
		e1.calling(123456);
		e1.calling(9876542);
		int i=6568983;
		e1.calling(i);
		
	}

	public void displayMyPersonalInfo() 
	{
		System.out.println("I am Tinu");
		System.out.println("I am from Pune");
	}
	public void displayMyPersonalInfo(String name, String location) 
	{
		System.out.println("I am "+name);
		System.out.println("I am from "+location);
}
    public void calling(int num) {
	num=i=6568983;
			System.out.println("I am xyz");
}

}

//5jan


