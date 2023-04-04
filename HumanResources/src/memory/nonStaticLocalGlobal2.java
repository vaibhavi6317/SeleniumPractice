package memory;

public class nonStaticLocalGlobal2 {
	int empId=25;

	public static void main(String[] args) {
		nonStaticLocalGlobal2 n1=new nonStaticLocalGlobal2();
		n1.display();
	}
	void display() {
		int empId=45;
		System.out.println("I am local empId"+ empId);
		nonStaticLocalGlobal2 n2=new nonStaticLocalGlobal2();
       System.out.println("I am Global empId"+ this.empId);
	}

}
