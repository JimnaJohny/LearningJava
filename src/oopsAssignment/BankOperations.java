package oopsAssignment;

import java.util.Scanner;

public class BankOperations {
	double availableFund;
	Scanner sc = new Scanner(System.in);

	public BankOperations(double balance) {
		availableFund = balance;
	}
	public double withdraw() {
		System.out.println("Enter the amount to withdraw:");
		double withdrawAmount = sc.nextDouble();
		if (withdrawAmount<=availableFund&&withdrawAmount>0)
			System.out.println("Withdrawal successfully completed, Take the cash");
		else
			System.out.println("Please enter a valid amount");
		availableFund -= withdrawAmount;
		return availableFund;
	}

	public double deposit() {
		System.out.println("Enter the amount to deposit:");
		double depositAmount = sc.nextDouble();
		if (depositAmount > 0)
			System.out.println("Successfully deposited the amount");
		else
			System.out.println("Please enter a valid amount");
		availableFund += depositAmount;
		return availableFund;
	}

	public double viewBalance() {
		return availableFund;
	}
}
