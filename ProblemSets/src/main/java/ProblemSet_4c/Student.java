package ProblemSet_4c;

public class Student {

	private char initial;
	private String surname;
	private Module[] modules;

	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
		this.modules = new Module[8];
	}

	public void setModules(int index, String code, double score) {
		modules[index] = new Module(code, score);
	}

	public Object getStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
