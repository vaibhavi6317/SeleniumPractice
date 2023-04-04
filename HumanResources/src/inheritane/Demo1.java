package inheritane;
class A {
	void call() {
		System.out.println("I am sister");
	}
}
	class B extends A {
		void call() {
			System.out.println("I am brother");
		}
	}

	class C extends A {
		void call() {
			System.out.println("I am mother");
		}
	}

public class Demo1 {
	public static void main(String[] args) {     //hierarchical inheritance
		A a1=new A();
		a1.call();
		B a2=new B();
		a2.call();
		C a3=new C();
		a3.call();

	}

}
