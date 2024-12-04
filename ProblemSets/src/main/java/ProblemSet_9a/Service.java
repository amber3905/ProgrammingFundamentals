package ProblemSet_9a;

import java.util.regex.Pattern;

// The Service class represents a service with a unique code, name, and an associated VAT rate.
public class Service {

    // Unique code identifying the service.
	private String code = null;
    // Name of the service.
	private String name = null;
    // VAT rate associated with the service.
	private VATRate rate = null;

    // Constructor for the Service class.
	public Service(String code, String name, VATRate rate) {
		super();

        // Validate code is not null or empty.
		if (code == null || code.isEmpty()) {
			throw new NullPointerException();
		}
        // Validate name is not null or empty.
		if (name == null || name.isEmpty()) {
			throw new NullPointerException();
		}
        // Validate code against the required format.
		if (!isValidCode(code)) {
			throw new IllegalArgumentException();
		}

        // Assign valid parameters to instance variables.
		this.code = code;
		this.name = name;
		this.rate = rate;
	}

    // Validates the format of the service code.
	private boolean isValidCode(String code) {
		String regex = "^[A-Z]{4}\\d{5}$";
		return Pattern.matches(regex, code);
	}

    // Getter for the service code.
	public String getCode() {
		return this.code;
	}

    // Getter for the service name.
	public String getName() {
		return this.name;
	}

    // Getter for the VAT rate associated with the service.
	public VATRate getRate() {
		return this.rate;
	}

}
