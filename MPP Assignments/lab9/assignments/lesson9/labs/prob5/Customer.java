package lab9.assignments.lesson9.labs.prob5;

public class Customer {
	private String name;
	private String street;
	private String city;
	private String zip;
	public Customer(String name, String street, String city, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String toString(){
		return name + " " + street + " " + city + " " + zip; 
	}
}
