package engineControlUnit;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		CalculateFuelInjection calculateFuelInjection = new CalculateFuelInjection();
		calculateFuelInjection.xThrottle = 500;
		calculateFuelInjection.calculateFuelInjection();
		Scanner sc=new Scanner(System.in);
		System.out.println("JIMNA");
	}

}
