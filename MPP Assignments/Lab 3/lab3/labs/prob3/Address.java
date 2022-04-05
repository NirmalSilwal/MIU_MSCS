package lab3.labs.prob3;


public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String str, String c, String state, String zip) {
		street=str;
		city=c;
		this.state=state;
		this.zip=zip;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
