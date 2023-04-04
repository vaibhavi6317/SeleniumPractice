package memory;

public class NonstaticLocalGlobal {
	int empId=22;

	public static void main(String[] args) {
		NonstaticLocalGlobal n1=new NonstaticLocalGlobal();
		n1.display();
	}
	void display()
	{
		int empId=43;
		System.out.println("I am local empId"+empId);
		System.out.println("I am Global empId"+empId);
	}

}

//6jan