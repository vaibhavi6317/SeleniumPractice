package inheritane;
interface Animal12{
	int age=20;
	public void animalSound();
	public void sleep();
}
interface Reptile{
	public void colour();
}
class Pig12 implements Animal12{
	public void animalSound() {
		System.out.println("this pig say wee see ");
	}
	public void sleep() {
		System.out.println("ZZZZZ");
	}
}
class Dog12 extends Pig12 implements Reptile{
	public void animalSound() {
		System.out.println("this dog say bow bow");
	}
	public void colour() {
		System.out.println("colour blue");
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Pig12 p1=new Pig12();
		p1.animalSound();
		p1.sleep();
		Dog12 d1=new Dog12();
		d1.animalSound();
		d1.sleep();
		d1.colour();

	}

}
