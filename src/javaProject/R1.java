package javaProject;

public class R1 extends Rocket{
	public R1() {
        maxWeight = 18000; // Max weight in kg
        currentWeight = 10000; // Base weight in kg
        cost=100000000;
    }
	@Override
	public boolean launch() {
		double chance = 0.05 * (currentWeight / maxWeight);
        return Math.random() >= chance;
	}
	@Override
	public boolean land() {
		double chance = 0.01 * ((double) currentWeight / maxWeight);
        return Math.random() >= chance;
	}

}
