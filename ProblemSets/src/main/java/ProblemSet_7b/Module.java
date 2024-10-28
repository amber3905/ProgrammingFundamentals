package ProblemSet_7b;

public class Module {

	private String name = null;

	public Module(String name) {
		boolean check = name.matches("(COM)([0-9]{4}");
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
