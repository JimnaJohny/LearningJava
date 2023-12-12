//Write a program to print the numbers in an array in descending order.
package arrayProgramsAskedinInterview;

import java.util.Arrays;
import java.util.Scanner;

public class MainArrayInDescendingOrder {
	public static void main(String[] args) {
		ArrayInDescendingOrder order= new ArrayInDescendingOrder();
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            //System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	            }
	        int[] newArray = order.descendingOrder(numbers);

	        System.out.println("Array in descending order: " + Arrays.toString(newArray));
	    }
}
