package exceptionhandling;

public class FinalizeExample {
	public void finalize()throws Throwable{
	try {
		System.out.println("inside finalize method");
	}
	catch(Throwable e) {
		throw e;
	}
	finally {
		System.out.println("Calling finalize method of the object class");
		super.finalize();
	}
	}

	public static void main(String[] args)throws Throwable
	{
		FinalizeExample f1=new FinalizeExample();
		f1.finalize();
	}

}
