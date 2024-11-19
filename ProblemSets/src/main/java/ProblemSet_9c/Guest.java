package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {

	private String forename = null;
	private String surname = null;
	private String address = null;
	private String telephone = null;
	private List<Charge> charges;

	public Guest(String forename, String surname,
			String address, String telephone) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.charges = new ArrayList<>();
	}

	public String getForename() {
		return this.forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getAddress() {
		return this.address;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public List<Charge> getCharges() {
		return this.charges;
	}

	@Override
	public void addCharge(Service s, double c) {
		this.charges.add(new Charge(s, c));
	}

	@Override
	public double calculateTotalChargeWithoutVAT() {
		double total = 0;
		for (Charge charge : this.charges) {
			total += charge.getCharge();
		}
		return total;
	}

	@Override
	public double calculateVATChargeAtRate(VATRate r) {
		double vat = 0;
		for (Charge charge : this.charges) {
			if (charge.getService().getRate() == r) {
				vat += charge.getCharge() * r.getRate();
			}
		}
		return vat;
	}

	@Override
	public double calculateTotalChargeIncVat() {
		double totalWithVAT = 0;
		for (Charge charge : this.charges) {
			double vat = charge.getCharge() * charge.getService()
					.getRate().getRate();
			totalWithVAT += charge.getCharge() + vat;
		}
		return totalWithVAT;
	}

	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(this.forename).append(" ");
		output.append(this.surname).append(", ");
		output.append(this.address).append(", ");
		output.append(this.telephone);
		return output.toString();
	}

}
