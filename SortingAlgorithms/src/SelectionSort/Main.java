package SelectionSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array elements");
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Array elments before sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		SelectionSort.sort(arr);
		System.out.println("Array elments After sorting");
		for (int x : arr) {
			System.out.print(x+" ");
		

	}
	}
}
