package ProblemSet_2b;

public class Food {

	private String type;
	private double sugar;

	public Food(String type1, double sugar1) {
		type = type1;
		sugar = sugar1;
	}

	public String getName() {
		return type;
	}

	public double getAmountOfSugar() {
		return sugar;
	}

}
