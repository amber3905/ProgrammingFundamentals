package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// The Counting class reads lines from a text file, numbers each line, and formats
public class Counting {

    // Default constructor for the Counting class.
	public Counting() {
		super();
	}

    // Reads a text file line by line, numbers each line, and appends the formatted result.
	public String readTextFile(String file) {
		// FileReader to read the file.
		FileReader fr = null;
		// BufferedReader to read lines from the file.
		BufferedReader br = null;
		// To store the formatted output.
		StringBuffer result = new StringBuffer();
		try {
			// Line counter to number each line.
			int counter = 0;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// Read the file line by line.
			String line = br.readLine();
			while (line != null) {
				// Increment the line counter.
				counter += 1;
				// Format and append the line.
				result.append(displayLine(line, counter));
				// Read the next line.
				line = br.readLine();
			}
			// Close the BufferedReader after reading all lines.
			br.close();
		} catch (FileNotFoundException e1) {
			// Print stack trace if the file is not found.
			e1.printStackTrace();
		} catch (IOException e2) {
			// Print stack trace if an IO error occurs.
			e2.printStackTrace();
		}
		// Return the formatted result.
		return result.toString();
	}

    // Formats a line of text with its corresponding line number.
	public String displayLine(String line, int counter) {
		StringBuffer output = new StringBuffer();
		// Append the line content and its corresponding line number.
		output.append(line).append(" : ");
		output.append(counter).append("\n");
		return output.toString();
	}

}
