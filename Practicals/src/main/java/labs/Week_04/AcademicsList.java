package labs.Week_04;
import java.util.ArrayList;

public class AcademicsList {
	
	private ArrayList<String> namesList = new ArrayList<String>();
	
	public AcademicsList() {
		
	}
	
	public void addNames() {
		namesList.add("Helen");
		namesList.add("Stella");
	}
	
	public String displayNames() {
		String names = "";
		for (String name : namesList) {
			names += name + "\n";
		}
		return names;
	}
	
	public static void main(String[] args) {
		AcademicsList computing = new AcademicsList();
	    computing.addNames();
	    System.out.println(computing.displayNames());
	}

}
