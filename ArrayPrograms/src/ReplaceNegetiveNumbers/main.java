package ReplaceNegetiveNumbers;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//
		System.out.println("Enter a length of array 1");
		//contents in array 1
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter a digit to replace the negaitve elements");
		int i=scan.nextInt();
		int[] replace= ReplaceNegetiveArray.replace(arr1,i);
			System.out.println("The new array: " );
			for (int r:replace) {
				System.out.print(r+" ");
			}
	}
	

}
