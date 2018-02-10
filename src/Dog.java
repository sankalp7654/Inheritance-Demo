
public class Dog extends Animal{
	
	public void run() {
		System.out.println("I run fast");
	}
	
	public void bark() {
		System.out.println("I am a good watch dog");
	}
	
	@Override
	public void eat() {
		System.out.println("I am herbivorious");
	}
}
