
public class Main {

	public static void main(String[] args) {
		
		/*
		 * This is a simple program to demonstrate the 
		 * concepts of inheritance and how a method 
		 * present inside the sub-class(child class)
		 * Override the method of the base class		  
		 */

		Turtle turtle = new Turtle();
		turtle.move();
		turtle.eat();
		turtle.sleep();
		
		Animal animal = new Animal();
		animal.move();
		animal.eat();
		animal.sleep();
		
		Dog pluto = new Dog();
		pluto.bark();
		pluto.eat();
		pluto.run();
		
	}

}
