package ProblemSet_9a;

public enum VATRate {
	STANDARD(0.2),
	ZERO(0),
	LOW(0.05);

	private final double rate;

	VATRate(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return this.rate;
	}
}
