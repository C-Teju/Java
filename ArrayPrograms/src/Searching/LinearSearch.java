package Searching;

public class LinearSearch {
	public static boolean isPresent(int target,int[] arr)

	{	
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == target) {
				return true;
			}

		}
		return false;

	}

}
