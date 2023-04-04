package package1;
class Demo{
	private int empID=1000;
	private double salary=45000;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int id) {
		empID=id;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
     Demo d1=new Demo();
     System.out.println("Accessing private data member outside the class using getter concept- empID:"+d1.getEmpID());
     System.out.println("Accessing private data member outside the class using getter concept- salary:"+d1.getSalsary());
     System.out.println("***************Updating private data members*******************");
      d1.setEmpID(1001);
      d1.setSalary(550000);
      System.out.println("Updated,Accessing private data member outside the class using getter concept-empID:"+d1.getSalary());
      System.out.println("*********************");
      Demo d2=new Demo();
      System.out.println("Accessing private data member outside the class using getter concept- empID:"+d2.getEmpID());
      System.out.println("Accessing private data member outside the class using getter concept- salary:"+d2.getSalary());
	}

}
