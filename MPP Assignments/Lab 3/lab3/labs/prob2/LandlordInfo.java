package lab3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {

	private double totalProfits;
	List<Building> buildings;

	public LandlordInfo() {
		buildings = new ArrayList<>();
	}

	public void addBuilding(Building b) {
		buildings.add(b);
	}

	public double calcProfits() {
		for (Building bld : buildings) {
			double currentProfit = bld.getProfit();
			totalProfits += currentProfit;
		}
		return totalProfits;
	}
}
