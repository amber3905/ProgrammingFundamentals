package ProblemSet_2c;

public class Module {

	private String name;
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;

	public double calculateAverage() {
		double total = assessment1.getMark() + assessment2.getMark() + assessment3.getMark();
		return total / 3;
	}

	public String toString() {
		return null;
	}
}