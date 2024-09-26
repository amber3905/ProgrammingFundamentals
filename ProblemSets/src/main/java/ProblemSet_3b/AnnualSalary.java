package ProblemSet_3b;

public class AnnualSalary {

	private double salary;
	private double tax;
	private double taxable;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		salary = newSalary;
	}

	public double calculateTax() {
		if (salary <= 12570) {
			tax = 0;
		} else if (salary <= 50270) {
			tax = (salary - 12570) * 0.2;
		} else if (salary <= 125140) {
			tax = (salary - 12570) * 0.2 + (salary - 50270) * 0.4;
		}
		return tax;
	}

}
