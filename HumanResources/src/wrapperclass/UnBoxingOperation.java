package wrapperclass;

public class UnBoxingOperation {

	public static void main(String[] args) {
		Double doubleObj=22.555;
		System.out.println("doubleObj:"+doubleObj);
		double salary=doubleObj.doubleValue();
		System.out.println(salary);
		System.out.println(doubleObj==salary);
		Boolean b=true;
		
	}

}
