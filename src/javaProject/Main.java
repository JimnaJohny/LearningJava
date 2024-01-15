package javaProject;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		Simulation simulation= new Simulation();
ArrayList<Item> items= simulation.loadItems("C:\\Users\\jimna\\eclipse-workspace\\LearningJava\\src\\javaProject\\phase-1.txt");
//ArrayList<Item> items= simulation.loadItems("items.txt");
ArrayList<Rocket> r1Rockets = simulation.loadU1(items);
int totalCostR1 = simulation.runSimulation(r1Rockets);
System.out.println("Total cost for R1 fleet: $" + totalCostR1);
ArrayList<Rocket> r2Rockets = simulation.loadU2(items);
int totalCostR2 = simulation.runSimulation(r2Rockets);
System.out.println("Total cost for R2 fleet: $" + totalCostR2);
	}

}
