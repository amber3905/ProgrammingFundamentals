package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

// The Hotel class represents a hotel with a name and a list of guests.
public class Hotel {

    // The name of the hotel.
	private String name = null;
    // A list to store the guests staying at the hotel.
	private List<IGuest> guests;

    // Constructor to initialize the hotel with a name.
	public Hotel(String name) {
		super();
        // Assign the hotel name and initialize the guests list.
		this.name = name;
		this.guests = new ArrayList<>();
	}

    // Adds a guest to the hotel.
	public void addGuest(IGuest guest) {
		if (guest != null) {
			this.guests.add(guest);
		}
	}

    // Prints the guest list for the hotel.
	public String printGuestList() {
		StringBuffer output = new StringBuffer();
		output.append(this.name).append(" Hotel\n"); // Add hotel name.
		output.append("Guest List\n"); // Add header for guest list.
        // Append each guest's details to the output.
		for (IGuest guest : this.guests) {
			output.append(guest).append("\n");
		}
		return output.toString();
	}

    // Getter for the list of guests.
	public List<IGuest> getGuests() {
		return this.guests;
	}

    // Getter for the hotel name.
	public String getName() {
		return this.name;
	}

}
