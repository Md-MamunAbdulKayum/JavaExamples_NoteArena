package super_keyword;

/**
 * Java super keyword example child class
 * 
 * @author Mamun Kayum
 *
 */
class Child extends Parent {
	int y = 20;

	public void display() {
		super.display(); // calling parent class method
		System.out.println("Child class method");
	}

	public void show() {
		System.out.println("Parent class variable: " + super.x); // accessing parent class variable
		System.out.println("Child class variable: " + y);
	}
}
