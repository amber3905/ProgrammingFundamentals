package ProblemSet_6c;

public class Palette {

	private P_COLOUR[] primaryColours;

	public Palette() {
		super();
		this.primaryColours = new P_COLOUR[3];
	}

	public Palette(P_COLOUR[] primaryColours) {
		super();
		if (primaryColours.length > 3) {
			throw new IllegalArgumentException();
		} else {
			this.primaryColours = primaryColours;
		}
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

	public String mixColours() {
		int red = 0;
		int blue = 0;
		int yellow = 0;
		for (int i = 0; i < primaryColours.length; i++) {
			if (primaryColours[i] == P_COLOUR.RED) {
				red += 1;
			} else if (primaryColours[i] == P_COLOUR.BLUE) {
				blue += 1;
			} else if (primaryColours[i] == P_COLOUR.YELLOW) {
				yellow += 1;
			}
		}
		if (red == 1 && blue == 1 & yellow == 1) {
			return "BLACK";
		} else if (red == 1 && blue == 1) {
			return "PURPLE";
		} else if (red == 1 && yellow == 1) {
			return "ORANGE";
		} else if (blue == 1 & yellow == 1) {
			return "GREEN";
		} else if (blue == 1) {
			return "BLUE";
		} else if (yellow == 1) {
			return "YELLOW";
		} else if (red == 1) {
			return "RED";
		} else {
			return "";
		}
	}

	public String display() {
		StringBuilder colours = new StringBuilder();
		colours.append(getColours()).append(" = ").append(mixColours());
		return colours.toString();
	}
}
