package overridingExample;

public class Shopping {
	String itemName;
	double itemPrice;

	public Shopping(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public void displayItemDetails() {
		System.out.println("Item: " + itemName);
		System.out.println("Price: $" + itemPrice);
	}

	public double calculateTotalCost(int quantity) {
		return itemPrice * quantity;
	}

	public void processPayment() {
		System.out.println("Payment processed using default method.");
	}
}