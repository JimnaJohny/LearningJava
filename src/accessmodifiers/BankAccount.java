package accessmodifiers;

public class BankAccount {

	public String name;
	
	String accountNumber;
	
	double balance;
	
	int atmPin;
	
	
	public BankAccount(String name1, String accountNumber1, double balance1, int atmPin1) {
		super();
		name = name1;
		accountNumber = accountNumber1;
		balance = balance1;
		atmPin = atmPin1;
	}

	void checkPin(int pin) {
		
		if(pin==atmPin) {
			System.out.println("User validate successfully");
		}else {
			System.out.println("incorrect pin");
		}
	}
}
