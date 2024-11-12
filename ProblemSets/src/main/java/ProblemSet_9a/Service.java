package ProblemSet_9a;

public class Service {

	private String code = null;
	private String name = null;
	private VATRate rate = null;

	public Service(String code, String name, VATRate rate) {
		super();
		if (code == null) {
			throw new NullPointerException();
		} else if (code.matches("([A-Z]{4})([0-9]{5})")) {
			this.code = code;
		} else {
			throw new IllegalArgumentException();
		}
		if (name != null) {
			this.name = name;
		} else {
			throw new NullPointerException();
		}
		this.rate = rate;
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
