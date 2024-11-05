package ProblemSet_7a;

public class Module {

	private String name = null;

	public Module(String name) {
		super();
		boolean check = name.matches("(COM)([0-9]{4})");
		if (check) {
			this.name = name;
		} else {
			this.name = "Error";
		}
	}

	public String getName() {
		return this.name;
	}

}
