package loops;

public class WhileHalloweenCandyCollection {
	int noOfChocolates;
	void trickAndTreat() {
		 while (noOfChocolates < 10) {
			System.out.println("Go to next house");
			System.out.println("Trick or Treat");
			noOfChocolates++;
			System.out.println("No.of chocolates I have so far: " + noOfChocolates);
		}
	}

}
