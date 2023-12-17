package oopsAssignment;

import java.util.Scanner;

public class ATM extends BankOperations {
	int pin;
	boolean isCorrectPinEntered = false;
	int count = 0;

	public ATM(int pin, double balance) {
		super(balance);
		this.pin = pin;
	}

	public boolean validatePIN() {
		do {
			System.out.println("Enter your PIN:");
			Scanner sc = new Scanner(System.in);
			int pinEntered = sc.nextInt();
			if (pinEntered == pin) {
				isCorrectPinEntered = true;
				break;
			} else {
				count++;
				System.out.println("Incorrect PIN");
				if (count == 3)
					System.out.println("Account Blocked!Please try after some time");
			}
		} while (count < 3);
		return isCorrectPinEntered;
	}

}
