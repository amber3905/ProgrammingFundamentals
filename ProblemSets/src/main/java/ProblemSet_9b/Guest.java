package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

// The Guest class represents a guest with personal information and a list of charges.
public class Guest implements IGuest {

    // Guest's personal information.
	private String forename = null;
	private String surname = null;
	private String address = null;
	private String telephone = null;
    // A list of charges associated with the guest.
	private List<Charge> charges;

    // Constructor to initialize a Guest with their personal details.
	public Guest(String forename, String surname,
			String address, String telephone) {
		super();
        // Assign the provided arguments to instance variables.
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
        // Initialize the charges list.
		this.charges = new ArrayList<>();
	}

    // Getter for the guest's forename.
	public String getForename() {
		return this.forename;
	}

    // Getter for the guest's surname.
	public String getSurname() {
		return this.surname;
	}

    // Getter for the guest's address.
	public String getAddress() {
		return this.address;
	}

    // Getter for the guest's telephone number.
	public String getTelephone() {
		return this.telephone;
	}

    // Getter for the list of charges associated with the guest.
	public List<Charge> getCharges() {
		return this.charges;
	}

    // Adds a new charge for a specific service to the guest's account.
	@Override
	public void addCharge(Service s, double c) {
		this.charges.add(new Charge(s, c));
	}

    // Calculates the total charge without VAT for all services.
	@Override
	public double calculateTotalChargeWithoutVAT() {
		double total = 0;
		for (Charge charge : this.charges) {
			total += charge.getCharge();
		}
		return total;
	}

    // Calculates the total VAT for services at a specified VAT rate.
	@Override
	public double calculateVATChargeAtRate(VATRate r) {
		double vat = 0;
		for (Charge charge : this.charges) {
            // Check if the service's VAT rate matches the specified rate.
			if (charge.getService().getRate() == r) {
				vat += charge.getCharge() * r.getRate();
			}
		}
		return vat;
	}

    // Calculates the total charge including VAT for all services.
	@Override
	public double calculateTotalChargeIncVat() {
		double totalWithVAT = 0;
		for (Charge charge : this.charges) {
            // Calculate the VAT for the charge.
			double vat = charge.getCharge() * charge.getService()
					.getRate().getRate();
			totalWithVAT += charge.getCharge() + vat;
		}
		return totalWithVAT;
	}

    // Returns a string representation of the guest, including their personal details.
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(this.forename).append(" "); 	// Add forename.
		output.append(this.surname).append(", "); 	// Add surname.
		output.append(this.address).append(", "); 	// Add address.
		output.append(this.telephone);				// Add telephone number.
		return output.toString();
	}

}
