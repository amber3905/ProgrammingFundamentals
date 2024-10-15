package labs.Week_04;

public class Test {

	public static void main(String[] args) {
		int house1 = 3;
		int house2 = 0;
		int house3 = 4;

		System.out.println("How many bottles in house 1 is " + house1);
		System.out.println("How many bottles in house 2 is " + house2);
		System.out.println("How many bottles in house 3 is " + house3);
		
		int[] houses;
		houses = new int [3];
		houses[0] = 3;
		houses[1] = 0;
		houses[2] = 4;
		  
		System.out.println("How many bottles in house 1 is " + houses[0]);
		System.out.println("How many bottles in house 2 is " + houses[1]);
		System.out.println("How many bottles in house 3 is " + houses[2]);
		
		for (int i = 0; i < houses.length; i++) {
			System.out.println("How many bottles in house " + (i + 1) + " is " + houses[i]);
		}
		
		int counter = 0;
		for (int i = 0; i < houses.length; i++) {
			counter += houses[i];
		}
		System.out.println(counter);
		
		for (int house : houses) {
			System.out.println("How many bottles in house is " + house);
		}
	}

}
