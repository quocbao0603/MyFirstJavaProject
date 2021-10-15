// Java Program to Illustrate Run-time Errors

// Main class
public class ErrorLogicalTest{

	// Main driver method
	public static void main(String args[])
	{

		// Declaring and initializing numbers
		int a = 2, b = 8, c = 6;

		if (a > b && a > c)
			System.out.println(a + " is the largest Number");
		else if (b > a && b > c)
			System.out.println(b + " is the smallest Number");

		// The correct message should have been
		// System.out.println
		// (b+" is the largest Number"); to make logic
		else
			System.out.println(c + " is the largest Number");
	}
}
