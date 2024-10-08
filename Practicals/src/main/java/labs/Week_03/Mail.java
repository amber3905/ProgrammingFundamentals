package labs.Week_03;

public class Mail {

	private User sender;
	private User recipient;
	private String message;

	public Mail(User sender, User recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}

	public String getSender() {
		return sender.toString();
	}

	public String getRecipient() {
		return recipient.toString();
	}

	public String getMessage() {
		return message;
	}

	private void isEmpty() {
		if (this.getMessage() == null || this.getMessage() == "") {
			this.message = "** Something Went Wrong! **";
		}
	}

	public void print() {
		System.out.println("From: " + getSender());
		System.out.println("To: " + getRecipient());
		this.isEmpty();
		System.out.println("Message: " + this.message); 
	}
}
