package javaProject;

public class R2 extends Rocket{
	public R2() {
        maxWeight = 29000;
        currentWeight = 18000;
        cost=120000000;
    }
	@Override
	public boolean launch() {
		double chance = 0.04 * ((double) currentWeight / maxWeight);
        return Math.random() >= chance;
	}
	@Override
	public boolean land() {
		double chance = 0.08 * ((double) currentWeight / maxWeight);
        return Math.random() >= chance;
	}

}
