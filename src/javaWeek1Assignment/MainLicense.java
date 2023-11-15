package javaWeek1Assignment;

//import java.util.Scanner;

public class MainLicense {

	public static void main(String[] args) {
		License criteria = new License();
		criteria.age = 17;
		criteria.currentLevel = "G3";
//		System.out.println("Enter the age");
//		Scanner sc=new Scanner(System.in);
//		criteria.age=sc.nextInt();
//		System.out.println("Enter the current level of License: G1, G2 or G");
//		criteria.currentLevel=sc.next();
		criteria.getLicense();
	}

}
