package Recursion_02_Basics;

public class First_Occurances {

	public static void main(String[] args) {

		int[] arr = {2, 3, 7, 3, 3, 7, 6, 3, 6, 3, 4, 5, 7, 6};
		int num = 7;
		System.out.println(firstoccur(arr, num, 0));
	}
	
	public static int firstoccur(int[] arr, int num, int idx) {
		
		// check if idx not crossing array length
		if(idx == arr.length) {
			return -1;
		}
		
		// checking the array value to number
		if(arr[idx] == num) {
			return idx;
		}
		
		return firstoccur(arr, num, idx + 1); 
	}
	
	

}
