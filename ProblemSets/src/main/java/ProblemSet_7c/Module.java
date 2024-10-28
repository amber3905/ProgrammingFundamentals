package ProblemSet_7c;

public class Module {

	private String name;

	public Module(String name) {
		boolean check = name.matches("(COM)([0-9]{4})");
		if (check) {
			this.name = name;
		} else {
			this.name = "Error";
		}
	}

	public String getName() {
		return name;
	}

}
