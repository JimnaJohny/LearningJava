package amusementParkRides;

import java.util.Scanner;

public class MainAmusementParkRides {

	public static void main(String[] args) {
		AmusementParkRides ride = new AmusementParkRides();
		System.out.println("Enter your height:");
		Scanner sc = new Scanner(System.in);
		ride.height = sc.nextInt();
		ride.allowToRides();
	}

}
