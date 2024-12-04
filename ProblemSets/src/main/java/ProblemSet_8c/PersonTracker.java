package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// The PersonTracker class manages a list of Person objects.
public class PersonTracker {

    // A list to store Person objects.
	private List<Person> peopleList;

    // Constructor to initialize an empty PersonTracker.
	public PersonTracker() {
		super();
        // Initialize the list of people.
		peopleList = new ArrayList<Person>();
	}

    // Adds a new person to the tracker.
	public void addPerson(String n, String s, int a) {
		Person person = new Person(n, s, a);
		peopleList.add(person);
	}

    // Returns the string representation of the people list.
	public String getPeopleList() {
		return peopleList.toString();
	}

    // Displays the details of all people in the tracker in a readable format.
	public String displayList() {
		StringBuffer output = new StringBuffer();
        // Append each person's details to the output.
		for (Person person : peopleList) {
			output.append(person.toString()).append("\n");
		}
		return output.toString();
	}

    /* Reads a text file containing person details,
     * adds each person to the tracker,
     */
	public String readTextFile(String file) {
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer output = new StringBuffer();
		try {
            // Open the file and create a BufferedReader for reading.
			fr = new FileReader(file);
			br = new BufferedReader(fr);
            // Read lines from the file.
			String line = br.readLine();
			while (line != null) {
				// Append the line to the output string.
				output.append(line).append("\n");
				/* Process the line to add
				 * a Person to the tracker.
				 */
				breakLine(line);
				// Read the next line.
				line = br.readLine();
			}
            // Close the BufferedReader.
			br.close();
		} catch (FileNotFoundException e1) {
			// Print stack trace if the file is not found.
			e1.printStackTrace();
		} catch (IOException e2) {
			// Print stack trace if there is an IO exception.
			e2.printStackTrace();
		}
		return output.toString();
	}

    // Parses a line of text into a Person object and adds it to the tracker.
	private void breakLine(String line) {
        // Split the line into parts: forename, surname, and age.
		String[] words = line.split(" ");
		String forename = words[0];
		String surname = words[1];
		// Convert the age from string to integer.
		int age = Integer.parseInt(words[2]);
        // Add the person to the tracker.
		addPerson(forename, surname, age);
	}

}
