package ProblemSet_5b;

public class GasBill {

	private String accountNumber;
	private double amount;
	private Customer customer;

	public GasBill(String accountNumber, double amount, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomer() {
		return customer.toString();
	}

	public boolean checkAccountAccuracy(String accountNumber) {
		boolean check = accountNumber.matches("(G)([0-9]{4})"
				+ "(-)([0-9]{4})(-)([0-9]{4})");
		if (!check) {
			this.accountNumber = "Invalid Account";
		}
		return check;
	}

	public String displayAccountDetails() {
		return "Gas Bill\n" + " Account Number:" + accountNumber
				+ "\n" + " Customer:" + customer.toString()
				+ "\n"
				+ " Amount due:£" + displayAmountDue();
	}

	public String displayAmountDue() {
		return String.format("%.2f", amount);
	}

}
