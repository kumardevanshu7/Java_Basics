package Recursion_02_Basics;

public class All_Occurances {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 4, 5, 7, 6, 4, 3, 4, 5};
		int num = 9;
		int new_Arr[] = new int[arr.length];
		int ans[] = alloccurs(arr, 0, num, new_Arr);
		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

	public static int[] alloccurs(int arr[], int idx, int item, int[] new_Arr) {

		// base
		if (idx == arr.length) {
			return new_Arr; // here we just return the empty array where all values are 0.
		}

		/*
		 * comparing arr value to item, if it is true the we putting that index in new
		 * array
		 */
		if (arr[idx] == item) {
			new_Arr[idx] = idx;
		} else {
			return alloccurs(arr, idx + 1, item, new_Arr);
		}

		return alloccurs(arr, idx + 1, item, new_Arr);
	}

}
