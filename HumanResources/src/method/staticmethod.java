package method;

public class staticmethod{
	

	public static void main(String[] args){

		displayMyPersonalInfo();
		displayMyPersonalInfo("Linu", "Mumbai");
		displayMyPersonalInfo("Milu","Nashik");
		
	}

	public static void displayMyPersonalInfo() 
	{
		System.out.println("I am Tinu");
		System.out.println("I am from Pune");
	}
	public static void displayMyPersonalInfo(String name, String location) 
	{
		System.out.println("I am "+name);
		System.out.println("I am from "+location);
}
}
		

//5jan