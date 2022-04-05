package lab3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintainanceCost;
	private List<Apartment> apartments;

	public Building(double maintainanceCost, double apartmentRent) {
		apartments = new ArrayList<Apartment>();
		this.maintainanceCost = maintainanceCost;
		apartments.add(new Apartment(apartmentRent));
	}

	public void addApartment(Apartment a) {
		apartments.add(a);
	}

	public double getProfit() {
		double apartRent = 0;
		for (Apartment ap : apartments) {
			apartRent += ap.getRent();
		}
		return apartRent - maintainanceCost;
	}

	public double getMaintainanceCost() {
		return maintainanceCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

}
