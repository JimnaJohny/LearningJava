package arrayProgramsAskedinInterview;

import java.util.Arrays;
import java.util.Scanner;

public class MainArraySorting {
	public static void main(String[] args) {
		ArraySorting sort= new ArraySorting();
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            //System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	            }
	        int[] newArray = sort.sortedArray(numbers);

	        System.out.println("Array in descending order: ");
	        for(int i=size;i<size;i--)
	        	System.out.println(Arrays.toString(newArray));
	    }
}
