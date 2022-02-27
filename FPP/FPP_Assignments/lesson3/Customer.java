package lesson3;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Customer {

	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;

	// initializing using constructor
	public Customer(String firstname, String lastname, String socSecurityNum) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.socSecurityNum = socSecurityNum;
	}

	// creating getters and setters for all attributes

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}

}
