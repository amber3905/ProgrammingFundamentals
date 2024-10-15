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
		boolean check = true;
		if (accountNumber.length() != 15) {
			check = false;
		} else if (accountNumber.charAt(0) != 'G' || accountNumber.charAt(5) != '-' || accountNumber.charAt(10) != '-') {
			check = false;
		} else {
			for (int i = 1; i < 4; i++) {
				if (!Character.isDigit(accountNumber.charAt(i))) {
					check = false;
				}
			}
			for (int i = 6; i < 9; i++) {
				if (!Character.isDigit(accountNumber.charAt(i))) {
					check = false;
				}
			}
			for (int i = 11; i < 14; i++) {
				if (!Character.isDigit(accountNumber.charAt(i))) {
					check = false;
				}
			}
		}
		if (check == false) {
			this.accountNumber = "Invalid Account";
		}
		return check;
	}

	public String displayAccountDetails() {
		return "Gas Bill\n" + " Account Number:" + accountNumber + "\n" + " Customer:" + customer.toString() + "\n" + " Amount due:£" + displayAmountDue();
	}
	
	public String displayAmountDue() {
		return String.format("%.2f", amount);
	}

}
