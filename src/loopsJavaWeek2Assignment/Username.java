//Write a program which takes username and password from user via console and compares it with a user name and password saved in your class. 
//Saved user id and password are as below
//UserId	pivotAdmin
//password	Admin123
 
 //If the username and password entered by user matches with the one saved in your class, then print “You are logged in to the application“ other wise  print “Incorrect User id or password.Try again”.  Also a user gets 3 chances enter the correct user name and password. If the user enters incorrect user name or password more than 3 times then print “ Account locked” 

package loopsJavaWeek2Assignment;

import java.util.Scanner;

public class Username {
	String userId;
	String password;
	String savedUserId="pivotAdmin";
	String savedPassword="Admin123";
	Scanner sc = new Scanner(System.in);

	void validateUsername() {
		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter your UserId: ");
			userId = sc.next();
			System.out.println("Enter your Password: ");
			password = sc.next();
			if (userId.equals(savedUserId) && password.equals(savedPassword)) {
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
