package lesson3;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem1Main {

	public static void main(String[] args) {

		Customer[] customers = new Customer[3];

		// String street, String city, String state, String zip

		customers[0] = new Customer("Nirmal", "Silwal", "abc123");
		customers[1] = new Customer("Dinesh", "Sarma", "ab456");
		customers[2] = new Customer("Binod", "Kathayat", "efg123");

		// String street, String city, String state, String zip

		Address billingAdd1 = new Address("Argiro", "Chicago", "Iowa", "52557");
		Address billingAdd2 = new Address("Kurintar", "Chitwan", "Kathmandu", "52550");
		Address billingAdd3 = new Address("Juhu", "Chicago", "Maharashtra", "25001");

		Address shippingAdd1 = new Address("Hetuda", "Valley", "Texas", "12211");
		Address shippingAdd2 = new Address("Kurintar", "Chicago", "Kathmandu", "23234");
		Address shippingAdd3 = new Address("Juhu", "Chicago", "Maharashtra", "54231");

		customers[0].setBillingAddress(billingAdd1);
		customers[0].setShippingAddress(shippingAdd1);

		customers[1].setBillingAddress(billingAdd2);
		customers[1].setShippingAddress(shippingAdd2);

		customers[2].setBillingAddress(billingAdd3);
		customers[2].setShippingAddress(shippingAdd3);

		for (Customer mycustomer : customers) {
			if (mycustomer.getShippingAddress().getCity().equals("Chicago")) {
				System.out.println(mycustomer.toString());
			}
		}
	}

}
