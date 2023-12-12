package arrayProgramsAskedinInterview;

import java.util.Scanner;

public class MainSmallestNumberInArray {

	public static void main(String[] args) {
		SmallestNumberInArray small= new SmallestNumberInArray();
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            //System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        int smallNumber = small.findSmallestNumber(numbers);
	        int maxNumber= small.findMaximumNumber(numbers);

	        System.out.println("Smallest number: " + smallNumber);
	        System.out.println("Largest number: " + maxNumber);
	    }


}
