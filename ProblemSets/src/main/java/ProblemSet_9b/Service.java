package ProblemSet_9b;

import java.util.regex.Pattern;

public class Service {

	private String code = null;
	private String name = null;
	private VATRate rate = null;

	public Service(String code, String name, VATRate rate) {
		super();

		if (code == null || code.isEmpty()) {
			throw new NullPointerException();
		}
		if (name == null || name.isEmpty()) {
			throw new NullPointerException();
		}
		if (!isValidCode(code)) {
			throw new IllegalArgumentException();
		}

		this.code = code;
		this.name = name;
		this.rate = rate;
	}

	private boolean isValidCode(String code) {
		String regex = "^[A-Z]{4}\\d{5}$";
		return Pattern.matches(regex, code);
	}

	public String getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public VATRate getRate() {
		return this.rate;
	}

}
