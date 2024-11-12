package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Counting {

	public Counting() {
		super();
	}

	public String readTextFile(String file) {
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer result = new StringBuffer();
		try {
			int counter = 0;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				counter += 1;
				result.append(displayLine(line, counter));
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return result.toString();
	}

	public String displayLine(String line, int counter) {
		StringBuffer output = new StringBuffer();
		output.append(line).append(" : ");
		output.append(counter).append("\n");
		return output.toString();
	}

}
