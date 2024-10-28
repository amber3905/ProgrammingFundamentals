package ProblemSet_6c;

public class Palette {

	private P_COLOUR[] primaryColours;

	public Palette() {
		this.primaryColours = new P_COLOUR[3];
	}

	public Palette(P_COLOUR[] primaryColours) {
		this.primaryColours = primaryColours;
	}

	public void addColour(P_COLOUR colour) {
		if (primaryColours.length > 3) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < primaryColours.length; i++) {
			if (primaryColours[i] == colour) {
				break;
			}
		}
		for (int i = 0; i < primaryColours.length; i++) {
			if (primaryColours[i] == null) {
				primaryColours[i] = colour;
				return;
			}
		}
	}

	public String getColours() {
		String temp = "";
			for (int i = 0; i < primaryColours.length; i++) {
				if (primaryColours[i] != null) {
					temp += primaryColours[i] + ", ";
				}
			}
			if (temp.length() > 2) {
				temp = temp.substring(0, temp.length() - 2);
			} else {
				return "No colours added";
			}
		return temp;
	}
}
