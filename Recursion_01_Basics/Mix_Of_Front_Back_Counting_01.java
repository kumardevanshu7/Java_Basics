package Recursion_01_Basics;

public class Mix_Of_Front_Back_Counting_01 {
	
	// printing : 1 2 3 4 5 5 4 3 2 1

	public static void main(String[] args) {

		MixCounting(1);
	}
	
	public static void MixCounting(int num) {
		if(num == 6) {
			return;
		}
		
		System.out.println(num);
		MixCounting(num + 1);
		System.out.println(num);
		
	}

}
