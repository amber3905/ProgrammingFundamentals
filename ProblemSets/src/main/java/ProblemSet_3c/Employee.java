package ProblemSet_3c;

public class Employee {

	private int id;
	private String firstName;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;

	public Employee(int newId, String newFirstName, String newSurname, AnnualSalary newSalary, Position newCompanyPosition) {
		id = newId;
		firstName = newFirstName;
		surname = newSurname;
		salary = newSalary;
		companyPosition = newCompanyPosition;
	}

	public int getId() {
		return id;
	}

	public String getForename() {
		return firstName;
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

}
