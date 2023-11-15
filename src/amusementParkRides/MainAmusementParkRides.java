package amusementParkRides;

import java.util.Scanner;

public class MainAmusementParkRides {

	public static void main(String[] args) {
		AmusementParkRides ride = new AmusementParkRides();
		System.out.println("Enter your height:");
		Scanner sc = new Scanner(System.in);
		ride.height = sc.nextInt();
		ride.allowToRides();
	// Test case1
		//Enter your height:
		//100
		//Allowed in rides
	//Test case2
		//Enter your height:
		//89
		//Not allowed in rides
	//Test case3
		//Enter your height:
		//201
		//Not allowed in rides
	}

}
