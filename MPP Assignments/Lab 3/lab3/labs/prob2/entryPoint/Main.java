package lab3.labs.prob2.entryPoint;

import lab3.labs.prob2.Apartment;
import lab3.labs.prob2.Building;
import lab3.labs.prob2.LandlordInfo;

/** 
 * Main class is for testing your code; you can uncomment
 * the code here once you have implemented classes. 
 * 
 * However, the way
 * data has been populated into the LandlordInfo and Building
 * objects violates the design indicated in the UML diagram for
 * this problem. Refactor the code in the main method so that
 * data is loaded in a correct manner; you can verify that you
 * have done this successfully by moving the Main class into a
 * different package.
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Apartment[] apts0 = {
				new Apartment(600),
				new Apartment(700)};
		
		Apartment[] apts1 = {
				new Apartment(500), 
				new Apartment(450)
		};
		
		Apartment[] apts2 = {
				new Apartment(1100),
				new Apartment(650)};
		
		
		Apartment[] apts3 = {
				new Apartment(6750), 
				new Apartment(945)
		};
		
		Building[] bldgs = {
				new Building(150, 400),
				new Building(175, 900),
				new Building(150, 300),
				new Building(175, 775)
		};
		
		for(Apartment a : apts0) {
			bldgs[0].addApartment(a);
		}
		for(Apartment a : apts1) {
			bldgs[1].addApartment(a);
		}
		for(Apartment a : apts2) {
			bldgs[2].addApartment(a);
		}
		for(Apartment a : apts3) {
			bldgs[3].addApartment(a);
		}
		
		LandlordInfo landlord = new LandlordInfo();
		
		for(Building b: bldgs) {
			landlord.addBuilding(b);
		}
		
		System.out.println(landlord.calcProfits());
				
		}

	}
