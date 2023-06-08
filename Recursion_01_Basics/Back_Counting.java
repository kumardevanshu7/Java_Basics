package Recursion_01_Basics;

public class Back_Counting {

	public static void main(String[] args) {
		
		backcount(5);

	}
	
	public static void backcount(int num) {
		
		if(num == 0) {
			return;
		}
		
		// recursion works on bottom to top
		System.out.println(num);
		backcount(num - 1);
	}

}
