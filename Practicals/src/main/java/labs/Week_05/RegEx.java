package labs.Week_05;

public class RegEx {

	public static void main(String[] args) {
		String reference = "HO1234";
		boolean foundMatch = reference.matches("(HO)([0-9]{4})");
		if (foundMatch) {
			System.out.println("Reference number is valid");
		} else {
			System.out.println("Reference number is NOT valid");
		}
	}

}
