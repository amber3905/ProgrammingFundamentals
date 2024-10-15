package labs.Week_04;

public class Academics {

	public static void main(String[] args) {
		
		String[] names = new String[20];
		names[0] = "Helen";
		names[1] = "Stella";
		
		for (String name : names) {
			if (name != null) {
				System.out.println("Name is: " + name);
			}
		}
	}

}
