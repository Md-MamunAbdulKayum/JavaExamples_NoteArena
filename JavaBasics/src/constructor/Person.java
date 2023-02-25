package constructor;
/**
 * 
 * @author Mamun Kayum
 *
 */
public class Person {
	String name;
	int age;

	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public void printInfo() {
		System.out.println("Name: "+name+", Age: "+age);
	}
}