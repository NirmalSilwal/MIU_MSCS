package lesson5.problem4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem4Main {

	public static void main(String[] args) {

		CommissionEmployee cemp = new CommissionEmployee("Nirmal", "Silwal", "ABCXYZ", 10000, 45);

		HourlyEmployee hemp = new HourlyEmployee("Dinesh", "Sharma", "ZEXRU", 70000, 10);

		SalariedEmployee semp = new SalariedEmployee("Binod", "Katayat", "BTORUI", 10000);

		BasePlusCommisionEmployee baseemp = new BasePlusCommisionEmployee("Ananda", "KC", "HYDER", 50000, 25, 10000);

		SalariedEmployee semp1 = new SalariedEmployee("Rakesh", "Maharjan", "RITYE", 8000);

		// creating employee array
		Employee[] emp = { cemp, hemp, semp, baseemp, semp1 };

		double totalSalary = 0.0;

		for (Employee currentEmp : emp) {
			double mysalary = currentEmp.getPayment();
			totalSalary += mysalary;
		}

		System.out.println("total salary of all employees is : " + totalSalary);

	}

}
