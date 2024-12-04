package ProblemSet_9c;

/*The Charge class represents a charge for
 * a specific service, including its value and associated VAT calculation.
 */
public class Charge {

  /* Instance variables for the associated
   * Service and the monetary charge amount.
   */
	private Service service;
	private double charge = 0;

    // Constructor for the Charge class.
	public Charge(Service service, double charge) {
		super();
        // Validate the service argument.
		if (service == null) {
			throw new IllegalArgumentException();
		}
        // Validate the charge argument.
		if (charge <= 0) {
			throw new IllegalArgumentException();
		}
        // Assign the valid arguments to the instance variables.
		this.service = service;
		this.charge = charge;
	}

    // Getter method for the Service object.
	public Service getService() {
		return this.service;
	}

    // Getter method for the charge amount.
	public double getCharge() {
		return this.charge;
	}

    // Calculates the VAT (Value Added Tax) for this Charge.
	public double calculateVAT() {
        // VAT is the charge amount multiplied by the service's rate.
		return this.charge * this.service.getRate().getRate();
	}

}
