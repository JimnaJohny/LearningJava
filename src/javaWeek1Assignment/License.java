package javaWeek1Assignment;

public class License {

	int age;
	String currentLevel;

	void getLicense() {
		if (age == 16) {
			System.out.println("Eligible to take G1 license");
		} else if (age > 16) {
			System.out.println("Eligible to take license");
			if (currentLevel == "G1") {
				System.out.println("Licence to take: G2 or G");
			} else if (currentLevel == "G2") {
				System.out.println("Licence to take: G");
			} else if (currentLevel == "G") {
				System.out.println("You already have full license!!!");
			} 
			//else if (currentLevel == "null") {
				System.out.println("Licence to take: G1");
			} else {
				System.out.println("Invalid Entry");
			}
		} else {
			System.out.println("Not eligible to take license, Minimum age required to take license is 16");
		}
	}
}
