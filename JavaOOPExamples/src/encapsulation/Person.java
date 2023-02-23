package encapsulation;

/**
 * An example to see how encapsulation works in Java
 * 
 * @author Mamun Kayum
 *
 */
public class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
