package arraysExamples;

import java.util.Scanner;

public class UserInfo {
	String[][] users = { { "pivot@gmail.com", "abcue12" }, { "riya@gmail.com", "sss@12" },
			{ "lal@gmail.com", "ath@12" } };
	Scanner sc = new Scanner(System.in);
	int flag=0;
	void populateUsers() {
//		for (int i = 0; i < users.length; i++) {
//
//			for (int j = 0; j < users[i].length; j++) {
//
//				users[i][j] = sc.next();
//
//			}
//
//		}
		System.out.println("Enter the username");
		String userName=sc.next();
		for(int i=0;i<users.length;i++)
			if(users[i][0].equals(userName))
			{
				System.out.println("Username found in the idex["+i+"][0]");
				String password=users[i][1];
				System.out.println("Password for that username is "+password);
				flag=1;
				break;
			}
		if(flag==0)
			System.out.println("Wrong username");
	}

}
