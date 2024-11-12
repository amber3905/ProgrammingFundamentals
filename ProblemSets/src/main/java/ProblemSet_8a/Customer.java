package ProblemSet_8a;

public class Customer {

	private String name = null;
	private String surname = null;

	public Customer(String name, String surname) {
		super();
		if (validateInfo(name) && validateInfo(surname)) {
			this.name = name;
			this.surname = surname;
		} else {
			throw new IllegalArgumentException("Invalid name");
		}
	}

	public char getName() {
		return this.name.charAt(0);
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean validateInfo(String name) {
		if (name.matches("^[A-Z][a-z]*")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuffer temp = new StringBuffer();
		temp.append(this.name.charAt(0));
		temp.append(". " + this.surname);
		return temp.toString();
	}
}
