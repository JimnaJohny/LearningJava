package oopsAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	String password;
	String userName;
	boolean isValidPasswordEntered = false;
	int count = 0;

//	public OnlineBanking(String userName, String password, double balance) {
//		super(balance);
//		this.userName = userName;
//		this.password = password;
//	}

	public OnlineBanking(PersonAccountDetails person) {
		super(person.getBalance());
		this.userName = person.getBankAccountNo();
		this.password = person.getOnlineBankingPassword();
	}

	public boolean validatePassword() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your username:");
			String userNameEntered = sc.next();

			if (userNameEntered.equals(userName)) {
				count = 0;
				do {
					System.out.println("Enter your password:");
					String passwordEntered = sc.next();
					if (passwordEntered.equals(password)) {
						System.out.println("Password is Correct");
						isValidPasswordEntered = true;
						break;
					} else {
						count++;
						System.out.println("Incorrect Password");
					}
					if (count == 3) {
						System.out.println("Account Blocked!Please try after some time");
						break;
					}
				} while (count < 3);
				break;
			} else {
				count++;
				System.out.println("Incorrect Username");
			}
			if (count == 3) {
				System.out.println("Account Blocked!Please try after some time");
				break;
			}
		} while (count < 3);
		return isValidPasswordEntered;
	}

}
