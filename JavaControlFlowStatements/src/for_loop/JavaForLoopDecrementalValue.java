package for_loop;

/**
 * An example of a for loop that uses a negative increment to print the elements
 * of an array in reverse order
 * 
 * @author Mamun Kayum
 *
 */
public class JavaForLoopDecrementalValue {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
