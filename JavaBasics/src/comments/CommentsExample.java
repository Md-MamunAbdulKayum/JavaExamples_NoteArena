package comments;

/**
 * This is a Java program that demonstrates the use of comments.
 * 
 * @author Mamun Kayum
 *
 */
public class CommentsExample {

	/**
	 * This is the main method of the program.
	 */
	public static void main(String[] args) {
		// This is a single-line comment
		System.out.println("Hello, world!"); // This is another single-line comment

		/*
		 * This is a multi-line comment. It can span multiple lines. Here's another line
		 * of the comment.
		 */
		int x = 10;

		// Let's print the value of x
		System.out.println("The value of x is: " + x);

		// Now let's change the value of x
		x = 20;

		// And print the new value of x
		System.out.println("The new value of x is: " + x);
	}

	/**
	 * This method greets the specified person by name.
	 *
	 * @param name The name of the person to greet
	 * @return A greeting string
	 */
	public String greet(String name) {
		return "Hello, " + name + "!";
	}
}
