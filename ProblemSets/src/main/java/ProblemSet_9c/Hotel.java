package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String name = null;
	private List<IGuest> guests;

	public Hotel(String name) {
		super();
		this.name = name;
		this.guests = new ArrayList<>();
	}

	public void addGuest(IGuest guest) {
		if (guest != null) {
			this.guests.add(guest);
		}
	}

	public String printGuestList() {
		StringBuffer output = new StringBuffer();
		output.append(this.name).append(" Hotel\n");
		output.append("Guest List\n");
		for (IGuest guest : this.guests) {
			output.append(guest).append("\n");
		}
		return output.toString();
	}

	public List<IGuest> getGuests() {
		return this.guests;
	}

	public String getName() {
		return this.name;
	}

}
