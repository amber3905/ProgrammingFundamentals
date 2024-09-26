package ProblemSet_3b;

public class AnnualSalary {

	private double salary;
	private double tax;
	private double taxable;
	private double lowerTax;
	private double higherTax;
	private double nonTaxable;
	private double extremeTax;

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
			higherTax = salary - 50270;
			lowerTax = 50270 - 12570;
			tax = (lowerTax * 0.2) + (higherTax * 0.4);
		} else {
			extremeTax = salary - 125140;
			higherTax = 125140 - 50270;
			lowerTax = 50270 - 12570;
			tax = (extremeTax * 0.45) + (higherTax * 0.4)
					+ (lowerTax * 0.2);
		}
		return tax;
	}

}
