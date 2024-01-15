package javaProject;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulation {
	public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
		ArrayList<Item> items = new ArrayList<>();
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] parts = line.split("=");
			if (parts.length == 2) {
				String name = parts[0];
				int weight = Integer.parseInt(parts[1]);
				items.add(new Item(name, weight));
			}
		}
		return items;
	}
	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
	    Rocket r1 = new R1();
	    for (int i = 0; i < items.size(); i++) {
	        Item item = items.get(i);
	        
	        if (!r1.canCarry(item)) {
	            rockets.add(r1);
	            r1 = new R1();
	        }

	        r1.carry(item);
	    }
	    return rockets;
	}
	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
	    Rocket r2 = new R2();
	    for (int i = 0; i < items.size(); i++) {
	        Item item = items.get(i);
	        
	        if (!r2.canCarry(item)) {
	            rockets.add(r2);
	            r2 = new R2();
	        }

	        r2.carry(item);
	    }
	    return rockets;
	}
	public int runSimulation(ArrayList<Rocket> rockets) {
	    int totalCost = 0;

	    for (int i = 0; i < rockets.size(); i++) {
	        Rocket rocket = rockets.get(i);

	        while (!rocket.launch() || !rocket.land()) {
	            totalCost += rocket.getCost();
	            // Rocket exploded or crashed, need to launch a new one
	        }
	        totalCost += rocket.getCost(); // Add cost for successful launch
	    }

	    return totalCost;
	}
}
