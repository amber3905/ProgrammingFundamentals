package labs.Week_06;

public enum Weekdays {

	MONDAY("Working day", 1),
	TUESDAY("Working day", 2),
	WEDNESDAY("Working day", 3),
	THURSDAY("Working day", 4),
	FRIDAY("Working day", 5),
	SATURDAY("Weekend", 6),
	SUNDAY("Weekend", 7);

	private String dayType;
	private int dayNumber;

	private Weekdays(String dayType, int dayNumber) {
		this.dayType = dayType;
		this.dayNumber = dayNumber;
	}

	public String getDayType() {
		return this.dayType;
	}

	public int getDayNumber() {
		return this.dayNumber;
	}
}