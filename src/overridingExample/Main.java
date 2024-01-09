package overridingExample;

public class Main {
	public static void main(String[] args) {
		// OnlineShopping
		OnlineShopping onlineItem = new OnlineShopping("Laptop", 1000, "123456789", "Jimna", "12/24");
		onlineItem.displayItemDetails();
		System.out.println("Total Cost for 2 items: $" + onlineItem.calculateTotalCost(2));
		onlineItem.processPayment();
		// InStoreShopping
		InStoreShopping inStoreItem = new InStoreShopping("Smartphone", 500, "987654321");
		inStoreItem.displayItemDetails();
		System.out.println("Total Cost for 3 items: $" + inStoreItem.calculateTotalCost(3));
		inStoreItem.processPayment();
	}
}
