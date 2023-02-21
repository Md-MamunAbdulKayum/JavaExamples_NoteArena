package whileL_loop;

/**
 * An example of using a while loop in Java to print the even numbers between 1
 * and 10
 * 
 * @author Mamun Kayum
 *
 */
public class JavaWhileLoop {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
