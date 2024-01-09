package overridingExample;

public class OnlineShopping extends Shopping {
	private String creditCardNumber;
	private String cardHolderName;
	private String expirationDate;

	public OnlineShopping(String itemName, double itemPrice, String creditCardNumber, String cardHolderName,
			String expirationDate) {
		super(itemName, itemPrice);
		this.creditCardNumber = creditCardNumber;
		this.cardHolderName = cardHolderName;
		this.expirationDate = expirationDate;
	}

	@Override
	public void processPayment() {
		System.out.println("Online Shopping Payment Processed.");
		System.out.println("Credit Card: " + creditCardNumber);
		System.out.println("Card Holder: " + cardHolderName);
		System.out.println("Expiration Date: " + expirationDate);
	}
}