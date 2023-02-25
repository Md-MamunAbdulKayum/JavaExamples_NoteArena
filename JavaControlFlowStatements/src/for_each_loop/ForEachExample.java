package for_each_loop;

import java.util.ArrayList;

/**
 * Java for-each loop example with ArrayList
 * 
 * @author Mamun Kayum
 *
 */

public class ForEachExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		for (String name : names) {
			System.out.println(name);
		}
	}
}