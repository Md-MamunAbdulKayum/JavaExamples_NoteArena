package string;

/**
 * Java String example with different string operations
 * 
 * @author Mamun Kayum
 *
 */
public class StringExample {
	public static void main(String[] args) {
		// Creating a string using a string literal
		String message1 = "Hello, world!";
		System.out.println(message1); // Output: Hello, world!

		// Creating a string using a constructor
		String message2 = new String("Goodbye, world!");
		System.out.println(message2); // Output: Goodbye, world!

		// Concatenating strings using the + operator and the concat() method
		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName; // Using the + operator
		System.out.println(fullName); // Output: John Doe
		String greeting = "Hello, ".concat(fullName); // Using the concat() method
		System.out.println(greeting); // Output: Hello, John Doe

		// Comparing strings using the equals() and equalsIgnoreCase() methods
		String password = "password123";
		if (password.equals("password123")) {
			System.out.println("Access granted!");
		}

		// Retrieving a substring using the substring() method
		String message3 = "Hello, world!";
		String greeting2 = message3.substring(0, 5); // greeting2 is "Hello"
		System.out.println(greeting2); // Output: Hello

		// Converting a string to uppercase or lowercase using the toUpperCase() and
		// toLowerCase() methods
		String message4 = "Hello, world!";
		String uppercaseMessage = message4.toUpperCase(); // uppercaseMessage is "HELLO, WORLD!"
		String lowercaseMessage = message4.toLowerCase(); // lowercaseMessage is "hello, world!"
		System.out.println(uppercaseMessage); // Output: HELLO, WORLD!
		System.out.println(lowercaseMessage); // Output: hello, world!

		// Finding the length of a string using the length() method
		String message5 = "Hello, world!";
		int length = message5.length(); // length is 13
		System.out.println(length); // Output: 13

		// Searching for a substring using the indexOf() and lastIndexOf() methods
		String message6 = "Hello, world!";
		int index = message6.indexOf("world"); // index is 7
		System.out.println(index); // Output: 7
	}
}