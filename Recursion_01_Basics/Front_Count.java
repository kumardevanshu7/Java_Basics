package Recursion_01_Basics;

public class Front_Count {

	public static void main(String[] args) {

		frontcount(5);

	}

	public static void frontcount(int num) {

		// base case
		if (num == 0) {
			return;
		}

		frontcount(num - 1);
		System.out.println(num);
	}

}
