package javaProject;

public abstract class Rocket implements SpaceShip{
	int currentWeight;
	int maxWeight;
	protected int cost;

	@Override
	public boolean launch() {
		return false;
	}

	@Override
	public boolean land() {
		return false;
	}

	@Override
	public boolean canCarry(Item item) {
		return (currentWeight + item.getWeight()) <= maxWeight;
	}

	@Override
	public void carry(Item item) {
		currentWeight += item.getWeight();
		
	}

	public int getCost() {
		return cost;
	}	
}
