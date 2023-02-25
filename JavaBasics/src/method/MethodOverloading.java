package method;

/**
 * Java method overloading example
 * 
 * @author Mamun Kayum
 *
 */
public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();

		System.out.println("Summation of two integers: " + methodOverloading.add(10, 10));
		System.out.println("Summation of two doubles: " + methodOverloading.add(10.50, 10.50));
	}

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	// overloaded add method with different parameters
	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
}
