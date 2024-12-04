package ProblemSet_8c;

// The Person class represents an individual with a forename, surname, and age.
public class Person {

    // The first name of the person.
	private String forename = null;
    // The last name of the person.
	private String surname = null;
    // The age of the person.
	private int age = 0;

    // Constructor to initialize a Person with their forename, surname, and age.
	public Person(String forename, String surname, int age) {
		super();
        // Assign parameters to instance variables.
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}

    // Getter for the person's age.
	public int getAge() {
		return this.age;
	}

    // Getter for the person's forename.
	public String getForename() {
		return this.forename;
	}

    // Getter for the person's surname.
	public String getSurname() {
		return this.surname;
	}

    /* Returns a string representation of the person, including
     * their full name and age.
     */
	@Override
	public String toString() {
		return this.forename + " " + this.surname
				+ " (" + this.age + ")";
	}
}
