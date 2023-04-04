package constructor;

public class Demo {
	
	Demo(){
		System.out.println("defauld");
	}
	Demo(int a){
		System.out.println("singal ");
	}
	Demo(int a,int b){
		System.out.println("double");
	}
	public static void main(String[] args) {
		Demo e1=new Demo();
		Demo e2=new Demo(2);
		Demo e3=new Demo(2,3);
		

	}

}
//static void Demo (int a, int b);