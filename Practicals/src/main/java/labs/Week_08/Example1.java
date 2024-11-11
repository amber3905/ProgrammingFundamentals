package labs.Week_08;

public class Example1 {
	public static void main(String[] args) {
		// Note: this code will compile without a try/catch block, but it is still
		// wrong. This is the type of problem that should be
		// fixed by the developer before the software is released.

		int dontDivideMeByZero = 5;
		int x = 0;
		if (x != 0) {
			int result = dontDivideMeByZero / x;
			System.out.println("Result = " + result);
		}		
	}
}
