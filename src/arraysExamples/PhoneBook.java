package arraysExamples;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {

	// Create an array of data type long to store 20 different values
	// DataType variable = new DataType[Length of the array]
	long[] phoneNumbers = new long[4];
	Scanner sc = new Scanner(System.in);

	// To Access a value or to store the value we will use the index
	// The maximum index will be always length - 1
	void populateTheArray() {

		for (int i = 0; i < phoneNumbers.length; i++) {
			System.out.println("Please enter the phone number");
			phoneNumbers[i] = sc.nextLong();
		}
		
	}
	
	void printTheArray() {
		
		System.out.println("The phonenumbers stored in array are ");
		
		String arrayStringRepresentation ="[";
		
		for(int i=0;i<phoneNumbers.length;i++) {
			arrayStringRepresentation = arrayStringRepresentation+phoneNumbers[i];
			if(i<phoneNumbers.length-1)
				arrayStringRepresentation=arrayStringRepresentation+",";
		}
		
		arrayStringRepresentation = arrayStringRepresentation+"]";
		
		System.out.println(arrayStringRepresentation);
	}

}
