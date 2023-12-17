package oopsAssignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int typeOfService;
		boolean isValidCredentialEntered = false;
		boolean isValidAccountNumberSelected = false;
		boolean isCorrectBankingServiceSelected = false;
		boolean isValidTransactionSelected = false;
		double balance = 0;
		Scanner sc = new Scanner(System.in);

		PersonAccountDetails person = new PersonAccountDetails();
		person.setBankAccountNo("123456789");
		person.setAccountHoldersName("Jimna");
		person.setBalance(5000);
		person.setPin(1234);
		person.setOnlineBankingPassword("Password");
		ATM atm = new ATM(person.getPin(), person.getBalance());
		OnlineBanking online = new OnlineBanking(person.getBankAccountNo(), person.getOnlineBankingPassword(),
				person.getBalance());
		while (!isValidAccountNumberSelected) {
			System.out.println("Enter bank account number:");
			String accountNum = sc.next();
			if (accountNum.equals(person.getBankAccountNo())) {
				System.out.println("Welcome " + person.getAccountHolderName() + " to the Scotia Bank Application");
				isValidAccountNumberSelected = true;
			} else
				System.out.println("Invalid account number");
			if (isValidAccountNumberSelected == true)
				while (!isCorrectBankingServiceSelected) {
					System.out.println(
							"Choose one of the following types of banking service you want: \n1.ATM \n2.Online Banking");
					typeOfService = sc.nextInt();
					switch (typeOfService) {
					case 1:
						isCorrectBankingServiceSelected = true;
						isValidCredentialEntered = atm.validatePIN();
						break;
					case 2:
						isCorrectBankingServiceSelected = true;
						isValidCredentialEntered = online.validatePassword();
						break;
					default:
						System.out.println("Invalid Entry!");
						break;
					}
				}
			BankOperations operations = new BankOperations(person.getBalance());
			if (isValidCredentialEntered)
				while (!isValidTransactionSelected) {
					System.out.println(
							"Choose one of the following types of transaction you want:\n1.Withdraw \n2.Deposit \n3.View Balance");
					int transaction = sc.nextInt();
					switch (transaction) {
					case 1:
						isValidTransactionSelected = true;
						balance = operations.withdraw();
						break;
					case 2:
						isValidTransactionSelected = true;
						balance = operations.deposit();
						break;
					case 3:
						isValidTransactionSelected = true;
						balance = operations.viewBalance();
						break;
					default:
						System.out.println("Invalid Entry!");
						break;

					}
					if (isValidTransactionSelected)
						System.out.println("Available balance is:" + balance);
				}
		}
	}
}
