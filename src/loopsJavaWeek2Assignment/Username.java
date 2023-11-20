package loopsJavaWeek2Assignment;

import java.util.Scanner;

public class Username {
	String userId;
	String password;
	Scanner sc = new Scanner(System.in);

	void validateUsername() {
		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter your UseId: ");
			userId = sc.next();
			System.out.println("Enter your Password: ");
			password = sc.next();
			if (userId.equals("pivotAdmin") && password.equals("Admin123")) {
				System.out.println("You are logged in to the application");
				break;
			} else {
				System.out.println("Incorrect User id or password. Try again");
				if (counter == 3)
					System.out.println("Account locked");
			}
		}

	}

}
