package labs.Week_04;

public class House {
	
	private int numberOfHouse;
	private int numberBottles;
	
	public House(int numberOfHouse, int numberBottles) {
		this.numberOfHouse = numberOfHouse;
		this.numberBottles = numberBottles;
	}
	
	public int getNumberBottles() {
		return numberBottles;
	}
	
	public int getNumberOfHouse() {
		return numberOfHouse;
	}
	
	public void setNumberBottles(int numberBottles) {
		this.numberBottles = numberBottles;
	}

	@Override
	public String toString() {
		return "House number: " + this.numberOfHouse + ", (" + this.numberBottles + "bottles)";
	}

}
