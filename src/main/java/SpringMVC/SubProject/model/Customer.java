package SpringMVC.SubProject.model;

public class Customer {
	private int customerID;
	private String fullName;
	private String phoneNumber;
	private String email;
	
	public Customer() {
		super();
	}

	public Customer(String fullName, String phoneNumber, String email) {
		super();
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Customer(int customerID, String fullName, String phoneNumber, String email) {
		super();
		this.customerID = customerID;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
}