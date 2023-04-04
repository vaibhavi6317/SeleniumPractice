package memory;

public class memory {
	static int salary;
	int empId;
	void display() {
		System.out.println("I am display()...");
	}
	static void print() {
		System.out.println("I am print()....");
	}
	public static void main(String[] args) {
		System.out.println("static variable salary:"+memory.salary);
		memory.print();
		memory m1=new memory();
		System.out.println("non static variable empId:"+m1.empId);
		m1.display();
		memory.salary=35000;
		System.out.println("update static variable salary:"+memory.salary);
		m1.empId=210;
		System.out.println("update non-static variable empId:"+m1.empId);
		memory m2=new memory();
		System.out.println("2nd instance non-static variable empId:"+m2.empId);
		m2.display();
	}

}


//6jan