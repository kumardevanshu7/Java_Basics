package Recursion_02_Basics;

public class Last_Occurance {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 4, 5, 7, 6, 4, 3, 4, 5, 6, 3 };
		int num = 4;
		System.out.println(arr.length);
		System.out.println(lastoccur(arr, arr.length - 1, num));

	}

	public static int lastoccur(int arr[], int idx, int item) {

		// base case
		if (idx == -1) {
			return -1;
		}

		// checking
		if (arr[idx] == item) {
			return idx;
		}

		return lastoccur(arr, idx - 1, item);
	}

}
