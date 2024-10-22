package labs.Week_05;

public class Brainteaser {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int total = 0;
			for (int j = 1; j <= 12; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) + "\t");
				total += i * j;
			}
			System.out.println();
			System.out.println("Total of table is " + total);
		}
	}

}
