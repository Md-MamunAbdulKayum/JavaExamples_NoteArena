package whileL_loop;

import java.util.Scanner;

/**
 * An example of using a while loop in Java to create a simple menu that allows
 * the user to select different options
 * 
 * @author Mamun Kayum
 *
 */
public class WhileLoopMenuExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 4) {
			System.out.println("Main Menu:");
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You chose Option 1.");
				break;
			case 2:
				System.out.println("You chose Option 2.");
				break;
			case 3:
				System.out.println("You chose Option 3.");
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
			System.out.println();
		}
	}
}
