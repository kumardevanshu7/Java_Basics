package Recursion_01_Basics;

public class Mix_Of_Front_Back_Counting_02 {
	
	// Printing : 5 4 3 2 1 1 2 3 4 5

	public static void main(String[] args) {

		MixCounting(5);
	}

	public static void MixCounting(int num) {
		if (num == 0) {
			return;
		}

		System.out.println(num);
		MixCounting(num - 1);
		System.out.println(num);

	}

}
