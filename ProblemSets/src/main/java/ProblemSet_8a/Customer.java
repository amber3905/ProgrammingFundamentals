package ProblemSet_8a;

// The Customer class represents a customer with a name and surname.
public class Customer {

    // The first name (or forename) of the customer.
	private String name = null;
    // The last name (or surname) of the customer.
	private String surname = null;

	// Constructor for creating a Customer object.
	public Customer(String name, String surname) {
		super();
        // Validate the name and surname using the validateInfo method.
		if (validateInfo(name) && validateInfo(surname)) {
			// Assign the name if it's valid.
			this.name = name;
			// Assign the surname if it's valid.
			this.surname = surname;
		} else {
			throw new IllegalArgumentException("Invalid name");
		}
	}

	// Gets the first letter of the customer's name.
	public char getName() {
		// Returns the first letter of the name.
		return this.name.charAt(0);
	}

	// Gets the surname of the customer.
	public String getSurname() {
		// Returns the surname.
		return this.surname;
	}

	// Sets the surname of the customer.
	public void setSurname(String surname) {
		// Sets the new surname.
		this.surname = surname;
	}

	/* Validates that the name consists of an uppercase
	 * letter followed by lowercase letters.
	 */
	public boolean validateInfo(String name) {
        /* Checks if the name matches the pattern
         * (first letter uppercase, rest lowercase).
         */
		return name.matches("^[A-Z][a-z]*");
	}

	/* Returns a string representation of
	 * the customer in the format "N. Surname".
	 */
	@Override
	public String toString() {
		// StringBuffer for efficient string concatenation.
		StringBuffer temp = new StringBuffer();
		// Append the first letter of the name.
		temp.append(this.name.charAt(0));
		// Append the surname after the period.
		temp.append(". " + this.surname);
		// Return the final formatted string.
		return temp.toString();
	}
}
