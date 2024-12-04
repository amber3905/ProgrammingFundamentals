package ProblemSet_9b;

//The IGuest interface defines the operations that can be performed on a guest.
public interface IGuest {

 // Adds a charge to the guest's account for a specified service.
	public void addCharge(Service s, double c);

 // Calculates the total charge for the guest's account excluding VAT.
	public double calculateTotalChargeWithoutVAT();

 // Calculates the total VAT amount for the guest's charges at a specific VAT rate.
	public double calculateVATChargeAtRate(VATRate r);

 // Calculates the total charge for the guest's account, including VAT.
	public double calculateTotalChargeIncVat();

 // Returns a string representation of the guest, including their personal details.
	@Override
	public String toString();

}
