//Write a program to find if the number is prime or not.
package arrayProgramsAskedinInterview;

public class PrimeOrNot {
	boolean checkPrime(int number) {
		if (number <= 1) {
			return false;
		}

		// Check for divisibility from 2 to the square root of the number
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
