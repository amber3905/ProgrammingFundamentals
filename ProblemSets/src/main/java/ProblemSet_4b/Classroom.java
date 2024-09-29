package ProblemSet_4b;

public class Classroom {

	private String room;
	private Student[] maxStudents;
	private int currentStudentCount;
	private int maxCapacity = 20;

	public Classroom(String room) {
		this.room = room;
		maxStudents = new Student[maxCapacity];
		currentStudentCount = 0;
	}

	public String getRoom() {
		return room;
	}

	public int getCapacity() {
		return maxCapacity;
	}

	public void addStudents(int index, char initial, String surname) {
		if (currentStudentCount < maxCapacity) {
			maxStudents[index] = new Student(initial, surname);
			currentStudentCount = currentStudentCount + 1;
		}
	}

	public String getSummary() {
		String summary = "";
		for (int i = 0; i < currentStudentCount; i = i + 1) {
			summary = summary + maxStudents[i].getStudentDetails() + "\n";
		}
		return summary.isEmpty() ? "No students added" : summary;
	}

	public int howManyStudents() {
		return currentStudentCount;
	}
}
