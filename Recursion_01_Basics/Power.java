package Recursion_01_Basics;

public class Power {

	public static void main(String[] args) {

		System.out.println(pow(2, 5)); // 2^5

	}

	public static int pow(int num, int power) {

		// base case would be
		if (power == 1) {
			return num; // because num will be remain same
		}

		int ans = num * pow(num, power - 1); 
		return ans;

	}

}
