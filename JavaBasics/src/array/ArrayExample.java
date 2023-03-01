package array;

import java.util.Arrays;

/**
 * Java Array example with different array operations
 * 
 * @author Mamun Kayum
 *
 */
public class ArrayExample {
	public static void main(String[] args) {
		// Declaring and initializing an array
		int[] myArray = { 1, 2, 3, 4, 5 };

		// Accessing array elements
		int firstElement = myArray[0];
		int thirdElement = myArray[2];

		// Modifying array elements
		myArray[0] = 10;
		myArray[2] = 30;

		// Printing array contents using a loop
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

		// Printing array contents using Arrays.toString()
		System.out.println(Arrays.toString(myArray));

		// Getting array length
		int arrayLength = myArray.length;

		// Declaring and initializing a 2D array
		int[][] my2DArray = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Accessing 2D array elements
		int firstElement2D = my2DArray[0][0];
		int thirdElement2D = my2DArray[1][2];

		// Printing 2D array contents using nested loops
		for (int i = 0; i < my2DArray.length; i++) {
			for (int j = 0; j < my2DArray[i].length; j++) {
				System.out.print(my2DArray[i][j] + " ");
			}
			System.out.println();
		}

		// Passing an array as a parameter to a method
		int sum = sumArray(myArray);
		System.out.println("Sum of array elements: " + sum);
	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
