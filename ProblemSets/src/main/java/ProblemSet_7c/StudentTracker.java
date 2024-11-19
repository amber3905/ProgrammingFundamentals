package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {

	private List<Student> studentList;
	private Map<Integer, Student> moduleList;

	public StudentTracker() {
		super();
		this.studentList = new ArrayList<>();
		this.moduleList = new HashMap<>();
	}

	public void addStudent(Student student, List<Module> moduleList) {
		this.studentList.add(student);
		for (Module module : moduleList) {
			student.addModuleList(module);
		}
	}

	public String printStudents() {
		StringBuffer output = new StringBuffer();
		for (Student student : this.studentList) {
			output.append(student.getName()).append("(");
			output.append(student.getUrn()).append(")\n");
		}
		return output.toString();
	}

	public String printModules(int urn) {
		initialiseMap();
		StringBuffer output = new StringBuffer();
		output.append("URN ").append(urn);
		output.append(" is enrolled in:\n");
		output.append(moduleList.getOrDefault(urn, null).printModules());
		return output.toString();
	}

	private void initialiseMap() {
		for (Student student : studentList) {
			this.moduleList.put(student.getUrn(), student);
		}
	}

}
