package Searching;

import java.util.Scanner;

//changes in parameters passed
public class SearchingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int target = scan.nextInt();
		System.out.println("Enter the array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements of array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Choose:-\n 1-Linear Search,\n 2-Binary Search");
		int ch = scan.nextInt();
		scan.close();
		boolean result1 = false;
		boolean result2 = false;
		switch (ch) {
		case 1: {
			result1 = LinearSearch.isPresent(target, arr);
			break;
		}
		case 2: {
			result2 = BinarySearch.present(target, arr);
			break;
		}
		default:
			System.out.println("Enter proper choice for searching");

		}
		if (result1 == true || result2 == true) {
			System.out.println("Element found ! ");
		} else {
			System.out.println("Element not found !");
		}
	}
}
