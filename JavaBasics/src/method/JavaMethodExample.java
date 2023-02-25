package method;

/**
 * Java method example
 * 
 * @author Mamun Kayum
 *
 */
public class JavaMethodExample {
	public static void main(String[] args) {
		JavaMethodExample example = new JavaMethodExample();
		// calling a method using class object
		example.callAdd();
	}

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public void callAdd() {
		// calling a method from another
		int sum = add(5, 10);
		System.out.println("Sum is: " + sum);
	}
}
