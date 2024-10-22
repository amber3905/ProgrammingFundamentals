package labs.Week_05;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "good";
		System.out.println(s1);
		String s2 = "morning";
		String s3 = s1 + " " + s2;
		System.out.println(s1.length());
		System.out.println(s2.length() + s3.length());
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		String exercise = "COM1027";
		String exercise2 = new String("COM1027");
		if (exercise.equals(exercise2)) {
			System.out.println("The two strings are equal");
		} else {
			System.out.println("The two strings are NOT equal");
		}
		if (exercise == exercise2) {
			System.out.println("exercise equals exercise2");
		} else {
			System.out.println("exercise does NOT equal exercise2");
		}
		String exercise3 = "COM1027";
		if (exercise == exercise3) {
			System.out.println("exercise equals exercise3");
		} else {
			System.out.println("exercise does NOT equal exercise3");
		}
	}

}
