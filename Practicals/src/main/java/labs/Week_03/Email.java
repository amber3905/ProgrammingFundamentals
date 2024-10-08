package labs.Week_03;

public class Email {

	private static final String DEFAULT_ADDRESS = "unknown@unknown";
	private String emailAddress = DEFAULT_ADDRESS;

	public Email(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmail() {
		return emailAddress;
	}
}
