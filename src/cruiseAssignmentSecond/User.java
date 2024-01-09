package cruiseAssignmentSecond;

public class User {
	String emailId;
	String password;
	String name;
	String phoneNumber;
	private MyBookings[] bookings;
	private int bookingCount;

	public User() {
		bookings = new MyBookings[10]; // Initial size of array
		bookingCount = 0;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void addBooking(MyBookings booking) {
		// Check if the array is full
		if (bookingCount >= bookings.length) {
			increaseArraySize();
		}
		bookings[bookingCount] = booking;
		bookingCount++;
	}

	private void increaseArraySize() {
		MyBookings[] newBookings = new MyBookings[bookings.length * 2];
		System.arraycopy(bookings, 0, newBookings, 0, bookings.length);
		bookings = newBookings;
	}

}
