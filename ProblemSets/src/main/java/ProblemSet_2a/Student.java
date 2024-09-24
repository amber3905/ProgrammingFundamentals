package ProblemSet_2a;

public class Student {

	private String firstName;
	private String surname;
	private int age;

	public Student(String firstName1, String surname1, int age1) {
		firstName = firstName1;
		surname = surname1;
		age = age1;
			}

	public void setAge(int newAge) {
		age = newAge;
	}

	public Integer getAge() {
		return age;
	}

	public String getFullname() {
		return firstName + " " + surname;
	}

	public void setForename(String newFirstName) {
		firstName = newFirstName;
	}

	public void setSurname(String newSurname) {
		surname = newSurname;
	}

}
