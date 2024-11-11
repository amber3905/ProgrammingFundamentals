package labs.Week_08;

public class Example2 {

	public static void main(String[] args) {
		// Create a person object with an invalid age.
		Person person = new Person("joe", "bloggs", -1);
		System.out.println(person);
	    }
}
