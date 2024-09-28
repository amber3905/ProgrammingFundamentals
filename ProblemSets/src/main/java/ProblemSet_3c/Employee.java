package ProblemSet_3c;

public class Employee {

	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	private String bonus;
	private double tax;

	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}

	public Integer getId() {
		return id;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public AnnualSalary getSalary() {
		return salary;
	}

	public Position getPositionName() {
		return companyPosition;
	}

	public String toString() {
		tax = salary.calculateTax();
		return forename + ", " + surname + " (" + id + "): " + companyPosition + " at £" + salary + " (£" + tax + " tax) and " + bonus + " eligible for bonus.";
	}
}
