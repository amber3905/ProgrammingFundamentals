package ProblemSet_9a;

//The VATRate enum represents different VAT (Value Added Tax) rates.
public enum VATRate {
 // Standard VAT rate of 20%.
	STANDARD(0.2),
 // Zero VAT rate (0%).
	ZERO(0),
 // Reduced VAT rate of 5%.
	LOW(0.05);

 // Field to hold the rate value.
	private final double rate;

 // Constructor for VATRate enum.
	VATRate(double rate) {
		this.rate = rate;
	}

 // Getter for the VAT rate value.
	public double getRate() {
		return this.rate;
	}
}
