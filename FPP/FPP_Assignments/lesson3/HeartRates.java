package lesson3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class HeartRates {

	private String firstname;
	private String lastname;
	private String dob;

	public HeartRates(String firstname, String lastname, String dob) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getPersonAge() {
		// format-(yyyy-mm-dd)
		DateTimeFormatter dobFormatter = DateTimeFormatter.ofPattern("yyyy-M-d");

		LocalDate birthday = LocalDate.parse(this.dob, dobFormatter);

		LocalDate today = LocalDate.now();

		Period totalAge = Period.between(birthday, today);

		return totalAge.getYears();
	}

	public int getMaxHeartRate() {
		return 220 - this.getPersonAge();
	}

	public void getTargetHeartRateRange() {

		// calculating using given formulas
		int RHR = 70;
		int MHR = 220 - this.getPersonAge();
		int AHR = MHR - RHR;
		float LB = 0.5f;
		float UB = 0.85f;
		double LBTHR = (AHR * LB) + RHR;
		double UBTHR = (AHR * UB) + RHR;

		System.out.println("The target heart rate range is between " + LBTHR + " and " + UBTHR);
	}

	@Override
	public String toString() {
		return "First Name: " + this.firstname + "\n" + "Last Name: " + this.lastname + "\n" + "Age: "
				+ this.getPersonAge() + "\n" + "Date of Birth: " + this.dob + "\n" + "Maximum Heart Rate: "
				+ this.getMaxHeartRate();
	}

}
