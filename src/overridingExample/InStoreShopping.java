package overridingExample;

public class InStoreShopping extends Shopping {
	private String giftCardNumber;

	public InStoreShopping(String itemName, double itemPrice, String giftCardNumber) {
		super(itemName, itemPrice);
		this.giftCardNumber = giftCardNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("In-Store Shopping Payment Processed.");
		System.out.println("Gift Card: " + giftCardNumber);
	}
}