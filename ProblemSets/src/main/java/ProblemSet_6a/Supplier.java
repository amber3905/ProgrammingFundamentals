package ProblemSet_6a;

public class Supplier {

	private String name;
	private String phone;

	public Supplier(String name, String phone) {
		this.name = name;
		if (phone.matches("(01483)(-)([0-9]{6})")) {
			this.phone = phone;
		} else if (phone.matches("(01483)([0-9]{6})")) {
			this.phone = phone;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}

	@Override
	public String toString() {
		return this.name + "(" + this.phone + ")";
	}
}
