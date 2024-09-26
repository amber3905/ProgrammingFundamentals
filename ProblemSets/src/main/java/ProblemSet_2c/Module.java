package ProblemSet_2c;

public class Module {

	private String name = "COM1027";
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;

	public Module(Assessment assessment, Assessment assessment4
			, Assessment assessment5) {
		assessment1 = assessment;
		assessment2 = assessment4;
		assessment3 = assessment5;
	}

	public double calculateAverage() {
		double total = (assessment1.getMark() * 0.2) + 
				(assessment2.getMark() * 0.2) + 
				(assessment3.getMark() * 0.6);
		return total;
	}

	public String toString() {
		return name + " (" + calculateAverage() + "%)";
	}
}
