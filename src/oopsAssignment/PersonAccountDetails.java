package oopsAssignment;

public class PersonAccountDetails {
	private String bankAccountNo;
	private String accountHoldersName;
	private double balance;
	private int pin;
	private String onlineBankingPassword;

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public String getAccountHoldersName() {
		return accountHoldersName;
	}

	public void setAccountHoldersName(String accountHoldersName) {
		this.accountHoldersName = accountHoldersName;
	}

	public String getAccountHolderName() {
		return accountHoldersName;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

}
