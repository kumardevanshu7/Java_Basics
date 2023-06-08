package Recursion_01_Basics;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(fact(5));

	}

	// creating a factorial function & return type is integer
	public static int fact(int n) {

		// initiate the base case where our recursion will stop
		if (n == 1) {
			return n; // when our n is decreases its 1 value then it will return
		}

		// we add n in the fact function : head recursion
		int factorial = fact(n - 1); // we decreasing the n value until its get 1 and hit the base case
		return n * factorial;
	}
}
