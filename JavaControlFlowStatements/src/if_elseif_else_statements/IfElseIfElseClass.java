package if_elseif_else_statements;

import java.util.Scanner;
/**
 * An example code snippet that demonstrates how to use if-else if-else statements in Java
 * @author Mamun Kayum
 *
 */
public class IfElseIfElseClass {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your age: ");
	    int age = scanner.nextInt();

	    if (age < 0) {
	      System.out.println("Age cannot be negative.");
	    } else if (age < 18) {
	      System.out.println("You are a minor.");
	    } else if (age < 65) {
	      System.out.println("You are an adult.");
	    } else {
	      System.out.println("You are a senior citizen.");
	    }
	  }
}
