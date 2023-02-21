package do_while_loop;

import java.util.Scanner;

/**
 * An example of using a do-while loop in Java to calculate the factorial of a
 * given number
 * 
 * @author Mamun Kayum
 *
 */
public class FactorialDoWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, i = 1, factorial = 1;

		System.out.print("Enter a number: ");
		n = input.nextInt();

		do {
			factorial *= i;
			i++;
		} while (i <= n);

		System.out.println("The factorial of " + n + " is " + factorial);
	}
}
