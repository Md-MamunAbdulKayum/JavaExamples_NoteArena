package for_loop;

/**
 * An example program that uses a for loop to iterate through an array of
 * integers and calculate their sum
 * 
 * @author Mamun Kayum
 *
 */
public class JavaForLoopArrayIteration {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum is: " + sum);
	}
}
