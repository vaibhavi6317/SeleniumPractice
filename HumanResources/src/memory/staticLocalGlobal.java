package memory;

public final class staticLocalGlobal {
	static int age=22;
	public static void main(String[] args) {
		int age=43;
		System.out.println("I am Local age:"+age);
		System.out.println("I am global age:"+staticLocalGlobal.age);
		
	}

}


//6 jan