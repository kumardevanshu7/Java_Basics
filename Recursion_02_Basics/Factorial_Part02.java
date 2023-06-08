package Recursion_02_Basics;

public class Factorial_Part02 {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(fact(num, 1));

	}

	// creating a factorial function & return type is integer
	public static int fact(int n, int ans) {

		if (n == 0) {
			return ans;
		}

		return fact(n - 1, ans * n);

	}

}
