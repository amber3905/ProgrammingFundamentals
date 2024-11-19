package ProblemSet_9b;

public class Charge {

	private Service service;
	private double charge = 0;

	public Charge(Service service, double charge) {
		super();
		if (service == null) {
			throw new IllegalArgumentException();
		}
		if (charge <= 0) {
			throw new IllegalArgumentException();
		}

		this.service = service;
		this.charge = charge;
	}

	public Service getService() {
		return this.service;
	}

	public double getCharge() {
		return this.charge;
	}

	public double calculateVAT() {
		return this.charge * this.service.getRate().getRate();
	}

}
