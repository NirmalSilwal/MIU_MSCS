package lesson12;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class CustomerAccount {

	private String Cus_name;
	private long Acc_No;
	private double Balance;

	CustomerAccount(String name, long accn, double bal) {
		this.Cus_name = name;
		this.Acc_No = accn;
		this.Balance = bal;
	}

	public boolean deposit(double amount) {
		if (amount < 0)
			return false;
		this.Balance += amount;
		return true;
	}

	public boolean withdraw(double amount) throws MyProblem2CustomException {

		if (amount > 0 && amount <= this.Balance) {
			this.Balance -= amount;
			return true;
		}

		if (amount > this.Balance) {
			throw new MyProblem2CustomException("Withdraw amount exceed the balance");
		}

		return false;
	}

	public double getBalance() throws MyProblem2CustomException {
		if (this.Balance >= 0 && this.Balance < 100)
			throw new MyProblem2CustomException("Balance reach below 100$");

		return this.Balance;
	}

	public static void main(String[] args) throws MyProblem2CustomException {

		CustomerAccount customer1 = new CustomerAccount("Nirmal", 123456678, 200);

		try {
			System.out.println("current balance: " + customer1.getBalance() + "\n");

			System.out.println("depositing -$1 " + customer1.deposit(-1));
			System.out.println("current balance: " + customer1.getBalance() + "\n");

			System.out.println("depositing $10 " + customer1.deposit(10));
			System.out.println("current balance: " + customer1.getBalance() + "\n");

			System.out.println("withdrawing $0 " + customer1.withdraw(0));
			System.out.println("current balance: " + customer1.getBalance() + "\n");

			System.out.println("withdrawing $220 " + customer1.withdraw(220));
			System.out.println("current balance: " + customer1.getBalance() + "\n");

		} catch (MyProblem2CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
