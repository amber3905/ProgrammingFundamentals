package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name = null;
	private String urn = "00000";
	private List<Module> moduleList;

	public Student(String name, String urn) {
		super();
		String[] words = name.split(" ");
		StringBuffer output = new StringBuffer();
		for (String word : words) {
			output.append(Character.toUpperCase(word.charAt(0))).append
			(word.substring(1)).append(" ");
		}
		this.name = output.toString().trim();
		if (urn.matches("([0-9]{5})")) {
			this.urn = urn;
		}
		this.moduleList = new ArrayList<Module>();
	}

	public void addModuleList(Module module) {
		boolean exists = false;
		for (Module modules : this.moduleList) {
			if (modules == module) {
				exists = true;
			}
		}
		if (!exists) {
			this.moduleList.add(module);
		}
	}

	public String getName() {
		return this.name;
	}

	public int getUrn() {
		return Integer.parseInt(this.urn);
	}

	public String printModules() {
		StringBuffer output = new StringBuffer();
		for (Module modules : this.moduleList) {
			if (modules != null) {
				output.append(modules.getName()).append(", ");
			}
		}
		if (!output.isEmpty()) {
			output.setLength(output.length() - 2);
		}
		return output.toString();
	}
}
