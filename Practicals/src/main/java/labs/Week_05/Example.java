package labs.Week_05;

public class Example {

	public static void main(String[] args) {
		String [] names = {"Stella", "Junaid", "Mariyah"};
		double [] grades = {50, 60, 75};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		for (int i = 0; i < grades.length; i ++) {
			System.out.println(grades[i]);
		}
		System.out.println();
		for (int i = 0; i < names.length; i ++) {
			System.out.println(names[i] + " achieved " + grades[i] + "%");
		}
	}

}
