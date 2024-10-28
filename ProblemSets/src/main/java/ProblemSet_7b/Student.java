package ProblemSet_7b;

import java.util.ArrayList;

public class Student {

	private String name = null;
	private String urn = null;
	private ArrayList<Module> moduleList;

	public Student(String name, String urn) {
		boolean check = urn.matches("[0-9]{5}");
		if (check) {
			this.urn = urn;
		} else {
			this.urn = "00000";
		}
		String[] arr = name.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : arr) {
			result.append(word.substring(0).toUpperCase()).append(" ");
		}
		this.name = result.toString().trim();
		this.moduleList = new ArrayList<Module>();
	}

	public int getUrn() {
		int urnInt = 0;
		urnInt = Integer.parseInt(urn);
		return urnInt;
	}

	public void addModuleList(Module module) {
	}

	public String printModules() {
		return null;
	}

	public String getName() {
		return name;
	}
}
