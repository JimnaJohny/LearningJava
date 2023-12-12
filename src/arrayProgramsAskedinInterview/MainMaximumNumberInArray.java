package arrayProgramsAskedinInterview;

import java.util.Scanner;

public class MainMaximumNumberInArray {

	public static void main(String[] args) {
		MaximumNumberInArray max= new MaximumNumberInArray();
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            //System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        int maxNumber = max.findMaximumNumber(numbers);

	        System.out.println("Maximum number: " + maxNumber);
	    }

}
