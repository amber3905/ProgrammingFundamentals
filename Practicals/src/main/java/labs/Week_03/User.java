package labs.Week_03;

public class User {

	private String name;
	private Email email;

	public User(String fullName, Email emailAddress) {
		this.name = fullName;
		this.email = emailAddress;
	}

	public String toString() {
		return this.name + " <" + this.email.getEmail() + ">";
	}
}
