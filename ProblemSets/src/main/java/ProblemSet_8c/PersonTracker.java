package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonTracker {

	private List<Person> peopleList;

	public PersonTracker() {
		super();
		peopleList = new ArrayList<Person>();
	}

	public void addPerson(String n, String s, int a) {
		Person person = new Person(n, s, a);
		peopleList.add(person);
	}

	public String getPeopleList() {
		return peopleList.toString();
	}

	public String displayList() {
		StringBuffer output = new StringBuffer();
		for (Person person : peopleList) {
			output.append(person.toString()).append("\n");
		}
		return output.toString();
	}

	public String readTextFile(String file) {
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer output = new StringBuffer();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				output.append(line).append("\n");
				breakLine(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return output.toString();
	}

	private void breakLine(String line) {
		String[] words = line.split(" ");
		String forename = words[0];
		String surname = words[1];
		int age = Integer.parseInt(words[2]);
		addPerson(forename, surname, age);
	}

}
