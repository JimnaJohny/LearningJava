package arrayProgramsAskedinInterview;

import java.util.Scanner;

public class MainPrimeOrNot {
	public static void main(String[] args) {
		PrimeOrNot primeNumber = new PrimeOrNot();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		boolean isPrime = primeNumber.checkPrime(number);

		if (isPrime)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}
}
