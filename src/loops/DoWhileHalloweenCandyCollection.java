package loops;
import java.util.Scanner;
public class DoWhileHalloweenCandyCollection {
	int noOfChocolates;

	void trickAndTreat() {
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Is it Snowing");
			Boolean isItSnowing = sc.nextBoolean();
			if(isItSnowing)
			{
			System.out.println("Heavy snow! Go home!!!");
			break;
			}
			System.out.println("Go to next house");
			System.out.println("Trick or Treat");
			noOfChocolates++;
			if(noOfChocolates<10)
			System.out.println("No.of chocolates I have so far: " + noOfChocolates);
		} while (noOfChocolates < 10);
		System.out.println("No.of chocolates I have so far: " + noOfChocolates);
	}

}
