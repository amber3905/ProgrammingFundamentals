package ProblemSet_2b;

public class Meal {

	private Food mainCourse;
	private Food dessert;

	public Meal(Food mainCourse1, Food dessert1) {
		mainCourse = mainCourse1;
		dessert = dessert1;
	}

	public double calculateTotalSugarLevel() {
		return mainCourse.getAmountOfSugar() + 
				dessert.getAmountOfSugar();
	}

	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName() + ", "
				+ "dessert = " + dessert.getName() + "]";
	}
}
