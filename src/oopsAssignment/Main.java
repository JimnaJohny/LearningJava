package oopsAssignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int typeOfService;
		boolean isValidAccountNumberSelected = false;
		boolean isAnotherTransactionRequested=true;
		double balance = 0;
		Scanner sc = new Scanner(System.in);
		PersonAccountDetails person = new PersonAccountDetails("123456789", "Jimna", 5000, 1234, "Password");
		ATM atm = new ATM(person);
		OnlineBanking online = new OnlineBanking(person);
		// person = new PersonAccountDetails();
		while (!isValidAccountNumberSelected) {
			System.out.println("Enter bank account number:");
			String accountNum = sc.next();
			if (accountNum.equals(person.getBankAccountNo())) {
				System.out.println("Welcome " + person.getAccountHolderName() + " to the Scotia Bank Application");
				isValidAccountNumberSelected = true;
			} else
				System.out.println("Invalid account number");
			//if (isValidAccountNumberSelected == true)
				
			while (isValidAccountNumberSelected && isAnotherTransactionRequested) {
				boolean isCorrectBankingServiceSelected = false;
	            boolean isValidCredentialEntered = false;
	            boolean isValidTransactionSelected = false;
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
						person.setBalance(balance);
						break;
					case 2:
						isValidTransactionSelected = true;
						balance = operations.deposit();
						person.setBalance(balance);
						break;
					case 3:
						isValidTransactionSelected = true;
						balance = operations.viewBalance();
						person.setBalance(balance);
						break;
					default:
						System.out.println("Invalid Entry!");
						break;

					}
					if (isValidTransactionSelected)
						System.out.println("Available balance is:" + balance);
				}
					System.out.println("Do you need another transaction? TRUE/FALSE");
					isAnotherTransactionRequested=sc.nextBoolean();
				
				}
		}
		System.out.println("Thank you for using Scotia bank application");
	}
}
